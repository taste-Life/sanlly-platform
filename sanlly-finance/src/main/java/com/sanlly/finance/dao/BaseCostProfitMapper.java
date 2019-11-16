package com.sanlly.finance.dao;

import com.sanlly.finance.entity.BaseCostProfit;
import com.sanlly.finance.entity.BaseCostProfitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseCostProfitMapper {
    long countByExample(BaseCostProfitExample example);

    int deleteByExample(BaseCostProfitExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BaseCostProfit record);

    int insertSelective(BaseCostProfit record);

    List<BaseCostProfit> selectByExample(BaseCostProfitExample example);

    BaseCostProfit selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BaseCostProfit record, @Param("example") BaseCostProfitExample example);

    int updateByExample(@Param("record") BaseCostProfit record, @Param("example") BaseCostProfitExample example);

    int updateByPrimaryKeySelective(BaseCostProfit record);

    int updateByPrimaryKey(BaseCostProfit record);
}