package com.zh.mybatis.mapper;


import com.zh.mybatis.entity.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 学生Mapper接口
 */
public interface StudentMapper {
    /**
     *插入
     * @param student
     * @return
     */
   // @Insert("insert into student(name,sex,id_card,subject,edu) value(#{name},#{sex},#{idCard},#{subject},#{edu})")
    int insertStudent(Student student);

    /**
     * 通过id查询
     * @param
     * @return
     */
    Student selectStudent(Integer  stuId);

    /**
     * 修改新姓名
     * @param name
     * @return
     */
    int updateStudent(String name);

    /**方法有多个参数，需要给每一个加上参数，（“xxx”）怎么定义，xml里就要写什么查询条件----注解映射
     * 根据学历，性别查询学生
     * @param sex
     * @param edu
     * @return
     */
    List<Student> selectList(@Param("sex") int sex,@Param("edu") int edu);

    Student selectOneMoreResume(@Param("stuId") int stuId);

    /**
     * 根据关键字查询
     * @param kd
     * @return
     */
    List<Student> selectByKD(@Param("kd") String kd);

    /**
     * 实现分页显示查询
     * @return
     * f :分页每一行第一个的序号
     * pageRows:每一页多少个
     */
    List<Student> selectPage(@Param("f") Integer f,@Param("pageRows") Integer pageRows);
}
