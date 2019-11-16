package com.sanlly.production.dao;

import com.sanlly.production.entity.CourseEntry;
import com.sanlly.production.entity.CourseEntryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseEntryMapper {
    long countByExample(CourseEntryExample example);

    int deleteByExample(CourseEntryExample example);

    int deleteByPrimaryKey(String prodCourseEntryId);

    int insert(CourseEntry record);

    int insertSelective(CourseEntry record);

    List<CourseEntry> selectByExampleWithBLOBs(CourseEntryExample example);

    List<CourseEntry> selectByExample(CourseEntryExample example);

    CourseEntry selectByPrimaryKey(String prodCourseEntryId);

    int updateByExampleSelective(@Param("record") CourseEntry record, @Param("example") CourseEntryExample example);

    int updateByExampleWithBLOBs(@Param("record") CourseEntry record, @Param("example") CourseEntryExample example);

    int updateByExample(@Param("record") CourseEntry record, @Param("example") CourseEntryExample example);

    int updateByPrimaryKeySelective(CourseEntry record);

    int updateByPrimaryKeyWithBLOBs(CourseEntry record);

    int updateByPrimaryKey(CourseEntry record);
}