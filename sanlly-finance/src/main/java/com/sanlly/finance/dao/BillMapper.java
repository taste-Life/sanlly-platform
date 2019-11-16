package com.sanlly.finance.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface BillMapper {
	/**
	 * @Title: selectBaseTable
	 * @Description: TODO 查询 各种账单库
	 * @param: @param
	 *             selectSql
	 * @param: @return
	 * @return: List<Map<String,String>>
	 */
	List<Map<String, String>> selectBillTable(@Param("selectSql") String selectSql);
	
}