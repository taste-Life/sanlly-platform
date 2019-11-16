package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.BorrowLend;
import com.sanlly.warehouse.entity.BorrowLendExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BorrowLendMapper {
    long countByExample(BorrowLendExample example);

    int deleteByExample(BorrowLendExample example);

    int deleteByPrimaryKey(Integer wareBorrowLendSlipId);

    int insert(BorrowLend record);

    int insertSelective(BorrowLend record);

    List<BorrowLend> selectByExample(BorrowLendExample example);

    BorrowLend selectByPrimaryKey(Integer wareBorrowLendSlipId);

    int updateByExampleSelective(@Param("record") BorrowLend record, @Param("example") BorrowLendExample example);

    int updateByExample(@Param("record") BorrowLend record, @Param("example") BorrowLendExample example);

    int updateByPrimaryKeySelective(BorrowLend record);

    int updateByPrimaryKey(BorrowLend record);
}