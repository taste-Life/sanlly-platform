package com.sanlly.purchase.dao;

import com.sanlly.purchase.entity.PeriodProductRemind;
import com.sanlly.purchase.entity.PeriodProductRemindExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PeriodProductRemindMapper {
    long countByExample(PeriodProductRemindExample example);

    int deleteByExample(PeriodProductRemindExample example);

    int deleteByPrimaryKey(Integer purcPeriodProductRemindId);

    int insert(PeriodProductRemind record);

    int insertSelective(PeriodProductRemind record);

    List<PeriodProductRemind> selectByExample(PeriodProductRemindExample example);

    PeriodProductRemind selectByPrimaryKey(Integer purcPeriodProductRemindId);

    int updateByExampleSelective(@Param("record") PeriodProductRemind record, @Param("example") PeriodProductRemindExample example);

    int updateByExample(@Param("record") PeriodProductRemind record, @Param("example") PeriodProductRemindExample example);

    int updateByPrimaryKeySelective(PeriodProductRemind record);

    int updateByPrimaryKey(PeriodProductRemind record);
}