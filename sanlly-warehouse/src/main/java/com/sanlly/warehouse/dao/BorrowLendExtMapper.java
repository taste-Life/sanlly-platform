package com.sanlly.warehouse.dao;

import java.util.List;
import java.util.Map;

import com.sanlly.warehouse.entity.BorrowLend;

/**
 * 借入借出扩展DAO
 * 
 * @author lishzh
 *
 */
public interface BorrowLendExtMapper {

	/**
	 * 根据输入条件关联查询
	 *
	 * @author lishzh
	 * @param map
	 * @return
	 */
	List<BorrowLend> selectByCondition(Map<String, Object> map);

	/**
	 * 查询总条数
	 *
	 * @author lishzh
	 * @return
	 */
	int getTotal();

}
