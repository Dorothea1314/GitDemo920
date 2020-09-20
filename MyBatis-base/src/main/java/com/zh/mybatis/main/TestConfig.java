package com.zh.mybatis.main;

import com.zh.mybatis.entity.BM;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestConfig {
    public static void main(String[] args) {
        String resourse = "MyBatis-config.xml";
        try {
            InputStream inputStream = Resources.getResourceAsStream(resourse);
            //SqlSessionFactory
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            //sqlSession
            SqlSession sqlSession = sqlSessionFactory.openSession();
            //List<BM> bmList= sqlSession.selectList("selectBM");
            //final List<Object> selectBM = sqlSession.selectList("selectBM");
            //System.out.println(bmList);

            BM bm = new BM();
            //bm.setId("123");
            //bm.setName("开发一部");
            //DML语句------数据操纵语言
            //int rows = sqlSession.insert("insertBM",bm);
            int rows2 = sqlSession.update("updateBM",bm);
            //提交事务
            sqlSession.commit();
            System.out.println(rows2);
            sqlSession.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
