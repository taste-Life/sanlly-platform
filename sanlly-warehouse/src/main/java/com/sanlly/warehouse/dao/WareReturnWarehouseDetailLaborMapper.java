package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareReturnWarehouseDetailLabor;
import com.sanlly.warehouse.entity.WareReturnWarehouseDetailLaborExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareReturnWarehouseDetailLaborMapper {
    long countByExample(WareReturnWarehouseDetailLaborExample example);

    int deleteByExample(WareReturnWarehouseDetailLaborExample example);

    int deleteByPrimaryKey(Integer wareReturnWarehouseDetailLaborId);

    int insert(WareReturnWarehouseDetailLabor record);

    int insertSelective(WareReturnWarehouseDetailLabor record);

    List<WareReturnWarehouseDetailLabor> selectByExample(WareReturnWarehouseDetailLaborExample example);

    WareReturnWarehouseDetailLabor selectByPrimaryKey(Integer wareReturnWarehouseDetailLaborId);

    int updateByExampleSelective(@Param("record") WareReturnWarehouseDetailLabor record, @Param("example") WareReturnWarehouseDetailLaborExample example);

    int updateByExample(@Param("record") WareReturnWarehouseDetailLabor record, @Param("example") WareReturnWarehouseDetailLaborExample example);

    int updateByPrimaryKeySelective(WareReturnWarehouseDetailLabor record);

    int updateByPrimaryKey(WareReturnWarehouseDetailLabor record);
}