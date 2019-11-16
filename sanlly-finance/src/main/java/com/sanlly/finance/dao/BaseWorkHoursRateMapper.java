package com.sanlly.finance.dao;

import com.sanlly.finance.entity.BaseWorkHoursRate;
import com.sanlly.finance.entity.BaseWorkHoursRateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseWorkHoursRateMapper {
    long countByExample(BaseWorkHoursRateExample example);

    int deleteByExample(BaseWorkHoursRateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BaseWorkHoursRate record);

    int insertSelective(BaseWorkHoursRate record);

    List<BaseWorkHoursRate> selectByExample(BaseWorkHoursRateExample example);

    BaseWorkHoursRate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BaseWorkHoursRate record, @Param("example") BaseWorkHoursRateExample example);

    int updateByExample(@Param("record") BaseWorkHoursRate record, @Param("example") BaseWorkHoursRateExample example);

    int updateByPrimaryKeySelective(BaseWorkHoursRate record);

    int updateByPrimaryKey(BaseWorkHoursRate record);
}