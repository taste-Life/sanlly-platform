package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareInternalProcurement;
import com.sanlly.warehouse.entity.WareInternalProcurementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareInternalProcurementMapper {
    long countByExample(WareInternalProcurementExample example);

    int deleteByExample(WareInternalProcurementExample example);

    int deleteByPrimaryKey(Integer wareInternalProcurementId);

    int insert(WareInternalProcurement record);

    int insertSelective(WareInternalProcurement record);

    List<WareInternalProcurement> selectByExample(WareInternalProcurementExample example);

    WareInternalProcurement selectByPrimaryKey(Integer wareInternalProcurementId);

    int updateByExampleSelective(@Param("record") WareInternalProcurement record, @Param("example") WareInternalProcurementExample example);

    int updateByExample(@Param("record") WareInternalProcurement record, @Param("example") WareInternalProcurementExample example);

    int updateByPrimaryKeySelective(WareInternalProcurement record);

    int updateByPrimaryKey(WareInternalProcurement record);
}