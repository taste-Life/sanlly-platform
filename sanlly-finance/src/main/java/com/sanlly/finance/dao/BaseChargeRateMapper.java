package com.sanlly.finance.dao;

import com.sanlly.finance.entity.BaseChargeRate;
import com.sanlly.finance.entity.BaseChargeRateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseChargeRateMapper {
    long countByExample(BaseChargeRateExample example);

    int deleteByExample(BaseChargeRateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BaseChargeRate record);

    int insertSelective(BaseChargeRate record);

    List<BaseChargeRate> selectByExample(BaseChargeRateExample example);

    BaseChargeRate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BaseChargeRate record, @Param("example") BaseChargeRateExample example);

    int updateByExample(@Param("record") BaseChargeRate record, @Param("example") BaseChargeRateExample example);

    int updateByPrimaryKeySelective(BaseChargeRate record);

    int updateByPrimaryKey(BaseChargeRate record);
}