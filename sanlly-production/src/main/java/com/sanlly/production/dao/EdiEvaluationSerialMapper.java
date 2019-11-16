package com.sanlly.production.dao;

import com.sanlly.production.entity.EdiEvaluationSerial;
import com.sanlly.production.entity.EdiEvaluationSerialExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EdiEvaluationSerialMapper {
    long countByExample(EdiEvaluationSerialExample example);

    int deleteByExample(EdiEvaluationSerialExample example);

    int deleteByPrimaryKey(String prodEdiFormat);

    int insert(EdiEvaluationSerial record);

    int insertSelective(EdiEvaluationSerial record);

    List<EdiEvaluationSerial> selectByExample(EdiEvaluationSerialExample example);

    EdiEvaluationSerial selectByPrimaryKey(String prodEdiFormat);

    int updateByExampleSelective(@Param("record") EdiEvaluationSerial record, @Param("example") EdiEvaluationSerialExample example);

    int updateByExample(@Param("record") EdiEvaluationSerial record, @Param("example") EdiEvaluationSerialExample example);

    int updateByPrimaryKeySelective(EdiEvaluationSerial record);

    int updateByPrimaryKey(EdiEvaluationSerial record);
}