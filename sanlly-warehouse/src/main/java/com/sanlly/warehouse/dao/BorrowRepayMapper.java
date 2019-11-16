package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.BorrowRepay;
import com.sanlly.warehouse.entity.BorrowRepayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BorrowRepayMapper {
    long countByExample(BorrowRepayExample example);

    int deleteByExample(BorrowRepayExample example);

    int deleteByPrimaryKey(Integer borrowRepayId);

    int insert(BorrowRepay record);

    int insertSelective(BorrowRepay record);

    List<BorrowRepay> selectByExample(BorrowRepayExample example);

    BorrowRepay selectByPrimaryKey(Integer borrowRepayId);

    int updateByExampleSelective(@Param("record") BorrowRepay record, @Param("example") BorrowRepayExample example);

    int updateByExample(@Param("record") BorrowRepay record, @Param("example") BorrowRepayExample example);

    int updateByPrimaryKeySelective(BorrowRepay record);

    int updateByPrimaryKey(BorrowRepay record);
}