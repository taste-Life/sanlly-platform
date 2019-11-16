package com.sanlly.production.dao;

import com.sanlly.production.entity.Firetest;
import com.sanlly.production.entity.FiretestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FiretestMapper {
    long countByExample(FiretestExample example);

    int deleteByExample(FiretestExample example);

    int deleteByPrimaryKey(Integer prodFiretestId);

    int insert(Firetest record);

    int insertSelective(Firetest record);

    List<Firetest> selectByExample(FiretestExample example);

    Firetest selectByPrimaryKey(Integer prodFiretestId);

    int updateByExampleSelective(@Param("record") Firetest record, @Param("example") FiretestExample example);

    int updateByExample(@Param("record") Firetest record, @Param("example") FiretestExample example);

    int updateByPrimaryKeySelective(Firetest record);

    int updateByPrimaryKey(Firetest record);
}