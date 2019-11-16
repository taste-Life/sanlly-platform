package com.sanlly.purchase.dao;

import com.sanlly.purchase.entity.SupplierTypeRelational;
import com.sanlly.purchase.entity.SupplierTypeRelationalExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SupplierTypeRelationalMapper {
    long countByExample(SupplierTypeRelationalExample example);

    int deleteByExample(SupplierTypeRelationalExample example);

    int deleteByPrimaryKey(Integer purcSupplierTypeRelationalId);

    int insert(SupplierTypeRelational record);

    int insertSelective(SupplierTypeRelational record);

    List<SupplierTypeRelational> selectByExample(SupplierTypeRelationalExample example);

    SupplierTypeRelational selectByPrimaryKey(Integer purcSupplierTypeRelationalId);

    int updateByExampleSelective(@Param("record") SupplierTypeRelational record, @Param("example") SupplierTypeRelationalExample example);

    int updateByExample(@Param("record") SupplierTypeRelational record, @Param("example") SupplierTypeRelationalExample example);

    int updateByPrimaryKeySelective(SupplierTypeRelational record);

    int updateByPrimaryKey(SupplierTypeRelational record);
}