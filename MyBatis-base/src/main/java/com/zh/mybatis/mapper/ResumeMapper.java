package com.zh.mybatis.mapper;

import com.zh.mybatis.entity.Resume;
import org.apache.ibatis.annotations.Param;

/**
 * 简历Mapper接口
 */
public interface ResumeMapper {
    /**
     *
     * @param res_id
     * @return
     */
    Resume selectOne(@Param("res_id") int res_id);
}
