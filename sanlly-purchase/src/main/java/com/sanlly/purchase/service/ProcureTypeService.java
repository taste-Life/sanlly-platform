package com.sanlly.purchase.service;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.purchase.models.input.procuretype.AddProcureTypeInput;
import com.sanlly.purchase.models.input.procuretype.EditProcureTypeInput;
import com.sanlly.purchase.models.input.procuretype.SearchProcureTypeInput;
import com.sanlly.purchase.models.output.procuretype.ProcureTypeOutput;


public interface ProcureTypeService {
	/**
	 * 供应商采购类型分页列表
	 * @param input
	 * @return
	 */
	PagedList<ProcureTypeOutput> getProcureTypePagedList(SearchProcureTypeInput input);
	
	/**
	 * 新增供应商采购类型
	 * @param input
	 */
	void addProcureType(AddProcureTypeInput input);
	
	/**
	 * 获取供应商库采购类型
	 * @param input
	 * @return
	 */
	ProcureTypeOutput getProcureType(EditProcureTypeInput input);
	
	/**
	 * 修改供应商采购类型
	 * @param input
	 */
	void updateProcureType(EditProcureTypeInput input);
	
	/**
	 * 批量删除供应商采购类型
	 * @param ProcureTypeIds
	 */
	void deleteProcureType(Integer[] ProcureTypeIds);
}
