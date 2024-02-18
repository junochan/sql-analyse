package com.juno.utils.analyse.sql.dm;

import lombok.extern.slf4j.Slf4j;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

/**
 * @author juno
 * @date 2024-02-05 15:52
 */
@Slf4j
public class CommonErrorListener extends BaseErrorListener {

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        log.error("Get SQL syntax error. line: {}, pos: {}, msg: {}", line, charPositionInLine, msg);
    }
}
