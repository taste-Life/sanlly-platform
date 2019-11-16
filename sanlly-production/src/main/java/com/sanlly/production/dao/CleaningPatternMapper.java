package com.sanlly.production.dao;

import com.sanlly.production.entity.CleaningPattern;
import com.sanlly.production.entity.CleaningPatternExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CleaningPatternMapper {
    long countByExample(CleaningPatternExample example);

    int deleteByExample(CleaningPatternExample example);

    int deleteByPrimaryKey(Integer prodCleaningPatternId);

    int insert(CleaningPattern record);

    int insertSelective(CleaningPattern record);

    List<CleaningPattern> selectByExample(CleaningPatternExample example);

    CleaningPattern selectByPrimaryKey(Integer prodCleaningPatternId);

    int updateByExampleSelective(@Param("record") CleaningPattern record, @Param("example") CleaningPatternExample example);

    int updateByExample(@Param("record") CleaningPattern record, @Param("example") CleaningPatternExample example);

    int updateByPrimaryKeySelective(CleaningPattern record);

    int updateByPrimaryKey(CleaningPattern record);
}