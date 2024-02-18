package com.juno.utils.analyse.entity;

import com.juno.utils.analyse.entity.Column;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author juno
 * @date 2024-02-01 18:27
 */
@Getter
@Setter
public class TableInfo {

    private String schema;

    private String tableName;

    private String tableDesc;

    private List<Column> columns;

    private List<CIndex> indexList;

    private Long autoIncrementSeed;

    private String engine = "InnoDB";

    private String defaultCharset = "utf8mb4";

}
