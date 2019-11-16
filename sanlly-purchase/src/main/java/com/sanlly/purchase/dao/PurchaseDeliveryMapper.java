package com.sanlly.purchase.dao;

import com.sanlly.purchase.entity.PurchaseDelivery;
import com.sanlly.purchase.entity.PurchaseDeliveryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurchaseDeliveryMapper {
    long countByExample(PurchaseDeliveryExample example);

    int deleteByExample(PurchaseDeliveryExample example);

    int deleteByPrimaryKey(Integer purcPurchaseDeliveryId);

    int insert(PurchaseDelivery record);

    int insertSelective(PurchaseDelivery record);

    List<PurchaseDelivery> selectByExample(PurchaseDeliveryExample example);

    PurchaseDelivery selectByPrimaryKey(Integer purcPurchaseDeliveryId);

    int updateByExampleSelective(@Param("record") PurchaseDelivery record, @Param("example") PurchaseDeliveryExample example);

    int updateByExample(@Param("record") PurchaseDelivery record, @Param("example") PurchaseDeliveryExample example);

    int updateByPrimaryKeySelective(PurchaseDelivery record);

    int updateByPrimaryKey(PurchaseDelivery record);
}