package com.zh.mybatis.test;

import com.zh.mybatis.entity.BM;
import com.zh.mybatis.util.SqlSessionUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class BMTest {
    @Test
    public void testUpdate(){
            //避免代码重复，直接调用即可
            SqlSession sqlSession = SqlSessionUtils.getSqlSession();
            BM bm = new BM();
            //bm.setId("123");
            //bm.setName("开发一部");
            //DML语句------数据操纵语言
            //int rows = sqlSession.insert("insertBM",bm);
            //int rows2 = sqlSession.update("updateBM",bm);
            int rows3 = sqlSession.delete("deleteBM",3);
            //提交事务
            sqlSession.commit();
            System.out.println(rows3);
            sqlSession.close();

    }
}
