package com.juno.utils.analyse.entity;

import lombok.Getter;
import lombok.Setter;

/**
 * @author juno
 * @date 2024-02-01 18:28
 */
@Getter
@Setter
public class Column {

    private String columnName;
    private String dataType;
    private String dataTypeArg;
    private String fullDataType;
    private String comment;
    private boolean notNull;
    private String defaultValue;
    private boolean autoIncrement;
    private boolean primaryKey;

}
