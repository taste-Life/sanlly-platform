package com.sanlly.production.dao;

import com.sanlly.production.entity.UnitAddSpares;
import com.sanlly.production.entity.UnitAddSparesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UnitAddSparesMapper {
    long countByExample(UnitAddSparesExample example);

    int deleteByExample(UnitAddSparesExample example);

    int deleteByPrimaryKey(Integer prodUnitAddSparesId);

    int insert(UnitAddSpares record);

    int insertSelective(UnitAddSpares record);

    List<UnitAddSpares> selectByExample(UnitAddSparesExample example);

    UnitAddSpares selectByPrimaryKey(Integer prodUnitAddSparesId);

    int updateByExampleSelective(@Param("record") UnitAddSpares record, @Param("example") UnitAddSparesExample example);

    int updateByExample(@Param("record") UnitAddSpares record, @Param("example") UnitAddSparesExample example);

    int updateByPrimaryKeySelective(UnitAddSpares record);

    int updateByPrimaryKey(UnitAddSpares record);
}