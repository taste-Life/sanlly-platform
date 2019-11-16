package com.sanlly.warehouse.service;

import java.util.List;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.warehouse.models.input.warehousetype.AddWarehouseTypeInput;
import com.sanlly.warehouse.models.input.warehousetype.EditWarehouseTypeInput;
import com.sanlly.warehouse.models.input.warehousetype.SearchWarehouseTypeInput;
import com.sanlly.warehouse.models.output.KeyOutput;
import com.sanlly.warehouse.models.output.warehousetype.WarehouseTypeOutput;

public interface WarehouseTypeService {

	/**
	 * 添加仓库类型
	 * 
	 * @param input
	 */
	void addWarehouseType(AddWarehouseTypeInput input);

	/**
	 * 修改仓库类型
	 * 
	 * @param input
	 */
	void editWarehouseType(EditWarehouseTypeInput input);

	/**
	 * 删除仓库类型
	 * 
	 * @param input
	 */
	void deleteWarehouseType(Integer[] ids);

	/**
	 * 分页查询仓库类型
	 * 
	 * @param input
	 */
	PagedList<WarehouseTypeOutput> getPageWarehouseType(SearchWarehouseTypeInput input);

	/**
	 * 查询所有仓库类型
	 * 
	 */
	List<KeyOutput> getAllWarehouseType();

	/**
	 * 获取cbs仓库类型
	 *
	 */
	String getCBSType(String warehouseTypeKey);

	/**
	 * 查询所有仓库类型
	 *
	 */
	List<WarehouseTypeOutput> getAllWarehouseType(SearchWarehouseTypeInput input);

}
