package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareEntryAdjustment;
import com.sanlly.warehouse.entity.WareEntryAdjustmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareEntryAdjustmentMapper {
    long countByExample(WareEntryAdjustmentExample example);

    int deleteByExample(WareEntryAdjustmentExample example);

    int deleteByPrimaryKey(Integer wareEntryAdjustmentId);

    int insert(WareEntryAdjustment record);

    int insertSelective(WareEntryAdjustment record);

    List<WareEntryAdjustment> selectByExample(WareEntryAdjustmentExample example);

    WareEntryAdjustment selectByPrimaryKey(Integer wareEntryAdjustmentId);

    int updateByExampleSelective(@Param("record") WareEntryAdjustment record, @Param("example") WareEntryAdjustmentExample example);

    int updateByExample(@Param("record") WareEntryAdjustment record, @Param("example") WareEntryAdjustmentExample example);

    int updateByPrimaryKeySelective(WareEntryAdjustment record);

    int updateByPrimaryKey(WareEntryAdjustment record);
}