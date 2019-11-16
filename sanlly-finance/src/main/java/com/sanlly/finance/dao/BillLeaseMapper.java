package com.sanlly.finance.dao;

import com.sanlly.finance.entity.BillLease;
import com.sanlly.finance.entity.BillLeaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BillLeaseMapper {
    long countByExample(BillLeaseExample example);

    int deleteByExample(BillLeaseExample example);

    int deleteByPrimaryKey(Integer billId);

    int insert(BillLease record);

    int insertSelective(BillLease record);

    List<BillLease> selectByExample(BillLeaseExample example);

    BillLease selectByPrimaryKey(Integer billId);

    int updateByExampleSelective(@Param("record") BillLease record, @Param("example") BillLeaseExample example);

    int updateByExample(@Param("record") BillLease record, @Param("example") BillLeaseExample example);

    int updateByPrimaryKeySelective(BillLease record);

    int updateByPrimaryKey(BillLease record);
}