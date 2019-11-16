package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareMasterDevice;
import com.sanlly.warehouse.entity.WareMasterDeviceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareMasterDeviceMapper {
    long countByExample(WareMasterDeviceExample example);

    int deleteByExample(WareMasterDeviceExample example);

    int deleteByPrimaryKey(Integer wareMasterDeviceId);

    int insert(WareMasterDevice record);

    int insertSelective(WareMasterDevice record);

    List<WareMasterDevice> selectByExample(WareMasterDeviceExample example);

    WareMasterDevice selectByPrimaryKey(Integer wareMasterDeviceId);

    int updateByExampleSelective(@Param("record") WareMasterDevice record, @Param("example") WareMasterDeviceExample example);

    int updateByExample(@Param("record") WareMasterDevice record, @Param("example") WareMasterDeviceExample example);

    int updateByPrimaryKeySelective(WareMasterDevice record);

    int updateByPrimaryKey(WareMasterDevice record);
}