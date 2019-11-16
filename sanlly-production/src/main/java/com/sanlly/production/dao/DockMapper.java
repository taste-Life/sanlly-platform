package com.sanlly.production.dao;

import com.sanlly.production.entity.Dock;
import com.sanlly.production.entity.DockExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DockMapper {
    long countByExample(DockExample example);

    int deleteByExample(DockExample example);

    int deleteByPrimaryKey(Integer prodDockId);

    int insert(Dock record);

    int insertSelective(Dock record);

    List<Dock> selectByExample(DockExample example);

    Dock selectByPrimaryKey(Integer prodDockId);

    int updateByExampleSelective(@Param("record") Dock record, @Param("example") DockExample example);

    int updateByExample(@Param("record") Dock record, @Param("example") DockExample example);

    int updateByPrimaryKeySelective(Dock record);

    int updateByPrimaryKey(Dock record);
}