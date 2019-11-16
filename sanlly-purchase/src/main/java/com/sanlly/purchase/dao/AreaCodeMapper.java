package com.sanlly.purchase.dao;

import com.sanlly.purchase.entity.AreaCode;
import com.sanlly.purchase.entity.AreaCodeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AreaCodeMapper {
    long countByExample(AreaCodeExample example);

    int deleteByExample(AreaCodeExample example);

    int deleteByPrimaryKey(Integer purcAreaCodeId);

    int insert(AreaCode record);

    int insertSelective(AreaCode record);

    List<AreaCode> selectByExample(AreaCodeExample example);

    AreaCode selectByPrimaryKey(Integer purcAreaCodeId);

    int updateByExampleSelective(@Param("record") AreaCode record, @Param("example") AreaCodeExample example);

    int updateByExample(@Param("record") AreaCode record, @Param("example") AreaCodeExample example);

    int updateByPrimaryKeySelective(AreaCode record);

    int updateByPrimaryKey(AreaCode record);
}