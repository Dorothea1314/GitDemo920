package com.zh.mybatis.dao;

import com.zh.mybatis.entity.Student;

import java.util.List;

public class StudentDao {
    /**
     * 根据性别和学历查询学生
     *
     * @param sex
     * @param edu
     * @return
     */
    public List<Student> selectStudent(Integer sex, Integer edu) {
        String sql = "select * from student where 1=1";
        if (sex != null) {
            sql += "and sex = " + sex;
        }
        if (edu != null) {
            sql += "and edu = " + edu;
        }


        return null;
    }


}