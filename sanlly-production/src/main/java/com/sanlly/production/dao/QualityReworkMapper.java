package com.sanlly.production.dao;

import com.sanlly.production.entity.QualityRework;
import com.sanlly.production.entity.QualityReworkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QualityReworkMapper {
    long countByExample(QualityReworkExample example);

    int deleteByExample(QualityReworkExample example);

    int deleteByPrimaryKey(Integer prodQualityReworkId);

    int insert(QualityRework record);

    int insertSelective(QualityRework record);

    List<QualityRework> selectByExampleWithBLOBs(QualityReworkExample example);

    List<QualityRework> selectByExample(QualityReworkExample example);

    QualityRework selectByPrimaryKey(Integer prodQualityReworkId);

    int updateByExampleSelective(@Param("record") QualityRework record, @Param("example") QualityReworkExample example);

    int updateByExampleWithBLOBs(@Param("record") QualityRework record, @Param("example") QualityReworkExample example);

    int updateByExample(@Param("record") QualityRework record, @Param("example") QualityReworkExample example);

    int updateByPrimaryKeySelective(QualityRework record);

    int updateByPrimaryKeyWithBLOBs(QualityRework record);

    int updateByPrimaryKey(QualityRework record);
}