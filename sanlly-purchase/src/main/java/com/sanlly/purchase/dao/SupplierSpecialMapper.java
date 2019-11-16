package com.sanlly.purchase.dao;

import com.sanlly.purchase.entity.SupplierSpecial;
import com.sanlly.purchase.entity.SupplierSpecialExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SupplierSpecialMapper {
    long countByExample(SupplierSpecialExample example);

    int deleteByExample(SupplierSpecialExample example);

    int deleteByPrimaryKey(Integer supplierSpecialId);

    int insert(SupplierSpecial record);

    int insertSelective(SupplierSpecial record);

    List<SupplierSpecial> selectByExample(SupplierSpecialExample example);

    SupplierSpecial selectByPrimaryKey(Integer supplierSpecialId);

    int updateByExampleSelective(@Param("record") SupplierSpecial record, @Param("example") SupplierSpecialExample example);

    int updateByExample(@Param("record") SupplierSpecial record, @Param("example") SupplierSpecialExample example);

    int updateByPrimaryKeySelective(SupplierSpecial record);

    int updateByPrimaryKey(SupplierSpecial record);
}