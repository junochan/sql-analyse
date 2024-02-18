package com.juno.utils.analyse.entity;

import lombok.Data;

import java.util.List;

/**
 * @author juno
 * @date 2024-02-06 15:51
 */
@Data
public class CIndex {

    private String indexName;
    private String tableName;
    private Boolean izUnique;
    private List<CIndexColumn> indexColumns;

}
