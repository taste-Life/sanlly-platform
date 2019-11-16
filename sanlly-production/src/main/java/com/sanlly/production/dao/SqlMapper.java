package com.sanlly.production.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

/**
 * 
 * @author RexSheng
 * 2019年10月9日 上午11:11:35
 */
public interface SqlMapper {
	/**
	 * 自定义sql查询，返回map
	 * @param <T>
	 * @param selectSql
	 * @param clazz
	 * @return
	 */
	List<Map<String, Object>> selectBySql(@Param("sql") String selectSql);
	
	/**
	 * 自定义sql查询，返回实体集合
	 * @param <T>
	 * @param selectSql
	 * @param clazz
	 * @return
	 */
	<T> List<T> query(@Param("sql") String selectSql,Class<T> clazz);
}