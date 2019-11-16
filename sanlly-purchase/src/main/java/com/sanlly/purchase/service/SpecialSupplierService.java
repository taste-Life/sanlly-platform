package com.sanlly.purchase.service;

import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.purchase.models.input.specialsupplier.AddSpecialSupplierInput;
import com.sanlly.purchase.models.input.specialsupplier.EditSpecialSupplierInput;
import com.sanlly.purchase.models.input.specialsupplier.SearchSpecialSupplierInput;
import com.sanlly.purchase.models.output.specialsupplier.SpecialSupplierOutput;

public interface SpecialSupplierService {
	/**
	 * 特殊供应商分页列表
	 * @param input
	 * @return
	 */
	PagedList<SpecialSupplierOutput> getSpecialSupplierPagedList(SearchSpecialSupplierInput input);
	
	/**
	 * 新增特殊供应商
	 * @param input
	 */
	Result addSpecialSupplier(AddSpecialSupplierInput input);
	
	/**
	 * 获取特殊供应商
	 * @param input
	 * @return
	 */
	SpecialSupplierOutput getSpecialSupplier(EditSpecialSupplierInput input);
	
	/**
	 * 修改特殊供应商
	 * @param input
	 */
	void updateSpecialSupplier(EditSpecialSupplierInput input);
	
	/**
	 * 批量删除特殊供应商
	 * @param purcSupplierTypes
	 */
	Result deleteSpecialSupplier(Integer[] specialSupplierIds);
}
