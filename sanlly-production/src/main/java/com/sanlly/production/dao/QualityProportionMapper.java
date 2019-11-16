package com.sanlly.production.dao;

import com.sanlly.production.entity.QualityProportion;
import com.sanlly.production.entity.QualityProportionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QualityProportionMapper {
    long countByExample(QualityProportionExample example);

    int deleteByExample(QualityProportionExample example);

    int deleteByPrimaryKey(Integer prodQualityProportionId);

    int insert(QualityProportion record);

    int insertSelective(QualityProportion record);

    List<QualityProportion> selectByExample(QualityProportionExample example);

    QualityProportion selectByPrimaryKey(Integer prodQualityProportionId);

    int updateByExampleSelective(@Param("record") QualityProportion record, @Param("example") QualityProportionExample example);

    int updateByExample(@Param("record") QualityProportion record, @Param("example") QualityProportionExample example);

    int updateByPrimaryKeySelective(QualityProportion record);

    int updateByPrimaryKey(QualityProportion record);
}