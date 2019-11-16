package com.sanlly.production.dao;

import com.sanlly.production.entity.EdiContainerType;
import com.sanlly.production.entity.EdiContainerTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EdiContainerTypeMapper {
    long countByExample(EdiContainerTypeExample example);

    int deleteByExample(EdiContainerTypeExample example);

    int deleteByPrimaryKey(Integer prodEdiContainerTypeId);

    int insert(EdiContainerType record);

    int insertSelective(EdiContainerType record);

    List<EdiContainerType> selectByExample(EdiContainerTypeExample example);

    EdiContainerType selectByPrimaryKey(Integer prodEdiContainerTypeId);

    int updateByExampleSelective(@Param("record") EdiContainerType record, @Param("example") EdiContainerTypeExample example);

    int updateByExample(@Param("record") EdiContainerType record, @Param("example") EdiContainerTypeExample example);

    int updateByPrimaryKeySelective(EdiContainerType record);

    int updateByPrimaryKey(EdiContainerType record);
}