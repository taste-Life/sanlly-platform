package com.sanlly.purchase.service;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.purchase.models.input.supplierType.AddSupplierTypeInput;
import com.sanlly.purchase.models.input.supplierType.EditSupplierTypeInput;
import com.sanlly.purchase.models.input.supplierType.SearchSupplierTypeInput;
import com.sanlly.purchase.models.output.supplierType.SupplierTypeOutput;


public interface SupplierTypeService {
	/**
	 * 供应商类别分页列表
	 * @param input
	 * @return
	 */
	PagedList<SupplierTypeOutput> getSupplierTypePagedList(SearchSupplierTypeInput input);
	
	/**
	 * 新增供应商类别
	 * @param input
	 */
	void addSupplierType(AddSupplierTypeInput input);
	
	/**
	 * 获取供应商库类别
	 * @param input
	 * @return
	 */
	SupplierTypeOutput getSupplierType(EditSupplierTypeInput input);
	
	/**
	 * 修改供应商类别
	 * @param input
	 */
	void updateSupplierType(EditSupplierTypeInput input);
	
	/**
	 * 批量删除供应商类别
	 * @param SupplierTypeIds
	 */
	void deleteSupplierType(Integer[] SupplierTypeIds);
}
