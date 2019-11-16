package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareStockoutDetailLabaor;
import com.sanlly.warehouse.entity.WareStockoutDetailLabaorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareStockoutDetailLabaorMapper {
    long countByExample(WareStockoutDetailLabaorExample example);

    int deleteByExample(WareStockoutDetailLabaorExample example);

    int deleteByPrimaryKey(Integer wareStockoutDetailLabaorId);

    int insert(WareStockoutDetailLabaor record);

    int insertSelective(WareStockoutDetailLabaor record);

    List<WareStockoutDetailLabaor> selectByExample(WareStockoutDetailLabaorExample example);

    WareStockoutDetailLabaor selectByPrimaryKey(Integer wareStockoutDetailLabaorId);

    int updateByExampleSelective(@Param("record") WareStockoutDetailLabaor record, @Param("example") WareStockoutDetailLabaorExample example);

    int updateByExample(@Param("record") WareStockoutDetailLabaor record, @Param("example") WareStockoutDetailLabaorExample example);

    int updateByPrimaryKeySelective(WareStockoutDetailLabaor record);

    int updateByPrimaryKey(WareStockoutDetailLabaor record);
}