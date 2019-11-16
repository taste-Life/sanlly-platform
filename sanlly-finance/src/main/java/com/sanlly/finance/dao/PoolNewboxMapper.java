package com.sanlly.finance.dao;

import com.sanlly.finance.entity.PoolNewbox;
import com.sanlly.finance.entity.PoolNewboxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PoolNewboxMapper {
    long countByExample(PoolNewboxExample example);

    int deleteByExample(PoolNewboxExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PoolNewbox record);

    int insertSelective(PoolNewbox record);

    List<PoolNewbox> selectByExample(PoolNewboxExample example);

    PoolNewbox selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PoolNewbox record, @Param("example") PoolNewboxExample example);

    int updateByExample(@Param("record") PoolNewbox record, @Param("example") PoolNewboxExample example);

    int updateByPrimaryKeySelective(PoolNewbox record);

    int updateByPrimaryKey(PoolNewbox record);
}