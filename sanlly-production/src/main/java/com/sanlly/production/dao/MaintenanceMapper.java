package com.sanlly.production.dao;

import com.sanlly.production.entity.Maintenance;
import com.sanlly.production.entity.MaintenanceExample;
import com.sanlly.production.entity.MaintenanceWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MaintenanceMapper {
    long countByExample(MaintenanceExample example);

    int deleteByExample(MaintenanceExample example);

    int deleteByPrimaryKey(String prodMaintenanceId);

    int insert(MaintenanceWithBLOBs record);

    int insertSelective(MaintenanceWithBLOBs record);

    List<MaintenanceWithBLOBs> selectByExampleWithBLOBs(MaintenanceExample example);

    List<Maintenance> selectByExample(MaintenanceExample example);

    MaintenanceWithBLOBs selectByPrimaryKey(String prodMaintenanceId);

    int updateByExampleSelective(@Param("record") MaintenanceWithBLOBs record, @Param("example") MaintenanceExample example);

    int updateByExampleWithBLOBs(@Param("record") MaintenanceWithBLOBs record, @Param("example") MaintenanceExample example);

    int updateByExample(@Param("record") Maintenance record, @Param("example") MaintenanceExample example);

    int updateByPrimaryKeySelective(MaintenanceWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(MaintenanceWithBLOBs record);

    int updateByPrimaryKey(Maintenance record);
}