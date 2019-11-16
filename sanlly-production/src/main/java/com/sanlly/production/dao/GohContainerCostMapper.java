package com.sanlly.production.dao;

import com.sanlly.production.entity.GohContainerCost;
import com.sanlly.production.entity.GohContainerCostExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GohContainerCostMapper {
    long countByExample(GohContainerCostExample example);

    int deleteByExample(GohContainerCostExample example);

    int deleteByPrimaryKey(Integer prodGohContainerCostId);

    int insert(GohContainerCost record);

    int insertSelective(GohContainerCost record);

    List<GohContainerCost> selectByExample(GohContainerCostExample example);

    GohContainerCost selectByPrimaryKey(Integer prodGohContainerCostId);

    int updateByExampleSelective(@Param("record") GohContainerCost record, @Param("example") GohContainerCostExample example);

    int updateByExample(@Param("record") GohContainerCost record, @Param("example") GohContainerCostExample example);

    int updateByPrimaryKeySelective(GohContainerCost record);

    int updateByPrimaryKey(GohContainerCost record);
}