package com.sanlly.finance.dao;

import com.sanlly.finance.entity.BasePtiRate;
import com.sanlly.finance.entity.BasePtiRateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BasePtiRateMapper {
    long countByExample(BasePtiRateExample example);

    int deleteByExample(BasePtiRateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BasePtiRate record);

    int insertSelective(BasePtiRate record);

    List<BasePtiRate> selectByExample(BasePtiRateExample example);

    BasePtiRate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BasePtiRate record, @Param("example") BasePtiRateExample example);

    int updateByExample(@Param("record") BasePtiRate record, @Param("example") BasePtiRateExample example);

    int updateByPrimaryKeySelective(BasePtiRate record);

    int updateByPrimaryKey(BasePtiRate record);
}