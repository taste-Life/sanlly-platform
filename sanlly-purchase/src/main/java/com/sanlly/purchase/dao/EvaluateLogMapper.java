package com.sanlly.purchase.dao;

import com.sanlly.purchase.entity.EvaluateLog;
import com.sanlly.purchase.entity.EvaluateLogExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EvaluateLogMapper {
    long countByExample(EvaluateLogExample example);

    int deleteByExample(EvaluateLogExample example);

    int deleteByPrimaryKey(Integer purcEvaluateLogId);

    int insert(EvaluateLog record);

    int insertSelective(EvaluateLog record);

    List<EvaluateLog> selectByExample(EvaluateLogExample example);

    EvaluateLog selectByPrimaryKey(Integer purcEvaluateLogId);

    int updateByExampleSelective(@Param("record") EvaluateLog record, @Param("example") EvaluateLogExample example);

    int updateByExample(@Param("record") EvaluateLog record, @Param("example") EvaluateLogExample example);

    int updateByPrimaryKeySelective(EvaluateLog record);

    int updateByPrimaryKey(EvaluateLog record);
}