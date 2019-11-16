package com.sanlly.production.dao;

import com.sanlly.production.entity.PartsRepairType;
import com.sanlly.production.entity.PartsRepairTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PartsRepairTypeMapper {
    long countByExample(PartsRepairTypeExample example);

    int deleteByExample(PartsRepairTypeExample example);

    int deleteByPrimaryKey(Integer partsRepairTypeId);

    int insert(PartsRepairType record);

    int insertSelective(PartsRepairType record);

    List<PartsRepairType> selectByExample(PartsRepairTypeExample example);

    PartsRepairType selectByPrimaryKey(Integer partsRepairTypeId);

    int updateByExampleSelective(@Param("record") PartsRepairType record, @Param("example") PartsRepairTypeExample example);

    int updateByExample(@Param("record") PartsRepairType record, @Param("example") PartsRepairTypeExample example);

    int updateByPrimaryKeySelective(PartsRepairType record);

    int updateByPrimaryKey(PartsRepairType record);
}