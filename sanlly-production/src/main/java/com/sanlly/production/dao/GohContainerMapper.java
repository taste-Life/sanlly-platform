package com.sanlly.production.dao;

import com.sanlly.production.entity.GohContainer;
import com.sanlly.production.entity.GohContainerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GohContainerMapper {
    long countByExample(GohContainerExample example);

    int deleteByExample(GohContainerExample example);

    int deleteByPrimaryKey(Integer prodGohContainerId);

    int insert(GohContainer record);

    int insertSelective(GohContainer record);

    List<GohContainer> selectByExample(GohContainerExample example);

    GohContainer selectByPrimaryKey(Integer prodGohContainerId);

    int updateByExampleSelective(@Param("record") GohContainer record, @Param("example") GohContainerExample example);

    int updateByExample(@Param("record") GohContainer record, @Param("example") GohContainerExample example);

    int updateByPrimaryKeySelective(GohContainer record);

    int updateByPrimaryKey(GohContainer record);
}