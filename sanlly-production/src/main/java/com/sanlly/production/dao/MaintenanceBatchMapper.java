package com.sanlly.production.dao;

import com.sanlly.production.entity.MaintenanceBatch;
import com.sanlly.production.entity.MaintenanceBatchExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MaintenanceBatchMapper {
    long countByExample(MaintenanceBatchExample example);

    int deleteByExample(MaintenanceBatchExample example);

    int deleteByPrimaryKey(Integer prodMaintenanceBatchId);

    int insert(MaintenanceBatch record);

    int insertSelective(MaintenanceBatch record);

    List<MaintenanceBatch> selectByExample(MaintenanceBatchExample example);

    MaintenanceBatch selectByPrimaryKey(Integer prodMaintenanceBatchId);

    int updateByExampleSelective(@Param("record") MaintenanceBatch record, @Param("example") MaintenanceBatchExample example);

    int updateByExample(@Param("record") MaintenanceBatch record, @Param("example") MaintenanceBatchExample example);

    int updateByPrimaryKeySelective(MaintenanceBatch record);

    int updateByPrimaryKey(MaintenanceBatch record);
}