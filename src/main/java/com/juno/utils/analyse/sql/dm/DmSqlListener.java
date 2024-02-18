package com.juno.utils.analyse.sql.dm;// Generated from F:/workspace/java/sql-analyse/sql-analyse/src/main/resources/DmSql.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DmSqlParser}.
 */
public interface DmSqlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#singleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSingleStatement(DmSqlParser.SingleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#singleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSingleStatement(DmSqlParser.SingleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#multiStatement}.
	 * @param ctx the parse tree
	 */
	void enterMultiStatement(DmSqlParser.MultiStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#multiStatement}.
	 * @param ctx the parse tree
	 */
	void exitMultiStatement(DmSqlParser.MultiStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createDmTable}
	 * labeled alternative in {@link DmSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateDmTable(DmSqlParser.CreateDmTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createDmTable}
	 * labeled alternative in {@link DmSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateDmTable(DmSqlParser.CreateDmTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code commentTable}
	 * labeled alternative in {@link DmSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCommentTable(DmSqlParser.CommentTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code commentTable}
	 * labeled alternative in {@link DmSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCommentTable(DmSqlParser.CommentTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code commentColumn}
	 * labeled alternative in {@link DmSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCommentColumn(DmSqlParser.CommentColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code commentColumn}
	 * labeled alternative in {@link DmSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCommentColumn(DmSqlParser.CommentColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createIndex}
	 * labeled alternative in {@link DmSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateIndex(DmSqlParser.CreateIndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createIndex}
	 * labeled alternative in {@link DmSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateIndex(DmSqlParser.CreateIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#createTableHeader}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableHeader(DmSqlParser.CreateTableHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#createTableHeader}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableHeader(DmSqlParser.CreateTableHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#tableStorage}.
	 * @param ctx the parse tree
	 */
	void enterTableStorage(DmSqlParser.TableStorageContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#tableStorage}.
	 * @param ctx the parse tree
	 */
	void exitTableStorage(DmSqlParser.TableStorageContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#userName}.
	 * @param ctx the parse tree
	 */
	void enterUserName(DmSqlParser.UserNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#userName}.
	 * @param ctx the parse tree
	 */
	void exitUserName(DmSqlParser.UserNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#tableIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterTableIdentifier(DmSqlParser.TableIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#tableIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitTableIdentifier(DmSqlParser.TableIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#columnIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterColumnIdentifier(DmSqlParser.ColumnIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#columnIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitColumnIdentifier(DmSqlParser.ColumnIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#indexList}.
	 * @param ctx the parse tree
	 */
	void enterIndexList(DmSqlParser.IndexListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#indexList}.
	 * @param ctx the parse tree
	 */
	void exitIndexList(DmSqlParser.IndexListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#indexIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterIndexIdentifier(DmSqlParser.IndexIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#indexIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitIndexIdentifier(DmSqlParser.IndexIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#columnName}.
	 * @param ctx the parse tree
	 */
	void enterColumnName(DmSqlParser.ColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#columnName}.
	 * @param ctx the parse tree
	 */
	void exitColumnName(DmSqlParser.ColumnNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#columnComment}.
	 * @param ctx the parse tree
	 */
	void enterColumnComment(DmSqlParser.ColumnCommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#columnComment}.
	 * @param ctx the parse tree
	 */
	void exitColumnComment(DmSqlParser.ColumnCommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#description}.
	 * @param ctx the parse tree
	 */
	void enterDescription(DmSqlParser.DescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#description}.
	 * @param ctx the parse tree
	 */
	void exitDescription(DmSqlParser.DescriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#columnIndex}.
	 * @param ctx the parse tree
	 */
	void enterColumnIndex(DmSqlParser.ColumnIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#columnIndex}.
	 * @param ctx the parse tree
	 */
	void exitColumnIndex(DmSqlParser.ColumnIndexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primitiveDataType}
	 * labeled alternative in {@link DmSqlParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveDataType(DmSqlParser.PrimitiveDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primitiveDataType}
	 * labeled alternative in {@link DmSqlParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveDataType(DmSqlParser.PrimitiveDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#colTypeList}.
	 * @param ctx the parse tree
	 */
	void enterColTypeList(DmSqlParser.ColTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#colTypeList}.
	 * @param ctx the parse tree
	 */
	void exitColTypeList(DmSqlParser.ColTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#colType}.
	 * @param ctx the parse tree
	 */
	void enterColType(DmSqlParser.ColTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#colType}.
	 * @param ctx the parse tree
	 */
	void exitColType(DmSqlParser.ColTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#autoIncrement}.
	 * @param ctx the parse tree
	 */
	void enterAutoIncrement(DmSqlParser.AutoIncrementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#autoIncrement}.
	 * @param ctx the parse tree
	 */
	void exitAutoIncrement(DmSqlParser.AutoIncrementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#seed}.
	 * @param ctx the parse tree
	 */
	void enterSeed(DmSqlParser.SeedContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#seed}.
	 * @param ctx the parse tree
	 */
	void exitSeed(DmSqlParser.SeedContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#incr}.
	 * @param ctx the parse tree
	 */
	void enterIncr(DmSqlParser.IncrContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#incr}.
	 * @param ctx the parse tree
	 */
	void exitIncr(DmSqlParser.IncrContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#primaryKeyList}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryKeyList(DmSqlParser.PrimaryKeyListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#primaryKeyList}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryKeyList(DmSqlParser.PrimaryKeyListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#primaryKey}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryKey(DmSqlParser.PrimaryKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#primaryKey}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryKey(DmSqlParser.PrimaryKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#uniqueColumnList}.
	 * @param ctx the parse tree
	 */
	void enterUniqueColumnList(DmSqlParser.UniqueColumnListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#uniqueColumnList}.
	 * @param ctx the parse tree
	 */
	void exitUniqueColumnList(DmSqlParser.UniqueColumnListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#uniqueColumn}.
	 * @param ctx the parse tree
	 */
	void enterUniqueColumn(DmSqlParser.UniqueColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#uniqueColumn}.
	 * @param ctx the parse tree
	 */
	void exitUniqueColumn(DmSqlParser.UniqueColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#spatialColumnList}.
	 * @param ctx the parse tree
	 */
	void enterSpatialColumnList(DmSqlParser.SpatialColumnListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#spatialColumnList}.
	 * @param ctx the parse tree
	 */
	void exitSpatialColumnList(DmSqlParser.SpatialColumnListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#spatialColumn}.
	 * @param ctx the parse tree
	 */
	void enterSpatialColumn(DmSqlParser.SpatialColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#spatialColumn}.
	 * @param ctx the parse tree
	 */
	void exitSpatialColumn(DmSqlParser.SpatialColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#fullTextColumnList}.
	 * @param ctx the parse tree
	 */
	void enterFullTextColumnList(DmSqlParser.FullTextColumnListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#fullTextColumnList}.
	 * @param ctx the parse tree
	 */
	void exitFullTextColumnList(DmSqlParser.FullTextColumnListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#fullTextColumn}.
	 * @param ctx the parse tree
	 */
	void enterFullTextColumn(DmSqlParser.FullTextColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#fullTextColumn}.
	 * @param ctx the parse tree
	 */
	void exitFullTextColumn(DmSqlParser.FullTextColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(DmSqlParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(DmSqlParser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#tableComment}.
	 * @param ctx the parse tree
	 */
	void enterTableComment(DmSqlParser.TableCommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#tableComment}.
	 * @param ctx the parse tree
	 */
	void exitTableComment(DmSqlParser.TableCommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(DmSqlParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(DmSqlParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link DmSqlParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterUnquotedIdentifier(DmSqlParser.UnquotedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link DmSqlParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitUnquotedIdentifier(DmSqlParser.UnquotedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code quotedIdentifierAlternative}
	 * labeled alternative in {@link DmSqlParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterQuotedIdentifierAlternative(DmSqlParser.QuotedIdentifierAlternativeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code quotedIdentifierAlternative}
	 * labeled alternative in {@link DmSqlParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitQuotedIdentifierAlternative(DmSqlParser.QuotedIdentifierAlternativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#quotedIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterQuotedIdentifier(DmSqlParser.QuotedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#quotedIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitQuotedIdentifier(DmSqlParser.QuotedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmSqlParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(DmSqlParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmSqlParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(DmSqlParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link DmSqlParser#number}.
	 * @param ctx the parse tree
	 */
	void enterDecimalLiteral(DmSqlParser.DecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link DmSqlParser#number}.
	 * @param ctx the parse tree
	 */
	void exitDecimalLiteral(DmSqlParser.DecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link DmSqlParser#number}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(DmSqlParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link DmSqlParser#number}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(DmSqlParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bigIntLiteral}
	 * labeled alternative in {@link DmSqlParser#number}.
	 * @param ctx the parse tree
	 */
	void enterBigIntLiteral(DmSqlParser.BigIntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bigIntLiteral}
	 * labeled alternative in {@link DmSqlParser#number}.
	 * @param ctx the parse tree
	 */
	void exitBigIntLiteral(DmSqlParser.BigIntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code smallIntLiteral}
	 * labeled alternative in {@link DmSqlParser#number}.
	 * @param ctx the parse tree
	 */
	void enterSmallIntLiteral(DmSqlParser.SmallIntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code smallIntLiteral}
	 * labeled alternative in {@link DmSqlParser#number}.
	 * @param ctx the parse tree
	 */
	void exitSmallIntLiteral(DmSqlParser.SmallIntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tinyIntLiteral}
	 * labeled alternative in {@link DmSqlParser#number}.
	 * @param ctx the parse tree
	 */
	void enterTinyIntLiteral(DmSqlParser.TinyIntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tinyIntLiteral}
	 * labeled alternative in {@link DmSqlParser#number}.
	 * @param ctx the parse tree
	 */
	void exitTinyIntLiteral(DmSqlParser.TinyIntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doubleLiteral}
	 * labeled alternative in {@link DmSqlParser#number}.
	 * @param ctx the parse tree
	 */
	void enterDoubleLiteral(DmSqlParser.DoubleLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doubleLiteral}
	 * labeled alternative in {@link DmSqlParser#number}.
	 * @param ctx the parse tree
	 */
	void exitDoubleLiteral(DmSqlParser.DoubleLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bigDecimalLiteral}
	 * labeled alternative in {@link DmSqlParser#number}.
	 * @param ctx the parse tree
	 */
	void enterBigDecimalLiteral(DmSqlParser.BigDecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bigDecimalLiteral}
	 * labeled alternative in {@link DmSqlParser#number}.
	 * @param ctx the parse tree
	 */
	void exitBigDecimalLiteral(DmSqlParser.BigDecimalLiteralContext ctx);
}