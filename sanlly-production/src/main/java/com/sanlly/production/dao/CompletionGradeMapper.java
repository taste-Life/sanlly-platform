package com.sanlly.production.dao;

import com.sanlly.production.entity.CompletionGrade;
import com.sanlly.production.entity.CompletionGradeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompletionGradeMapper {
    long countByExample(CompletionGradeExample example);

    int deleteByExample(CompletionGradeExample example);

    int deleteByPrimaryKey(Integer prodCompletionGradeId);

    int insert(CompletionGrade record);

    int insertSelective(CompletionGrade record);

    List<CompletionGrade> selectByExample(CompletionGradeExample example);

    CompletionGrade selectByPrimaryKey(Integer prodCompletionGradeId);

    int updateByExampleSelective(@Param("record") CompletionGrade record, @Param("example") CompletionGradeExample example);

    int updateByExample(@Param("record") CompletionGrade record, @Param("example") CompletionGradeExample example);

    int updateByPrimaryKeySelective(CompletionGrade record);

    int updateByPrimaryKey(CompletionGrade record);
}