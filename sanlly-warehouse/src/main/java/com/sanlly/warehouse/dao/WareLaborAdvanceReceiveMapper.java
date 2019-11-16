package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareLaborAdvanceReceive;
import com.sanlly.warehouse.entity.WareLaborAdvanceReceiveExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareLaborAdvanceReceiveMapper {
    long countByExample(WareLaborAdvanceReceiveExample example);

    int deleteByExample(WareLaborAdvanceReceiveExample example);

    int deleteByPrimaryKey(Integer wareLaborAdvanceReceive);

    int insert(WareLaborAdvanceReceive record);

    int insertSelective(WareLaborAdvanceReceive record);

    List<WareLaborAdvanceReceive> selectByExample(WareLaborAdvanceReceiveExample example);

    WareLaborAdvanceReceive selectByPrimaryKey(Integer wareLaborAdvanceReceive);

    int updateByExampleSelective(@Param("record") WareLaborAdvanceReceive record, @Param("example") WareLaborAdvanceReceiveExample example);

    int updateByExample(@Param("record") WareLaborAdvanceReceive record, @Param("example") WareLaborAdvanceReceiveExample example);

    int updateByPrimaryKeySelective(WareLaborAdvanceReceive record);

    int updateByPrimaryKey(WareLaborAdvanceReceive record);
}