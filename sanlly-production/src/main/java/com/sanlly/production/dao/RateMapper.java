package com.sanlly.production.dao;

import com.sanlly.production.entity.Rate;
import com.sanlly.production.entity.RateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RateMapper {
    long countByExample(RateExample example);

    int deleteByExample(RateExample example);

    int deleteByPrimaryKey(String prodRateId);

    int insert(Rate record);

    int insertSelective(Rate record);

    List<Rate> selectByExample(RateExample example);

    Rate selectByPrimaryKey(String prodRateId);

    int updateByExampleSelective(@Param("record") Rate record, @Param("example") RateExample example);

    int updateByExample(@Param("record") Rate record, @Param("example") RateExample example);

    int updateByPrimaryKeySelective(Rate record);

    int updateByPrimaryKey(Rate record);
}