package com.sanlly.production.dao;

import com.sanlly.production.entity.ContainerOrder;
import com.sanlly.production.entity.ContainerOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContainerOrderMapper {
    long countByExample(ContainerOrderExample example);

    int deleteByExample(ContainerOrderExample example);

    int deleteByPrimaryKey(Integer prodContainerOrderId);

    int insert(ContainerOrder record);

    int insertSelective(ContainerOrder record);

    List<ContainerOrder> selectByExample(ContainerOrderExample example);

    ContainerOrder selectByPrimaryKey(Integer prodContainerOrderId);

    int updateByExampleSelective(@Param("record") ContainerOrder record, @Param("example") ContainerOrderExample example);

    int updateByExample(@Param("record") ContainerOrder record, @Param("example") ContainerOrderExample example);

    int updateByPrimaryKeySelective(ContainerOrder record);

    int updateByPrimaryKey(ContainerOrder record);
}