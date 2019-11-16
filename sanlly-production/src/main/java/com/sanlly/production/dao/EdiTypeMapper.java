package com.sanlly.production.dao;

import com.sanlly.production.entity.EdiType;
import com.sanlly.production.entity.EdiTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EdiTypeMapper {
    long countByExample(EdiTypeExample example);

    int deleteByExample(EdiTypeExample example);

    int deleteByPrimaryKey(Integer prodEdiTypeId);

    int insert(EdiType record);

    int insertSelective(EdiType record);

    List<EdiType> selectByExample(EdiTypeExample example);

    EdiType selectByPrimaryKey(Integer prodEdiTypeId);

    int updateByExampleSelective(@Param("record") EdiType record, @Param("example") EdiTypeExample example);

    int updateByExample(@Param("record") EdiType record, @Param("example") EdiTypeExample example);

    int updateByPrimaryKeySelective(EdiType record);

    int updateByPrimaryKey(EdiType record);
}