package com.sanlly.warehouse.dao;

import java.util.List;
import java.util.Map;

import com.sanlly.warehouse.entity.BorrowLendDetail;

/**
 * 借入借出明细扩展DAO
 * 
 * @author lishzh
 *
 */
public interface BorrowLendDetailExtMapper {

	List<BorrowLendDetail> selectByCondition(Map<String, Object> map);

	int getTotal();

}
