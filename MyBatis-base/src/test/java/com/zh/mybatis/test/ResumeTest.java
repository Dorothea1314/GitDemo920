package com.zh.mybatis.test;

import com.zh.mybatis.entity.Resume;
import com.zh.mybatis.mapper.ResumeMapper;
import com.zh.mybatis.util.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;



public class ResumeTest {
    @Test
    public void selectOne(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ResumeMapper resumeMapper = sqlSession.getMapper(ResumeMapper.class);
        Resume resume = resumeMapper.selectOne(1);
        Logger logger = Logger.getLogger(ResumeTest.class);
        logger.debug(resume.toString());
        sqlSession.close();

    }
}
