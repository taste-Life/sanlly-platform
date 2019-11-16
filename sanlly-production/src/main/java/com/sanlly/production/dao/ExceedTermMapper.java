package com.sanlly.production.dao;

import com.sanlly.production.entity.ExceedTerm;
import com.sanlly.production.entity.ExceedTermExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExceedTermMapper {
    long countByExample(ExceedTermExample example);

    int deleteByExample(ExceedTermExample example);

    int deleteByPrimaryKey(Integer prodExceedTermId);

    int insert(ExceedTerm record);

    int insertSelective(ExceedTerm record);

    List<ExceedTerm> selectByExample(ExceedTermExample example);

    ExceedTerm selectByPrimaryKey(Integer prodExceedTermId);

    int updateByExampleSelective(@Param("record") ExceedTerm record, @Param("example") ExceedTermExample example);

    int updateByExample(@Param("record") ExceedTerm record, @Param("example") ExceedTermExample example);

    int updateByPrimaryKeySelective(ExceedTerm record);

    int updateByPrimaryKey(ExceedTerm record);
}