package com.sanlly.production.dao;

import com.sanlly.production.entity.EvaluationVersions;
import com.sanlly.production.entity.EvaluationVersionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EvaluationVersionsMapper {
    long countByExample(EvaluationVersionsExample example);

    int deleteByExample(EvaluationVersionsExample example);

    int deleteByPrimaryKey(Integer prodEvaluationVersionsId);

    int insert(EvaluationVersions record);

    int insertSelective(EvaluationVersions record);

    List<EvaluationVersions> selectByExample(EvaluationVersionsExample example);

    EvaluationVersions selectByPrimaryKey(Integer prodEvaluationVersionsId);

    int updateByExampleSelective(@Param("record") EvaluationVersions record, @Param("example") EvaluationVersionsExample example);

    int updateByExample(@Param("record") EvaluationVersions record, @Param("example") EvaluationVersionsExample example);

    int updateByPrimaryKeySelective(EvaluationVersions record);

    int updateByPrimaryKey(EvaluationVersions record);
}