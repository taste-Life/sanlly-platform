package com.sanlly.purchase.dao;

import com.sanlly.purchase.entity.BankInformation;
import com.sanlly.purchase.entity.BankInformationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BankInformationMapper {
    long countByExample(BankInformationExample example);

    int deleteByExample(BankInformationExample example);

    int deleteByPrimaryKey(Integer purcBankInformationId);

    int insert(BankInformation record);

    int insertSelective(BankInformation record);

    List<BankInformation> selectByExample(BankInformationExample example);

    BankInformation selectByPrimaryKey(Integer purcBankInformationId);

    int updateByExampleSelective(@Param("record") BankInformation record, @Param("example") BankInformationExample example);

    int updateByExample(@Param("record") BankInformation record, @Param("example") BankInformationExample example);

    int updateByPrimaryKeySelective(BankInformation record);

    int updateByPrimaryKey(BankInformation record);
}