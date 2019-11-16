package com.sanlly.production.dao;

import com.sanlly.production.entity.ContainerSize;
import com.sanlly.production.entity.ContainerSizeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContainerSizeMapper {
    long countByExample(ContainerSizeExample example);

    int deleteByExample(ContainerSizeExample example);

    int deleteByPrimaryKey(Integer prodSizeId);

    int insert(ContainerSize record);

    int insertSelective(ContainerSize record);

    List<ContainerSize> selectByExample(ContainerSizeExample example);

    ContainerSize selectByPrimaryKey(Integer prodSizeId);

    int updateByExampleSelective(@Param("record") ContainerSize record, @Param("example") ContainerSizeExample example);

    int updateByExample(@Param("record") ContainerSize record, @Param("example") ContainerSizeExample example);

    int updateByPrimaryKeySelective(ContainerSize record);

    int updateByPrimaryKey(ContainerSize record);
}