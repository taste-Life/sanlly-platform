package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareWarehouse;
import com.sanlly.warehouse.entity.WareWarehouseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareWarehouseMapper {
    long countByExample(WareWarehouseExample example);

    int deleteByExample(WareWarehouseExample example);

    int deleteByPrimaryKey(Integer wareWarehouseId);

    int insert(WareWarehouse record);

    int insertSelective(WareWarehouse record);

    List<WareWarehouse> selectByExample(WareWarehouseExample example);

    WareWarehouse selectByPrimaryKey(Integer wareWarehouseId);

    int updateByExampleSelective(@Param("record") WareWarehouse record, @Param("example") WareWarehouseExample example);

    int updateByExample(@Param("record") WareWarehouse record, @Param("example") WareWarehouseExample example);

    int updateByPrimaryKeySelective(WareWarehouse record);

    int updateByPrimaryKey(WareWarehouse record);
}