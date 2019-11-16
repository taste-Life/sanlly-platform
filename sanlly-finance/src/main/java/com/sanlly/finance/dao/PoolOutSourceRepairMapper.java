package com.sanlly.finance.dao;

import com.sanlly.finance.entity.PoolOutSourceRepair;
import com.sanlly.finance.entity.PoolOutSourceRepairExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PoolOutSourceRepairMapper {
    long countByExample(PoolOutSourceRepairExample example);

    int deleteByExample(PoolOutSourceRepairExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PoolOutSourceRepair record);

    int insertSelective(PoolOutSourceRepair record);

    List<PoolOutSourceRepair> selectByExample(PoolOutSourceRepairExample example);

    PoolOutSourceRepair selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PoolOutSourceRepair record, @Param("example") PoolOutSourceRepairExample example);

    int updateByExample(@Param("record") PoolOutSourceRepair record, @Param("example") PoolOutSourceRepairExample example);

    int updateByPrimaryKeySelective(PoolOutSourceRepair record);

    int updateByPrimaryKey(PoolOutSourceRepair record);
}