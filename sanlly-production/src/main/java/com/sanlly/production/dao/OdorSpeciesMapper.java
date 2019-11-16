package com.sanlly.production.dao;

import com.sanlly.production.entity.OdorSpecies;
import com.sanlly.production.entity.OdorSpeciesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OdorSpeciesMapper {
    long countByExample(OdorSpeciesExample example);

    int deleteByExample(OdorSpeciesExample example);

    int deleteByPrimaryKey(Integer prodOdorSpeciesId);

    int insert(OdorSpecies record);

    int insertSelective(OdorSpecies record);

    List<OdorSpecies> selectByExample(OdorSpeciesExample example);

    OdorSpecies selectByPrimaryKey(Integer prodOdorSpeciesId);

    int updateByExampleSelective(@Param("record") OdorSpecies record, @Param("example") OdorSpeciesExample example);

    int updateByExample(@Param("record") OdorSpecies record, @Param("example") OdorSpeciesExample example);

    int updateByPrimaryKeySelective(OdorSpecies record);

    int updateByPrimaryKey(OdorSpecies record);
}