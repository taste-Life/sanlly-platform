package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareAssetManagement;
import com.sanlly.warehouse.entity.WareAssetManagementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareAssetManagementMapper {
    long countByExample(WareAssetManagementExample example);

    int deleteByExample(WareAssetManagementExample example);

    int deleteByPrimaryKey(Integer wareAssetManagementId);

    int insert(WareAssetManagement record);

    int insertSelective(WareAssetManagement record);

    List<WareAssetManagement> selectByExample(WareAssetManagementExample example);

    WareAssetManagement selectByPrimaryKey(Integer wareAssetManagementId);

    int updateByExampleSelective(@Param("record") WareAssetManagement record, @Param("example") WareAssetManagementExample example);

    int updateByExample(@Param("record") WareAssetManagement record, @Param("example") WareAssetManagementExample example);

    int updateByPrimaryKeySelective(WareAssetManagement record);

    int updateByPrimaryKey(WareAssetManagement record);
}