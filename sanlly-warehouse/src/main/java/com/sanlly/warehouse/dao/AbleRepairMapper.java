package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.AbleRepair;
import com.sanlly.warehouse.entity.AbleRepairExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AbleRepairMapper {
    long countByExample(AbleRepairExample example);

    int deleteByExample(AbleRepairExample example);

    int deleteByPrimaryKey(Integer wareAbleRepairId);

    int insert(AbleRepair record);

    int insertSelective(AbleRepair record);

    List<AbleRepair> selectByExample(AbleRepairExample example);

    AbleRepair selectByPrimaryKey(Integer wareAbleRepairId);

    int updateByExampleSelective(@Param("record") AbleRepair record, @Param("example") AbleRepairExample example);

    int updateByExample(@Param("record") AbleRepair record, @Param("example") AbleRepairExample example);

    int updateByPrimaryKeySelective(AbleRepair record);

    int updateByPrimaryKey(AbleRepair record);
}