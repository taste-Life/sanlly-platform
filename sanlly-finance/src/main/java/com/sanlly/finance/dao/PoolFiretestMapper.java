package com.sanlly.finance.dao;

import com.sanlly.finance.entity.PoolFiretest;
import com.sanlly.finance.entity.PoolFiretestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PoolFiretestMapper {
    long countByExample(PoolFiretestExample example);

    int deleteByExample(PoolFiretestExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PoolFiretest record);

    int insertSelective(PoolFiretest record);

    List<PoolFiretest> selectByExample(PoolFiretestExample example);

    PoolFiretest selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PoolFiretest record, @Param("example") PoolFiretestExample example);

    int updateByExample(@Param("record") PoolFiretest record, @Param("example") PoolFiretestExample example);

    int updateByPrimaryKeySelective(PoolFiretest record);

    int updateByPrimaryKey(PoolFiretest record);
}