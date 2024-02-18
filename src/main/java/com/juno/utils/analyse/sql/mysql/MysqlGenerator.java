package com.juno.utils.analyse.sql.mysql;

import com.juno.utils.analyse.entity.CIndex;
import com.juno.utils.analyse.entity.CIndexColumn;
import com.juno.utils.analyse.entity.Column;
import com.juno.utils.analyse.entity.TableInfo;
import org.springframework.util.StringUtils;

/**
 * @author juno
 * @date 2024-02-02 11:13
 */
public class MysqlGenerator {

    public static String genCreateSql(TableInfo tableInfo) {
        StringBuilder createSqlBuilder = new StringBuilder();
        String tableName = "`"+ tableInfo.getTableName().toLowerCase() + "`";
        if (StringUtils.hasText(tableInfo.getSchema())) {
            tableName = "`"+ tableInfo.getSchema().toLowerCase() + "`." + tableName;
        }
        createSqlBuilder.append("drop table ").append(tableName).append(";\n").append("create table ").append(tableName).append("(\r");
        for (int i = 0; i < tableInfo.getColumns().size(); i++) {
            Column column = tableInfo.getColumns().get(i);
            String row = "`" + column.getColumnName().toLowerCase() + "` " + column.getFullDataType().toLowerCase();
            if (column.isNotNull()) {
                row += " not null";
            }
            if (StringUtils.hasText(column.getDefaultValue())) {
                String defaultValue = column.getDefaultValue();
                row += " default " + defaultValue;
            }
            if (column.isPrimaryKey()) {
                row += " primary key ";
            }
            if (StringUtils.hasText(column.getComment())) {
                row += " comment '" + column.getComment() + "'";
            }
            createSqlBuilder.append(row);
            if (i != tableInfo.getColumns().size() - 1) {
                createSqlBuilder.append(",\r");
            }
        }
        createSqlBuilder.append(")engine=").append(tableInfo.getEngine()).append(" ")
                .append("default charset=").append(tableInfo.getDefaultCharset()).append(" ");
        if (StringUtils.hasText(tableInfo.getTableDesc())) {
            createSqlBuilder.append("comment='").append(tableInfo.getTableDesc()).append("'");
        }
        createSqlBuilder.append(";\r");
        if (tableInfo.getIndexList() != null) {
            for (CIndex index : tableInfo.getIndexList()) {
                createSqlBuilder.append("create ");
                if (Boolean.TRUE.equals(index.getIzUnique())) {
                    createSqlBuilder.append("unique ");
                }
                createSqlBuilder.append("index ").append(index.getIndexName())
                        .append(" ON ").append(index.getTableName()).append(" ")
                        .append("( ");
                for (int i = 0; i < index.getIndexColumns().size(); i++) {
                    CIndexColumn indexColumn = index.getIndexColumns().get(i);
                    createSqlBuilder.append(indexColumn.getIndexColumn()).append(" ");
                    if (StringUtils.hasText(indexColumn.getOrder())) {
                        createSqlBuilder.append(indexColumn.getOrder()).append(" ");
                    }
                    if (i < index.getIndexColumns().size() - 1) {
                        createSqlBuilder.append(",");
                    }
                }
                createSqlBuilder.append(");\n");
            }
        }
        return createSqlBuilder.toString();
    }

}
