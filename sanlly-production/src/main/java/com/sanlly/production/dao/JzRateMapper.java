package com.sanlly.production.dao;

import com.sanlly.production.entity.JzRate;
import com.sanlly.production.entity.JzRateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JzRateMapper {
    long countByExample(JzRateExample example);

    int deleteByExample(JzRateExample example);

    int deleteByPrimaryKey(String id);

    int insert(JzRate record);

    int insertSelective(JzRate record);

    List<JzRate> selectByExample(JzRateExample example);

    JzRate selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") JzRate record, @Param("example") JzRateExample example);

    int updateByExample(@Param("record") JzRate record, @Param("example") JzRateExample example);

    int updateByPrimaryKeySelective(JzRate record);

    int updateByPrimaryKey(JzRate record);
}