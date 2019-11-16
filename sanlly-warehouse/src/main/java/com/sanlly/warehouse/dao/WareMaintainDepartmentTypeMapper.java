package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareMaintainDepartmentType;
import com.sanlly.warehouse.entity.WareMaintainDepartmentTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareMaintainDepartmentTypeMapper {
    long countByExample(WareMaintainDepartmentTypeExample example);

    int deleteByExample(WareMaintainDepartmentTypeExample example);

    int deleteByPrimaryKey(Integer wareMaintainDepartmentTypeId);

    int insert(WareMaintainDepartmentType record);

    int insertSelective(WareMaintainDepartmentType record);

    List<WareMaintainDepartmentType> selectByExample(WareMaintainDepartmentTypeExample example);

    WareMaintainDepartmentType selectByPrimaryKey(Integer wareMaintainDepartmentTypeId);

    int updateByExampleSelective(@Param("record") WareMaintainDepartmentType record, @Param("example") WareMaintainDepartmentTypeExample example);

    int updateByExample(@Param("record") WareMaintainDepartmentType record, @Param("example") WareMaintainDepartmentTypeExample example);

    int updateByPrimaryKeySelective(WareMaintainDepartmentType record);

    int updateByPrimaryKey(WareMaintainDepartmentType record);
}