package com.activiti.dao;

import com.activiti.entity.ActGroup;
import com.activiti.entity.ActGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActGroupMapper {
    long countByExample(ActGroupExample example);

    int deleteByExample(ActGroupExample example);

    int deleteByPrimaryKey(String id);

    int insert(ActGroup record);

    int insertSelective(ActGroup record);

    List<ActGroup> selectByExample(ActGroupExample example);

    ActGroup selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ActGroup record, @Param("example") ActGroupExample example);

    int updateByExample(@Param("record") ActGroup record, @Param("example") ActGroupExample example);

    int updateByPrimaryKeySelective(ActGroup record);

    int updateByPrimaryKey(ActGroup record);
}