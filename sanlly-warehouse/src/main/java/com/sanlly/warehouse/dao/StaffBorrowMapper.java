package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.StaffBorrow;
import com.sanlly.warehouse.entity.StaffBorrowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StaffBorrowMapper {
    long countByExample(StaffBorrowExample example);

    int deleteByExample(StaffBorrowExample example);

    int deleteByPrimaryKey(Integer wareStaffBorrowId);

    int insert(StaffBorrow record);

    int insertSelective(StaffBorrow record);

    List<StaffBorrow> selectByExample(StaffBorrowExample example);

    StaffBorrow selectByPrimaryKey(Integer wareStaffBorrowId);

    int updateByExampleSelective(@Param("record") StaffBorrow record, @Param("example") StaffBorrowExample example);

    int updateByExample(@Param("record") StaffBorrow record, @Param("example") StaffBorrowExample example);

    int updateByPrimaryKeySelective(StaffBorrow record);

    int updateByPrimaryKey(StaffBorrow record);
}