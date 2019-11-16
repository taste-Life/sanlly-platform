package com.sanlly.finance.dao;

import com.sanlly.finance.entity.PoolLease;
import com.sanlly.finance.entity.PoolLeaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PoolLeaseMapper {
    long countByExample(PoolLeaseExample example);

    int deleteByExample(PoolLeaseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PoolLease record);

    int insertSelective(PoolLease record);

    List<PoolLease> selectByExample(PoolLeaseExample example);

    PoolLease selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PoolLease record, @Param("example") PoolLeaseExample example);

    int updateByExample(@Param("record") PoolLease record, @Param("example") PoolLeaseExample example);

    int updateByPrimaryKeySelective(PoolLease record);

    int updateByPrimaryKey(PoolLease record);
}