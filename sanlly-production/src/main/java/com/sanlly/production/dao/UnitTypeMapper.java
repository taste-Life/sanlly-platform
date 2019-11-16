package com.sanlly.production.dao;

import com.sanlly.production.entity.UnitType;
import com.sanlly.production.entity.UnitTypeExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UnitTypeMapper {
    long countByExample(UnitTypeExample example);

    int deleteByExample(UnitTypeExample example);

    int deleteByPrimaryKey(Integer prodUnitTypeId);

    int insert(UnitType record);

    int insertSelective(UnitType record);

    List<UnitType> selectByExample(UnitTypeExample example);

    UnitType selectByPrimaryKey(Integer prodUnitTypeId);

    int updateByExampleSelective(@Param("record") UnitType record, @Param("example") UnitTypeExample example);

    int updateByExample(@Param("record") UnitType record, @Param("example") UnitTypeExample example);

    int updateByPrimaryKeySelective(UnitType record);

    int updateByPrimaryKey(UnitType record);
}