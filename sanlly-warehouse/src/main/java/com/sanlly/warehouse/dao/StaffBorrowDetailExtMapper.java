package com.sanlly.warehouse.dao;

import java.util.List;
import java.util.Map;

import com.sanlly.warehouse.entity.StaffBorrowDetail;

/**
 * 员工借件单明细扩展DAO
 * 
 * @author lishzh
 *
 */
public interface StaffBorrowDetailExtMapper {
	List<StaffBorrowDetail> selectByCondition(Map<String, Object> map);

	int getTotal();
}