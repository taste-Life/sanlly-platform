package com.sanlly.production.dao;

import com.sanlly.production.entity.RateFormula;
import com.sanlly.production.entity.RateFormulaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RateFormulaMapper {
    long countByExample(RateFormulaExample example);

    int deleteByExample(RateFormulaExample example);

    int deleteByPrimaryKey(String prodRateFormulaId);

    int insert(RateFormula record);

    int insertSelective(RateFormula record);

    List<RateFormula> selectByExample(RateFormulaExample example);

    RateFormula selectByPrimaryKey(String prodRateFormulaId);

    int updateByExampleSelective(@Param("record") RateFormula record, @Param("example") RateFormulaExample example);

    int updateByExample(@Param("record") RateFormula record, @Param("example") RateFormulaExample example);

    int updateByPrimaryKeySelective(RateFormula record);

    int updateByPrimaryKey(RateFormula record);
}