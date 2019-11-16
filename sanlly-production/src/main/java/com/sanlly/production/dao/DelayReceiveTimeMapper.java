package com.sanlly.production.dao;

import com.sanlly.production.entity.DelayReceiveTime;
import com.sanlly.production.entity.DelayReceiveTimeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DelayReceiveTimeMapper {
    long countByExample(DelayReceiveTimeExample example);

    int deleteByExample(DelayReceiveTimeExample example);

    int deleteByPrimaryKey(Integer prodDelayReceiveTimeId);

    int insert(DelayReceiveTime record);

    int insertSelective(DelayReceiveTime record);

    List<DelayReceiveTime> selectByExample(DelayReceiveTimeExample example);

    DelayReceiveTime selectByPrimaryKey(Integer prodDelayReceiveTimeId);

    int updateByExampleSelective(@Param("record") DelayReceiveTime record, @Param("example") DelayReceiveTimeExample example);

    int updateByExample(@Param("record") DelayReceiveTime record, @Param("example") DelayReceiveTimeExample example);

    int updateByPrimaryKeySelective(DelayReceiveTime record);

    int updateByPrimaryKey(DelayReceiveTime record);
}