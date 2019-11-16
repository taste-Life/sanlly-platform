package com.sanlly.production.dao;

import com.sanlly.production.entity.XxContainer;
import com.sanlly.production.entity.XxContainerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XxContainerMapper {
    long countByExample(XxContainerExample example);

    int deleteByExample(XxContainerExample example);

    int deleteByPrimaryKey(Integer prodXxContainerId);

    int insert(XxContainer record);

    int insertSelective(XxContainer record);

    List<XxContainer> selectByExample(XxContainerExample example);

    XxContainer selectByPrimaryKey(Integer prodXxContainerId);

    int updateByExampleSelective(@Param("record") XxContainer record, @Param("example") XxContainerExample example);

    int updateByExample(@Param("record") XxContainer record, @Param("example") XxContainerExample example);

    int updateByPrimaryKeySelective(XxContainer record);

    int updateByPrimaryKey(XxContainer record);
}