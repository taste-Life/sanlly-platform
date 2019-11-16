package com.sanlly.purchase.dao;

import com.sanlly.purchase.entity.MatterTenderPurchase;
import com.sanlly.purchase.entity.MatterTenderPurchaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MatterTenderPurchaseMapper {
    long countByExample(MatterTenderPurchaseExample example);

    int deleteByExample(MatterTenderPurchaseExample example);

    int deleteByPrimaryKey(Integer purcMatterTenderPurchaseId);

    int insert(MatterTenderPurchase record);

    int insertSelective(MatterTenderPurchase record);

    List<MatterTenderPurchase> selectByExample(MatterTenderPurchaseExample example);

    MatterTenderPurchase selectByPrimaryKey(Integer purcMatterTenderPurchaseId);

    int updateByExampleSelective(@Param("record") MatterTenderPurchase record, @Param("example") MatterTenderPurchaseExample example);

    int updateByExample(@Param("record") MatterTenderPurchase record, @Param("example") MatterTenderPurchaseExample example);

    int updateByPrimaryKeySelective(MatterTenderPurchase record);

    int updateByPrimaryKey(MatterTenderPurchase record);
}