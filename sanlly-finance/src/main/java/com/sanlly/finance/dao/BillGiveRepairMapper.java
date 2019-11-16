package com.sanlly.finance.dao;

import com.sanlly.finance.entity.BillGiveRepair;
import com.sanlly.finance.entity.BillGiveRepairExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BillGiveRepairMapper {
    long countByExample(BillGiveRepairExample example);

    int deleteByExample(BillGiveRepairExample example);

    int deleteByPrimaryKey(Integer billId);

    int insert(BillGiveRepair record);

    int insertSelective(BillGiveRepair record);

    List<BillGiveRepair> selectByExample(BillGiveRepairExample example);

    BillGiveRepair selectByPrimaryKey(Integer billId);

    int updateByExampleSelective(@Param("record") BillGiveRepair record, @Param("example") BillGiveRepairExample example);

    int updateByExample(@Param("record") BillGiveRepair record, @Param("example") BillGiveRepairExample example);

    int updateByPrimaryKeySelective(BillGiveRepair record);

    int updateByPrimaryKey(BillGiveRepair record);
}