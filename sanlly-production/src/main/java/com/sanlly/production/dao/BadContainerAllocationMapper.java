package com.sanlly.production.dao;

import com.sanlly.production.entity.BadContainerAllocation;
import com.sanlly.production.entity.BadContainerAllocationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BadContainerAllocationMapper {
    long countByExample(BadContainerAllocationExample example);

    int deleteByExample(BadContainerAllocationExample example);

    int deleteByPrimaryKey(Integer prodBadContainerAllocationId);

    int insert(BadContainerAllocation record);

    int insertSelective(BadContainerAllocation record);

    List<BadContainerAllocation> selectByExample(BadContainerAllocationExample example);

    BadContainerAllocation selectByPrimaryKey(Integer prodBadContainerAllocationId);

    int updateByExampleSelective(@Param("record") BadContainerAllocation record, @Param("example") BadContainerAllocationExample example);

    int updateByExample(@Param("record") BadContainerAllocation record, @Param("example") BadContainerAllocationExample example);

    int updateByPrimaryKeySelective(BadContainerAllocation record);

    int updateByPrimaryKey(BadContainerAllocation record);
}