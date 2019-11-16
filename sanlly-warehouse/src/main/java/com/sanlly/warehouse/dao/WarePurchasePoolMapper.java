package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WarePurchasePool;
import com.sanlly.warehouse.entity.WarePurchasePoolExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WarePurchasePoolMapper {
    long countByExample(WarePurchasePoolExample example);

    int deleteByExample(WarePurchasePoolExample example);

    int deleteByPrimaryKey(Integer warePurchasePoolId);

    int insert(WarePurchasePool record);

    int insertSelective(WarePurchasePool record);

    List<WarePurchasePool> selectByExample(WarePurchasePoolExample example);

    WarePurchasePool selectByPrimaryKey(Integer warePurchasePoolId);

    int updateByExampleSelective(@Param("record") WarePurchasePool record, @Param("example") WarePurchasePoolExample example);

    int updateByExample(@Param("record") WarePurchasePool record, @Param("example") WarePurchasePoolExample example);

    int updateByPrimaryKeySelective(WarePurchasePool record);

    int updateByPrimaryKey(WarePurchasePool record);
}