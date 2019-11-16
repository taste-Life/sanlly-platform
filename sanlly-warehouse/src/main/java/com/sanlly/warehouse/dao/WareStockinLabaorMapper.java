package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareStockinLabaor;
import com.sanlly.warehouse.entity.WareStockinLabaorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareStockinLabaorMapper {
    long countByExample(WareStockinLabaorExample example);

    int deleteByExample(WareStockinLabaorExample example);

    int deleteByPrimaryKey(Integer wareStockinLabaorId);

    int insert(WareStockinLabaor record);

    int insertSelective(WareStockinLabaor record);

    List<WareStockinLabaor> selectByExample(WareStockinLabaorExample example);

    WareStockinLabaor selectByPrimaryKey(Integer wareStockinLabaorId);

    int updateByExampleSelective(@Param("record") WareStockinLabaor record, @Param("example") WareStockinLabaorExample example);

    int updateByExample(@Param("record") WareStockinLabaor record, @Param("example") WareStockinLabaorExample example);

    int updateByPrimaryKeySelective(WareStockinLabaor record);

    int updateByPrimaryKey(WareStockinLabaor record);
}