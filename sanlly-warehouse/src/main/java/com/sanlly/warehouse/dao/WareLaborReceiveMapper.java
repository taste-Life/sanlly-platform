package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareLaborReceive;
import com.sanlly.warehouse.entity.WareLaborReceiveExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareLaborReceiveMapper {
    long countByExample(WareLaborReceiveExample example);

    int deleteByExample(WareLaborReceiveExample example);

    int deleteByPrimaryKey(Integer wareLaborReceiveId);

    int insert(WareLaborReceive record);

    int insertSelective(WareLaborReceive record);

    List<WareLaborReceive> selectByExample(WareLaborReceiveExample example);

    WareLaborReceive selectByPrimaryKey(Integer wareLaborReceiveId);

    int updateByExampleSelective(@Param("record") WareLaborReceive record, @Param("example") WareLaborReceiveExample example);

    int updateByExample(@Param("record") WareLaborReceive record, @Param("example") WareLaborReceiveExample example);

    int updateByPrimaryKeySelective(WareLaborReceive record);

    int updateByPrimaryKey(WareLaborReceive record);
}