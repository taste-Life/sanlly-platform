package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareUnit;
import com.sanlly.warehouse.entity.WareUnitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareUnitMapper {
    long countByExample(WareUnitExample example);

    int deleteByExample(WareUnitExample example);

    int deleteByPrimaryKey(Integer wareUnitId);

    int insert(WareUnit record);

    int insertSelective(WareUnit record);

    List<WareUnit> selectByExample(WareUnitExample example);

    WareUnit selectByPrimaryKey(Integer wareUnitId);

    int updateByExampleSelective(@Param("record") WareUnit record, @Param("example") WareUnitExample example);

    int updateByExample(@Param("record") WareUnit record, @Param("example") WareUnitExample example);

    int updateByPrimaryKeySelective(WareUnit record);

    int updateByPrimaryKey(WareUnit record);
}