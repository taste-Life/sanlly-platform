package com.sanlly.finance.dao;

import com.sanlly.finance.entity.BaseCommonRate;
import com.sanlly.finance.entity.BaseCommonRateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseCommonRateMapper {
    long countByExample(BaseCommonRateExample example);

    int deleteByExample(BaseCommonRateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BaseCommonRate record);

    int insertSelective(BaseCommonRate record);

    List<BaseCommonRate> selectByExample(BaseCommonRateExample example);

    BaseCommonRate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BaseCommonRate record, @Param("example") BaseCommonRateExample example);

    int updateByExample(@Param("record") BaseCommonRate record, @Param("example") BaseCommonRateExample example);

    int updateByPrimaryKeySelective(BaseCommonRate record);

    int updateByPrimaryKey(BaseCommonRate record);
}