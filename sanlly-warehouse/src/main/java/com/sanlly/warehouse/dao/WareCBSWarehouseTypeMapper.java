package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareCBSWarehouseType;
import com.sanlly.warehouse.entity.WareCBSWarehouseTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareCBSWarehouseTypeMapper {
    long countByExample(WareCBSWarehouseTypeExample example);

    int deleteByExample(WareCBSWarehouseTypeExample example);

    int deleteByPrimaryKey(Integer wareCbsWarehouseTypeId);

    int insert(WareCBSWarehouseType record);

    int insertSelective(WareCBSWarehouseType record);

    List<WareCBSWarehouseType> selectByExample(WareCBSWarehouseTypeExample example);

    WareCBSWarehouseType selectByPrimaryKey(Integer wareCbsWarehouseTypeId);

    int updateByExampleSelective(@Param("record") WareCBSWarehouseType record, @Param("example") WareCBSWarehouseTypeExample example);

    int updateByExample(@Param("record") WareCBSWarehouseType record, @Param("example") WareCBSWarehouseTypeExample example);

    int updateByPrimaryKeySelective(WareCBSWarehouseType record);

    int updateByPrimaryKey(WareCBSWarehouseType record);
}