package com.sanlly.finance.dao;

import com.sanlly.finance.entity.PoolRepair;
import com.sanlly.finance.entity.PoolRepairExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PoolRepairMapper {
    long countByExample(PoolRepairExample example);

    int deleteByExample(PoolRepairExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PoolRepair record);

    int insertSelective(PoolRepair record);

    List<PoolRepair> selectByExample(PoolRepairExample example);

    PoolRepair selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PoolRepair record, @Param("example") PoolRepairExample example);

    int updateByExample(@Param("record") PoolRepair record, @Param("example") PoolRepairExample example);

    int updateByPrimaryKeySelective(PoolRepair record);

    int updateByPrimaryKey(PoolRepair record);
}