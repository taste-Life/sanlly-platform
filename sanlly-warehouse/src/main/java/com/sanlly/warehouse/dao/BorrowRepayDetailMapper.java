package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.BorrowRepayDetail;
import com.sanlly.warehouse.entity.BorrowRepayDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BorrowRepayDetailMapper {
    long countByExample(BorrowRepayDetailExample example);

    int deleteByExample(BorrowRepayDetailExample example);

    int deleteByPrimaryKey(Integer borrowRepayDetailId);

    int insert(BorrowRepayDetail record);

    int insertSelective(BorrowRepayDetail record);

    List<BorrowRepayDetail> selectByExample(BorrowRepayDetailExample example);

    BorrowRepayDetail selectByPrimaryKey(Integer borrowRepayDetailId);

    int updateByExampleSelective(@Param("record") BorrowRepayDetail record, @Param("example") BorrowRepayDetailExample example);

    int updateByExample(@Param("record") BorrowRepayDetail record, @Param("example") BorrowRepayDetailExample example);

    int updateByPrimaryKeySelective(BorrowRepayDetail record);

    int updateByPrimaryKey(BorrowRepayDetail record);
}