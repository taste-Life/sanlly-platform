package com.sanlly.purchase.dao;

import com.sanlly.purchase.entity.PurchaseOrderDetail;
import com.sanlly.purchase.entity.PurchaseOrderDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurchaseOrderDetailMapper {
    long countByExample(PurchaseOrderDetailExample example);

    int deleteByExample(PurchaseOrderDetailExample example);

    int deleteByPrimaryKey(Integer purcPurchaseOrderDetailId);

    int insert(PurchaseOrderDetail record);

    int insertSelective(PurchaseOrderDetail record);

    List<PurchaseOrderDetail> selectByExample(PurchaseOrderDetailExample example);

    PurchaseOrderDetail selectByPrimaryKey(Integer purcPurchaseOrderDetailId);

    int updateByExampleSelective(@Param("record") PurchaseOrderDetail record, @Param("example") PurchaseOrderDetailExample example);

    int updateByExample(@Param("record") PurchaseOrderDetail record, @Param("example") PurchaseOrderDetailExample example);

    int updateByPrimaryKeySelective(PurchaseOrderDetail record);

    int updateByPrimaryKey(PurchaseOrderDetail record);
}