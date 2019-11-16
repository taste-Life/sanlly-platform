package com.sanlly.production.dao;

import com.sanlly.production.entity.UnitRepair;
import com.sanlly.production.entity.UnitRepairExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UnitRepairMapper {
    long countByExample(UnitRepairExample example);

    int deleteByExample(UnitRepairExample example);

    int deleteByPrimaryKey(Integer prodUnitRepairId);

    int insert(UnitRepair record);

    int insertSelective(UnitRepair record);

    List<UnitRepair> selectByExample(UnitRepairExample example);

    UnitRepair selectByPrimaryKey(Integer prodUnitRepairId);

    int updateByExampleSelective(@Param("record") UnitRepair record, @Param("example") UnitRepairExample example);

    int updateByExample(@Param("record") UnitRepair record, @Param("example") UnitRepairExample example);

    int updateByPrimaryKeySelective(UnitRepair record);

    int updateByPrimaryKey(UnitRepair record);
}