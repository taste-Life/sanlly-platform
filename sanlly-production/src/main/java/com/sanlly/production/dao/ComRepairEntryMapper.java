package com.sanlly.production.dao;

import com.sanlly.production.entity.ComRepairEntry;
import com.sanlly.production.entity.ComRepairEntryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ComRepairEntryMapper {
    long countByExample(ComRepairEntryExample example);

    int deleteByExample(ComRepairEntryExample example);

    int deleteByPrimaryKey(Integer prodComRepairEntryId);

    int insert(ComRepairEntry record);

    int insertSelective(ComRepairEntry record);

    List<ComRepairEntry> selectByExample(ComRepairEntryExample example);

    ComRepairEntry selectByPrimaryKey(Integer prodComRepairEntryId);

    int updateByExampleSelective(@Param("record") ComRepairEntry record, @Param("example") ComRepairEntryExample example);

    int updateByExample(@Param("record") ComRepairEntry record, @Param("example") ComRepairEntryExample example);

    int updateByPrimaryKeySelective(ComRepairEntry record);

    int updateByPrimaryKey(ComRepairEntry record);
}