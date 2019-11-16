package com.sanlly.finance.dao;

import com.sanlly.finance.entity.BillRepair;
import com.sanlly.finance.entity.BillRepairExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BillRepairMapper {
    long countByExample(BillRepairExample example);

    int deleteByExample(BillRepairExample example);

    int deleteByPrimaryKey(Integer billId);

    int insert(BillRepair record);

    int insertSelective(BillRepair record);

    List<BillRepair> selectByExample(BillRepairExample example);

    BillRepair selectByPrimaryKey(Integer billId);

    int updateByExampleSelective(@Param("record") BillRepair record, @Param("example") BillRepairExample example);

    int updateByExample(@Param("record") BillRepair record, @Param("example") BillRepairExample example);

    int updateByPrimaryKeySelective(BillRepair record);

    int updateByPrimaryKey(BillRepair record);
}