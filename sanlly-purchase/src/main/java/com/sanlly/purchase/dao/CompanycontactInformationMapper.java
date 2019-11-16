package com.sanlly.purchase.dao;

import com.sanlly.purchase.entity.CompanycontactInformation;
import com.sanlly.purchase.entity.CompanycontactInformationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CompanycontactInformationMapper {
    long countByExample(CompanycontactInformationExample example);

    int deleteByExample(CompanycontactInformationExample example);

    int deleteByPrimaryKey(Integer purcCompanycontactInformationId);

    int insert(CompanycontactInformation record);

    int insertSelective(CompanycontactInformation record);

    List<CompanycontactInformation> selectByExample(CompanycontactInformationExample example);

    CompanycontactInformation selectByPrimaryKey(Integer purcCompanycontactInformationId);

    int updateByExampleSelective(@Param("record") CompanycontactInformation record, @Param("example") CompanycontactInformationExample example);

    int updateByExample(@Param("record") CompanycontactInformation record, @Param("example") CompanycontactInformationExample example);

    int updateByPrimaryKeySelective(CompanycontactInformation record);

    int updateByPrimaryKey(CompanycontactInformation record);
}