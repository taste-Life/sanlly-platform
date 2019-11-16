package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareEntryAdjustmentDetail;
import com.sanlly.warehouse.entity.WareEntryAdjustmentDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareEntryAdjustmentDetailMapper {
    long countByExample(WareEntryAdjustmentDetailExample example);

    int deleteByExample(WareEntryAdjustmentDetailExample example);

    int deleteByPrimaryKey(Integer wareReturnWarehouseDetailId);

    int insert(WareEntryAdjustmentDetail record);

    int insertSelective(WareEntryAdjustmentDetail record);

    List<WareEntryAdjustmentDetail> selectByExample(WareEntryAdjustmentDetailExample example);

    WareEntryAdjustmentDetail selectByPrimaryKey(Integer wareReturnWarehouseDetailId);

    int updateByExampleSelective(@Param("record") WareEntryAdjustmentDetail record, @Param("example") WareEntryAdjustmentDetailExample example);

    int updateByExample(@Param("record") WareEntryAdjustmentDetail record, @Param("example") WareEntryAdjustmentDetailExample example);

    int updateByPrimaryKeySelective(WareEntryAdjustmentDetail record);

    int updateByPrimaryKey(WareEntryAdjustmentDetail record);
}