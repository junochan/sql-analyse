package com.juno.utils.analyse.sql.dm;// Generated from F:/workspace/java/sql-analyse/sql-analyse/src/main/resources/DmSql.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class DmSqlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, SELECT=7, FROM=8, ADD=9, 
		AS=10, ALL=11, DISTINCT=12, WHERE=13, GROUP=14, BY=15, GROUPING=16, SETS=17, 
		CUBE=18, ROLLUP=19, ORDER=20, HAVING=21, LIMIT=22, AT=23, OR=24, AND=25, 
		IN=26, NOT=27, NO=28, IDENTITY=29, DEFAULT=30, EXISTS=31, BETWEEN=32, 
		LIKE=33, RLIKE=34, IS=35, NULL=36, TRUE=37, FALSE=38, NULLS=39, ASC=40, 
		DESC=41, FOR=42, INTERVAL=43, CASE=44, WHEN=45, THEN=46, ELSE=47, END=48, 
		JOIN=49, CROSS=50, OUTER=51, INNER=52, LEFT=53, SEMI=54, RIGHT=55, FULL=56, 
		NATURAL=57, ON=58, LATERAL=59, WINDOW=60, OVER=61, PARTITION=62, RANGE=63, 
		ROWS=64, UNBOUNDED=65, PRECEDING=66, FOLLOWING=67, CURRENT=68, FIRST=69, 
		AFTER=70, LAST=71, ROW=72, WITH=73, VALUES=74, CREATE=75, TABLE=76, DIRECTORY=77, 
		VIEW=78, REPLACE=79, INSERT=80, DELETE=81, INTO=82, DESCRIBE=83, EXPLAIN=84, 
		FORMAT=85, LOGICAL=86, CODEGEN=87, COST=88, CAST=89, SHOW=90, TABLES=91, 
		COLUMNS=92, COLUMN=93, USE=94, PARTITIONS=95, FUNCTIONS=96, DROP=97, UNION=98, 
		EXCEPT=99, SETMINUS=100, INTERSECT=101, TO=102, TABLESAMPLE=103, STRATIFY=104, 
		ALTER=105, RENAME=106, ARRAY=107, MAP=108, STRUCT=109, COMMENT=110, SET=111, 
		RESET=112, DATA=113, START=114, TRANSACTION=115, COMMIT=116, ROLLBACK=117, 
		MACRO=118, IGNORE=119, BOTH=120, LEADING=121, TRAILING=122, CLUSTERBTR=123, 
		IF=124, POSITION=125, CHAR=126, EQ=127, NSEQ=128, NEQ=129, NEQJ=130, LT=131, 
		LTE=132, GT=133, GTE=134, PLUS=135, MINUS=136, ASTERISK=137, SLASH=138, 
		PERCENT=139, DIV=140, TILDE=141, AMPERSAND=142, PIPE=143, CONCAT_PIPE=144, 
		HAT=145, PERCENTLIT=146, BUCKET=147, OUT=148, OF=149, SORT=150, UNIQUE=151, 
		FULLTEXT=152, SPATIAL=153, CLUSTER=154, CONSTRAINT=155, CHECK=156, PRIMARY=157, 
		KEY=158, DISTRIBUTE=159, OVERWRITE=160, TRANSFORM=161, REDUCE=162, USING=163, 
		SERDE=164, SERDEPROPERTIES=165, RECORDREADER=166, RECORDWRITER=167, DELIMITED=168, 
		FIELDS=169, TERMINATED=170, COLLECTION=171, ITEMS=172, KEYS=173, ESCAPED=174, 
		LINES=175, SEPARATED=176, FUNCTION=177, EXTENDED=178, REFRESH=179, CLEAR=180, 
		CACHE=181, UNCACHE=182, LAZY=183, FORMATTED=184, GLOBAL=185, TEMPORARY=186, 
		OPTIONS=187, UNSET=188, TBLPROPERTIES=189, DBPROPERTIES=190, BUCKETS=191, 
		SKEWED=192, STORED=193, DIRECTORIES=194, LOCATION=195, EXCHANGE=196, ARCHIVE=197, 
		UNARCHIVE=198, FILEFORMAT=199, TOUCH=200, COMPACT=201, CONCATENATE=202, 
		CHANGE=203, CASCADE=204, RESTRICT=205, CLUSTERED=206, SORTED=207, PURGE=208, 
		INPUTFORMAT=209, OUTPUTFORMAT=210, DATABASE=211, DATABASES=212, DFS=213, 
		TRUNCATE=214, ANALYZE=215, COMPUTE=216, LIST=217, STATISTICS=218, PARTITIONED=219, 
		EXTERNAL=220, DEFINED=221, REVOKE=222, GRANT=223, LOCK=224, UNLOCK=225, 
		MSCK=226, REPAIR=227, RECOVER=228, EXPORT=229, IMPORT=230, LOAD=231, ROLE=232, 
		ROLES=233, COMPACTIONS=234, PRINCIPALS=235, TRANSACTIONS=236, INDEX=237, 
		INDEXES=238, LOCKS=239, OPTION=240, ANTI=241, LOCAL=242, INPATH=243, CURRENT_DATE=244, 
		CURRENT_TIMESTAMP=245, STORAGE=246, STRING=247, BIGINT_LITERAL=248, SMALLINT_LITERAL=249, 
		TINYINT_LITERAL=250, BYTELENGTH_LITERAL=251, DECIMAL_VALUE=252, DOUBLE_LITERAL=253, 
		BIGDECIMAL_LITERAL=254, INTEGER_VALUE=255, IDENTIFIER=256, BACKQUOTED_IDENTIFIER=257, 
		SIMPLE_COMMENT=258, BRACKETED_EMPTY_COMMENT=259, BRACKETED_COMMENT=260, 
		WS=261, UNRECOGNIZED=262, DELIMITER=263;
	public static final int
		RULE_singleStatement = 0, RULE_multiStatement = 1, RULE_statement = 2, 
		RULE_createTableHeader = 3, RULE_tableStorage = 4, RULE_userName = 5, 
		RULE_tableIdentifier = 6, RULE_columnIdentifier = 7, RULE_indexList = 8, 
		RULE_indexIdentifier = 9, RULE_columnName = 10, RULE_columnComment = 11, 
		RULE_description = 12, RULE_columnIndex = 13, RULE_dataType = 14, RULE_colTypeList = 15, 
		RULE_colType = 16, RULE_autoIncrement = 17, RULE_seed = 18, RULE_incr = 19, 
		RULE_primaryKeyList = 20, RULE_primaryKey = 21, RULE_uniqueColumnList = 22, 
		RULE_uniqueColumn = 23, RULE_spatialColumnList = 24, RULE_spatialColumn = 25, 
		RULE_fullTextColumnList = 26, RULE_fullTextColumn = 27, RULE_defaultValue = 28, 
		RULE_tableComment = 29, RULE_identifier = 30, RULE_strictIdentifier = 31, 
		RULE_quotedIdentifier = 32, RULE_operator = 33, RULE_number = 34;
	private static String[] makeRuleNames() {
		return new String[] {
			"singleStatement", "multiStatement", "statement", "createTableHeader", 
			"tableStorage", "userName", "tableIdentifier", "columnIdentifier", "indexList", 
			"indexIdentifier", "columnName", "columnComment", "description", "columnIndex", 
			"dataType", "colTypeList", "colType", "autoIncrement", "seed", "incr", 
			"primaryKeyList", "primaryKey", "uniqueColumnList", "uniqueColumn", "spatialColumnList", 
			"spatialColumn", "fullTextColumnList", "fullTextColumn", "defaultValue", 
			"tableComment", "identifier", "strictIdentifier", "quotedIdentifier", 
			"operator", "number"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'('", "')'", "','", "'.'", "'()'", "'SELECT'", "'FROM'", 
			"'ADD'", "'AS'", "'ALL'", "'DISTINCT'", "'WHERE'", "'GROUP'", "'BY'", 
			"'GROUPING'", "'SETS'", "'CUBE'", "'ROLLUP'", "'ORDER'", "'HAVING'", 
			"'LIMIT'", "'AT'", "'OR'", "'AND'", "'IN'", null, "'NO'", "'IDENTITY'", 
			"'DEFAULT'", "'EXISTS'", "'BETWEEN'", "'LIKE'", null, "'IS'", "'NULL'", 
			"'TRUE'", "'FALSE'", "'NULLS'", "'ASC'", "'DESC'", "'FOR'", "'INTERVAL'", 
			"'CASE'", "'WHEN'", "'THEN'", "'ELSE'", "'END'", "'JOIN'", "'CROSS'", 
			"'OUTER'", "'INNER'", "'LEFT'", "'SEMI'", "'RIGHT'", "'FULL'", "'NATURAL'", 
			"'ON'", "'LATERAL'", "'WINDOW'", "'OVER'", "'PARTITION'", "'RANGE'", 
			"'ROWS'", "'UNBOUNDED'", "'PRECEDING'", "'FOLLOWING'", "'CURRENT'", "'FIRST'", 
			"'AFTER'", "'LAST'", "'ROW'", "'WITH'", "'VALUES'", "'CREATE'", "'TABLE'", 
			"'DIRECTORY'", "'VIEW'", "'REPLACE'", "'INSERT'", "'DELETE'", "'INTO'", 
			"'DESCRIBE'", "'EXPLAIN'", "'FORMAT'", "'LOGICAL'", "'CODEGEN'", "'COST'", 
			"'CAST'", "'SHOW'", "'TABLES'", "'COLUMNS'", "'COLUMN'", "'USE'", "'PARTITIONS'", 
			"'FUNCTIONS'", "'DROP'", "'UNION'", "'EXCEPT'", "'MINUS'", "'INTERSECT'", 
			"'TO'", "'TABLESAMPLE'", "'STRATIFY'", "'ALTER'", "'RENAME'", "'ARRAY'", 
			"'MAP'", "'STRUCT'", "'COMMENT'", "'SET'", "'RESET'", "'DATA'", "'START'", 
			"'TRANSACTION'", "'COMMIT'", "'ROLLBACK'", "'MACRO'", "'IGNORE'", "'BOTH'", 
			"'LEADING'", "'TRAILING'", "'CLUSTERBTR'", "'IF'", "'POSITION'", "'CHAR'", 
			null, "'<=>'", "'<>'", "'!='", "'<'", null, "'>'", null, "'+'", "'-'", 
			"'*'", "'/'", "'%'", "'DIV'", "'~'", "'&'", "'|'", "'||'", "'^'", "'PERCENT'", 
			"'BUCKET'", "'OUT'", "'OF'", "'SORT'", "'UNIQUE'", "'FULLTEXT'", "'SPATIAL'", 
			"'CLUSTER'", "'CONSTRAINT'", "'CHECK'", "'PRIMARY'", "'KEY'", "'DISTRIBUTE'", 
			"'OVERWRITE'", "'TRANSFORM'", "'REDUCE'", "'USING'", "'SERDE'", "'SERDEPROPERTIES'", 
			"'RECORDREADER'", "'RECORDWRITER'", "'DELIMITED'", "'FIELDS'", "'TERMINATED'", 
			"'COLLECTION'", "'ITEMS'", "'KEYS'", "'ESCAPED'", "'LINES'", "'SEPARATED'", 
			"'FUNCTION'", "'EXTENDED'", "'REFRESH'", "'CLEAR'", "'CACHE'", "'UNCACHE'", 
			"'LAZY'", "'FORMATTED'", "'GLOBAL'", null, "'OPTIONS'", "'UNSET'", "'TBLPROPERTIES'", 
			"'DBPROPERTIES'", "'BUCKETS'", "'SKEWED'", "'STORED'", "'DIRECTORIES'", 
			"'LOCATION'", "'EXCHANGE'", "'ARCHIVE'", "'UNARCHIVE'", "'FILEFORMAT'", 
			"'TOUCH'", "'COMPACT'", "'CONCATENATE'", "'CHANGE'", "'CASCADE'", "'RESTRICT'", 
			"'CLUSTERED'", "'SORTED'", "'PURGE'", "'INPUTFORMAT'", "'OUTPUTFORMAT'", 
			null, null, "'DFS'", "'TRUNCATE'", "'ANALYZE'", "'COMPUTE'", "'LIST'", 
			"'STATISTICS'", "'PARTITIONED'", "'EXTERNAL'", "'DEFINED'", "'REVOKE'", 
			"'GRANT'", "'LOCK'", "'UNLOCK'", "'MSCK'", "'REPAIR'", "'RECOVER'", "'EXPORT'", 
			"'IMPORT'", "'LOAD'", "'ROLE'", "'ROLES'", "'COMPACTIONS'", "'PRINCIPALS'", 
			"'TRANSACTIONS'", "'INDEX'", "'INDEXES'", "'LOCKS'", "'OPTION'", "'ANTI'", 
			"'LOCAL'", "'INPATH'", "'CURRENT_DATE'", "'CURRENT_TIMESTAMP'", "'STORAGE'", 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"'/**/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "SELECT", "FROM", "ADD", "AS", 
			"ALL", "DISTINCT", "WHERE", "GROUP", "BY", "GROUPING", "SETS", "CUBE", 
			"ROLLUP", "ORDER", "HAVING", "LIMIT", "AT", "OR", "AND", "IN", "NOT", 
			"NO", "IDENTITY", "DEFAULT", "EXISTS", "BETWEEN", "LIKE", "RLIKE", "IS", 
			"NULL", "TRUE", "FALSE", "NULLS", "ASC", "DESC", "FOR", "INTERVAL", "CASE", 
			"WHEN", "THEN", "ELSE", "END", "JOIN", "CROSS", "OUTER", "INNER", "LEFT", 
			"SEMI", "RIGHT", "FULL", "NATURAL", "ON", "LATERAL", "WINDOW", "OVER", 
			"PARTITION", "RANGE", "ROWS", "UNBOUNDED", "PRECEDING", "FOLLOWING", 
			"CURRENT", "FIRST", "AFTER", "LAST", "ROW", "WITH", "VALUES", "CREATE", 
			"TABLE", "DIRECTORY", "VIEW", "REPLACE", "INSERT", "DELETE", "INTO", 
			"DESCRIBE", "EXPLAIN", "FORMAT", "LOGICAL", "CODEGEN", "COST", "CAST", 
			"SHOW", "TABLES", "COLUMNS", "COLUMN", "USE", "PARTITIONS", "FUNCTIONS", 
			"DROP", "UNION", "EXCEPT", "SETMINUS", "INTERSECT", "TO", "TABLESAMPLE", 
			"STRATIFY", "ALTER", "RENAME", "ARRAY", "MAP", "STRUCT", "COMMENT", "SET", 
			"RESET", "DATA", "START", "TRANSACTION", "COMMIT", "ROLLBACK", "MACRO", 
			"IGNORE", "BOTH", "LEADING", "TRAILING", "CLUSTERBTR", "IF", "POSITION", 
			"CHAR", "EQ", "NSEQ", "NEQ", "NEQJ", "LT", "LTE", "GT", "GTE", "PLUS", 
			"MINUS", "ASTERISK", "SLASH", "PERCENT", "DIV", "TILDE", "AMPERSAND", 
			"PIPE", "CONCAT_PIPE", "HAT", "PERCENTLIT", "BUCKET", "OUT", "OF", "SORT", 
			"UNIQUE", "FULLTEXT", "SPATIAL", "CLUSTER", "CONSTRAINT", "CHECK", "PRIMARY", 
			"KEY", "DISTRIBUTE", "OVERWRITE", "TRANSFORM", "REDUCE", "USING", "SERDE", 
			"SERDEPROPERTIES", "RECORDREADER", "RECORDWRITER", "DELIMITED", "FIELDS", 
			"TERMINATED", "COLLECTION", "ITEMS", "KEYS", "ESCAPED", "LINES", "SEPARATED", 
			"FUNCTION", "EXTENDED", "REFRESH", "CLEAR", "CACHE", "UNCACHE", "LAZY", 
			"FORMATTED", "GLOBAL", "TEMPORARY", "OPTIONS", "UNSET", "TBLPROPERTIES", 
			"DBPROPERTIES", "BUCKETS", "SKEWED", "STORED", "DIRECTORIES", "LOCATION", 
			"EXCHANGE", "ARCHIVE", "UNARCHIVE", "FILEFORMAT", "TOUCH", "COMPACT", 
			"CONCATENATE", "CHANGE", "CASCADE", "RESTRICT", "CLUSTERED", "SORTED", 
			"PURGE", "INPUTFORMAT", "OUTPUTFORMAT", "DATABASE", "DATABASES", "DFS", 
			"TRUNCATE", "ANALYZE", "COMPUTE", "LIST", "STATISTICS", "PARTITIONED", 
			"EXTERNAL", "DEFINED", "REVOKE", "GRANT", "LOCK", "UNLOCK", "MSCK", "REPAIR", 
			"RECOVER", "EXPORT", "IMPORT", "LOAD", "ROLE", "ROLES", "COMPACTIONS", 
			"PRINCIPALS", "TRANSACTIONS", "INDEX", "INDEXES", "LOCKS", "OPTION", 
			"ANTI", "LOCAL", "INPATH", "CURRENT_DATE", "CURRENT_TIMESTAMP", "STORAGE", 
			"STRING", "BIGINT_LITERAL", "SMALLINT_LITERAL", "TINYINT_LITERAL", "BYTELENGTH_LITERAL", 
			"DECIMAL_VALUE", "DOUBLE_LITERAL", "BIGDECIMAL_LITERAL", "INTEGER_VALUE", 
			"IDENTIFIER", "BACKQUOTED_IDENTIFIER", "SIMPLE_COMMENT", "BRACKETED_EMPTY_COMMENT", 
			"BRACKETED_COMMENT", "WS", "UNRECOGNIZED", "DELIMITER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "DmSql.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	  /**
	   * Verify whether current token is a valid decimal token (which contains dot).
	   * Returns true if the character that follows the token is not a digit or letter or underscore.
	   *
	   * For example:
	   * For char stream "2.3", "2." is not a valid decimal token, because it is followed by digit '3'.
	   * For char stream "2.3_", "2.3" is not a valid decimal token, because it is followed by '_'.
	   * For char stream "2.3W", "2.3" is not a valid decimal token, because it is followed by 'W'.
	   * For char stream "12.0D 34.E2+0.12 "  12.0D is a valid decimal token because it is folllowed
	   * by a space. 34.E2 is a valid decimal token because it is followed by symbol '+'
	   * which is not a digit or letter or underscore.
	   */
	  public boolean isValidDecimal() {
	    int nextChar = _input.LA(1);
	    if (nextChar >= 'A' && nextChar <= 'Z' || nextChar >= '0' && nextChar <= '9' ||
	      nextChar == '_') {
	      return false;
	    } else {
	      return true;
	    }
	  }

	public DmSqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SingleStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode EOF() { return getToken(DmSqlParser.EOF, 0); }
		public SingleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).enterSingleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).exitSingleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DmSqlVisitor ) return ((DmSqlVisitor<? extends T>)visitor).visitSingleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleStatementContext singleStatement() throws RecognitionException {
		SingleStatementContext _localctx = new SingleStatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_singleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			statement();
			setState(71);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultiStatementContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MultiStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).enterMultiStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).exitMultiStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DmSqlVisitor ) return ((DmSqlVisitor<? extends T>)visitor).visitMultiStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiStatementContext multiStatement() throws RecognitionException {
		MultiStatementContext _localctx = new MultiStatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_multiStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CREATE || _la==COMMENT) {
				{
				{
				setState(73);
				statement();
				setState(74);
				match(T__0);
				}
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CommentTableContext extends StatementContext {
		public TerminalNode COMMENT() { return getToken(DmSqlParser.COMMENT, 0); }
		public TerminalNode ON() { return getToken(DmSqlParser.ON, 0); }
		public TerminalNode TABLE() { return getToken(DmSqlParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode IS() { return getToken(DmSqlParser.IS, 0); }
		public TableCommentContext tableComment() {
			return getRuleContext(TableCommentContext.class,0);
		}
		public CommentTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).enterCommentTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).exitCommentTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DmSqlVisitor ) return ((DmSqlVisitor<? extends T>)visitor).visitCommentTable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CreateDmTableContext extends StatementContext {
		public CreateTableHeaderContext createTableHeader() {
			return getRuleContext(CreateTableHeaderContext.class,0);
		}
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TableStorageContext tableStorage() {
			return getRuleContext(TableStorageContext.class,0);
		}
		public CreateDmTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).enterCreateDmTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).exitCreateDmTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DmSqlVisitor ) return ((DmSqlVisitor<? extends T>)visitor).visitCreateDmTable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CommentColumnContext extends StatementContext {
		public TerminalNode COMMENT() { return getToken(DmSqlParser.COMMENT, 0); }
		public TerminalNode ON() { return getToken(DmSqlParser.ON, 0); }
		public TerminalNode COLUMN() { return getToken(DmSqlParser.COLUMN, 0); }
		public ColumnIdentifierContext columnIdentifier() {
			return getRuleContext(ColumnIdentifierContext.class,0);
		}
		public TerminalNode IS() { return getToken(DmSqlParser.IS, 0); }
		public ColumnCommentContext columnComment() {
			return getRuleContext(ColumnCommentContext.class,0);
		}
		public CommentColumnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).enterCommentColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).exitCommentColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DmSqlVisitor ) return ((DmSqlVisitor<? extends T>)visitor).visitCommentColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CreateIndexContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(DmSqlParser.CREATE, 0); }
		public TerminalNode INDEX() { return getToken(DmSqlParser.INDEX, 0); }
		public ColumnIndexContext columnIndex() {
			return getRuleContext(ColumnIndexContext.class,0);
		}
		public TerminalNode ON() { return getToken(DmSqlParser.ON, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public IndexListContext indexList() {
			return getRuleContext(IndexListContext.class,0);
		}
		public TableStorageContext tableStorage() {
			return getRuleContext(TableStorageContext.class,0);
		}
		public CreateIndexContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).enterCreateIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).exitCreateIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DmSqlVisitor ) return ((DmSqlVisitor<? extends T>)visitor).visitCreateIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		int _la;
		try {
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new CreateDmTableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				createTableHeader();
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(82);
					match(T__1);
					setState(83);
					colTypeList();
					setState(84);
					match(T__2);
					}
				}

				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STORAGE) {
					{
					setState(88);
					tableStorage();
					}
				}

				}
				break;
			case 2:
				_localctx = new CommentTableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				match(COMMENT);
				setState(92);
				match(ON);
				setState(93);
				match(TABLE);
				setState(94);
				tableIdentifier();
				setState(95);
				match(IS);
				setState(96);
				tableComment();
				}
				break;
			case 3:
				_localctx = new CommentColumnContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(98);
				match(COMMENT);
				setState(99);
				match(ON);
				setState(100);
				match(COLUMN);
				setState(101);
				columnIdentifier();
				setState(102);
				match(IS);
				setState(103);
				columnComment();
				}
				break;
			case 4:
				_localctx = new CreateIndexContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(105);
				match(CREATE);
				setState(106);
				match(INDEX);
				setState(107);
				columnIndex();
				setState(108);
				match(ON);
				setState(109);
				tableIdentifier();
				setState(110);
				match(T__1);
				setState(111);
				indexList();
				setState(112);
				match(T__2);
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STORAGE) {
					{
					setState(113);
					tableStorage();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CreateTableHeaderContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(DmSqlParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(DmSqlParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(DmSqlParser.IF, 0); }
		public TerminalNode NOT() { return getToken(DmSqlParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(DmSqlParser.EXISTS, 0); }
		public CreateTableHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).enterCreateTableHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).exitCreateTableHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DmSqlVisitor ) return ((DmSqlVisitor<? extends T>)visitor).visitCreateTableHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableHeaderContext createTableHeader() throws RecognitionException {
		CreateTableHeaderContext _localctx = new CreateTableHeaderContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_createTableHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(CREATE);
			setState(119);
			match(TABLE);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(120);
				match(IF);
				setState(121);
				match(NOT);
				setState(122);
				match(EXISTS);
				}
			}

			setState(125);
			tableIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TableStorageContext extends ParserRuleContext {
		public TerminalNode STORAGE() { return getToken(DmSqlParser.STORAGE, 0); }
		public TerminalNode ON() { return getToken(DmSqlParser.ON, 0); }
		public UserNameContext userName() {
			return getRuleContext(UserNameContext.class,0);
		}
		public TerminalNode CLUSTERBTR() { return getToken(DmSqlParser.CLUSTERBTR, 0); }
		public TableStorageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableStorage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).enterTableStorage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).exitTableStorage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DmSqlVisitor ) return ((DmSqlVisitor<? extends T>)visitor).visitTableStorage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableStorageContext tableStorage() throws RecognitionException {
		TableStorageContext _localctx = new TableStorageContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tableStorage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(STORAGE);
			setState(128);
			match(T__1);
			setState(129);
			match(ON);
			setState(130);
			userName();
			setState(131);
			match(T__3);
			setState(132);
			match(CLUSTERBTR);
			setState(133);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UserNameContext extends ParserRuleContext {
		public Token name;
		public TerminalNode STRING() { return getToken(DmSqlParser.STRING, 0); }
		public UserNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).enterUserName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).exitUserName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DmSqlVisitor ) return ((DmSqlVisitor<? extends T>)visitor).visitUserName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UserNameContext userName() throws RecognitionException {
		UserNameContext _localctx = new UserNameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_userName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			((UserNameContext)_localctx).name = match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TableIdentifierContext extends ParserRuleContext {
		public Token db;
		public Token table;
		public List<TerminalNode> STRING() { return getTokens(DmSqlParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(DmSqlParser.STRING, i);
		}
		public TableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).enterTableIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).exitTableIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DmSqlVisitor ) return ((DmSqlVisitor<? extends T>)visitor).visitTableIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableIdentifierContext tableIdentifier() throws RecognitionException {
		TableIdentifierContext _localctx = new TableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(137);
				((TableIdentifierContext)_localctx).db = match(STRING);
				setState(138);
				match(T__4);
				}
				break;
			}
			setState(141);
			((TableIdentifierContext)_localctx).table = match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnIdentifierContext extends ParserRuleContext {
		public Token db;
		public Token table;
		public List<TerminalNode> STRING() { return getTokens(DmSqlParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(DmSqlParser.STRING, i);
		}
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public ColumnIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).enterColumnIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).exitColumnIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DmSqlVisitor ) return ((DmSqlVisitor<? extends T>)visitor).visitColumnIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnIdentifierContext columnIdentifier() throws RecognitionException {
		ColumnIdentifierContext _localctx = new ColumnIdentifierContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_columnIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(143);
				((ColumnIdentifierContext)_localctx).db = match(STRING);
				setState(144);
				match(T__4);
				}
				break;
			}
			setState(147);
			((ColumnIdentifierContext)_localctx).table = match(STRING);
			{
			setState(148);
			match(T__4);
			setState(149);
			columnName();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IndexListContext extends ParserRuleContext {
		public List<IndexIdentifierContext> indexIdentifier() {
			return getRuleContexts(IndexIdentifierContext.class);
		}
		public IndexIdentifierContext indexIdentifier(int i) {
			return getRuleContext(IndexIdentifierContext.class,i);
		}
		public IndexListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).enterIndexList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).exitIndexList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DmSqlVisitor ) return ((DmSqlVisitor<? extends T>)visitor).visitIndexList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexListContext indexList() throws RecognitionException {
		IndexListContext _localctx = new IndexListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_indexList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			indexIdentifier();
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(152);
				match(T__3);
				setState(153);
				indexIdentifier();
				}
				}
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IndexIdentifierContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode ASC() { return getToken(DmSqlParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(DmSqlParser.DESC, 0); }
		public IndexIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).enterIndexIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).exitIndexIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DmSqlVisitor ) return ((DmSqlVisitor<? extends T>)visitor).visitIndexIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexIdentifierContext indexIdentifier() throws RecognitionException {
		IndexIdentifierContext _localctx = new IndexIdentifierContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_indexIdentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			columnName();
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(160);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnNameContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(DmSqlParser.STRING, 0); }
		public ColumnNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).enterColumnName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).exitColumnName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DmSqlVisitor ) return ((DmSqlVisitor<? extends T>)visitor).visitColumnName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnNameContext columnName() throws RecognitionException {
		ColumnNameContext _localctx = new ColumnNameContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_columnName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnCommentContext extends ParserRuleContext {
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public ColumnCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnComment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).enterColumnComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).exitColumnComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DmSqlVisitor ) return ((DmSqlVisitor<? extends T>)visitor).visitColumnComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnCommentContext columnComment() throws RecognitionException {
		ColumnCommentContext _localctx = new ColumnCommentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_columnComment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			description();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DescriptionContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(DmSqlParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(DmSqlParser.STRING, i);
		}
		public DescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_description; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).enterDescription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).exitDescription(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DmSqlVisitor ) return ((DmSqlVisitor<? extends T>)visitor).visitDescription(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescriptionContext description() throws RecognitionException {
		DescriptionContext _localctx = new DescriptionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_description);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(STRING);
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRING) {
				{
				{
				setState(168);
				match(STRING);
				}
				}
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnIndexContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(DmSqlParser.STRING, 0); }
		public ColumnIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnIndex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).enterColumnIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).exitColumnIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DmSqlVisitor ) return ((DmSqlVisitor<? extends T>)visitor).visitColumnIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnIndexContext columnIndex() throws RecognitionException {
		ColumnIndexContext _localctx = new ColumnIndexContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_columnIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DataTypeContext extends ParserRuleContext {
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
	 
		public DataTypeContext() { }
		public void copyFrom(DataTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimitiveDataTypeContext extends DataTypeContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> INTEGER_VALUE() { return getTokens(DmSqlParser.INTEGER_VALUE); }
		public TerminalNode INTEGER_VALUE(int i) {
			return getToken(DmSqlParser.INTEGER_VALUE, i);
		}
		public TerminalNode CHAR() { return getToken(DmSqlParser.CHAR, 0); }
		public PrimitiveDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).enterPrimitiveDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).exitPrimitiveDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DmSqlVisitor ) return ((DmSqlVisitor<? extends T>)visitor).visitPrimitiveDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_dataType);
		int _la;
		try {
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new PrimitiveDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				identifier();
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(177);
					match(T__1);
					setState(178);
					match(INTEGER_VALUE);
					{
					setState(183);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(179);
						match(T__3);
						setState(180);
						match(INTEGER_VALUE);
						}
						}
						setState(185);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					setState(186);
					match(T__2);
					}
				}

				}
				break;
			case 2:
				_localctx = new PrimitiveDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				identifier();
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(190);
					match(T__1);
					setState(191);
					match(INTEGER_VALUE);
					setState(192);
					match(CHAR);
					setState(193);
					match(T__2);
					}
				}

				}
				break;
			case 3:
				_localctx = new PrimitiveDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(196);
				match(CHAR);
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(197);
					match(T__1);
					setState(198);
					match(INTEGER_VALUE);
					setState(199);
					match(T__2);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColTypeListContext extends ParserRuleContext {
		public List<ColTypeContext> colType() {
			return getRuleContexts(ColTypeContext.class);
		}
		public ColTypeContext colType(int i) {
			return getRuleContext(ColTypeContext.class,i);
		}
		public ColTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).enterColTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).exitColTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DmSqlVisitor ) return ((DmSqlVisitor<? extends T>)visitor).visitColTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColTypeListContext colTypeList() throws RecognitionException {
		ColTypeListContext _localctx = new ColTypeListContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_colTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			colType();
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(205);
				match(T__3);
				setState(206);
				colType();
				}
				}
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColTypeContext extends ParserRuleContext {
		public Token notNull;
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public AutoIncrementContext autoIncrement() {
			return getRuleContext(AutoIncrementContext.class,0);
		}
		public TerminalNode NULL() { return getToken(DmSqlParser.NULL, 0); }
		public TerminalNode DEFAULT() { return getToken(DmSqlParser.DEFAULT, 0); }
		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(DmSqlParser.COMMENT, 0); }
		public ColumnCommentContext columnComment() {
			return getRuleContext(ColumnCommentContext.class,0);
		}
		public TerminalNode NOT() { return getToken(DmSqlParser.NOT, 0); }
		public TerminalNode PRIMARY() { return getToken(DmSqlParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(DmSqlParser.KEY, 0); }
		public PrimaryKeyListContext primaryKeyList() {
			return getRuleContext(PrimaryKeyListContext.class,0);
		}
		public TerminalNode CONSTRAINT() { return getToken(DmSqlParser.CONSTRAINT, 0); }
		public TerminalNode STRING() { return getToken(DmSqlParser.STRING, 0); }
		public TerminalNode CLUSTER() { return getToken(DmSqlParser.CLUSTER, 0); }
		public TerminalNode UNIQUE() { return getToken(DmSqlParser.UNIQUE, 0); }
		public UniqueColumnListContext uniqueColumnList() {
			return getRuleContext(UniqueColumnListContext.class,0);
		}
		public TerminalNode FULLTEXT() { return getToken(DmSqlParser.FULLTEXT, 0); }
		public FullTextColumnListContext fullTextColumnList() {
			return getRuleContext(FullTextColumnListContext.class,0);
		}
		public TerminalNode SPATIAL() { return getToken(DmSqlParser.SPATIAL, 0); }
		public SpatialColumnListContext spatialColumnList() {
			return getRuleContext(SpatialColumnListContext.class,0);
		}
		public TerminalNode CHECK() { return getToken(DmSqlParser.CHECK, 0); }
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(DmSqlParser.IDENTIFIER, 0); }
		public ColTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).enterColType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).exitColType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DmSqlVisitor ) return ((DmSqlVisitor<? extends T>)visitor).visitColType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColTypeContext colType() throws RecognitionException {
		ColTypeContext _localctx = new ColTypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_colType);
		int _la;
		try {
			setState(286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				columnName();
				setState(213);
				dataType();
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTITY) {
					{
					setState(214);
					autoIncrement();
					}
				}

				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(217);
					((ColTypeContext)_localctx).notNull = match(NOT);
					setState(218);
					match(NULL);
					}
				}

				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(221);
					match(DEFAULT);
					setState(222);
					defaultValue();
					}
				}

				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(225);
					match(COMMENT);
					setState(226);
					columnComment();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				columnName();
				setState(230);
				dataType();
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(231);
					match(DEFAULT);
					setState(232);
					defaultValue();
					}
				}

				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(235);
					((ColTypeContext)_localctx).notNull = match(NOT);
					setState(236);
					match(NULL);
					}
				}

				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(239);
					match(COMMENT);
					setState(240);
					columnComment();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONSTRAINT) {
					{
					setState(243);
					match(CONSTRAINT);
					setState(244);
					match(STRING);
					}
				}

				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(247);
					match(NOT);
					setState(248);
					match(CLUSTER);
					}
				}

				setState(251);
				match(PRIMARY);
				setState(252);
				match(KEY);
				setState(253);
				match(T__1);
				setState(254);
				primaryKeyList();
				setState(255);
				match(T__2);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(257);
				match(UNIQUE);
				setState(258);
				match(T__1);
				setState(259);
				uniqueColumnList();
				setState(260);
				match(T__2);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(262);
				match(FULLTEXT);
				setState(263);
				match(T__1);
				setState(264);
				fullTextColumnList();
				setState(265);
				match(T__2);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(267);
				match(SPATIAL);
				setState(268);
				match(T__1);
				setState(269);
				spatialColumnList();
				setState(270);
				match(T__2);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(272);
				match(CHECK);
				{
				setState(273);
				match(T__1);
				setState(274);
				match(STRING);
				setState(275);
				operator();
				setState(276);
				number();
				setState(277);
				match(T__2);
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(279);
				match(CHECK);
				{
				setState(280);
				match(T__1);
				setState(281);
				match(STRING);
				setState(282);
				operator();
				setState(283);
				match(IDENTIFIER);
				setState(284);
				match(T__2);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AutoIncrementContext extends ParserRuleContext {
		public TerminalNode IDENTITY() { return getToken(DmSqlParser.IDENTITY, 0); }
		public SeedContext seed() {
			return getRuleContext(SeedContext.class,0);
		}
		public IncrContext incr() {
			return getRuleContext(IncrContext.class,0);
		}
		public AutoIncrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_autoIncrement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).enterAutoIncrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).exitAutoIncrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DmSqlVisitor ) return ((DmSqlVisitor<? extends T>)visitor).visitAutoIncrement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AutoIncrementContext autoIncrement() throws RecognitionException {
		AutoIncrementContext _localctx = new AutoIncrementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_autoIncrement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(IDENTITY);
			setState(289);
			match(T__1);
			setState(290);
			seed();
			setState(291);
			match(T__3);
			setState(292);
			incr();
			setState(293);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SeedContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(DmSqlParser.INTEGER_VALUE, 0); }
		public SeedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seed; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).enterSeed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).exitSeed(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DmSqlVisitor ) return ((DmSqlVisitor<? extends T>)visitor).visitSeed(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeedContext seed() throws RecognitionException {
		SeedContext _localctx = new SeedContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_seed);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(INTEGER_VALUE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IncrContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(DmSqlParser.INTEGER_VALUE, 0); }
		public IncrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).enterIncr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).exitIncr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DmSqlVisitor ) return ((DmSqlVisitor<? extends T>)visitor).visitIncr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncrContext incr() throws RecognitionException {
		IncrContext _localctx = new IncrContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_incr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(INTEGER_VALUE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryKeyListContext extends ParserRuleContext {
		public List<PrimaryKeyContext> primaryKey() {
			return getRuleContexts(PrimaryKeyContext.class);
		}
		public PrimaryKeyContext primaryKey(int i) {
			return getRuleContext(PrimaryKeyContext.class,i);
		}
		public PrimaryKeyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryKeyList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).enterPrimaryKeyList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).exitPrimaryKeyList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DmSqlVisitor ) return ((DmSqlVisitor<? extends T>)visitor).visitPrimaryKeyList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryKeyListContext primaryKeyList() throws RecognitionException {
		PrimaryKeyListContext _localctx = new PrimaryKeyListContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_primaryKeyList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			primaryKey();
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(300);
				match(T__3);
				setState(301);
				primaryKey();
				}
				}
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryKeyContext extends ParserRuleContext {
		public Token name;
		public TerminalNode STRING() { return getToken(DmSqlParser.STRING, 0); }
		public PrimaryKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).enterPrimaryKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).exitPrimaryKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DmSqlVisitor ) return ((DmSqlVisitor<? extends T>)visitor).visitPrimaryKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryKeyContext primaryKey() throws RecognitionException {
		PrimaryKeyContext _localctx = new PrimaryKeyContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_primaryKey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			((PrimaryKeyContext)_localctx).name = match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UniqueColumnListContext extends ParserRuleContext {
		public List<UniqueColumnContext> uniqueColumn() {
			return getRuleContexts(UniqueColumnContext.class);
		}
		public UniqueColumnContext uniqueColumn(int i) {
			return getRuleContext(UniqueColumnContext.class,i);
		}
		public UniqueColumnListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uniqueColumnList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).enterUniqueColumnList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).exitUniqueColumnList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DmSqlVisitor ) return ((DmSqlVisitor<? extends T>)visitor).visitUniqueColumnList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UniqueColumnListContext uniqueColumnList() throws RecognitionException {
		UniqueColumnListContext _localctx = new UniqueColumnListContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_uniqueColumnList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			uniqueColumn();
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(310);
				match(T__3);
				setState(311);
				uniqueColumn();
				}
				}
				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UniqueColumnContext extends ParserRuleContext {
		public Token name;
		public TerminalNode STRING() { return getToken(DmSqlParser.STRING, 0); }
		public UniqueColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uniqueColumn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).enterUniqueColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).exitUniqueColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DmSqlVisitor ) return ((DmSqlVisitor<? extends T>)visitor).visitUniqueColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UniqueColumnContext uniqueColumn() throws RecognitionException {
		UniqueColumnContext _localctx = new UniqueColumnContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_uniqueColumn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			((UniqueColumnContext)_localctx).name = match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SpatialColumnListContext extends ParserRuleContext {
		public List<SpatialColumnContext> spatialColumn() {
			return getRuleContexts(SpatialColumnContext.class);
		}
		public SpatialColumnContext spatialColumn(int i) {
			return getRuleContext(SpatialColumnContext.class,i);
		}
		public SpatialColumnListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spatialColumnList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).enterSpatialColumnList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).exitSpatialColumnList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DmSqlVisitor ) return ((DmSqlVisitor<? extends T>)visitor).visitSpatialColumnList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpatialColumnListContext spatialColumnList() throws RecognitionException {
		SpatialColumnListContext _localctx = new SpatialColumnListContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_spatialColumnList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			spatialColumn();
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(320);
				match(T__3);
				setState(321);
				spatialColumn();
				}
				}
				setState(326);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SpatialColumnContext extends ParserRuleContext {
		public Token name;
		public TerminalNode STRING() { return getToken(DmSqlParser.STRING, 0); }
		public SpatialColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spatialColumn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).enterSpatialColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).exitSpatialColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DmSqlVisitor ) return ((DmSqlVisitor<? extends T>)visitor).visitSpatialColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpatialColumnContext spatialColumn() throws RecognitionException {
		SpatialColumnContext _localctx = new SpatialColumnContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_spatialColumn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			((SpatialColumnContext)_localctx).name = match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FullTextColumnListContext extends ParserRuleContext {
		public List<FullTextColumnContext> fullTextColumn() {
			return getRuleContexts(FullTextColumnContext.class);
		}
		public FullTextColumnContext fullTextColumn(int i) {
			return getRuleContext(FullTextColumnContext.class,i);
		}
		public FullTextColumnListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullTextColumnList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).enterFullTextColumnList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).exitFullTextColumnList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DmSqlVisitor ) return ((DmSqlVisitor<? extends T>)visitor).visitFullTextColumnList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FullTextColumnListContext fullTextColumnList() throws RecognitionException {
		FullTextColumnListContext _localctx = new FullTextColumnListContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_fullTextColumnList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			fullTextColumn();
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(330);
				match(T__3);
				setState(331);
				fullTextColumn();
				}
				}
				setState(336);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FullTextColumnContext extends ParserRuleContext {
		public Token name;
		public TerminalNode STRING() { return getToken(DmSqlParser.STRING, 0); }
		public FullTextColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullTextColumn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).enterFullTextColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).exitFullTextColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DmSqlVisitor ) return ((DmSqlVisitor<? extends T>)visitor).visitFullTextColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FullTextColumnContext fullTextColumn() throws RecognitionException {
		FullTextColumnContext _localctx = new FullTextColumnContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_fullTextColumn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			((FullTextColumnContext)_localctx).name = match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefaultValueContext extends ParserRuleContext {
		public NumberContext value;
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode STRING() { return getToken(DmSqlParser.STRING, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(DmSqlParser.CURRENT_TIMESTAMP, 0); }
		public TerminalNode NULL() { return getToken(DmSqlParser.NULL, 0); }
		public DefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).enterDefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).exitDefaultValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DmSqlVisitor ) return ((DmSqlVisitor<? extends T>)visitor).visitDefaultValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_defaultValue);
		try {
			setState(344);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
			case BIGINT_LITERAL:
			case SMALLINT_LITERAL:
			case TINYINT_LITERAL:
			case DECIMAL_VALUE:
			case DOUBLE_LITERAL:
			case BIGDECIMAL_LITERAL:
			case INTEGER_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(339);
				((DefaultValueContext)_localctx).value = number();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(340);
				match(STRING);
				}
				break;
			case CURRENT_TIMESTAMP:
				enterOuterAlt(_localctx, 3);
				{
				setState(341);
				match(CURRENT_TIMESTAMP);
				setState(342);
				match(T__5);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(343);
				match(NULL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TableCommentContext extends ParserRuleContext {
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public TableCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableComment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).enterTableComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).exitTableComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DmSqlVisitor ) return ((DmSqlVisitor<? extends T>)visitor).visitTableComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableCommentContext tableComment() throws RecognitionException {
		TableCommentContext _localctx = new TableCommentContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_tableComment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			description();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ParserRuleContext {
		public StrictIdentifierContext strictIdentifier() {
			return getRuleContext(StrictIdentifierContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DmSqlVisitor ) return ((DmSqlVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			strictIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StrictIdentifierContext extends ParserRuleContext {
		public StrictIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strictIdentifier; }
	 
		public StrictIdentifierContext() { }
		public void copyFrom(StrictIdentifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class QuotedIdentifierAlternativeContext extends StrictIdentifierContext {
		public QuotedIdentifierContext quotedIdentifier() {
			return getRuleContext(QuotedIdentifierContext.class,0);
		}
		public QuotedIdentifierAlternativeContext(StrictIdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).enterQuotedIdentifierAlternative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).exitQuotedIdentifierAlternative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DmSqlVisitor ) return ((DmSqlVisitor<? extends T>)visitor).visitQuotedIdentifierAlternative(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnquotedIdentifierContext extends StrictIdentifierContext {
		public TerminalNode IDENTIFIER() { return getToken(DmSqlParser.IDENTIFIER, 0); }
		public UnquotedIdentifierContext(StrictIdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).enterUnquotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).exitUnquotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DmSqlVisitor ) return ((DmSqlVisitor<? extends T>)visitor).visitUnquotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrictIdentifierContext strictIdentifier() throws RecognitionException {
		StrictIdentifierContext _localctx = new StrictIdentifierContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_strictIdentifier);
		try {
			setState(352);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(350);
				match(IDENTIFIER);
				}
				break;
			case BACKQUOTED_IDENTIFIER:
				_localctx = new QuotedIdentifierAlternativeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(351);
				quotedIdentifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QuotedIdentifierContext extends ParserRuleContext {
		public TerminalNode BACKQUOTED_IDENTIFIER() { return getToken(DmSqlParser.BACKQUOTED_IDENTIFIER, 0); }
		public QuotedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quotedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).enterQuotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).exitQuotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DmSqlVisitor ) return ((DmSqlVisitor<? extends T>)visitor).visitQuotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuotedIdentifierContext quotedIdentifier() throws RecognitionException {
		QuotedIdentifierContext _localctx = new QuotedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_quotedIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(BACKQUOTED_IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode IS() { return getToken(DmSqlParser.IS, 0); }
		public TerminalNode GTE() { return getToken(DmSqlParser.GTE, 0); }
		public TerminalNode GT() { return getToken(DmSqlParser.GT, 0); }
		public TerminalNode LTE() { return getToken(DmSqlParser.LTE, 0); }
		public TerminalNode LT() { return getToken(DmSqlParser.LT, 0); }
		public TerminalNode NEQJ() { return getToken(DmSqlParser.NEQJ, 0); }
		public TerminalNode NEQ() { return getToken(DmSqlParser.NEQ, 0); }
		public TerminalNode NSEQ() { return getToken(DmSqlParser.NSEQ, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).exitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DmSqlVisitor ) return ((DmSqlVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			_la = _input.LA(1);
			if ( !(_la==IS || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 127L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NumberContext extends ParserRuleContext {
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	 
		public NumberContext() { }
		public void copyFrom(NumberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DecimalLiteralContext extends NumberContext {
		public TerminalNode DECIMAL_VALUE() { return getToken(DmSqlParser.DECIMAL_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(DmSqlParser.MINUS, 0); }
		public DecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).enterDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).exitDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DmSqlVisitor ) return ((DmSqlVisitor<? extends T>)visitor).visitDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BigIntLiteralContext extends NumberContext {
		public TerminalNode BIGINT_LITERAL() { return getToken(DmSqlParser.BIGINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(DmSqlParser.MINUS, 0); }
		public BigIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).enterBigIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).exitBigIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DmSqlVisitor ) return ((DmSqlVisitor<? extends T>)visitor).visitBigIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TinyIntLiteralContext extends NumberContext {
		public TerminalNode TINYINT_LITERAL() { return getToken(DmSqlParser.TINYINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(DmSqlParser.MINUS, 0); }
		public TinyIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).enterTinyIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).exitTinyIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DmSqlVisitor ) return ((DmSqlVisitor<? extends T>)visitor).visitTinyIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BigDecimalLiteralContext extends NumberContext {
		public TerminalNode BIGDECIMAL_LITERAL() { return getToken(DmSqlParser.BIGDECIMAL_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(DmSqlParser.MINUS, 0); }
		public BigDecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).enterBigDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).exitBigDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DmSqlVisitor ) return ((DmSqlVisitor<? extends T>)visitor).visitBigDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DoubleLiteralContext extends NumberContext {
		public TerminalNode DOUBLE_LITERAL() { return getToken(DmSqlParser.DOUBLE_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(DmSqlParser.MINUS, 0); }
		public DoubleLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).enterDoubleLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).exitDoubleLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DmSqlVisitor ) return ((DmSqlVisitor<? extends T>)visitor).visitDoubleLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntegerLiteralContext extends NumberContext {
		public TerminalNode INTEGER_VALUE() { return getToken(DmSqlParser.INTEGER_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(DmSqlParser.MINUS, 0); }
		public IntegerLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DmSqlVisitor ) return ((DmSqlVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SmallIntLiteralContext extends NumberContext {
		public TerminalNode SMALLINT_LITERAL() { return getToken(DmSqlParser.SMALLINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(DmSqlParser.MINUS, 0); }
		public SmallIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).enterSmallIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmSqlListener ) ((DmSqlListener)listener).exitSmallIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DmSqlVisitor ) return ((DmSqlVisitor<? extends T>)visitor).visitSmallIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_number);
		int _la;
		try {
			setState(386);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				_localctx = new DecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(359);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(358);
					match(MINUS);
					}
				}

				setState(361);
				match(DECIMAL_VALUE);
				}
				break;
			case 2:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(363);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(362);
					match(MINUS);
					}
				}

				setState(365);
				match(INTEGER_VALUE);
				}
				break;
			case 3:
				_localctx = new BigIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(367);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(366);
					match(MINUS);
					}
				}

				setState(369);
				match(BIGINT_LITERAL);
				}
				break;
			case 4:
				_localctx = new SmallIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(371);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(370);
					match(MINUS);
					}
				}

				setState(373);
				match(SMALLINT_LITERAL);
				}
				break;
			case 5:
				_localctx = new TinyIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(375);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(374);
					match(MINUS);
					}
				}

				setState(377);
				match(TINYINT_LITERAL);
				}
				break;
			case 6:
				_localctx = new DoubleLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(379);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(378);
					match(MINUS);
					}
				}

				setState(381);
				match(DOUBLE_LITERAL);
				}
				break;
			case 7:
				_localctx = new BigDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(383);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(382);
					match(MINUS);
					}
				}

				setState(385);
				match(BIGDECIMAL_LITERAL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0107\u0185\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u0001M\b\u0001\n\u0001\f\u0001P\t\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002W\b\u0002\u0001\u0002"+
		"\u0003\u0002Z\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002s\b\u0002\u0003\u0002u\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003|\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0003\u0006\u008c\b\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u0092\b\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0005\b\u009b\b\b\n\b\f\b\u009e"+
		"\t\b\u0001\t\u0001\t\u0003\t\u00a2\b\t\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0005\f\u00aa\b\f\n\f\f\f\u00ad\t\f\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e"+
		"\u00b6\b\u000e\n\u000e\f\u000e\u00b9\t\u000e\u0001\u000e\u0003\u000e\u00bc"+
		"\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u00c3\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u00c9\b\u000e\u0003\u000e\u00cb\b\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0005\u000f\u00d0\b\u000f\n\u000f\f\u000f\u00d3\t\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00d8\b\u0010\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u00dc\b\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00e0"+
		"\b\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00e4\b\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00ea\b\u0010\u0001\u0010"+
		"\u0001\u0010\u0003\u0010\u00ee\b\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u00f2\b\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00f6\b\u0010\u0001"+
		"\u0010\u0001\u0010\u0003\u0010\u00fa\b\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u011f\b\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0005\u0014\u012f\b\u0014\n\u0014\f\u0014\u0132\t\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u0139\b\u0016"+
		"\n\u0016\f\u0016\u013c\t\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0005\u0018\u0143\b\u0018\n\u0018\f\u0018\u0146\t\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a"+
		"\u014d\b\u001a\n\u001a\f\u001a\u0150\t\u001a\u0001\u001b\u0001\u001b\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u0159"+
		"\b\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0001"+
		"\u001f\u0003\u001f\u0161\b\u001f\u0001 \u0001 \u0001!\u0001!\u0001\"\u0003"+
		"\"\u0168\b\"\u0001\"\u0001\"\u0003\"\u016c\b\"\u0001\"\u0001\"\u0003\""+
		"\u0170\b\"\u0001\"\u0001\"\u0003\"\u0174\b\"\u0001\"\u0001\"\u0003\"\u0178"+
		"\b\"\u0001\"\u0001\"\u0003\"\u017c\b\"\u0001\"\u0001\"\u0003\"\u0180\b"+
		"\"\u0001\"\u0003\"\u0183\b\"\u0001\"\u0000\u0000#\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"02468:<>@BD\u0000\u0002\u0001\u0000()\u0002\u0000##\u0080\u0086\u019a"+
		"\u0000F\u0001\u0000\u0000\u0000\u0002N\u0001\u0000\u0000\u0000\u0004t"+
		"\u0001\u0000\u0000\u0000\u0006v\u0001\u0000\u0000\u0000\b\u007f\u0001"+
		"\u0000\u0000\u0000\n\u0087\u0001\u0000\u0000\u0000\f\u008b\u0001\u0000"+
		"\u0000\u0000\u000e\u0091\u0001\u0000\u0000\u0000\u0010\u0097\u0001\u0000"+
		"\u0000\u0000\u0012\u009f\u0001\u0000\u0000\u0000\u0014\u00a3\u0001\u0000"+
		"\u0000\u0000\u0016\u00a5\u0001\u0000\u0000\u0000\u0018\u00a7\u0001\u0000"+
		"\u0000\u0000\u001a\u00ae\u0001\u0000\u0000\u0000\u001c\u00ca\u0001\u0000"+
		"\u0000\u0000\u001e\u00cc\u0001\u0000\u0000\u0000 \u011e\u0001\u0000\u0000"+
		"\u0000\"\u0120\u0001\u0000\u0000\u0000$\u0127\u0001\u0000\u0000\u0000"+
		"&\u0129\u0001\u0000\u0000\u0000(\u012b\u0001\u0000\u0000\u0000*\u0133"+
		"\u0001\u0000\u0000\u0000,\u0135\u0001\u0000\u0000\u0000.\u013d\u0001\u0000"+
		"\u0000\u00000\u013f\u0001\u0000\u0000\u00002\u0147\u0001\u0000\u0000\u0000"+
		"4\u0149\u0001\u0000\u0000\u00006\u0151\u0001\u0000\u0000\u00008\u0158"+
		"\u0001\u0000\u0000\u0000:\u015a\u0001\u0000\u0000\u0000<\u015c\u0001\u0000"+
		"\u0000\u0000>\u0160\u0001\u0000\u0000\u0000@\u0162\u0001\u0000\u0000\u0000"+
		"B\u0164\u0001\u0000\u0000\u0000D\u0182\u0001\u0000\u0000\u0000FG\u0003"+
		"\u0004\u0002\u0000GH\u0005\u0000\u0000\u0001H\u0001\u0001\u0000\u0000"+
		"\u0000IJ\u0003\u0004\u0002\u0000JK\u0005\u0001\u0000\u0000KM\u0001\u0000"+
		"\u0000\u0000LI\u0001\u0000\u0000\u0000MP\u0001\u0000\u0000\u0000NL\u0001"+
		"\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000O\u0003\u0001\u0000\u0000"+
		"\u0000PN\u0001\u0000\u0000\u0000QV\u0003\u0006\u0003\u0000RS\u0005\u0002"+
		"\u0000\u0000ST\u0003\u001e\u000f\u0000TU\u0005\u0003\u0000\u0000UW\u0001"+
		"\u0000\u0000\u0000VR\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000"+
		"WY\u0001\u0000\u0000\u0000XZ\u0003\b\u0004\u0000YX\u0001\u0000\u0000\u0000"+
		"YZ\u0001\u0000\u0000\u0000Zu\u0001\u0000\u0000\u0000[\\\u0005n\u0000\u0000"+
		"\\]\u0005:\u0000\u0000]^\u0005L\u0000\u0000^_\u0003\f\u0006\u0000_`\u0005"+
		"#\u0000\u0000`a\u0003:\u001d\u0000au\u0001\u0000\u0000\u0000bc\u0005n"+
		"\u0000\u0000cd\u0005:\u0000\u0000de\u0005]\u0000\u0000ef\u0003\u000e\u0007"+
		"\u0000fg\u0005#\u0000\u0000gh\u0003\u0016\u000b\u0000hu\u0001\u0000\u0000"+
		"\u0000ij\u0005K\u0000\u0000jk\u0005\u00ed\u0000\u0000kl\u0003\u001a\r"+
		"\u0000lm\u0005:\u0000\u0000mn\u0003\f\u0006\u0000no\u0005\u0002\u0000"+
		"\u0000op\u0003\u0010\b\u0000pr\u0005\u0003\u0000\u0000qs\u0003\b\u0004"+
		"\u0000rq\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000su\u0001\u0000"+
		"\u0000\u0000tQ\u0001\u0000\u0000\u0000t[\u0001\u0000\u0000\u0000tb\u0001"+
		"\u0000\u0000\u0000ti\u0001\u0000\u0000\u0000u\u0005\u0001\u0000\u0000"+
		"\u0000vw\u0005K\u0000\u0000w{\u0005L\u0000\u0000xy\u0005|\u0000\u0000"+
		"yz\u0005\u001b\u0000\u0000z|\u0005\u001f\u0000\u0000{x\u0001\u0000\u0000"+
		"\u0000{|\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}~\u0003\f\u0006"+
		"\u0000~\u0007\u0001\u0000\u0000\u0000\u007f\u0080\u0005\u00f6\u0000\u0000"+
		"\u0080\u0081\u0005\u0002\u0000\u0000\u0081\u0082\u0005:\u0000\u0000\u0082"+
		"\u0083\u0003\n\u0005\u0000\u0083\u0084\u0005\u0004\u0000\u0000\u0084\u0085"+
		"\u0005{\u0000\u0000\u0085\u0086\u0005\u0003\u0000\u0000\u0086\t\u0001"+
		"\u0000\u0000\u0000\u0087\u0088\u0005\u00f7\u0000\u0000\u0088\u000b\u0001"+
		"\u0000\u0000\u0000\u0089\u008a\u0005\u00f7\u0000\u0000\u008a\u008c\u0005"+
		"\u0005\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008b\u008c\u0001"+
		"\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u008e\u0005"+
		"\u00f7\u0000\u0000\u008e\r\u0001\u0000\u0000\u0000\u008f\u0090\u0005\u00f7"+
		"\u0000\u0000\u0090\u0092\u0005\u0005\u0000\u0000\u0091\u008f\u0001\u0000"+
		"\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000"+
		"\u0000\u0000\u0093\u0094\u0005\u00f7\u0000\u0000\u0094\u0095\u0005\u0005"+
		"\u0000\u0000\u0095\u0096\u0003\u0014\n\u0000\u0096\u000f\u0001\u0000\u0000"+
		"\u0000\u0097\u009c\u0003\u0012\t\u0000\u0098\u0099\u0005\u0004\u0000\u0000"+
		"\u0099\u009b\u0003\u0012\t\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009b"+
		"\u009e\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009c"+
		"\u009d\u0001\u0000\u0000\u0000\u009d\u0011\u0001\u0000\u0000\u0000\u009e"+
		"\u009c\u0001\u0000\u0000\u0000\u009f\u00a1\u0003\u0014\n\u0000\u00a0\u00a2"+
		"\u0007\u0000\u0000\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000\u00a1\u00a2"+
		"\u0001\u0000\u0000\u0000\u00a2\u0013\u0001\u0000\u0000\u0000\u00a3\u00a4"+
		"\u0005\u00f7\u0000\u0000\u00a4\u0015\u0001\u0000\u0000\u0000\u00a5\u00a6"+
		"\u0003\u0018\f\u0000\u00a6\u0017\u0001\u0000\u0000\u0000\u00a7\u00ab\u0005"+
		"\u00f7\u0000\u0000\u00a8\u00aa\u0005\u00f7\u0000\u0000\u00a9\u00a8\u0001"+
		"\u0000\u0000\u0000\u00aa\u00ad\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001"+
		"\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac\u0019\u0001"+
		"\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ae\u00af\u0005"+
		"\u00f7\u0000\u0000\u00af\u001b\u0001\u0000\u0000\u0000\u00b0\u00bb\u0003"+
		"<\u001e\u0000\u00b1\u00b2\u0005\u0002\u0000\u0000\u00b2\u00b7\u0005\u00ff"+
		"\u0000\u0000\u00b3\u00b4\u0005\u0004\u0000\u0000\u00b4\u00b6\u0005\u00ff"+
		"\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b6\u00b9\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000"+
		"\u0000\u0000\u00b8\u00ba\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000"+
		"\u0000\u0000\u00ba\u00bc\u0005\u0003\u0000\u0000\u00bb\u00b1\u0001\u0000"+
		"\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc\u00cb\u0001\u0000"+
		"\u0000\u0000\u00bd\u00c2\u0003<\u001e\u0000\u00be\u00bf\u0005\u0002\u0000"+
		"\u0000\u00bf\u00c0\u0005\u00ff\u0000\u0000\u00c0\u00c1\u0005~\u0000\u0000"+
		"\u00c1\u00c3\u0005\u0003\u0000\u0000\u00c2\u00be\u0001\u0000\u0000\u0000"+
		"\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3\u00cb\u0001\u0000\u0000\u0000"+
		"\u00c4\u00c8\u0005~\u0000\u0000\u00c5\u00c6\u0005\u0002\u0000\u0000\u00c6"+
		"\u00c7\u0005\u00ff\u0000\u0000\u00c7\u00c9\u0005\u0003\u0000\u0000\u00c8"+
		"\u00c5\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9"+
		"\u00cb\u0001\u0000\u0000\u0000\u00ca\u00b0\u0001\u0000\u0000\u0000\u00ca"+
		"\u00bd\u0001\u0000\u0000\u0000\u00ca\u00c4\u0001\u0000\u0000\u0000\u00cb"+
		"\u001d\u0001\u0000\u0000\u0000\u00cc\u00d1\u0003 \u0010\u0000\u00cd\u00ce"+
		"\u0005\u0004\u0000\u0000\u00ce\u00d0\u0003 \u0010\u0000\u00cf\u00cd\u0001"+
		"\u0000\u0000\u0000\u00d0\u00d3\u0001\u0000\u0000\u0000\u00d1\u00cf\u0001"+
		"\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2\u001f\u0001"+
		"\u0000\u0000\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d4\u00d5\u0003"+
		"\u0014\n\u0000\u00d5\u00d7\u0003\u001c\u000e\u0000\u00d6\u00d8\u0003\""+
		"\u0011\u0000\u00d7\u00d6\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000"+
		"\u0000\u0000\u00d8\u00db\u0001\u0000\u0000\u0000\u00d9\u00da\u0005\u001b"+
		"\u0000\u0000\u00da\u00dc\u0005$\u0000\u0000\u00db\u00d9\u0001\u0000\u0000"+
		"\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc\u00df\u0001\u0000\u0000"+
		"\u0000\u00dd\u00de\u0005\u001e\u0000\u0000\u00de\u00e0\u00038\u001c\u0000"+
		"\u00df\u00dd\u0001\u0000\u0000\u0000\u00df\u00e0\u0001\u0000\u0000\u0000"+
		"\u00e0\u00e3\u0001\u0000\u0000\u0000\u00e1\u00e2\u0005n\u0000\u0000\u00e2"+
		"\u00e4\u0003\u0016\u000b\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e3"+
		"\u00e4\u0001\u0000\u0000\u0000\u00e4\u011f\u0001\u0000\u0000\u0000\u00e5"+
		"\u00e6\u0003\u0014\n\u0000\u00e6\u00e9\u0003\u001c\u000e\u0000\u00e7\u00e8"+
		"\u0005\u001e\u0000\u0000\u00e8\u00ea\u00038\u001c\u0000\u00e9\u00e7\u0001"+
		"\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000\u00ea\u00ed\u0001"+
		"\u0000\u0000\u0000\u00eb\u00ec\u0005\u001b\u0000\u0000\u00ec\u00ee\u0005"+
		"$\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000"+
		"\u0000\u0000\u00ee\u00f1\u0001\u0000\u0000\u0000\u00ef\u00f0\u0005n\u0000"+
		"\u0000\u00f0\u00f2\u0003\u0016\u000b\u0000\u00f1\u00ef\u0001\u0000\u0000"+
		"\u0000\u00f1\u00f2\u0001\u0000\u0000\u0000\u00f2\u011f\u0001\u0000\u0000"+
		"\u0000\u00f3\u00f4\u0005\u009b\u0000\u0000\u00f4\u00f6\u0005\u00f7\u0000"+
		"\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000\u0000"+
		"\u0000\u00f6\u00f9\u0001\u0000\u0000\u0000\u00f7\u00f8\u0005\u001b\u0000"+
		"\u0000\u00f8\u00fa\u0005\u009a\u0000\u0000\u00f9\u00f7\u0001\u0000\u0000"+
		"\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000"+
		"\u0000\u00fb\u00fc\u0005\u009d\u0000\u0000\u00fc\u00fd\u0005\u009e\u0000"+
		"\u0000\u00fd\u00fe\u0005\u0002\u0000\u0000\u00fe\u00ff\u0003(\u0014\u0000"+
		"\u00ff\u0100\u0005\u0003\u0000\u0000\u0100\u011f\u0001\u0000\u0000\u0000"+
		"\u0101\u0102\u0005\u0097\u0000\u0000\u0102\u0103\u0005\u0002\u0000\u0000"+
		"\u0103\u0104\u0003,\u0016\u0000\u0104\u0105\u0005\u0003\u0000\u0000\u0105"+
		"\u011f\u0001\u0000\u0000\u0000\u0106\u0107\u0005\u0098\u0000\u0000\u0107"+
		"\u0108\u0005\u0002\u0000\u0000\u0108\u0109\u00034\u001a\u0000\u0109\u010a"+
		"\u0005\u0003\u0000\u0000\u010a\u011f\u0001\u0000\u0000\u0000\u010b\u010c"+
		"\u0005\u0099\u0000\u0000\u010c\u010d\u0005\u0002\u0000\u0000\u010d\u010e"+
		"\u00030\u0018\u0000\u010e\u010f\u0005\u0003\u0000\u0000\u010f\u011f\u0001"+
		"\u0000\u0000\u0000\u0110\u0111\u0005\u009c\u0000\u0000\u0111\u0112\u0005"+
		"\u0002\u0000\u0000\u0112\u0113\u0005\u00f7\u0000\u0000\u0113\u0114\u0003"+
		"B!\u0000\u0114\u0115\u0003D\"\u0000\u0115\u0116\u0005\u0003\u0000\u0000"+
		"\u0116\u011f\u0001\u0000\u0000\u0000\u0117\u0118\u0005\u009c\u0000\u0000"+
		"\u0118\u0119\u0005\u0002\u0000\u0000\u0119\u011a\u0005\u00f7\u0000\u0000"+
		"\u011a\u011b\u0003B!\u0000\u011b\u011c\u0005\u0100\u0000\u0000\u011c\u011d"+
		"\u0005\u0003\u0000\u0000\u011d\u011f\u0001\u0000\u0000\u0000\u011e\u00d4"+
		"\u0001\u0000\u0000\u0000\u011e\u00e5\u0001\u0000\u0000\u0000\u011e\u00f5"+
		"\u0001\u0000\u0000\u0000\u011e\u0101\u0001\u0000\u0000\u0000\u011e\u0106"+
		"\u0001\u0000\u0000\u0000\u011e\u010b\u0001\u0000\u0000\u0000\u011e\u0110"+
		"\u0001\u0000\u0000\u0000\u011e\u0117\u0001\u0000\u0000\u0000\u011f!\u0001"+
		"\u0000\u0000\u0000\u0120\u0121\u0005\u001d\u0000\u0000\u0121\u0122\u0005"+
		"\u0002\u0000\u0000\u0122\u0123\u0003$\u0012\u0000\u0123\u0124\u0005\u0004"+
		"\u0000\u0000\u0124\u0125\u0003&\u0013\u0000\u0125\u0126\u0005\u0003\u0000"+
		"\u0000\u0126#\u0001\u0000\u0000\u0000\u0127\u0128\u0005\u00ff\u0000\u0000"+
		"\u0128%\u0001\u0000\u0000\u0000\u0129\u012a\u0005\u00ff\u0000\u0000\u012a"+
		"\'\u0001\u0000\u0000\u0000\u012b\u0130\u0003*\u0015\u0000\u012c\u012d"+
		"\u0005\u0004\u0000\u0000\u012d\u012f\u0003*\u0015\u0000\u012e\u012c\u0001"+
		"\u0000\u0000\u0000\u012f\u0132\u0001\u0000\u0000\u0000\u0130\u012e\u0001"+
		"\u0000\u0000\u0000\u0130\u0131\u0001\u0000\u0000\u0000\u0131)\u0001\u0000"+
		"\u0000\u0000\u0132\u0130\u0001\u0000\u0000\u0000\u0133\u0134\u0005\u00f7"+
		"\u0000\u0000\u0134+\u0001\u0000\u0000\u0000\u0135\u013a\u0003.\u0017\u0000"+
		"\u0136\u0137\u0005\u0004\u0000\u0000\u0137\u0139\u0003.\u0017\u0000\u0138"+
		"\u0136\u0001\u0000\u0000\u0000\u0139\u013c\u0001\u0000\u0000\u0000\u013a"+
		"\u0138\u0001\u0000\u0000\u0000\u013a\u013b\u0001\u0000\u0000\u0000\u013b"+
		"-\u0001\u0000\u0000\u0000\u013c\u013a\u0001\u0000\u0000\u0000\u013d\u013e"+
		"\u0005\u00f7\u0000\u0000\u013e/\u0001\u0000\u0000\u0000\u013f\u0144\u0003"+
		"2\u0019\u0000\u0140\u0141\u0005\u0004\u0000\u0000\u0141\u0143\u00032\u0019"+
		"\u0000\u0142\u0140\u0001\u0000\u0000\u0000\u0143\u0146\u0001\u0000\u0000"+
		"\u0000\u0144\u0142\u0001\u0000\u0000\u0000\u0144\u0145\u0001\u0000\u0000"+
		"\u0000\u01451\u0001\u0000\u0000\u0000\u0146\u0144\u0001\u0000\u0000\u0000"+
		"\u0147\u0148\u0005\u00f7\u0000\u0000\u01483\u0001\u0000\u0000\u0000\u0149"+
		"\u014e\u00036\u001b\u0000\u014a\u014b\u0005\u0004\u0000\u0000\u014b\u014d"+
		"\u00036\u001b\u0000\u014c\u014a\u0001\u0000\u0000\u0000\u014d\u0150\u0001"+
		"\u0000\u0000\u0000\u014e\u014c\u0001\u0000\u0000\u0000\u014e\u014f\u0001"+
		"\u0000\u0000\u0000\u014f5\u0001\u0000\u0000\u0000\u0150\u014e\u0001\u0000"+
		"\u0000\u0000\u0151\u0152\u0005\u00f7\u0000\u0000\u01527\u0001\u0000\u0000"+
		"\u0000\u0153\u0159\u0003D\"\u0000\u0154\u0159\u0005\u00f7\u0000\u0000"+
		"\u0155\u0156\u0005\u00f5\u0000\u0000\u0156\u0159\u0005\u0006\u0000\u0000"+
		"\u0157\u0159\u0005$\u0000\u0000\u0158\u0153\u0001\u0000\u0000\u0000\u0158"+
		"\u0154\u0001\u0000\u0000\u0000\u0158\u0155\u0001\u0000\u0000\u0000\u0158"+
		"\u0157\u0001\u0000\u0000\u0000\u01599\u0001\u0000\u0000\u0000\u015a\u015b"+
		"\u0003\u0018\f\u0000\u015b;\u0001\u0000\u0000\u0000\u015c\u015d\u0003"+
		">\u001f\u0000\u015d=\u0001\u0000\u0000\u0000\u015e\u0161\u0005\u0100\u0000"+
		"\u0000\u015f\u0161\u0003@ \u0000\u0160\u015e\u0001\u0000\u0000\u0000\u0160"+
		"\u015f\u0001\u0000\u0000\u0000\u0161?\u0001\u0000\u0000\u0000\u0162\u0163"+
		"\u0005\u0101\u0000\u0000\u0163A\u0001\u0000\u0000\u0000\u0164\u0165\u0007"+
		"\u0001\u0000\u0000\u0165C\u0001\u0000\u0000\u0000\u0166\u0168\u0005\u0088"+
		"\u0000\u0000\u0167\u0166\u0001\u0000\u0000\u0000\u0167\u0168\u0001\u0000"+
		"\u0000\u0000\u0168\u0169\u0001\u0000\u0000\u0000\u0169\u0183\u0005\u00fc"+
		"\u0000\u0000\u016a\u016c\u0005\u0088\u0000\u0000\u016b\u016a\u0001\u0000"+
		"\u0000\u0000\u016b\u016c\u0001\u0000\u0000\u0000\u016c\u016d\u0001\u0000"+
		"\u0000\u0000\u016d\u0183\u0005\u00ff\u0000\u0000\u016e\u0170\u0005\u0088"+
		"\u0000\u0000\u016f\u016e\u0001\u0000\u0000\u0000\u016f\u0170\u0001\u0000"+
		"\u0000\u0000\u0170\u0171\u0001\u0000\u0000\u0000\u0171\u0183\u0005\u00f8"+
		"\u0000\u0000\u0172\u0174\u0005\u0088\u0000\u0000\u0173\u0172\u0001\u0000"+
		"\u0000\u0000\u0173\u0174\u0001\u0000\u0000\u0000\u0174\u0175\u0001\u0000"+
		"\u0000\u0000\u0175\u0183\u0005\u00f9\u0000\u0000\u0176\u0178\u0005\u0088"+
		"\u0000\u0000\u0177\u0176\u0001\u0000\u0000\u0000\u0177\u0178\u0001\u0000"+
		"\u0000\u0000\u0178\u0179\u0001\u0000\u0000\u0000\u0179\u0183\u0005\u00fa"+
		"\u0000\u0000\u017a\u017c\u0005\u0088\u0000\u0000\u017b\u017a\u0001\u0000"+
		"\u0000\u0000\u017b\u017c\u0001\u0000\u0000\u0000\u017c\u017d\u0001\u0000"+
		"\u0000\u0000\u017d\u0183\u0005\u00fd\u0000\u0000\u017e\u0180\u0005\u0088"+
		"\u0000\u0000\u017f\u017e\u0001\u0000\u0000\u0000\u017f\u0180\u0001\u0000"+
		"\u0000\u0000\u0180\u0181\u0001\u0000\u0000\u0000\u0181\u0183\u0005\u00fe"+
		"\u0000\u0000\u0182\u0167\u0001\u0000\u0000\u0000\u0182\u016b\u0001\u0000"+
		"\u0000\u0000\u0182\u016f\u0001\u0000\u0000\u0000\u0182\u0173\u0001\u0000"+
		"\u0000\u0000\u0182\u0177\u0001\u0000\u0000\u0000\u0182\u017b\u0001\u0000"+
		"\u0000\u0000\u0182\u017f\u0001\u0000\u0000\u0000\u0183E\u0001\u0000\u0000"+
		"\u0000)NVYrt{\u008b\u0091\u009c\u00a1\u00ab\u00b7\u00bb\u00c2\u00c8\u00ca"+
		"\u00d1\u00d7\u00db\u00df\u00e3\u00e9\u00ed\u00f1\u00f5\u00f9\u011e\u0130"+
		"\u013a\u0144\u014e\u0158\u0160\u0167\u016b\u016f\u0173\u0177\u017b\u017f"+
		"\u0182";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}