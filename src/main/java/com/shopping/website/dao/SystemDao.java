package com.shopping.website.dao;


import java.util.List;

import org.apache.ibatis.annotations.Param;
import com.shopping.website.pojo.System;
import com.shopping.website.pojo.SystemExample;

public interface SystemDao {
    int countByExample(SystemExample example);

    int deleteByExample(SystemExample example);

    int deleteByPrimaryKey(String sysid);

    int insert(System record);

    int insertSelective(System record);

    List<System> selectByExample(SystemExample example);

    System selectByPrimaryKey(String sysid);

    int updateByExampleSelective(@Param("record") System record, @Param("example") SystemExample example);

    int updateByExample(@Param("record") System record, @Param("example") SystemExample example);

    int updateByPrimaryKeySelective(System record);

    int updateByPrimaryKey(System record);
}