package com.activiti.dao;

import com.activiti.entity.ActUser;
import com.activiti.entity.ActUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActUserMapper {
    long countByExample(ActUserExample example);

    int deleteByExample(ActUserExample example);

    int deleteByPrimaryKey(String id);

    int insert(ActUser record);

    int insertSelective(ActUser record);

    List<ActUser> selectByExample(ActUserExample example);

    ActUser selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ActUser record, @Param("example") ActUserExample example);

    int updateByExample(@Param("record") ActUser record, @Param("example") ActUserExample example);

    int updateByPrimaryKeySelective(ActUser record);

    int updateByPrimaryKey(ActUser record);
}