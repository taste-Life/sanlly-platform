package com.sanlly.production.dao;

import com.sanlly.production.entity.CostRate;
import com.sanlly.production.entity.CostRateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CostRateMapper {
    long countByExample(CostRateExample example);

    int deleteByExample(CostRateExample example);

    int deleteByPrimaryKey(String prodCostRateId);

    int insert(CostRate record);

    int insertSelective(CostRate record);

    List<CostRate> selectByExample(CostRateExample example);

    CostRate selectByPrimaryKey(String prodCostRateId);

    int updateByExampleSelective(@Param("record") CostRate record, @Param("example") CostRateExample example);

    int updateByExample(@Param("record") CostRate record, @Param("example") CostRateExample example);

    int updateByPrimaryKeySelective(CostRate record);

    int updateByPrimaryKey(CostRate record);
}