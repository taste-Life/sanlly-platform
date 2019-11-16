package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareWasteWarehouse;
import com.sanlly.warehouse.entity.WareWasteWarehouseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareWasteWarehouseMapper {
    long countByExample(WareWasteWarehouseExample example);

    int deleteByExample(WareWasteWarehouseExample example);

    int deleteByPrimaryKey(Integer wareWasteWarehouseId);

    int insert(WareWasteWarehouse record);

    int insertSelective(WareWasteWarehouse record);

    List<WareWasteWarehouse> selectByExample(WareWasteWarehouseExample example);

    WareWasteWarehouse selectByPrimaryKey(Integer wareWasteWarehouseId);

    int updateByExampleSelective(@Param("record") WareWasteWarehouse record, @Param("example") WareWasteWarehouseExample example);

    int updateByExample(@Param("record") WareWasteWarehouse record, @Param("example") WareWasteWarehouseExample example);

    int updateByPrimaryKeySelective(WareWasteWarehouse record);

    int updateByPrimaryKey(WareWasteWarehouse record);
}