package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.RepairStore;
import com.sanlly.warehouse.entity.RepairStoreExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RepairStoreMapper {
    long countByExample(RepairStoreExample example);

    int deleteByExample(RepairStoreExample example);

    int deleteByPrimaryKey(Integer wareRepairStoreId);

    int insert(RepairStore record);

    int insertSelective(RepairStore record);

    List<RepairStore> selectByExample(RepairStoreExample example);

    RepairStore selectByPrimaryKey(Integer wareRepairStoreId);

    int updateByExampleSelective(@Param("record") RepairStore record, @Param("example") RepairStoreExample example);

    int updateByExample(@Param("record") RepairStore record, @Param("example") RepairStoreExample example);

    int updateByPrimaryKeySelective(RepairStore record);

    int updateByPrimaryKey(RepairStore record);
}