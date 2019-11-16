package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.RepairReportDetail;
import com.sanlly.warehouse.entity.RepairReportDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RepairReportDetailMapper {
    long countByExample(RepairReportDetailExample example);

    int deleteByExample(RepairReportDetailExample example);

    int deleteByPrimaryKey(Integer wareReportDetailId);

    int insert(RepairReportDetail record);

    int insertSelective(RepairReportDetail record);

    List<RepairReportDetail> selectByExample(RepairReportDetailExample example);

    RepairReportDetail selectByPrimaryKey(Integer wareReportDetailId);

    int updateByExampleSelective(@Param("record") RepairReportDetail record, @Param("example") RepairReportDetailExample example);

    int updateByExample(@Param("record") RepairReportDetail record, @Param("example") RepairReportDetailExample example);

    int updateByPrimaryKeySelective(RepairReportDetail record);

    int updateByPrimaryKey(RepairReportDetail record);
}