package com.sanlly.purchase.service;


import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.purchase.models.input.supplier.AddPureSupplierTypeInput;
import com.sanlly.purchase.models.input.supplier.EditPureSupplierTypeInput;
import com.sanlly.purchase.models.input.supplier.SearchPureSupplierTypeInput;
import com.sanlly.purchase.models.output.supplier.PureSupplierTypeOutput;

public interface PureSupplierTypeService {
	/**
	 * 供应商类别分页列表
	 * @param input
	 * @return
	 */
	PagedList<PureSupplierTypeOutput> getSupplierTypePagedList(SearchPureSupplierTypeInput input);
	
	/**
	 * 新增供应商类别
	 * @param input
	 */
	void addPureSupplierType(AddPureSupplierTypeInput input);
	
	/**
	 * 获取供应商类别
	 * @param input
	 * @return
	 */
	PureSupplierTypeOutput getPureSupplierType(EditPureSupplierTypeInput input);
	
	/**
	 * 修改供应商类别
	 * @param input
	 */
	void updatePureSupplierType(EditPureSupplierTypeInput input);
	
	/**
	 * 批量删除供应商类别
	 * @param purcSupplierTypes
	 */
	void deletePureSupplierType(Integer[] pureSupplierTypeIds);
}
