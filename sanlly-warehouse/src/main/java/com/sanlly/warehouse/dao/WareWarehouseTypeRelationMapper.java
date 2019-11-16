package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareWarehouseTypeRelation;
import com.sanlly.warehouse.entity.WareWarehouseTypeRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareWarehouseTypeRelationMapper {
    long countByExample(WareWarehouseTypeRelationExample example);

    int deleteByExample(WareWarehouseTypeRelationExample example);

    int deleteByPrimaryKey(Integer wareWarehouseId);

    int insert(WareWarehouseTypeRelation record);

    int insertSelective(WareWarehouseTypeRelation record);

    List<WareWarehouseTypeRelation> selectByExample(WareWarehouseTypeRelationExample example);

    WareWarehouseTypeRelation selectByPrimaryKey(Integer wareWarehouseId);

    int updateByExampleSelective(@Param("record") WareWarehouseTypeRelation record, @Param("example") WareWarehouseTypeRelationExample example);

    int updateByExample(@Param("record") WareWarehouseTypeRelation record, @Param("example") WareWarehouseTypeRelationExample example);

    int updateByPrimaryKeySelective(WareWarehouseTypeRelation record);

    int updateByPrimaryKey(WareWarehouseTypeRelation record);
}