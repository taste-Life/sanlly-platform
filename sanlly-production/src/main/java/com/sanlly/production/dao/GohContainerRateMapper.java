package com.sanlly.production.dao;

import com.sanlly.production.entity.GohContainerRate;
import com.sanlly.production.entity.GohContainerRateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GohContainerRateMapper {
    long countByExample(GohContainerRateExample example);

    int deleteByExample(GohContainerRateExample example);

    int deleteByPrimaryKey(Integer prodGohContainerRateId);

    int insert(GohContainerRate record);

    int insertSelective(GohContainerRate record);

    List<GohContainerRate> selectByExample(GohContainerRateExample example);

    GohContainerRate selectByPrimaryKey(Integer prodGohContainerRateId);

    int updateByExampleSelective(@Param("record") GohContainerRate record, @Param("example") GohContainerRateExample example);

    int updateByExample(@Param("record") GohContainerRate record, @Param("example") GohContainerRateExample example);

    int updateByPrimaryKeySelective(GohContainerRate record);

    int updateByPrimaryKey(GohContainerRate record);
}