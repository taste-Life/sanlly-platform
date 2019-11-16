package com.sanlly.production.dao;

import com.sanlly.production.entity.OutContainer;
import com.sanlly.production.entity.OutContainerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OutContainerMapper {
    long countByExample(OutContainerExample example);

    int deleteByExample(OutContainerExample example);

    int deleteByPrimaryKey(Integer prodOutContainerId);

    int insert(OutContainer record);

    int insertSelective(OutContainer record);

    List<OutContainer> selectByExample(OutContainerExample example);

    OutContainer selectByPrimaryKey(Integer prodOutContainerId);

    int updateByExampleSelective(@Param("record") OutContainer record, @Param("example") OutContainerExample example);

    int updateByExample(@Param("record") OutContainer record, @Param("example") OutContainerExample example);

    int updateByPrimaryKeySelective(OutContainer record);

    int updateByPrimaryKey(OutContainer record);
}