package com.sanlly.production.dao;

import com.sanlly.production.entity.GohContainerEntry;
import com.sanlly.production.entity.GohContainerEntryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GohContainerEntryMapper {
    long countByExample(GohContainerEntryExample example);

    int deleteByExample(GohContainerEntryExample example);

    int deleteByPrimaryKey(Integer prodGohContainerEntryId);

    int insert(GohContainerEntry record);

    int insertSelective(GohContainerEntry record);

    List<GohContainerEntry> selectByExample(GohContainerEntryExample example);

    GohContainerEntry selectByPrimaryKey(Integer prodGohContainerEntryId);

    int updateByExampleSelective(@Param("record") GohContainerEntry record, @Param("example") GohContainerEntryExample example);

    int updateByExample(@Param("record") GohContainerEntry record, @Param("example") GohContainerEntryExample example);

    int updateByPrimaryKeySelective(GohContainerEntry record);

    int updateByPrimaryKey(GohContainerEntry record);
}