package com.sanlly.purchase.dao;

import com.sanlly.purchase.entity.PurchaseDeliveryDetail;
import com.sanlly.purchase.entity.PurchaseDeliveryDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurchaseDeliveryDetailMapper {
    long countByExample(PurchaseDeliveryDetailExample example);

    int deleteByExample(PurchaseDeliveryDetailExample example);

    int deleteByPrimaryKey(Integer purcPurchaseDeliveryDetailId);

    int insert(PurchaseDeliveryDetail record);

    int insertSelective(PurchaseDeliveryDetail record);

    List<PurchaseDeliveryDetail> selectByExample(PurchaseDeliveryDetailExample example);

    PurchaseDeliveryDetail selectByPrimaryKey(Integer purcPurchaseDeliveryDetailId);

    int updateByExampleSelective(@Param("record") PurchaseDeliveryDetail record, @Param("example") PurchaseDeliveryDetailExample example);

    int updateByExample(@Param("record") PurchaseDeliveryDetail record, @Param("example") PurchaseDeliveryDetailExample example);

    int updateByPrimaryKeySelective(PurchaseDeliveryDetail record);

    int updateByPrimaryKey(PurchaseDeliveryDetail record);
}