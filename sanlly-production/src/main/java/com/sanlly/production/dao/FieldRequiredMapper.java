package com.sanlly.production.dao;

import com.sanlly.production.entity.FieldRequired;
import com.sanlly.production.entity.FieldRequiredExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FieldRequiredMapper {
    long countByExample(FieldRequiredExample example);

    int deleteByExample(FieldRequiredExample example);

    int deleteByPrimaryKey(Integer prodFieldRequiredId);

    int insert(FieldRequired record);

    int insertSelective(FieldRequired record);

    List<FieldRequired> selectByExample(FieldRequiredExample example);

    FieldRequired selectByPrimaryKey(Integer prodFieldRequiredId);

    int updateByExampleSelective(@Param("record") FieldRequired record, @Param("example") FieldRequiredExample example);

    int updateByExample(@Param("record") FieldRequired record, @Param("example") FieldRequiredExample example);

    int updateByPrimaryKeySelective(FieldRequired record);

    int updateByPrimaryKey(FieldRequired record);
}