package com.sanlly.finance.dao;

import com.sanlly.finance.entity.PoolSourceRepair;
import com.sanlly.finance.entity.PoolSourceRepairExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PoolSourceRepairMapper {
    long countByExample(PoolSourceRepairExample example);

    int deleteByExample(PoolSourceRepairExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PoolSourceRepair record);

    int insertSelective(PoolSourceRepair record);

    List<PoolSourceRepair> selectByExample(PoolSourceRepairExample example);

    PoolSourceRepair selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PoolSourceRepair record, @Param("example") PoolSourceRepairExample example);

    int updateByExample(@Param("record") PoolSourceRepair record, @Param("example") PoolSourceRepairExample example);

    int updateByPrimaryKeySelective(PoolSourceRepair record);

    int updateByPrimaryKey(PoolSourceRepair record);
}