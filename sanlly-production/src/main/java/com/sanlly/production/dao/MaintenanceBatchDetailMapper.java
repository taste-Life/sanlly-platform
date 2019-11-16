package com.sanlly.production.dao;

import com.sanlly.production.entity.MaintenanceBatchDetail;
import com.sanlly.production.entity.MaintenanceBatchDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MaintenanceBatchDetailMapper {
    long countByExample(MaintenanceBatchDetailExample example);

    int deleteByExample(MaintenanceBatchDetailExample example);

    int deleteByPrimaryKey(Integer prodMaintenanceBatchDetailId);

    int insert(MaintenanceBatchDetail record);

    int insertSelective(MaintenanceBatchDetail record);

    List<MaintenanceBatchDetail> selectByExample(MaintenanceBatchDetailExample example);

    MaintenanceBatchDetail selectByPrimaryKey(Integer prodMaintenanceBatchDetailId);

    int updateByExampleSelective(@Param("record") MaintenanceBatchDetail record, @Param("example") MaintenanceBatchDetailExample example);

    int updateByExample(@Param("record") MaintenanceBatchDetail record, @Param("example") MaintenanceBatchDetailExample example);

    int updateByPrimaryKeySelective(MaintenanceBatchDetail record);

    int updateByPrimaryKey(MaintenanceBatchDetail record);
}