package com.sanlly.production.dao;

import com.sanlly.production.entity.PtiInfo;
import com.sanlly.production.entity.PtiInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PtiInfoMapper {
    long countByExample(PtiInfoExample example);

    int deleteByExample(PtiInfoExample example);

    int deleteByPrimaryKey(Integer prodVisualCheckId);

    int insert(PtiInfo record);

    int insertSelective(PtiInfo record);

    List<PtiInfo> selectByExample(PtiInfoExample example);

    PtiInfo selectByPrimaryKey(Integer prodVisualCheckId);

    int updateByExampleSelective(@Param("record") PtiInfo record, @Param("example") PtiInfoExample example);

    int updateByExample(@Param("record") PtiInfo record, @Param("example") PtiInfoExample example);

    int updateByPrimaryKeySelective(PtiInfo record);

    int updateByPrimaryKey(PtiInfo record);
}