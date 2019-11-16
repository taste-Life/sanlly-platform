package com.sanlly.production.dao;

import com.sanlly.production.entity.UnrecycleCost;
import com.sanlly.production.entity.UnrecycleCostExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UnrecycleCostMapper {
    long countByExample(UnrecycleCostExample example);

    int deleteByExample(UnrecycleCostExample example);

    int deleteByPrimaryKey(Integer prodUnrecycleCostId);

    int insert(UnrecycleCost record);

    int insertSelective(UnrecycleCost record);

    List<UnrecycleCost> selectByExample(UnrecycleCostExample example);

    UnrecycleCost selectByPrimaryKey(Integer prodUnrecycleCostId);

    int updateByExampleSelective(@Param("record") UnrecycleCost record, @Param("example") UnrecycleCostExample example);

    int updateByExample(@Param("record") UnrecycleCost record, @Param("example") UnrecycleCostExample example);

    int updateByPrimaryKeySelective(UnrecycleCost record);

    int updateByPrimaryKey(UnrecycleCost record);
}