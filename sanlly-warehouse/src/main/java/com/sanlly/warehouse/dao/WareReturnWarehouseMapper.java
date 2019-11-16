package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareReturnWarehouse;
import com.sanlly.warehouse.entity.WareReturnWarehouseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareReturnWarehouseMapper {
    long countByExample(WareReturnWarehouseExample example);

    int deleteByExample(WareReturnWarehouseExample example);

    int deleteByPrimaryKey(Integer wareReturnWarehouseId);

    int insert(WareReturnWarehouse record);

    int insertSelective(WareReturnWarehouse record);

    List<WareReturnWarehouse> selectByExample(WareReturnWarehouseExample example);

    WareReturnWarehouse selectByPrimaryKey(Integer wareReturnWarehouseId);

    int updateByExampleSelective(@Param("record") WareReturnWarehouse record, @Param("example") WareReturnWarehouseExample example);

    int updateByExample(@Param("record") WareReturnWarehouse record, @Param("example") WareReturnWarehouseExample example);

    int updateByPrimaryKeySelective(WareReturnWarehouse record);

    int updateByPrimaryKey(WareReturnWarehouse record);
}