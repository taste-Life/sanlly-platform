package com.sanlly.purchase.dao;

import com.sanlly.purchase.entity.PeriodProduct;
import com.sanlly.purchase.entity.PeriodProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PeriodProductMapper {
    long countByExample(PeriodProductExample example);

    int deleteByExample(PeriodProductExample example);

    int deleteByPrimaryKey(Integer purcPeriodProductId);

    int insert(PeriodProduct record);

    int insertSelective(PeriodProduct record);

    List<PeriodProduct> selectByExample(PeriodProductExample example);

    PeriodProduct selectByPrimaryKey(Integer purcPeriodProductId);

    int updateByExampleSelective(@Param("record") PeriodProduct record, @Param("example") PeriodProductExample example);

    int updateByExample(@Param("record") PeriodProduct record, @Param("example") PeriodProductExample example);

    int updateByPrimaryKeySelective(PeriodProduct record);

    int updateByPrimaryKey(PeriodProduct record);
}