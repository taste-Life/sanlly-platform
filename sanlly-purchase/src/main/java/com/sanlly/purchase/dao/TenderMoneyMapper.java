package com.sanlly.purchase.dao;

import com.sanlly.purchase.entity.TenderMoney;
import com.sanlly.purchase.entity.TenderMoneyExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TenderMoneyMapper {
    long countByExample(TenderMoneyExample example);

    int deleteByExample(TenderMoneyExample example);

    int deleteByPrimaryKey(Integer purcMatterTenderSuppierId);

    int insert(TenderMoney record);

    int insertSelective(TenderMoney record);

    List<TenderMoney> selectByExample(TenderMoneyExample example);

    TenderMoney selectByPrimaryKey(Integer purcMatterTenderSuppierId);

    int updateByExampleSelective(@Param("record") TenderMoney record, @Param("example") TenderMoneyExample example);

    int updateByExample(@Param("record") TenderMoney record, @Param("example") TenderMoneyExample example);

    int updateByPrimaryKeySelective(TenderMoney record);

    int updateByPrimaryKey(TenderMoney record);
}