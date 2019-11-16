package com.sanlly.purchase.dao;

import com.sanlly.purchase.entity.SupplierType;
import com.sanlly.purchase.entity.SupplierTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SupplierTypeMapper {
    long countByExample(SupplierTypeExample example);

    int deleteByExample(SupplierTypeExample example);

    int deleteByPrimaryKey(Integer purcSupplierTypeId);

    int insert(SupplierType record);

    int insertSelective(SupplierType record);

    List<SupplierType> selectByExample(SupplierTypeExample example);

    SupplierType selectByPrimaryKey(Integer purcSupplierTypeId);

    int updateByExampleSelective(@Param("record") SupplierType record, @Param("example") SupplierTypeExample example);

    int updateByExample(@Param("record") SupplierType record, @Param("example") SupplierTypeExample example);

    int updateByPrimaryKeySelective(SupplierType record);

    int updateByPrimaryKey(SupplierType record);
}