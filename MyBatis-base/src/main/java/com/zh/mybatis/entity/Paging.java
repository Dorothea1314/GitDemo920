package com.zh.mybatis.entity;

import lombok.Data;

/**
 * 分页类
 */
@Data
public class Paging {
    /**
     * 每页第1条记录在整个表中序号
     */
    private int f;
    /**
     * 每页记录数
     */
    private int pageRows;
}
