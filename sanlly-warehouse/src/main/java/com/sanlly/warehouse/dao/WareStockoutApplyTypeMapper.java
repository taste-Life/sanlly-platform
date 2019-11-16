package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareStockoutApplyType;
import com.sanlly.warehouse.entity.WareStockoutApplyTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareStockoutApplyTypeMapper {
    long countByExample(WareStockoutApplyTypeExample example);

    int deleteByExample(WareStockoutApplyTypeExample example);

    int deleteByPrimaryKey(Integer wareStockoutApplyTypeId);

    int insert(WareStockoutApplyType record);

    int insertSelective(WareStockoutApplyType record);

    List<WareStockoutApplyType> selectByExample(WareStockoutApplyTypeExample example);

    WareStockoutApplyType selectByPrimaryKey(Integer wareStockoutApplyTypeId);

    int updateByExampleSelective(@Param("record") WareStockoutApplyType record, @Param("example") WareStockoutApplyTypeExample example);

    int updateByExample(@Param("record") WareStockoutApplyType record, @Param("example") WareStockoutApplyTypeExample example);

    int updateByPrimaryKeySelective(WareStockoutApplyType record);

    int updateByPrimaryKey(WareStockoutApplyType record);
}