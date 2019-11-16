package com.sanlly.purchase.dao;

import com.sanlly.purchase.entity.SupplierCompany;
import com.sanlly.purchase.entity.SupplierCompanyExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SupplierCompanyMapper {
    long countByExample(SupplierCompanyExample example);

    int deleteByExample(SupplierCompanyExample example);

    int deleteByPrimaryKey(Integer purcSupplierCompanyId);

    int insert(SupplierCompany record);

    int insertSelective(SupplierCompany record);

    List<SupplierCompany> selectByExample(SupplierCompanyExample example);

    SupplierCompany selectByPrimaryKey(Integer purcSupplierCompanyId);

    int updateByExampleSelective(@Param("record") SupplierCompany record, @Param("example") SupplierCompanyExample example);

    int updateByExample(@Param("record") SupplierCompany record, @Param("example") SupplierCompanyExample example);

    int updateByPrimaryKeySelective(SupplierCompany record);

    int updateByPrimaryKey(SupplierCompany record);
}