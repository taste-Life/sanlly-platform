package com.sanlly.finance.dao;

import com.sanlly.finance.entity.BillSourceRepair;
import com.sanlly.finance.entity.BillSourceRepairExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BillSourceRepairMapper {
    long countByExample(BillSourceRepairExample example);

    int deleteByExample(BillSourceRepairExample example);

    int deleteByPrimaryKey(Integer billId);

    int insert(BillSourceRepair record);

    int insertSelective(BillSourceRepair record);

    List<BillSourceRepair> selectByExample(BillSourceRepairExample example);

    BillSourceRepair selectByPrimaryKey(Integer billId);

    int updateByExampleSelective(@Param("record") BillSourceRepair record, @Param("example") BillSourceRepairExample example);

    int updateByExample(@Param("record") BillSourceRepair record, @Param("example") BillSourceRepairExample example);

    int updateByPrimaryKeySelective(BillSourceRepair record);

    int updateByPrimaryKey(BillSourceRepair record);
}