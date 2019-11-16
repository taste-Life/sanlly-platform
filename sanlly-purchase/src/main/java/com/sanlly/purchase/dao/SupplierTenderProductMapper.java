package com.sanlly.purchase.dao;

import com.sanlly.purchase.entity.SupplierTenderProduct;
import com.sanlly.purchase.entity.SupplierTenderProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SupplierTenderProductMapper {
    long countByExample(SupplierTenderProductExample example);

    int deleteByExample(SupplierTenderProductExample example);

    int deleteByPrimaryKey(Integer purcSupplierTenderProductId);

    int insert(SupplierTenderProduct record);

    int insertSelective(SupplierTenderProduct record);

    List<SupplierTenderProduct> selectByExample(SupplierTenderProductExample example);

    SupplierTenderProduct selectByPrimaryKey(Integer purcSupplierTenderProductId);

    int updateByExampleSelective(@Param("record") SupplierTenderProduct record, @Param("example") SupplierTenderProductExample example);

    int updateByExample(@Param("record") SupplierTenderProduct record, @Param("example") SupplierTenderProductExample example);

    int updateByPrimaryKeySelective(SupplierTenderProduct record);

    int updateByPrimaryKey(SupplierTenderProduct record);
}