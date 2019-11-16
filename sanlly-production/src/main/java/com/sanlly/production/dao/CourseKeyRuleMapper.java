package com.sanlly.production.dao;

import com.sanlly.production.entity.CourseKeyRule;
import com.sanlly.production.entity.CourseKeyRuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseKeyRuleMapper {
    long countByExample(CourseKeyRuleExample example);

    int deleteByExample(CourseKeyRuleExample example);

    int deleteByPrimaryKey(Integer ruleId);

    int insert(CourseKeyRule record);

    int insertSelective(CourseKeyRule record);

    List<CourseKeyRule> selectByExample(CourseKeyRuleExample example);

    CourseKeyRule selectByPrimaryKey(Integer ruleId);

    int updateByExampleSelective(@Param("record") CourseKeyRule record, @Param("example") CourseKeyRuleExample example);

    int updateByExample(@Param("record") CourseKeyRule record, @Param("example") CourseKeyRuleExample example);

    int updateByPrimaryKeySelective(CourseKeyRule record);

    int updateByPrimaryKey(CourseKeyRule record);
}