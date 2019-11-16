package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareMaintainDepartment;
import com.sanlly.warehouse.entity.WareMaintainDepartmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareMaintainDepartmentMapper {
    long countByExample(WareMaintainDepartmentExample example);

    int deleteByExample(WareMaintainDepartmentExample example);

    int deleteByPrimaryKey(Integer wareMaintainDepartmentId);

    int insert(WareMaintainDepartment record);

    int insertSelective(WareMaintainDepartment record);

    List<WareMaintainDepartment> selectByExample(WareMaintainDepartmentExample example);

    WareMaintainDepartment selectByPrimaryKey(Integer wareMaintainDepartmentId);

    int updateByExampleSelective(@Param("record") WareMaintainDepartment record, @Param("example") WareMaintainDepartmentExample example);

    int updateByExample(@Param("record") WareMaintainDepartment record, @Param("example") WareMaintainDepartmentExample example);

    int updateByPrimaryKeySelective(WareMaintainDepartment record);

    int updateByPrimaryKey(WareMaintainDepartment record);
}