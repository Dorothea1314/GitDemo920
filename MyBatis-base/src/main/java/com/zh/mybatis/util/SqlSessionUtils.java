package com.zh.mybatis.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import sun.security.mscapi.CPublicKey;


import java.io.IOException;
import java.io.InputStream;

/**
 * SqlSession工具类
 */
public class SqlSessionUtils {
    //static 静态的 类加载创建
    private static SqlSessionFactory sqlSessionFactory=null;

    static{
        String resource = "MyBatis-config.xml";
        try {
            //读取文件的时候会发生IO异常
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    /**
     * 获取SqlSession
     * @return
     */
    public static SqlSession getSqlSession(){
        if (sqlSessionFactory!=null){
            return sqlSessionFactory.openSession();
        }else{
            return null;
        }
    }
}
