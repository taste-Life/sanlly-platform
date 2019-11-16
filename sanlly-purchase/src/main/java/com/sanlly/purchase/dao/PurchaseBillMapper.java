package com.sanlly.purchase.dao;

import com.sanlly.purchase.entity.PurchaseBill;
import com.sanlly.purchase.entity.PurchaseBillExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurchaseBillMapper {
    long countByExample(PurchaseBillExample example);

    int deleteByExample(PurchaseBillExample example);

    int deleteByPrimaryKey(Integer purcPurchaseBillId);

    int insert(PurchaseBill record);

    int insertSelective(PurchaseBill record);

    List<PurchaseBill> selectByExample(PurchaseBillExample example);

    PurchaseBill selectByPrimaryKey(Integer purcPurchaseBillId);

    int updateByExampleSelective(@Param("record") PurchaseBill record, @Param("example") PurchaseBillExample example);

    int updateByExample(@Param("record") PurchaseBill record, @Param("example") PurchaseBillExample example);

    int updateByPrimaryKeySelective(PurchaseBill record);

    int updateByPrimaryKey(PurchaseBill record);
}