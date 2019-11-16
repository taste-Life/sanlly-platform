package com.sanlly.purchase.dao;

import com.sanlly.purchase.entity.MatterTemporaryPurchase;
import com.sanlly.purchase.entity.MatterTemporaryPurchaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MatterTemporaryPurchaseMapper {
    long countByExample(MatterTemporaryPurchaseExample example);

    int deleteByExample(MatterTemporaryPurchaseExample example);

    int deleteByPrimaryKey(Integer purcMatterTemporaryPurchaseId);

    int insert(MatterTemporaryPurchase record);

    int insertSelective(MatterTemporaryPurchase record);

    List<MatterTemporaryPurchase> selectByExample(MatterTemporaryPurchaseExample example);

    MatterTemporaryPurchase selectByPrimaryKey(Integer purcMatterTemporaryPurchaseId);

    int updateByExampleSelective(@Param("record") MatterTemporaryPurchase record, @Param("example") MatterTemporaryPurchaseExample example);

    int updateByExample(@Param("record") MatterTemporaryPurchase record, @Param("example") MatterTemporaryPurchaseExample example);

    int updateByPrimaryKeySelective(MatterTemporaryPurchase record);

    int updateByPrimaryKey(MatterTemporaryPurchase record);
}