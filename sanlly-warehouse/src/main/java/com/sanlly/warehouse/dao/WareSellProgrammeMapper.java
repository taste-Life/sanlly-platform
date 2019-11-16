package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareSellProgramme;
import com.sanlly.warehouse.entity.WareSellProgrammeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareSellProgrammeMapper {
    long countByExample(WareSellProgrammeExample example);

    int deleteByExample(WareSellProgrammeExample example);

    int deleteByPrimaryKey(Integer wareSellProgrammeId);

    int insert(WareSellProgramme record);

    int insertSelective(WareSellProgramme record);

    List<WareSellProgramme> selectByExample(WareSellProgrammeExample example);

    WareSellProgramme selectByPrimaryKey(Integer wareSellProgrammeId);

    int updateByExampleSelective(@Param("record") WareSellProgramme record, @Param("example") WareSellProgrammeExample example);

    int updateByExample(@Param("record") WareSellProgramme record, @Param("example") WareSellProgrammeExample example);

    int updateByPrimaryKeySelective(WareSellProgramme record);

    int updateByPrimaryKey(WareSellProgramme record);
}