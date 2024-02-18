package com.juno.utils.analyse.sql.dm;

import com.juno.utils.analyse.entity.CIndex;
import com.juno.utils.analyse.entity.CIndexColumn;
import com.juno.utils.analyse.entity.Column;
import com.juno.utils.analyse.entity.TableInfo;
import lombok.RequiredArgsConstructor;
import org.antlr.v4.runtime.tree.ParseTree;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author juno
 * @date 2024-02-05 16:18
 */
@RequiredArgsConstructor
public class DmMultiCreateSqlListener extends DmSqlBaseListener {

    private final List<TableInfo> tableInfoList;

    private static final String QUOTED_REGEX = "[\"']";
    private static final Map<String, String> DATA_TYPE_MAP = Map.of("CLOB", "TEXT", "VARCHAR2", "VARCHAR", "BIT", "CHAR(1)", "DEC", "DECIMAL");


    @Override
    public void enterMultiStatement(DmSqlParser.MultiStatementContext ctx) {
        Map<String, String> commentMap = new HashMap<>();
        Map<String, List<CIndex>> tableIndexMap = new HashMap<>();
        for (DmSqlParser.StatementContext statementContext : ctx.statement()) {
            if (statementContext instanceof DmSqlParser.CreateDmTableContext createDmTableContext) {
                TableInfo tableInfo = parseCreateDmTableContext(createDmTableContext);
                if (tableInfo != null) {
                    tableInfoList.add(tableInfo);
                    String fullTableName = tableInfo.getTableName();
                    if (StringUtils.hasText(tableInfo.getSchema())) {
                        fullTableName = tableInfo.getSchema() + "." + fullTableName;
                    }
                    List<CIndex> indexList = parseColumnIndex(fullTableName, createDmTableContext.colTypeList());
                    tableIndexMap.computeIfAbsent(fullTableName, key -> new ArrayList<>()).addAll(indexList);
                }
            }
            if (statementContext instanceof DmSqlParser.CommentTableContext commentTableContext) {
                commentMap.put(commentTableContext.tableIdentifier().getText().replaceAll(QUOTED_REGEX, ""), commentTableContext.tableComment().description().getText().replaceAll(QUOTED_REGEX, ""));
            }
            if (statementContext instanceof DmSqlParser.CommentColumnContext commentColumnContext) {
                commentMap.put(commentColumnContext.columnIdentifier().getText().replaceAll(QUOTED_REGEX, ""), commentColumnContext.columnComment().description().getText().replaceAll(QUOTED_REGEX, ""));
            }
            if (statementContext instanceof DmSqlParser.CreateIndexContext createIndexContext) {
                String tableName = createIndexContext.tableIdentifier().getText().replaceAll(QUOTED_REGEX, "");
                CIndex cIndex = parseCreateIndexContext(createIndexContext);
                tableIndexMap.computeIfAbsent(tableName, key -> new ArrayList<>()).add(cIndex);
            }
        }
        for (TableInfo tableInfo : tableInfoList) {
            String tableKey = tableInfo.getTableName();
            if (StringUtils.hasText(tableInfo.getSchema())) {
                tableKey = tableInfo.getSchema() + "." + tableKey;
            }
            if (commentMap.containsKey(tableKey)) {
                tableInfo.setTableDesc(commentMap.get(tableKey));
            }
            if (tableInfo.getColumns() != null) {
                for (Column column : tableInfo.getColumns()) {
                    String columnKey = tableKey + "." + column.getColumnName();
                    if (commentMap.containsKey(columnKey)) {
                        column.setComment(commentMap.get(columnKey));
                    }
                }
            }
            if (tableIndexMap.containsKey(tableKey)) {
                tableInfo.setIndexList(tableIndexMap.get(tableKey));
            }
        }
    }

    private TableInfo parseCreateDmTableContext(DmSqlParser.CreateDmTableContext createDmTableContext) {
        TableInfo tableInfo = parseTableIdentifierContext(createDmTableContext.createTableHeader().tableIdentifier());
        if (tableInfo == null) {
            return null;
        }
        List<Column> columns = parseColTypeListContext(createDmTableContext.colTypeList());
        tableInfo.setColumns(columns);
        return tableInfo;
    }

