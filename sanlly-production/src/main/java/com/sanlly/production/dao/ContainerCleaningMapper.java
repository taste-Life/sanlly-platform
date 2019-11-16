package com.sanlly.production.dao;

import com.sanlly.production.entity.ContainerCleaning;
import com.sanlly.production.entity.ContainerCleaningExample;
import com.sanlly.production.entity.ContainerCleaningWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContainerCleaningMapper {
    long countByExample(ContainerCleaningExample example);

    int deleteByExample(ContainerCleaningExample example);

    int deleteByPrimaryKey(Integer prodContainerCleaningId);

    int insert(ContainerCleaningWithBLOBs record);

    int insertSelective(ContainerCleaningWithBLOBs record);

    List<ContainerCleaningWithBLOBs> selectByExampleWithBLOBs(ContainerCleaningExample example);

    List<ContainerCleaning> selectByExample(ContainerCleaningExample example);

    ContainerCleaningWithBLOBs selectByPrimaryKey(Integer prodContainerCleaningId);

    int updateByExampleSelective(@Param("record") ContainerCleaningWithBLOBs record, @Param("example") ContainerCleaningExample example);

    int updateByExampleWithBLOBs(@Param("record") ContainerCleaningWithBLOBs record, @Param("example") ContainerCleaningExample example);

    int updateByExample(@Param("record") ContainerCleaning record, @Param("example") ContainerCleaningExample example);

    int updateByPrimaryKeySelective(ContainerCleaningWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ContainerCleaningWithBLOBs record);

    int updateByPrimaryKey(ContainerCleaning record);
}