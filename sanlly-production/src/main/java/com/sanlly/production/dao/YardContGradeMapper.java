package com.sanlly.production.dao;

import com.sanlly.production.entity.YardContGrade;
import com.sanlly.production.entity.YardContGradeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YardContGradeMapper {
    long countByExample(YardContGradeExample example);

    int deleteByExample(YardContGradeExample example);

    int deleteByPrimaryKey(Integer prodYardContGradeId);

    int insert(YardContGrade record);

    int insertSelective(YardContGrade record);

    List<YardContGrade> selectByExample(YardContGradeExample example);

    YardContGrade selectByPrimaryKey(Integer prodYardContGradeId);

    int updateByExampleSelective(@Param("record") YardContGrade record, @Param("example") YardContGradeExample example);

    int updateByExample(@Param("record") YardContGrade record, @Param("example") YardContGradeExample example);

    int updateByPrimaryKeySelective(YardContGrade record);

    int updateByPrimaryKey(YardContGrade record);
}