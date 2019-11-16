package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareBillType;
import com.sanlly.warehouse.entity.WareBillTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareBillTypeMapper {
    long countByExample(WareBillTypeExample example);

    int deleteByExample(WareBillTypeExample example);

    int deleteByPrimaryKey(Integer wareBillTypeId);

    int insert(WareBillType record);

    int insertSelective(WareBillType record);

    List<WareBillType> selectByExample(WareBillTypeExample example);

    WareBillType selectByPrimaryKey(Integer wareBillTypeId);

    int updateByExampleSelective(@Param("record") WareBillType record, @Param("example") WareBillTypeExample example);

    int updateByExample(@Param("record") WareBillType record, @Param("example") WareBillTypeExample example);

    int updateByPrimaryKeySelective(WareBillType record);

    int updateByPrimaryKey(WareBillType record);
}