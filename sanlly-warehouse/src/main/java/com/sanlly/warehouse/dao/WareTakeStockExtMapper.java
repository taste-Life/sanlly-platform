package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareTakeStock;
import com.sanlly.warehouse.entity.WareTakeStockExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface WareTakeStockExtMapper {

	/**
	 * 根据输入条件关联查询
	 *
	 * @author jlx
	 * @param map
	 * @return
	 */
    List<WareTakeStock> selectByCondition(Map<String, Object> map);
	/**
	 * 查询总条数
	 *
	 * @author jlx
	 * @return
	 */
	int getTotal();
}