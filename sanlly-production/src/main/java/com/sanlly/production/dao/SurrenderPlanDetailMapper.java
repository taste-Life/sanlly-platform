package com.sanlly.production.dao;

import com.sanlly.production.entity.SurrenderPlanDetail;
import com.sanlly.production.entity.SurrenderPlanDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SurrenderPlanDetailMapper {
    long countByExample(SurrenderPlanDetailExample example);

    int deleteByExample(SurrenderPlanDetailExample example);

    int deleteByPrimaryKey(Integer prodSurrenderPlanDetailId);

    int insert(SurrenderPlanDetail record);

    int insertSelective(SurrenderPlanDetail record);

    List<SurrenderPlanDetail> selectByExample(SurrenderPlanDetailExample example);

    SurrenderPlanDetail selectByPrimaryKey(Integer prodSurrenderPlanDetailId);

    int updateByExampleSelective(@Param("record") SurrenderPlanDetail record, @Param("example") SurrenderPlanDetailExample example);

    int updateByExample(@Param("record") SurrenderPlanDetail record, @Param("example") SurrenderPlanDetailExample example);

    int updateByPrimaryKeySelective(SurrenderPlanDetail record);

    int updateByPrimaryKey(SurrenderPlanDetail record);
}