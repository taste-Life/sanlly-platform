package com.sanlly.production.dao;

import com.sanlly.production.entity.SpecialWashingRate;
import com.sanlly.production.entity.SpecialWashingRateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpecialWashingRateMapper {
    long countByExample(SpecialWashingRateExample example);

    int deleteByExample(SpecialWashingRateExample example);

    int deleteByPrimaryKey(Integer prodSpecialWashingRateId);

    int insert(SpecialWashingRate record);

    int insertSelective(SpecialWashingRate record);

    List<SpecialWashingRate> selectByExample(SpecialWashingRateExample example);

    SpecialWashingRate selectByPrimaryKey(Integer prodSpecialWashingRateId);

    int updateByExampleSelective(@Param("record") SpecialWashingRate record, @Param("example") SpecialWashingRateExample example);

    int updateByExample(@Param("record") SpecialWashingRate record, @Param("example") SpecialWashingRateExample example);

    int updateByPrimaryKeySelective(SpecialWashingRate record);

    int updateByPrimaryKey(SpecialWashingRate record);
}