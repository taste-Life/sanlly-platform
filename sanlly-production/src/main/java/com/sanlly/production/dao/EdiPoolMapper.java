package com.sanlly.production.dao;

import com.sanlly.production.entity.EdiPool;
import com.sanlly.production.entity.EdiPoolExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EdiPoolMapper {
    long countByExample(EdiPoolExample example);

    int deleteByExample(EdiPoolExample example);

    int deleteByPrimaryKey(Integer prodEdiPoolId);

    int insert(EdiPool record);

    int insertSelective(EdiPool record);

    List<EdiPool> selectByExample(EdiPoolExample example);

    EdiPool selectByPrimaryKey(Integer prodEdiPoolId);

    int updateByExampleSelective(@Param("record") EdiPool record, @Param("example") EdiPoolExample example);

    int updateByExample(@Param("record") EdiPool record, @Param("example") EdiPoolExample example);

    int updateByPrimaryKeySelective(EdiPool record);

    int updateByPrimaryKey(EdiPool record);
}