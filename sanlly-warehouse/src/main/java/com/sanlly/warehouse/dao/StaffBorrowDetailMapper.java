package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.StaffBorrowDetail;
import com.sanlly.warehouse.entity.StaffBorrowDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StaffBorrowDetailMapper {
    long countByExample(StaffBorrowDetailExample example);

    int deleteByExample(StaffBorrowDetailExample example);

    int deleteByPrimaryKey(Integer wareStaffBorrowDetailId);

    int insert(StaffBorrowDetail record);

    int insertSelective(StaffBorrowDetail record);

    List<StaffBorrowDetail> selectByExample(StaffBorrowDetailExample example);

    StaffBorrowDetail selectByPrimaryKey(Integer wareStaffBorrowDetailId);

    int updateByExampleSelective(@Param("record") StaffBorrowDetail record, @Param("example") StaffBorrowDetailExample example);

    int updateByExample(@Param("record") StaffBorrowDetail record, @Param("example") StaffBorrowDetailExample example);

    int updateByPrimaryKeySelective(StaffBorrowDetail record);

    int updateByPrimaryKey(StaffBorrowDetail record);
}