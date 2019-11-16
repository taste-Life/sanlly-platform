package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareMaintainType;
import com.sanlly.warehouse.entity.WareMaintainTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareMaintainTypeMapper {
    long countByExample(WareMaintainTypeExample example);

    int deleteByExample(WareMaintainTypeExample example);

    int deleteByPrimaryKey(Integer wareMaintainTypeId);

    int insert(WareMaintainType record);

    int insertSelective(WareMaintainType record);

    List<WareMaintainType> selectByExample(WareMaintainTypeExample example);

    WareMaintainType selectByPrimaryKey(Integer wareMaintainTypeId);

    int updateByExampleSelective(@Param("record") WareMaintainType record, @Param("example") WareMaintainTypeExample example);

    int updateByExample(@Param("record") WareMaintainType record, @Param("example") WareMaintainTypeExample example);

    int updateByPrimaryKeySelective(WareMaintainType record);

    int updateByPrimaryKey(WareMaintainType record);
}