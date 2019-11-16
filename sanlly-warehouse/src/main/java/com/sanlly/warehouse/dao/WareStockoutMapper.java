package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareStockout;
import com.sanlly.warehouse.entity.WareStockoutExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareStockoutMapper {
    long countByExample(WareStockoutExample example);

    int deleteByExample(WareStockoutExample example);

    int deleteByPrimaryKey(Integer wareStockoutId);

    int insert(WareStockout record);

    int insertSelective(WareStockout record);

    List<WareStockout> selectByExample(WareStockoutExample example);

    WareStockout selectByPrimaryKey(Integer wareStockoutId);

    int updateByExampleSelective(@Param("record") WareStockout record, @Param("example") WareStockoutExample example);

    int updateByExample(@Param("record") WareStockout record, @Param("example") WareStockoutExample example);

    int updateByPrimaryKeySelective(WareStockout record);

    int updateByPrimaryKey(WareStockout record);
}