package com.sanlly.production.dao;

import com.sanlly.production.entity.FiretestRate;
import com.sanlly.production.entity.FiretestRateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FiretestRateMapper {
    long countByExample(FiretestRateExample example);

    int deleteByExample(FiretestRateExample example);

    int deleteByPrimaryKey(Integer prodFiretestRateId);

    int insert(FiretestRate record);

    int insertSelective(FiretestRate record);

    List<FiretestRate> selectByExample(FiretestRateExample example);

    FiretestRate selectByPrimaryKey(Integer prodFiretestRateId);

    int updateByExampleSelective(@Param("record") FiretestRate record, @Param("example") FiretestRateExample example);

    int updateByExample(@Param("record") FiretestRate record, @Param("example") FiretestRateExample example);

    int updateByPrimaryKeySelective(FiretestRate record);

    int updateByPrimaryKey(FiretestRate record);
}