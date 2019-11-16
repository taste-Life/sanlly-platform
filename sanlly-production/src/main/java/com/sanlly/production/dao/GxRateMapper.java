package com.sanlly.production.dao;

import com.sanlly.production.entity.GxRate;
import com.sanlly.production.entity.GxRateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GxRateMapper {
    long countByExample(GxRateExample example);

    int deleteByExample(GxRateExample example);

    int deleteByPrimaryKey(String id);

    int insert(GxRate record);

    int insertSelective(GxRate record);

    List<GxRate> selectByExample(GxRateExample example);

    GxRate selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") GxRate record, @Param("example") GxRateExample example);

    int updateByExample(@Param("record") GxRate record, @Param("example") GxRateExample example);

    int updateByPrimaryKeySelective(GxRate record);

    int updateByPrimaryKey(GxRate record);
}