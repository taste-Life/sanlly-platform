package com.sanlly.production.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface LangMapper {
	/**
	 * @Title: selectBaseTable
	 * @Description: TODO 查询翻译库
	 * @param: @param
	 *             selectSql
	 * @param: @return
	 * @return: List<Map<String,String>>
	 */
	List<Map<String, String>> selectLangTable(@Param("selectSql") String selectSql);
}