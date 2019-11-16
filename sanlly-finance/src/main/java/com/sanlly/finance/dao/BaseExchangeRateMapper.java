package com.sanlly.finance.dao;

import com.sanlly.finance.entity.BaseExchangeRate;
import com.sanlly.finance.entity.BaseExchangeRateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseExchangeRateMapper {
    long countByExample(BaseExchangeRateExample example);

    int deleteByExample(BaseExchangeRateExample example);

    int deleteByPrimaryKey(Integer exchangeRateId);

    int insert(BaseExchangeRate record);

    int insertSelective(BaseExchangeRate record);

    List<BaseExchangeRate> selectByExample(BaseExchangeRateExample example);

    BaseExchangeRate selectByPrimaryKey(Integer exchangeRateId);

    int updateByExampleSelective(@Param("record") BaseExchangeRate record, @Param("example") BaseExchangeRateExample example);

    int updateByExample(@Param("record") BaseExchangeRate record, @Param("example") BaseExchangeRateExample example);

    int updateByPrimaryKeySelective(BaseExchangeRate record);

    int updateByPrimaryKey(BaseExchangeRate record);
}