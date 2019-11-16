package com.sanlly.production.dao;

import com.sanlly.production.entity.PartsRepair;
import com.sanlly.production.entity.PartsRepairExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PartsRepairMapper {
    long countByExample(PartsRepairExample example);

    int deleteByExample(PartsRepairExample example);

    int deleteByPrimaryKey(Integer prodPartsRepairId);

    int insert(PartsRepair record);

    int insertSelective(PartsRepair record);

    List<PartsRepair> selectByExample(PartsRepairExample example);

    PartsRepair selectByPrimaryKey(Integer prodPartsRepairId);

    int updateByExampleSelective(@Param("record") PartsRepair record, @Param("example") PartsRepairExample example);

    int updateByExample(@Param("record") PartsRepair record, @Param("example") PartsRepairExample example);

    int updateByPrimaryKeySelective(PartsRepair record);

    int updateByPrimaryKey(PartsRepair record);
}