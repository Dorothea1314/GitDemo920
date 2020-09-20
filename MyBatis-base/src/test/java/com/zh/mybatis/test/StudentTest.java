package com.zh.mybatis.test;

import com.zh.mybatis.entity.Student;
import com.zh.mybatis.mapper.StudentMapper;
import com.zh.mybatis.util.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class StudentTest {


    @Test
    public void insertStudent() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        //创建StudentMapper接口代理对象（1.jdk代理2.spring里这么做）
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);//传它的class类型
        Student student = new Student();
        student.setName("大大");
        student.setSex(1);
        student.setIdCard("3208303145657");
        student.setEdu(3);
        student.setSubject("计算机");
        studentMapper.insertStudent(student);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void selectStudent() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        //创建StudentMapper接口代理对象（1.jdk代理2.spring里这么做）
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);//传它的class类型
        Student student1 = new Student();
        student1.setStuId(6);

        Student student2 = studentMapper.selectStudent(student1.getStuId());

        sqlSession.commit();
        System.out.println(student2.toString());
        sqlSession.close();
    }

    @Test
    public void updateStudent() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        //创建StudentMapper接口代理对象（1.jdk代理2.spring里这么做）
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);//传它的class类型
        Student student3 = new Student();
        student3.setName("小面包");
        int rows = studentMapper.updateStudent(student3.getName());
        sqlSession.commit();   //要提交，不然编译成功但结果不变
        System.out.println(rows);
        sqlSession.close();
    }

    @Test
    public void selectList() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        //创建StudentMapper接口代理对象（1.jdk代理 2.spring里这么做）
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);//传它的class类型
        List<Student> student4 = studentMapper.selectList(1, 3);
        System.out.println(student4);

    }

    @Test
    public void selectOneMoreResume() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        //创建StudentMapper接口代理对象（1.jdk代理2.spring里这么做）
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);//传它的class类型
        Student selectOneMoreResume = studentMapper.selectOneMoreResume(1);
        System.out.println(selectOneMoreResume);
    }

    @Test
    public void selectByKD() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        //创建StudentMapper接口代理对象（1.jdk代理2.spring里这么做）
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> studentList = studentMapper.selectByKD("面包");
        System.out.println(studentList);
    }

    @Test//分页查询
    public void selectPage() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        //创建StudentMapper接口代理对象（1.jdk代理2.spring里这么做）
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);//传它的class类型
        for (int i = 1; i <= 4; i++) {
            List<Student> studentList = studentMapper.selectPage((i - 1) * 5, 5);
            System.out.println("第" + i + "页查询结果：" + studentList);
        }

    }
}
