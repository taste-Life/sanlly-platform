package com.sanlly.production.dao;

import com.sanlly.production.entity.UnitCourse;
import com.sanlly.production.entity.UnitCourseExample;
import com.sanlly.production.entity.UnitCourseWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UnitCourseMapper {
    long countByExample(UnitCourseExample example);

    int deleteByExample(UnitCourseExample example);

    int deleteByPrimaryKey(String prodCourseId);

    int insert(UnitCourseWithBLOBs record);

    int insertSelective(UnitCourseWithBLOBs record);

    List<UnitCourseWithBLOBs> selectByExampleWithBLOBs(UnitCourseExample example);

    List<UnitCourse> selectByExample(UnitCourseExample example);

    UnitCourseWithBLOBs selectByPrimaryKey(String prodCourseId);

    int updateByExampleSelective(@Param("record") UnitCourseWithBLOBs record, @Param("example") UnitCourseExample example);

    int updateByExampleWithBLOBs(@Param("record") UnitCourseWithBLOBs record, @Param("example") UnitCourseExample example);

    int updateByExample(@Param("record") UnitCourse record, @Param("example") UnitCourseExample example);

    int updateByPrimaryKeySelective(UnitCourseWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(UnitCourseWithBLOBs record);

    int updateByPrimaryKey(UnitCourse record);
}