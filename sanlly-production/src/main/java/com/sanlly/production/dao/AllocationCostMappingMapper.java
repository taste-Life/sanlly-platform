package com.sanlly.production.dao;

import com.sanlly.production.entity.AllocationCostMapping;
import com.sanlly.production.entity.AllocationCostMappingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AllocationCostMappingMapper {
    long countByExample(AllocationCostMappingExample example);

    int deleteByExample(AllocationCostMappingExample example);

    int deleteByPrimaryKey(Integer prodAllocationCostMappingId);

    int insert(AllocationCostMapping record);

    int insertSelective(AllocationCostMapping record);

    List<AllocationCostMapping> selectByExample(AllocationCostMappingExample example);

    AllocationCostMapping selectByPrimaryKey(Integer prodAllocationCostMappingId);

    int updateByExampleSelective(@Param("record") AllocationCostMapping record, @Param("example") AllocationCostMappingExample example);

    int updateByExample(@Param("record") AllocationCostMapping record, @Param("example") AllocationCostMappingExample example);

    int updateByPrimaryKeySelective(AllocationCostMapping record);

    int updateByPrimaryKey(AllocationCostMapping record);
}