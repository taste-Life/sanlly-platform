package com.sanlly.production.dao;

import com.sanlly.production.entity.ContainerBelong;
import com.sanlly.production.entity.ContainerBelongExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContainerBelongMapper {
    long countByExample(ContainerBelongExample example);

    int deleteByExample(ContainerBelongExample example);

    int deleteByPrimaryKey(Integer prodContainerBelongId);

    int insert(ContainerBelong record);

    int insertSelective(ContainerBelong record);

    List<ContainerBelong> selectByExample(ContainerBelongExample example);

    ContainerBelong selectByPrimaryKey(Integer prodContainerBelongId);

    int updateByExampleSelective(@Param("record") ContainerBelong record, @Param("example") ContainerBelongExample example);

    int updateByExample(@Param("record") ContainerBelong record, @Param("example") ContainerBelongExample example);

    int updateByPrimaryKeySelective(ContainerBelong record);

    int updateByPrimaryKey(ContainerBelong record);
}