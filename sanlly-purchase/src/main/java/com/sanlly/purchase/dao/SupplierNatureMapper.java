package com.sanlly.purchase.dao;

import com.sanlly.purchase.entity.SupplierNature;
import com.sanlly.purchase.entity.SupplierNatureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SupplierNatureMapper {
    long countByExample(SupplierNatureExample example);

    int deleteByExample(SupplierNatureExample example);

    int deleteByPrimaryKey(Integer purcSupplierNatureId);

    int insert(SupplierNature record);

    int insertSelective(SupplierNature record);

    List<SupplierNature> selectByExample(SupplierNatureExample example);

    SupplierNature selectByPrimaryKey(Integer purcSupplierNatureId);

    int updateByExampleSelective(@Param("record") SupplierNature record, @Param("example") SupplierNatureExample example);

    int updateByExample(@Param("record") SupplierNature record, @Param("example") SupplierNatureExample example);

    int updateByPrimaryKeySelective(SupplierNature record);

    int updateByPrimaryKey(SupplierNature record);
}