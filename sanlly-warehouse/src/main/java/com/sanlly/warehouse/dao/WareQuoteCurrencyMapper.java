package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareQuoteCurrency;
import com.sanlly.warehouse.entity.WareQuoteCurrencyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareQuoteCurrencyMapper {
    long countByExample(WareQuoteCurrencyExample example);

    int deleteByExample(WareQuoteCurrencyExample example);

    int deleteByPrimaryKey(Integer wareQuoteCurrencyId);

    int insert(WareQuoteCurrency record);

    int insertSelective(WareQuoteCurrency record);

    List<WareQuoteCurrency> selectByExample(WareQuoteCurrencyExample example);

    WareQuoteCurrency selectByPrimaryKey(Integer wareQuoteCurrencyId);

    int updateByExampleSelective(@Param("record") WareQuoteCurrency record, @Param("example") WareQuoteCurrencyExample example);

    int updateByExample(@Param("record") WareQuoteCurrency record, @Param("example") WareQuoteCurrencyExample example);

    int updateByPrimaryKeySelective(WareQuoteCurrency record);

    int updateByPrimaryKey(WareQuoteCurrency record);
}