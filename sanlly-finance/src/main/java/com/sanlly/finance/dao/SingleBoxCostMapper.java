package com.sanlly.finance.dao;

import com.sanlly.finance.entity.SingleBoxCost;
import com.sanlly.finance.entity.SingleBoxCostExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SingleBoxCostMapper {
    long countByExample(SingleBoxCostExample example);

    int deleteByExample(SingleBoxCostExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SingleBoxCost record);

    int insertSelective(SingleBoxCost record);

    List<SingleBoxCost> selectByExample(SingleBoxCostExample example);

    SingleBoxCost selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SingleBoxCost record, @Param("example") SingleBoxCostExample example);

    int updateByExample(@Param("record") SingleBoxCost record, @Param("example") SingleBoxCostExample example);

    int updateByPrimaryKeySelective(SingleBoxCost record);

    int updateByPrimaryKey(SingleBoxCost record);
}