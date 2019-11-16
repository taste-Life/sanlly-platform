package com.sanlly.production.dao;

import com.sanlly.production.entity.YardContainerType;
import com.sanlly.production.entity.YardContainerTypeExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface YardContainerTypeMapper {
    long countByExample(YardContainerTypeExample example);

    int deleteByExample(YardContainerTypeExample example);

    int deleteByPrimaryKey(Integer prodYardContainerTypeId);

    int insert(YardContainerType record);

    int insertSelective(YardContainerType record);

    List<YardContainerType> selectByExample(YardContainerTypeExample example);

    YardContainerType selectByPrimaryKey(Integer prodYardContainerTypeId);

    int updateByExampleSelective(@Param("record") YardContainerType record, @Param("example") YardContainerTypeExample example);

    int updateByExample(@Param("record") YardContainerType record, @Param("example") YardContainerTypeExample example);

    int updateByPrimaryKeySelective(YardContainerType record);

    int updateByPrimaryKey(YardContainerType record);
}