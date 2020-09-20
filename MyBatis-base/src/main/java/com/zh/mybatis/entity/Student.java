package com.zh.mybatis.entity;

import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.util.List;

@Alias("stu")  //第二种方法，通过注解给每个实体类加上别名
@Data  //lombok插件  自动生成setter/getter/toString方法
public class Student {
    /**
     * 学生ID
     */
    private Integer stuId;
    /**
     * 姓名
     */
    private String name;
    /**
     * 性别(1:男;2:女)
     */
    private Integer sex;
    /**
     * 身份证号码
     */
    private String idCard;
    /**
     * 专业
     */
    private String subject;
    /**
     * 学历(1:中专;2:大专;3:本科;4:硕士;5:其它)
     */
    private Integer edu;

    /**
     * 一个学生拥有多个简历
     */
    private List<Resume> resumeList;

    public Student() {

    }


}
