package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareStockoutApply;
import com.sanlly.warehouse.entity.WareStockoutApplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareStockoutApplyMapper {
    long countByExample(WareStockoutApplyExample example);

    int deleteByExample(WareStockoutApplyExample example);

    int deleteByPrimaryKey(Integer wareStockoutApplyId);

    int insert(WareStockoutApply record);

    int insertSelective(WareStockoutApply record);

    List<WareStockoutApply> selectByExample(WareStockoutApplyExample example);

    WareStockoutApply selectByPrimaryKey(Integer wareStockoutApplyId);

    int updateByExampleSelective(@Param("record") WareStockoutApply record, @Param("example") WareStockoutApplyExample example);

    int updateByExample(@Param("record") WareStockoutApply record, @Param("example") WareStockoutApplyExample example);

    int updateByPrimaryKeySelective(WareStockoutApply record);

    int updateByPrimaryKey(WareStockoutApply record);
}