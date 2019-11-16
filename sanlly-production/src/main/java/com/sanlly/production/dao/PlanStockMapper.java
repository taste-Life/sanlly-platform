package com.sanlly.production.dao;

import com.sanlly.production.entity.PlanStock;
import com.sanlly.production.entity.PlanStockExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlanStockMapper {
    long countByExample(PlanStockExample example);

    int deleteByExample(PlanStockExample example);

    int deleteByPrimaryKey(Integer prodPlanStockId);

    int insert(PlanStock record);

    int insertSelective(PlanStock record);

    List<PlanStock> selectByExample(PlanStockExample example);

    PlanStock selectByPrimaryKey(Integer prodPlanStockId);

    int updateByExampleSelective(@Param("record") PlanStock record, @Param("example") PlanStockExample example);

    int updateByExample(@Param("record") PlanStock record, @Param("example") PlanStockExample example);

    int updateByPrimaryKeySelective(PlanStock record);

    int updateByPrimaryKey(PlanStock record);
}