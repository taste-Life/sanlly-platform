package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareInternalProcurementDetail;
import com.sanlly.warehouse.entity.WareInternalProcurementDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareInternalProcurementDetailMapper {
    long countByExample(WareInternalProcurementDetailExample example);

    int deleteByExample(WareInternalProcurementDetailExample example);

    int deleteByPrimaryKey(Integer wareInternalProcurementDetailId);

    int insert(WareInternalProcurementDetail record);

    int insertSelective(WareInternalProcurementDetail record);

    List<WareInternalProcurementDetail> selectByExample(WareInternalProcurementDetailExample example);

    WareInternalProcurementDetail selectByPrimaryKey(Integer wareInternalProcurementDetailId);

    int updateByExampleSelective(@Param("record") WareInternalProcurementDetail record, @Param("example") WareInternalProcurementDetailExample example);

    int updateByExample(@Param("record") WareInternalProcurementDetail record, @Param("example") WareInternalProcurementDetailExample example);

    int updateByPrimaryKeySelective(WareInternalProcurementDetail record);

    int updateByPrimaryKey(WareInternalProcurementDetail record);
}