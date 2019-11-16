package com.sanlly.production.dao;

import com.sanlly.production.entity.CompanyCustomer;
import com.sanlly.production.entity.CompanyCustomerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompanyCustomerMapper {
    long countByExample(CompanyCustomerExample example);

    int deleteByExample(CompanyCustomerExample example);

    int deleteByPrimaryKey(Integer prodEdiTypeId);

    int insert(CompanyCustomer record);

    int insertSelective(CompanyCustomer record);

    List<CompanyCustomer> selectByExample(CompanyCustomerExample example);

    CompanyCustomer selectByPrimaryKey(Integer prodEdiTypeId);

    int updateByExampleSelective(@Param("record") CompanyCustomer record, @Param("example") CompanyCustomerExample example);

    int updateByExample(@Param("record") CompanyCustomer record, @Param("example") CompanyCustomerExample example);

    int updateByPrimaryKeySelective(CompanyCustomer record);

    int updateByPrimaryKey(CompanyCustomer record);
}