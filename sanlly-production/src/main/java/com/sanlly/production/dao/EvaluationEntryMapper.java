package com.sanlly.production.dao;

import com.sanlly.production.entity.EvaluationEntry;
import com.sanlly.production.entity.EvaluationEntryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EvaluationEntryMapper {
    long countByExample(EvaluationEntryExample example);

    int deleteByExample(EvaluationEntryExample example);

    int deleteByPrimaryKey(String prodEvaluationEntryId);

    int insert(EvaluationEntry record);

    int insertSelective(EvaluationEntry record);

    List<EvaluationEntry> selectByExampleWithBLOBs(EvaluationEntryExample example);

    List<EvaluationEntry> selectByExample(EvaluationEntryExample example);

    EvaluationEntry selectByPrimaryKey(String prodEvaluationEntryId);

    int updateByExampleSelective(@Param("record") EvaluationEntry record, @Param("example") EvaluationEntryExample example);

    int updateByExampleWithBLOBs(@Param("record") EvaluationEntry record, @Param("example") EvaluationEntryExample example);

    int updateByExample(@Param("record") EvaluationEntry record, @Param("example") EvaluationEntryExample example);

    int updateByPrimaryKeySelective(EvaluationEntry record);

    int updateByPrimaryKeyWithBLOBs(EvaluationEntry record);

    int updateByPrimaryKey(EvaluationEntry record);
}