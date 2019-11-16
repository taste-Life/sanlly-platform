package com.sanlly.purchase.service;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.purchase.models.input.StoreHouseType.AddStorehouseTypeInput;
import com.sanlly.purchase.models.input.StoreHouseType.EditStorehouseTypeInput;
import com.sanlly.purchase.models.input.StoreHouseType.SearchStorehouseTypeInput;
import com.sanlly.purchase.models.output.StorehouseType.StorehouseTypeOutput;


public interface StorehouseTypeService {
	/**
	 * 供应商库类别分页列表
	 * @param input
	 * @return
	 */
	PagedList<StorehouseTypeOutput> getStorehouseTypePagedList(SearchStorehouseTypeInput input);
	
	/**
	 * 新增供应商库类别
	 * @param input
	 */
	void addStorehouseType(AddStorehouseTypeInput input);
	
	/**
	 * 获取供应商库类别
	 * @param input
	 * @return
	 */
	StorehouseTypeOutput getStorehouseType(EditStorehouseTypeInput input);
	
	/**
	 * 修改供应商库类别
	 * @param input
	 */
	void updateStorehouseType(EditStorehouseTypeInput input);
	
	/**
	 * 批量删除供应商库类别
	 * @param StorehouseTypeIds
	 */
	void deleteStorehouseType(String[] keys);
}
