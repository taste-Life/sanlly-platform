package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareReturnWarehouseLabor;
import com.sanlly.warehouse.entity.WareReturnWarehouseLaborExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareReturnWarehouseLaborMapper {
    long countByExample(WareReturnWarehouseLaborExample example);

    int deleteByExample(WareReturnWarehouseLaborExample example);

    int deleteByPrimaryKey(Integer wareReturnWarehouseLaborId);

    int insert(WareReturnWarehouseLabor record);

    int insertSelective(WareReturnWarehouseLabor record);

    List<WareReturnWarehouseLabor> selectByExample(WareReturnWarehouseLaborExample example);

    WareReturnWarehouseLabor selectByPrimaryKey(Integer wareReturnWarehouseLaborId);

    int updateByExampleSelective(@Param("record") WareReturnWarehouseLabor record, @Param("example") WareReturnWarehouseLaborExample example);

    int updateByExample(@Param("record") WareReturnWarehouseLabor record, @Param("example") WareReturnWarehouseLaborExample example);

    int updateByPrimaryKeySelective(WareReturnWarehouseLabor record);

    int updateByPrimaryKey(WareReturnWarehouseLabor record);
}