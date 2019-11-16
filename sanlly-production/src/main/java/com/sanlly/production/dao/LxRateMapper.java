package com.sanlly.production.dao;

import com.sanlly.production.entity.LxRate;
import com.sanlly.production.entity.LxRateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LxRateMapper {
    long countByExample(LxRateExample example);

    int deleteByExample(LxRateExample example);

    int deleteByPrimaryKey(String id);

    int insert(LxRate record);

    int insertSelective(LxRate record);

    List<LxRate> selectByExample(LxRateExample example);

    LxRate selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") LxRate record, @Param("example") LxRateExample example);

    int updateByExample(@Param("record") LxRate record, @Param("example") LxRateExample example);

    int updateByPrimaryKeySelective(LxRate record);

    int updateByPrimaryKey(LxRate record);
}