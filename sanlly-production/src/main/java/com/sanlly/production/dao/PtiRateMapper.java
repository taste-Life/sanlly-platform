package com.sanlly.production.dao;

import com.sanlly.production.entity.PtiRate;
import com.sanlly.production.entity.PtiRateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PtiRateMapper {
    long countByExample(PtiRateExample example);

    int deleteByExample(PtiRateExample example);

    int deleteByPrimaryKey(Integer prodPtiRateId);

    int insert(PtiRate record);

    int insertSelective(PtiRate record);

    List<PtiRate> selectByExample(PtiRateExample example);

    PtiRate selectByPrimaryKey(Integer prodPtiRateId);

    int updateByExampleSelective(@Param("record") PtiRate record, @Param("example") PtiRateExample example);

    int updateByExample(@Param("record") PtiRate record, @Param("example") PtiRateExample example);

    int updateByPrimaryKeySelective(PtiRate record);

    int updateByPrimaryKey(PtiRate record);
}