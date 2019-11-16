package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareSellPool;
import com.sanlly.warehouse.entity.WareSellPoolExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareSellPoolMapper {
    long countByExample(WareSellPoolExample example);

    int deleteByExample(WareSellPoolExample example);

    int deleteByPrimaryKey(Integer wareSellPoolId);

    int insert(WareSellPool record);

    int insertSelective(WareSellPool record);

    List<WareSellPool> selectByExample(WareSellPoolExample example);

    WareSellPool selectByPrimaryKey(Integer wareSellPoolId);

    int updateByExampleSelective(@Param("record") WareSellPool record, @Param("example") WareSellPoolExample example);

    int updateByExample(@Param("record") WareSellPool record, @Param("example") WareSellPoolExample example);

    int updateByPrimaryKeySelective(WareSellPool record);

    int updateByPrimaryKey(WareSellPool record);
}