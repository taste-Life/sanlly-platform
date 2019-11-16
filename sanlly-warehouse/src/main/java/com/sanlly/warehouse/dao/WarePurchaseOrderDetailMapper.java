package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WarePurchaseOrderDetail;
import com.sanlly.warehouse.entity.WarePurchaseOrderDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WarePurchaseOrderDetailMapper {
    long countByExample(WarePurchaseOrderDetailExample example);

    int deleteByExample(WarePurchaseOrderDetailExample example);

    int deleteByPrimaryKey(Integer warePurchaseOrderDetailId);

    int insert(WarePurchaseOrderDetail record);

    int insertSelective(WarePurchaseOrderDetail record);

    List<WarePurchaseOrderDetail> selectByExample(WarePurchaseOrderDetailExample example);

    WarePurchaseOrderDetail selectByPrimaryKey(Integer warePurchaseOrderDetailId);

    int updateByExampleSelective(@Param("record") WarePurchaseOrderDetail record, @Param("example") WarePurchaseOrderDetailExample example);

    int updateByExample(@Param("record") WarePurchaseOrderDetail record, @Param("example") WarePurchaseOrderDetailExample example);

    int updateByPrimaryKeySelective(WarePurchaseOrderDetail record);

    int updateByPrimaryKey(WarePurchaseOrderDetail record);
}