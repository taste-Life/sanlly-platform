package com.sanlly.warehouse.dao;

import java.util.List;
import java.util.Map;

import com.sanlly.warehouse.entity.WareLaborStock;
import com.sanlly.warehouse.entity.WareLaborStockExt;
import com.sanlly.warehouse.entity.WareToolExtManage;

/**
 * 劳保库存管理扩展DAO
 * 
 * @author zhh
 *
 */
public interface WareLaborStockExtMapper {

	List<WareLaborStockExt> selectPageLabors(Map<String, Object> map);
	
	int getTotal();
	
}
