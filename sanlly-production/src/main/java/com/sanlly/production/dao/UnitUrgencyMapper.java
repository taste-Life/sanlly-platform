package com.sanlly.production.dao;

import com.sanlly.production.entity.UnitUrgency;
import com.sanlly.production.entity.UnitUrgencyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UnitUrgencyMapper {
    long countByExample(UnitUrgencyExample example);

    int deleteByExample(UnitUrgencyExample example);

    int deleteByPrimaryKey(Integer prodUnitUrgencyId);

    int insert(UnitUrgency record);

    int insertSelective(UnitUrgency record);

    List<UnitUrgency> selectByExample(UnitUrgencyExample example);

    UnitUrgency selectByPrimaryKey(Integer prodUnitUrgencyId);

    int updateByExampleSelective(@Param("record") UnitUrgency record, @Param("example") UnitUrgencyExample example);

    int updateByExample(@Param("record") UnitUrgency record, @Param("example") UnitUrgencyExample example);

    int updateByPrimaryKeySelective(UnitUrgency record);

    int updateByPrimaryKey(UnitUrgency record);
}