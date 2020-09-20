package com.zh.mybatis.entity;

import lombok.Data;
import org.apache.ibatis.type.Alias;

/**
 * 学生简历实体类
 */
@Alias("resume")
@Data
public class Resume {
    /***
     * 简历ID
     */
    private Integer resId;
    /**
     * 学生ID(外键)
     */
    private Integer stuId;
    /**
     * 简历标题
     */
    private String title;
    /**
     * 简历语种
     */
    private String lang;
    /**
     * 简历只属于特定的学生
     */
    private Student student;
    public Resume() {

    }


}
