package com.sanlly.production.dao;

import com.sanlly.production.entity.PartsType;
import com.sanlly.production.entity.PartsTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PartsTypeMapper {
    long countByExample(PartsTypeExample example);

    int deleteByExample(PartsTypeExample example);

    int deleteByPrimaryKey(Integer prodPartsTypeId);

    int insert(PartsType record);

    int insertSelective(PartsType record);

    List<PartsType> selectByExample(PartsTypeExample example);

    PartsType selectByPrimaryKey(Integer prodPartsTypeId);

    int updateByExampleSelective(@Param("record") PartsType record, @Param("example") PartsTypeExample example);

    int updateByExample(@Param("record") PartsType record, @Param("example") PartsTypeExample example);

    int updateByPrimaryKeySelective(PartsType record);

    int updateByPrimaryKey(PartsType record);
}