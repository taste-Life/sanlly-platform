package com.sanlly.warehouse.dao;

import java.util.List;
import java.util.Map;

import com.sanlly.warehouse.entity.StaffBorrow;

/**
 * 员工借件扩展DAO
 * 
 * @author lishzh
 *
 */
public interface StaffBorrowExtMapper {

	List<StaffBorrow> selectByCondition(Map<String, Object> map);

	int getTotal();
}