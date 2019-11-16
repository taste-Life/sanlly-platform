package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.RepairDepartment;
import com.sanlly.warehouse.entity.RepairDepartmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RepairDepartmentMapper {
    long countByExample(RepairDepartmentExample example);

    int deleteByExample(RepairDepartmentExample example);

    int deleteByPrimaryKey(Integer wareRepairDepartmentId);

    int insert(RepairDepartment record);

    int insertSelective(RepairDepartment record);

    List<RepairDepartment> selectByExample(RepairDepartmentExample example);

    RepairDepartment selectByPrimaryKey(Integer wareRepairDepartmentId);

    int updateByExampleSelective(@Param("record") RepairDepartment record, @Param("example") RepairDepartmentExample example);

    int updateByExample(@Param("record") RepairDepartment record, @Param("example") RepairDepartmentExample example);

    int updateByPrimaryKeySelective(RepairDepartment record);

    int updateByPrimaryKey(RepairDepartment record);
}