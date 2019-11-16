package com.sanlly.finance.dao;

import com.sanlly.finance.entity.ReportSingleBoxCost;
import com.sanlly.finance.entity.ReportSingleBoxCostExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReportSingleBoxCostMapper {
    long countByExample(ReportSingleBoxCostExample example);

    int deleteByExample(ReportSingleBoxCostExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ReportSingleBoxCost record);

    int insertSelective(ReportSingleBoxCost record);

    List<ReportSingleBoxCost> selectByExample(ReportSingleBoxCostExample example);

    ReportSingleBoxCost selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ReportSingleBoxCost record, @Param("example") ReportSingleBoxCostExample example);

    int updateByExample(@Param("record") ReportSingleBoxCost record, @Param("example") ReportSingleBoxCostExample example);

    int updateByPrimaryKeySelective(ReportSingleBoxCost record);

    int updateByPrimaryKey(ReportSingleBoxCost record);
}