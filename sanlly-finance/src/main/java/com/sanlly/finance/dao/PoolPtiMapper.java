package com.sanlly.finance.dao;

import com.sanlly.finance.entity.PoolPti;
import com.sanlly.finance.entity.PoolPtiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PoolPtiMapper {
    long countByExample(PoolPtiExample example);

    int deleteByExample(PoolPtiExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PoolPti record);

    int insertSelective(PoolPti record);

    List<PoolPti> selectByExample(PoolPtiExample example);

    PoolPti selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PoolPti record, @Param("example") PoolPtiExample example);

    int updateByExample(@Param("record") PoolPti record, @Param("example") PoolPtiExample example);

    int updateByPrimaryKeySelective(PoolPti record);

    int updateByPrimaryKey(PoolPti record);
}