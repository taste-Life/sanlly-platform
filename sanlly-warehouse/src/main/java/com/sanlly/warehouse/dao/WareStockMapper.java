package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareStock;
import com.sanlly.warehouse.entity.WareStockExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareStockMapper {
    long countByExample(WareStockExample example);

    int deleteByExample(WareStockExample example);

    int deleteByPrimaryKey(Integer wareStockId);

    int insert(WareStock record);

    int insertSelective(WareStock record);

    List<WareStock> selectByExample(WareStockExample example);

    WareStock selectByPrimaryKey(Integer wareStockId);

    int updateByExampleSelective(@Param("record") WareStock record, @Param("example") WareStockExample example);

    int updateByExample(@Param("record") WareStock record, @Param("example") WareStockExample example);

    int updateByPrimaryKeySelective(WareStock record);

    int updateByPrimaryKey(WareStock record);
}