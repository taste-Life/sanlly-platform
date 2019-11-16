package com.sanlly.production.dao;

import com.sanlly.production.entity.PtiType;
import com.sanlly.production.entity.PtiTypeExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PtiTypeMapper {
    long countByExample(PtiTypeExample example);

    int deleteByExample(PtiTypeExample example);

    int deleteByPrimaryKey(Integer prodPtiTypeId);

    int insert(PtiType record);

    int insertSelective(PtiType record);

    List<PtiType> selectByExample(PtiTypeExample example);

    PtiType selectByPrimaryKey(Integer prodPtiTypeId);

    int updateByExampleSelective(@Param("record") PtiType record, @Param("example") PtiTypeExample example);

    int updateByExample(@Param("record") PtiType record, @Param("example") PtiTypeExample example);

    int updateByPrimaryKeySelective(PtiType record);

    int updateByPrimaryKey(PtiType record);
}