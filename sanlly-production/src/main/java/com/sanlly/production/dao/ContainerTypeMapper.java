package com.sanlly.production.dao;

import com.sanlly.production.entity.ContainerType;
import com.sanlly.production.entity.ContainerTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContainerTypeMapper {
    long countByExample(ContainerTypeExample example);

    int deleteByExample(ContainerTypeExample example);

    int deleteByPrimaryKey(Integer prodContainerTypeId);

    int insert(ContainerType record);

    int insertSelective(ContainerType record);

    List<ContainerType> selectByExample(ContainerTypeExample example);

    ContainerType selectByPrimaryKey(Integer prodContainerTypeId);

    int updateByExampleSelective(@Param("record") ContainerType record, @Param("example") ContainerTypeExample example);

    int updateByExample(@Param("record") ContainerType record, @Param("example") ContainerTypeExample example);

    int updateByPrimaryKeySelective(ContainerType record);

    int updateByPrimaryKey(ContainerType record);
}