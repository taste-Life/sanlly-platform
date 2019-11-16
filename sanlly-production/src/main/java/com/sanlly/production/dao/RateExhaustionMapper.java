package com.sanlly.production.dao;

import com.sanlly.production.entity.RateExhaustion;
import com.sanlly.production.entity.RateExhaustionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RateExhaustionMapper {
    long countByExample(RateExhaustionExample example);

    int deleteByExample(RateExhaustionExample example);

    int deleteByPrimaryKey(String prodRateExhaustionId);

    int insert(RateExhaustion record);

    int insertSelective(RateExhaustion record);

    List<RateExhaustion> selectByExample(RateExhaustionExample example);

    RateExhaustion selectByPrimaryKey(String prodRateExhaustionId);

    int updateByExampleSelective(@Param("record") RateExhaustion record, @Param("example") RateExhaustionExample example);

    int updateByExample(@Param("record") RateExhaustion record, @Param("example") RateExhaustionExample example);

    int updateByPrimaryKeySelective(RateExhaustion record);

    int updateByPrimaryKey(RateExhaustion record);
}