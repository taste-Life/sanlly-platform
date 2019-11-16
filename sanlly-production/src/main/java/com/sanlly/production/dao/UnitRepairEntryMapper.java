package com.sanlly.production.dao;

import com.sanlly.production.entity.UnitRepairEntry;
import com.sanlly.production.entity.UnitRepairEntryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UnitRepairEntryMapper {
    long countByExample(UnitRepairEntryExample example);

    int deleteByExample(UnitRepairEntryExample example);

    int deleteByPrimaryKey(Integer prodUnitRepairEntryId);

    int insert(UnitRepairEntry record);

    int insertSelective(UnitRepairEntry record);

    List<UnitRepairEntry> selectByExample(UnitRepairEntryExample example);

    UnitRepairEntry selectByPrimaryKey(Integer prodUnitRepairEntryId);

    int updateByExampleSelective(@Param("record") UnitRepairEntry record, @Param("example") UnitRepairEntryExample example);

    int updateByExample(@Param("record") UnitRepairEntry record, @Param("example") UnitRepairEntryExample example);

    int updateByPrimaryKeySelective(UnitRepairEntry record);

    int updateByPrimaryKey(UnitRepairEntry record);
}