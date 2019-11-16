package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.BorrowLendDetail;
import com.sanlly.warehouse.entity.BorrowLendDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BorrowLendDetailMapper {
    long countByExample(BorrowLendDetailExample example);

    int deleteByExample(BorrowLendDetailExample example);

    int deleteByPrimaryKey(Integer wareBorrowSlipDetailId);

    int insert(BorrowLendDetail record);

    int insertSelective(BorrowLendDetail record);

    List<BorrowLendDetail> selectByExample(BorrowLendDetailExample example);

    BorrowLendDetail selectByPrimaryKey(Integer wareBorrowSlipDetailId);

    int updateByExampleSelective(@Param("record") BorrowLendDetail record, @Param("example") BorrowLendDetailExample example);

    int updateByExample(@Param("record") BorrowLendDetail record, @Param("example") BorrowLendDetailExample example);

    int updateByPrimaryKeySelective(BorrowLendDetail record);

    int updateByPrimaryKey(BorrowLendDetail record);
}