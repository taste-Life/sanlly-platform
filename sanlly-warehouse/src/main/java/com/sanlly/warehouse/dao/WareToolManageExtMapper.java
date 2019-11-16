package com.sanlly.warehouse.dao;

import java.util.List;
import java.util.Map;

import com.sanlly.warehouse.entity.WareToolExtManage;

/**
 * 工具管理扩展DAO
 * 
 * @author lishzh
 *
 */
public interface WareToolManageExtMapper {

	List<WareToolExtManage> selectPageTools(Map<String, Object> map);
	
	int getTotal();

}
