package com.juno.utils.analyse.sql.convert;

import com.juno.utils.analyse.entity.TableInfo;
import com.juno.utils.analyse.sql.dm.CommonErrorListener;
import com.juno.utils.analyse.sql.dm.DmMultiCreateSqlListener;
import com.juno.utils.analyse.sql.dm.DmSqlLexer;
import com.juno.utils.analyse.sql.dm.DmSqlParser;
import com.juno.utils.analyse.sql.mysql.MysqlGenerator;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author juno
 * @date 2024-02-06 14:44
 */
public class Dm2MysqlConvert implements ISqlConvert {

    @Override
    public String convert(String sql) {
        List<TableInfo> tableInfoList = parse(sql);
        return tableInfoList.stream().map(MysqlGenerator::genCreateSql).collect(Collectors.joining());
    }

    private List<TableInfo> parse(String sql) {
        List<TableInfo> tableInfos = new ArrayList<>();
        DmSqlLexer dmSqlLexer = new DmSqlLexer(CharStreams.fromString(sql));
        CommonTokenStream tokenStream = new CommonTokenStream(dmSqlLexer);
        DmSqlParser dmSqlParser = new DmSqlParser(tokenStream);
        dmSqlParser.addErrorListener(new CommonErrorListener());
        dmSqlParser.multiStatement().enterRule(new DmMultiCreateSqlListener(tableInfos));
        return tableInfos;
    }

}
