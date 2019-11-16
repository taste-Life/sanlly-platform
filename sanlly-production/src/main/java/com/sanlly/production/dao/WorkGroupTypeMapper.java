package com.sanlly.production.dao;

import com.sanlly.production.entity.WorkGroupType;
import com.sanlly.production.entity.WorkGroupTypeExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WorkGroupTypeMapper {
    long countByExample(WorkGroupTypeExample example);

    int deleteByExample(WorkGroupTypeExample example);

    int deleteByPrimaryKey(Integer prodWorkGroupTypeId);

    int insert(WorkGroupType record);

    int insertSelective(WorkGroupType record);

    List<WorkGroupType> selectByExample(WorkGroupTypeExample example);

    WorkGroupType selectByPrimaryKey(Integer prodWorkGroupTypeId);

    int updateByExampleSelective(@Param("record") WorkGroupType record, @Param("example") WorkGroupTypeExample example);

    int updateByExample(@Param("record") WorkGroupType record, @Param("example") WorkGroupTypeExample example);

    int updateByPrimaryKeySelective(WorkGroupType record);

    int updateByPrimaryKey(WorkGroupType record);
}