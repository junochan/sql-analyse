package com.juno.utils.analyse.sql.convert;

import java.util.HashMap;
import java.util.Map;

/**
 * @author juno
 * @date 2024-02-06 14:52
 */
public class SqlConverter {

    private SqlConverter() {
    }

    private static final Map<String, ISqlConvert> SQL_CONVERT_MAP = new HashMap<>();

    static {
        SQL_CONVERT_MAP.put("dm-mysql", new Dm2MysqlConvert());
    }

    public static String convert(String key, String sql) {
        if (!SQL_CONVERT_MAP.containsKey(key)) {
            throw new IllegalArgumentException("暂不支持" + key + "语句转换");
        }
        return SQL_CONVERT_MAP.get(key).convert(sql);
    }

}
