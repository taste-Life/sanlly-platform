package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareStockinDetailLabaor;
import com.sanlly.warehouse.entity.WareStockinDetailLabaorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareStockinDetailLabaorMapper {
    long countByExample(WareStockinDetailLabaorExample example);

    int deleteByExample(WareStockinDetailLabaorExample example);

    int deleteByPrimaryKey(Integer wareStockinDetailLabaorId);

    int insert(WareStockinDetailLabaor record);

    int insertSelective(WareStockinDetailLabaor record);

    List<WareStockinDetailLabaor> selectByExample(WareStockinDetailLabaorExample example);

    WareStockinDetailLabaor selectByPrimaryKey(Integer wareStockinDetailLabaorId);

    int updateByExampleSelective(@Param("record") WareStockinDetailLabaor record, @Param("example") WareStockinDetailLabaorExample example);

    int updateByExample(@Param("record") WareStockinDetailLabaor record, @Param("example") WareStockinDetailLabaorExample example);

    int updateByPrimaryKeySelective(WareStockinDetailLabaor record);

    int updateByPrimaryKey(WareStockinDetailLabaor record);
}