    private List<CIndex> parseColumnIndex(String tableName, DmSqlParser.ColTypeListContext colTypeListContext) {
        List<CIndex> indexList = new ArrayList<>();
        for (DmSqlParser.ColTypeContext colTypeContext : colTypeListContext.colType()) {
            if (colTypeContext.uniqueColumnList() != null) {
                CIndex index = new CIndex();
                index.setTableName(tableName);
                index.setIzUnique(true);
                List<CIndexColumn> indexColumns = new ArrayList<>();
                for (DmSqlParser.UniqueColumnContext uniqueColumnContext : colTypeContext.uniqueColumnList().uniqueColumn()) {
                    CIndexColumn indexColumn = new CIndexColumn();
                    indexColumn.setIndexColumn(uniqueColumnContext.getText().replaceAll(QUOTED_REGEX, ""));
                    indexColumns.add(indexColumn);
                    index.setIndexColumns(indexColumns);
                }
                String columnNames = indexColumns.stream().map(CIndexColumn::getIndexColumn).collect(Collectors.joining("_"));
                index.setIndexName("UK_" + columnNames);
                indexList.add(index);
            }
        }
        return indexList;
    }

    private TableInfo parseTableIdentifierContext(DmSqlParser.TableIdentifierContext tableIdentifier) {
        if (tableIdentifier == null) {
            return null;
        }
        TableInfo tableInfo = new TableInfo();
        if (tableIdentifier.db != null) {
            tableInfo.setSchema(tableIdentifier.db.getText().replaceAll(QUOTED_REGEX, ""));
        }
        tableInfo.setTableName(tableIdentifier.table.getText().replaceAll(QUOTED_REGEX, ""));
        return tableInfo;
    }

    private List<Column> parseColTypeListContext(DmSqlParser.ColTypeListContext colTypeListContext) {
        List<Column> columns = new ArrayList<>();
        String primaryKey = null;
        for (DmSqlParser.ColTypeContext colTypeContext : colTypeListContext.colType()) {
            if (colTypeContext.columnName() != null) {
                Column column = new Column();
                column.setColumnName(colTypeContext.columnName().getText().replaceAll(QUOTED_REGEX, ""));
                column.setFullDataType(colTypeContext.dataType().getText().replace(" CHAR)", ")"));
                for (ParseTree child : colTypeContext.dataType().children) {
                    if (child instanceof DmSqlParser.IdentifierContext dataType) {
                        column.setDataType(dataType.getText());
                        if (DATA_TYPE_MAP.containsKey(column.getDataType())) {
                            String newDateType = DATA_TYPE_MAP.get(column.getDataType());
                            column.setFullDataType(column.getFullDataType().replace(column.getDataType(), newDateType));
                            column.setDataType(newDateType);
                        }
                    }
                }
                column.setNotNull(colTypeContext.notNull != null);
                if (colTypeContext.defaultValue() != null) {
                    column.setDefaultValue(colTypeContext.defaultValue().getText());
                }
                if (colTypeContext.columnComment() != null) {
                    column.setComment(colTypeContext.columnComment().description().getText().replaceAll(QUOTED_REGEX, ""));
                }
                columns.add(column);
            } else {
                if (colTypeContext.primaryKeyList() != null && colTypeContext.primaryKeyList().primaryKey().size() == 1) {
                    primaryKey = colTypeContext.primaryKeyList().primaryKey().get(0).getText().replaceAll(QUOTED_REGEX, "");
                }
            }
        }
        if (primaryKey != null) {
            for (Column column : columns) {
                if (column.getColumnName().equals(primaryKey)) {
                    column.setPrimaryKey(true);
                }
            }
        }
        return columns;
    }

    private CIndex parseCreateIndexContext(DmSqlParser.CreateIndexContext createIndexContext) {
        CIndex cIndex = new CIndex();
        String indexName = createIndexContext.columnIndex().getText().replaceAll(QUOTED_REGEX, "");
        cIndex.setIndexName(indexName);
        String tableName = createIndexContext.tableIdentifier().getText().replaceAll(QUOTED_REGEX, "");
        cIndex.setTableName(tableName);
        List<CIndexColumn> indexColumns = new ArrayList<>();
        for (DmSqlParser.IndexIdentifierContext indexIdentifierContext : createIndexContext.indexList().indexIdentifier()) {
            CIndexColumn indexColumn = new CIndexColumn();
            indexColumn.setIndexColumn(indexIdentifierContext.columnName().getText().replaceAll(QUOTED_REGEX, ""));
            if (indexIdentifierContext.ASC() != null) {
                indexColumn.setOrder(indexIdentifierContext.ASC().getText());
            }
            if (indexIdentifierContext.DESC() != null) {
                indexColumn.setOrder(indexIdentifierContext.DESC().getText());
            }
            indexColumns.add(indexColumn);
        }
        cIndex.setIndexColumns(indexColumns);
        return cIndex;
    }

}
