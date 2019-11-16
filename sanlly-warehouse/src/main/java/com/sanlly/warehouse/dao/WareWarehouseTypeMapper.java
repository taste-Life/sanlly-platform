package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareWarehouseType;
import com.sanlly.warehouse.entity.WareWarehouseTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareWarehouseTypeMapper {
    long countByExample(WareWarehouseTypeExample example);

    int deleteByExample(WareWarehouseTypeExample example);

    int deleteByPrimaryKey(Integer wareWarehouseTypeId);

    int insert(WareWarehouseType record);

    int insertSelective(WareWarehouseType record);

    List<WareWarehouseType> selectByExample(WareWarehouseTypeExample example);

    WareWarehouseType selectByPrimaryKey(Integer wareWarehouseTypeId);

    int updateByExampleSelective(@Param("record") WareWarehouseType record, @Param("example") WareWarehouseTypeExample example);

    int updateByExample(@Param("record") WareWarehouseType record, @Param("example") WareWarehouseTypeExample example);

    int updateByPrimaryKeySelective(WareWarehouseType record);

    int updateByPrimaryKey(WareWarehouseType record);
}