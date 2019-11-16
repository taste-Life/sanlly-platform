package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.RepairReport;
import com.sanlly.warehouse.entity.RepairReportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RepairReportMapper {
    long countByExample(RepairReportExample example);

    int deleteByExample(RepairReportExample example);

    int deleteByPrimaryKey(Integer wareRepairReportId);

    int insert(RepairReport record);

    int insertSelective(RepairReport record);

    List<RepairReport> selectByExample(RepairReportExample example);

    RepairReport selectByPrimaryKey(Integer wareRepairReportId);

    int updateByExampleSelective(@Param("record") RepairReport record, @Param("example") RepairReportExample example);

    int updateByExample(@Param("record") RepairReport record, @Param("example") RepairReportExample example);

    int updateByPrimaryKeySelective(RepairReport record);

    int updateByPrimaryKey(RepairReport record);
}