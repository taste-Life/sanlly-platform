package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareSpareUnit;
import com.sanlly.warehouse.entity.WareSpareUnitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareSpareUnitMapper {
    long countByExample(WareSpareUnitExample example);

    int deleteByExample(WareSpareUnitExample example);

    int deleteByPrimaryKey(Integer wareSpareUnitId);

    int insert(WareSpareUnit record);

    int insertSelective(WareSpareUnit record);

    List<WareSpareUnit> selectByExample(WareSpareUnitExample example);

    WareSpareUnit selectByPrimaryKey(Integer wareSpareUnitId);

    int updateByExampleSelective(@Param("record") WareSpareUnit record, @Param("example") WareSpareUnitExample example);

    int updateByExample(@Param("record") WareSpareUnit record, @Param("example") WareSpareUnitExample example);

    int updateByPrimaryKeySelective(WareSpareUnit record);

    int updateByPrimaryKey(WareSpareUnit record);
}