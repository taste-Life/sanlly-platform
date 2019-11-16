package com.sanlly.production.dao;

import com.sanlly.production.entity.SurrenderPlan;
import com.sanlly.production.entity.SurrenderPlanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SurrenderPlanMapper {
    long countByExample(SurrenderPlanExample example);

    int deleteByExample(SurrenderPlanExample example);

    int deleteByPrimaryKey(Integer prodSurrenderPlanId);

    int insert(SurrenderPlan record);

    int insertSelective(SurrenderPlan record);

    List<SurrenderPlan> selectByExample(SurrenderPlanExample example);

    SurrenderPlan selectByPrimaryKey(Integer prodSurrenderPlanId);

    int updateByExampleSelective(@Param("record") SurrenderPlan record, @Param("example") SurrenderPlanExample example);

    int updateByExample(@Param("record") SurrenderPlan record, @Param("example") SurrenderPlanExample example);

    int updateByPrimaryKeySelective(SurrenderPlan record);

    int updateByPrimaryKey(SurrenderPlan record);
}