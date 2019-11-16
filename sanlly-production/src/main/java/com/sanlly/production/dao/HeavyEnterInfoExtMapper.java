package com.sanlly.production.dao;

import java.util.List;
import java.util.Map;

import com.sanlly.production.entity.HeavyTempRecord;


/**
 * 重箱监管-船名航次列表Mapper
 * @author zhangkai
 *
 */
public interface HeavyEnterInfoExtMapper {
	
	/**
	 * 重箱监管-船名航次列表（分页）
	 * @param map
	 * @return
	 * @author zhangkai
	 */
	List<String> voyages(Map<String, Integer> map);
	
	/**
	 * 重箱监管-船名航次总数
	 * @return
	 * @author zhangkai
	 */
	Integer count();

}
