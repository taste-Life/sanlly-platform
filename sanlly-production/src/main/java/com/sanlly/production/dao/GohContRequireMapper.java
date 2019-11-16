package com.sanlly.production.dao;

import com.sanlly.production.entity.GohContRequire;
import com.sanlly.production.entity.GohContRequireExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GohContRequireMapper {
    long countByExample(GohContRequireExample example);

    int deleteByExample(GohContRequireExample example);

    int deleteByPrimaryKey(Integer prodGohContRequireId);

    int insert(GohContRequire record);

    int insertSelective(GohContRequire record);

    List<GohContRequire> selectByExampleWithBLOBs(GohContRequireExample example);

    List<GohContRequire> selectByExample(GohContRequireExample example);

    GohContRequire selectByPrimaryKey(Integer prodGohContRequireId);

    int updateByExampleSelective(@Param("record") GohContRequire record, @Param("example") GohContRequireExample example);

    int updateByExampleWithBLOBs(@Param("record") GohContRequire record, @Param("example") GohContRequireExample example);

    int updateByExample(@Param("record") GohContRequire record, @Param("example") GohContRequireExample example);

    int updateByPrimaryKeySelective(GohContRequire record);

    int updateByPrimaryKeyWithBLOBs(GohContRequire record);

    int updateByPrimaryKey(GohContRequire record);
}