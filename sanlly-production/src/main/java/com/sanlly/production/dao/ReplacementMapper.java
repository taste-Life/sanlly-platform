package com.sanlly.production.dao;

import com.sanlly.production.entity.Replacement;
import com.sanlly.production.entity.ReplacementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReplacementMapper {
    long countByExample(ReplacementExample example);

    int deleteByExample(ReplacementExample example);

    int deleteByPrimaryKey(Integer prodReplacementId);

    int insert(Replacement record);

    int insertSelective(Replacement record);

    List<Replacement> selectByExample(ReplacementExample example);

    Replacement selectByPrimaryKey(Integer prodReplacementId);

    int updateByExampleSelective(@Param("record") Replacement record, @Param("example") ReplacementExample example);

    int updateByExample(@Param("record") Replacement record, @Param("example") ReplacementExample example);

    int updateByPrimaryKeySelective(Replacement record);

    int updateByPrimaryKey(Replacement record);
}