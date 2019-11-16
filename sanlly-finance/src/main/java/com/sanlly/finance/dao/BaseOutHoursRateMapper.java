package com.sanlly.finance.dao;

import com.sanlly.finance.entity.BaseOutHoursRate;
import com.sanlly.finance.entity.BaseOutHoursRateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseOutHoursRateMapper {
    long countByExample(BaseOutHoursRateExample example);

    int deleteByExample(BaseOutHoursRateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BaseOutHoursRate record);

    int insertSelective(BaseOutHoursRate record);

    List<BaseOutHoursRate> selectByExample(BaseOutHoursRateExample example);

    BaseOutHoursRate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BaseOutHoursRate record, @Param("example") BaseOutHoursRateExample example);

    int updateByExample(@Param("record") BaseOutHoursRate record, @Param("example") BaseOutHoursRateExample example);

    int updateByPrimaryKeySelective(BaseOutHoursRate record);

    int updateByPrimaryKey(BaseOutHoursRate record);
}