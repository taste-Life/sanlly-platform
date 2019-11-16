package com.sanlly.production.dao;

import com.sanlly.production.entity.QualityControlTime;
import com.sanlly.production.entity.QualityControlTimeExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QualityControlTimeMapper {
    long countByExample(QualityControlTimeExample example);

    int deleteByExample(QualityControlTimeExample example);

    int deleteByPrimaryKey(Integer prodQualityControlTimeId);

    int insert(QualityControlTime record);

    int insertSelective(QualityControlTime record);

    List<QualityControlTime> selectByExample(QualityControlTimeExample example);

    QualityControlTime selectByPrimaryKey(Integer prodQualityControlTimeId);

    int updateByExampleSelective(@Param("record") QualityControlTime record, @Param("example") QualityControlTimeExample example);

    int updateByExample(@Param("record") QualityControlTime record, @Param("example") QualityControlTimeExample example);

    int updateByPrimaryKeySelective(QualityControlTime record);

    int updateByPrimaryKey(QualityControlTime record);
}