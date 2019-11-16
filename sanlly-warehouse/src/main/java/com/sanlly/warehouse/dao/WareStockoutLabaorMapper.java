package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareStockoutLabaor;
import com.sanlly.warehouse.entity.WareStockoutLabaorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareStockoutLabaorMapper {
    long countByExample(WareStockoutLabaorExample example);

    int deleteByExample(WareStockoutLabaorExample example);

    int deleteByPrimaryKey(Integer wareStockoutLabaorId);

    int insert(WareStockoutLabaor record);

    int insertSelective(WareStockoutLabaor record);

    List<WareStockoutLabaor> selectByExample(WareStockoutLabaorExample example);

    WareStockoutLabaor selectByPrimaryKey(Integer wareStockoutLabaorId);

    int updateByExampleSelective(@Param("record") WareStockoutLabaor record, @Param("example") WareStockoutLabaorExample example);

    int updateByExample(@Param("record") WareStockoutLabaor record, @Param("example") WareStockoutLabaorExample example);

    int updateByPrimaryKeySelective(WareStockoutLabaor record);

    int updateByPrimaryKey(WareStockoutLabaor record);
}