package com.sanlly.purchase.dao;

import com.sanlly.purchase.entity.SpecialSupplier;
import com.sanlly.purchase.entity.SpecialSupplierExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpecialSupplierMapper {
    long countByExample(SpecialSupplierExample example);

    int deleteByExample(SpecialSupplierExample example);

    int deleteByPrimaryKey(Integer specialSupplierId);

    int insert(SpecialSupplier record);

    int insertSelective(SpecialSupplier record);

    List<SpecialSupplier> selectByExample(SpecialSupplierExample example);

    SpecialSupplier selectByPrimaryKey(Integer specialSupplierId);

    int updateByExampleSelective(@Param("record") SpecialSupplier record, @Param("example") SpecialSupplierExample example);

    int updateByExample(@Param("record") SpecialSupplier record, @Param("example") SpecialSupplierExample example);

    int updateByPrimaryKeySelective(SpecialSupplier record);

    int updateByPrimaryKey(SpecialSupplier record);
}