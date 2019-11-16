package com.sanlly.production.dao;

import com.sanlly.production.entity.UnitMaintenance;
import com.sanlly.production.entity.UnitMaintenanceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UnitMaintenanceMapper {
    long countByExample(UnitMaintenanceExample example);

    int deleteByExample(UnitMaintenanceExample example);

    int deleteByPrimaryKey(Integer prodUnitMaintenanceId);

    int insert(UnitMaintenance record);

    int insertSelective(UnitMaintenance record);

    List<UnitMaintenance> selectByExample(UnitMaintenanceExample example);

    UnitMaintenance selectByPrimaryKey(Integer prodUnitMaintenanceId);

    int updateByExampleSelective(@Param("record") UnitMaintenance record, @Param("example") UnitMaintenanceExample example);

    int updateByExample(@Param("record") UnitMaintenance record, @Param("example") UnitMaintenanceExample example);

    int updateByPrimaryKeySelective(UnitMaintenance record);

    int updateByPrimaryKey(UnitMaintenance record);
}