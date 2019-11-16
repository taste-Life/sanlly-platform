package com.sanlly.production.dao;

import com.sanlly.production.entity.WorkGroup;
import com.sanlly.production.entity.WorkGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorkGroupMapper {
    long countByExample(WorkGroupExample example);

    int deleteByExample(WorkGroupExample example);

    int deleteByPrimaryKey(Integer prodWorkGroupId);

    int insert(WorkGroup record);

    int insertSelective(WorkGroup record);

    List<WorkGroup> selectByExample(WorkGroupExample example);

    WorkGroup selectByPrimaryKey(Integer prodWorkGroupId);

    int updateByExampleSelective(@Param("record") WorkGroup record, @Param("example") WorkGroupExample example);

    int updateByExample(@Param("record") WorkGroup record, @Param("example") WorkGroupExample example);

    int updateByPrimaryKeySelective(WorkGroup record);

    int updateByPrimaryKey(WorkGroup record);
}