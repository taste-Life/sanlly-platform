package com.sanlly.purchase.dao;

import com.sanlly.purchase.entity.SupplierTender;
import com.sanlly.purchase.entity.SupplierTenderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SupplierTenderMapper {
    long countByExample(SupplierTenderExample example);

    int deleteByExample(SupplierTenderExample example);

    int deleteByPrimaryKey(Integer purcSupplierTenderId);

    int insert(SupplierTender record);

    int insertSelective(SupplierTender record);

    List<SupplierTender> selectByExample(SupplierTenderExample example);

    SupplierTender selectByPrimaryKey(Integer purcSupplierTenderId);

    int updateByExampleSelective(@Param("record") SupplierTender record, @Param("example") SupplierTenderExample example);

    int updateByExample(@Param("record") SupplierTender record, @Param("example") SupplierTenderExample example);

    int updateByPrimaryKeySelective(SupplierTender record);

    int updateByPrimaryKey(SupplierTender record);
}