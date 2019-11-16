package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WarePurchaseOrder;
import com.sanlly.warehouse.entity.WarePurchaseOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WarePurchaseOrderMapper {
    long countByExample(WarePurchaseOrderExample example);

    int deleteByExample(WarePurchaseOrderExample example);

    int deleteByPrimaryKey(Integer warePurchaseOrderId);

    int insert(WarePurchaseOrder record);

    int insertSelective(WarePurchaseOrder record);

    List<WarePurchaseOrder> selectByExample(WarePurchaseOrderExample example);

    WarePurchaseOrder selectByPrimaryKey(Integer warePurchaseOrderId);

    int updateByExampleSelective(@Param("record") WarePurchaseOrder record, @Param("example") WarePurchaseOrderExample example);

    int updateByExample(@Param("record") WarePurchaseOrder record, @Param("example") WarePurchaseOrderExample example);

    int updateByPrimaryKeySelective(WarePurchaseOrder record);

    int updateByPrimaryKey(WarePurchaseOrder record);
}