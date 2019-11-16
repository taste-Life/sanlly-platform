package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareMasterRateRelation;
import com.sanlly.warehouse.entity.WareMasterRateRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareMasterRateRelationMapper {
    long countByExample(WareMasterRateRelationExample example);

    int deleteByExample(WareMasterRateRelationExample example);

    int deleteByPrimaryKey(Integer wareWarehouseYardId);

    int insert(WareMasterRateRelation record);

    int insertSelective(WareMasterRateRelation record);

    List<WareMasterRateRelation> selectByExample(WareMasterRateRelationExample example);

    WareMasterRateRelation selectByPrimaryKey(Integer wareWarehouseYardId);

    int updateByExampleSelective(@Param("record") WareMasterRateRelation record, @Param("example") WareMasterRateRelationExample example);

    int updateByExample(@Param("record") WareMasterRateRelation record, @Param("example") WareMasterRateRelationExample example);

    int updateByPrimaryKeySelective(WareMasterRateRelation record);

    int updateByPrimaryKey(WareMasterRateRelation record);
}