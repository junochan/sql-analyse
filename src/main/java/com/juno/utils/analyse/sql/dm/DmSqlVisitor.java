package com.juno.utils.analyse.sql.dm;// Generated from F:/workspace/java/sql-analyse/sql-analyse/src/main/resources/DmSql.g4 by ANTLR 4.13.1

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DmSqlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DmSqlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#singleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleStatement(DmSqlParser.SingleStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#multiStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiStatement(DmSqlParser.MultiStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createDmTable}
	 * labeled alternative in {@link DmSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateDmTable(DmSqlParser.CreateDmTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code commentTable}
	 * labeled alternative in {@link DmSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommentTable(DmSqlParser.CommentTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code commentColumn}
	 * labeled alternative in {@link DmSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommentColumn(DmSqlParser.CommentColumnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createIndex}
	 * labeled alternative in {@link DmSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateIndex(DmSqlParser.CreateIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#createTableHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableHeader(DmSqlParser.CreateTableHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#tableStorage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableStorage(DmSqlParser.TableStorageContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#userName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserName(DmSqlParser.UserNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#tableIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableIdentifier(DmSqlParser.TableIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#columnIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnIdentifier(DmSqlParser.ColumnIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#indexList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexList(DmSqlParser.IndexListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#indexIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexIdentifier(DmSqlParser.IndexIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#columnName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnName(DmSqlParser.ColumnNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#columnComment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnComment(DmSqlParser.ColumnCommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#description}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescription(DmSqlParser.DescriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#columnIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnIndex(DmSqlParser.ColumnIndexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primitiveDataType}
	 * labeled alternative in {@link DmSqlParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveDataType(DmSqlParser.PrimitiveDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#colTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColTypeList(DmSqlParser.ColTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#colType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColType(DmSqlParser.ColTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#autoIncrement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAutoIncrement(DmSqlParser.AutoIncrementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#seed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeed(DmSqlParser.SeedContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#incr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncr(DmSqlParser.IncrContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#primaryKeyList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryKeyList(DmSqlParser.PrimaryKeyListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#primaryKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryKey(DmSqlParser.PrimaryKeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#uniqueColumnList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUniqueColumnList(DmSqlParser.UniqueColumnListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#uniqueColumn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUniqueColumn(DmSqlParser.UniqueColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#spatialColumnList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpatialColumnList(DmSqlParser.SpatialColumnListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#spatialColumn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpatialColumn(DmSqlParser.SpatialColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#fullTextColumnList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullTextColumnList(DmSqlParser.FullTextColumnListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#fullTextColumn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullTextColumn(DmSqlParser.FullTextColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#defaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultValue(DmSqlParser.DefaultValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#tableComment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableComment(DmSqlParser.TableCommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(DmSqlParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link DmSqlParser#strictIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnquotedIdentifier(DmSqlParser.UnquotedIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code quotedIdentifierAlternative}
	 * labeled alternative in {@link DmSqlParser#strictIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuotedIdentifierAlternative(DmSqlParser.QuotedIdentifierAlternativeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#quotedIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuotedIdentifier(DmSqlParser.QuotedIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link DmSqlParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(DmSqlParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link DmSqlParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalLiteral(DmSqlParser.DecimalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link DmSqlParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(DmSqlParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bigIntLiteral}
	 * labeled alternative in {@link DmSqlParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBigIntLiteral(DmSqlParser.BigIntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code smallIntLiteral}
	 * labeled alternative in {@link DmSqlParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmallIntLiteral(DmSqlParser.SmallIntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tinyIntLiteral}
	 * labeled alternative in {@link DmSqlParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTinyIntLiteral(DmSqlParser.TinyIntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doubleLiteral}
	 * labeled alternative in {@link DmSqlParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleLiteral(DmSqlParser.DoubleLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bigDecimalLiteral}
	 * labeled alternative in {@link DmSqlParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBigDecimalLiteral(DmSqlParser.BigDecimalLiteralContext ctx);
}