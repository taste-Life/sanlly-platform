package com.sanlly.finance.dao;

import com.sanlly.finance.entity.BaseTaxRate;
import com.sanlly.finance.entity.BaseTaxRateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseTaxRateMapper {
    long countByExample(BaseTaxRateExample example);

    int deleteByExample(BaseTaxRateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BaseTaxRate record);

    int insertSelective(BaseTaxRate record);

    List<BaseTaxRate> selectByExample(BaseTaxRateExample example);

    BaseTaxRate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BaseTaxRate record, @Param("example") BaseTaxRateExample example);

    int updateByExample(@Param("record") BaseTaxRate record, @Param("example") BaseTaxRateExample example);

    int updateByPrimaryKeySelective(BaseTaxRate record);

    int updateByPrimaryKey(BaseTaxRate record);
}