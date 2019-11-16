package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareWarehouseYard;
import com.sanlly.warehouse.entity.WareWarehouseYardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareWarehouseYardMapper {
    long countByExample(WareWarehouseYardExample example);

    int deleteByExample(WareWarehouseYardExample example);

    int deleteByPrimaryKey(Integer wareWarehouseYardId);

    int insert(WareWarehouseYard record);

    int insertSelective(WareWarehouseYard record);

    List<WareWarehouseYard> selectByExample(WareWarehouseYardExample example);

    WareWarehouseYard selectByPrimaryKey(Integer wareWarehouseYardId);

    int updateByExampleSelective(@Param("record") WareWarehouseYard record, @Param("example") WareWarehouseYardExample example);

    int updateByExample(@Param("record") WareWarehouseYard record, @Param("example") WareWarehouseYardExample example);

    int updateByPrimaryKeySelective(WareWarehouseYard record);

    int updateByPrimaryKey(WareWarehouseYard record);
}