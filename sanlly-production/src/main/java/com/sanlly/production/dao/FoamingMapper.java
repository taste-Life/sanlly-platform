package com.sanlly.production.dao;

import com.sanlly.production.entity.Foaming;
import com.sanlly.production.entity.FoamingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FoamingMapper {
    long countByExample(FoamingExample example);

    int deleteByExample(FoamingExample example);

    int deleteByPrimaryKey(Integer prodFoamingId);

    int insert(Foaming record);

    int insertSelective(Foaming record);

    List<Foaming> selectByExampleWithBLOBs(FoamingExample example);

    List<Foaming> selectByExample(FoamingExample example);

    Foaming selectByPrimaryKey(Integer prodFoamingId);

    int updateByExampleSelective(@Param("record") Foaming record, @Param("example") FoamingExample example);

    int updateByExampleWithBLOBs(@Param("record") Foaming record, @Param("example") FoamingExample example);

    int updateByExample(@Param("record") Foaming record, @Param("example") FoamingExample example);

    int updateByPrimaryKeySelective(Foaming record);

    int updateByPrimaryKeyWithBLOBs(Foaming record);

    int updateByPrimaryKey(Foaming record);
}