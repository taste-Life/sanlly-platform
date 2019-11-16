package com.sanlly.production.dao;

import com.sanlly.production.entity.Course;
import com.sanlly.production.entity.CourseExample;
import com.sanlly.production.entity.CourseWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseMapper {
    long countByExample(CourseExample example);

    int deleteByExample(CourseExample example);

    int deleteByPrimaryKey(String prodCourseId);

    int insert(CourseWithBLOBs record);

    int insertSelective(CourseWithBLOBs record);

    List<CourseWithBLOBs> selectByExampleWithBLOBs(CourseExample example);

    List<Course> selectByExample(CourseExample example);

    CourseWithBLOBs selectByPrimaryKey(String prodCourseId);

    int updateByExampleSelective(@Param("record") CourseWithBLOBs record, @Param("example") CourseExample example);

    int updateByExampleWithBLOBs(@Param("record") CourseWithBLOBs record, @Param("example") CourseExample example);

    int updateByExample(@Param("record") Course record, @Param("example") CourseExample example);

    int updateByPrimaryKeySelective(CourseWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(CourseWithBLOBs record);

    int updateByPrimaryKey(Course record);
}