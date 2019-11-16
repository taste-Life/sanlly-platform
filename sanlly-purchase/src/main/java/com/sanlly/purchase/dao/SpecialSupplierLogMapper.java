package com.sanlly.purchase.dao;

import com.sanlly.purchase.entity.SpecialSupplierLog;
import com.sanlly.purchase.entity.SpecialSupplierLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpecialSupplierLogMapper {
    long countByExample(SpecialSupplierLogExample example);

    int deleteByExample(SpecialSupplierLogExample example);

    int deleteByPrimaryKey(Integer purcSpecialSupplierLogId);

    int insert(SpecialSupplierLog record);

    int insertSelective(SpecialSupplierLog record);

    List<SpecialSupplierLog> selectByExample(SpecialSupplierLogExample example);

    SpecialSupplierLog selectByPrimaryKey(Integer purcSpecialSupplierLogId);

    int updateByExampleSelective(@Param("record") SpecialSupplierLog record, @Param("example") SpecialSupplierLogExample example);

    int updateByExample(@Param("record") SpecialSupplierLog record, @Param("example") SpecialSupplierLogExample example);

    int updateByPrimaryKeySelective(SpecialSupplierLog record);

    int updateByPrimaryKey(SpecialSupplierLog record);
}