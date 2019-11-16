package com.sanlly.warehouse.service;


import java.util.List;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.warehouse.entity.WareSafeStock;
import com.sanlly.warehouse.models.input.wareearlywarning.AddImportWareSafeStockInput;
import com.sanlly.warehouse.models.input.wareearlywarning.AddWareSafeStockInput;
import com.sanlly.warehouse.models.input.wareearlywarning.DeleteWareSafeStockInput;
import com.sanlly.warehouse.models.input.wareearlywarning.EditWareSafeStockInput;
import com.sanlly.warehouse.models.input.wareearlywarning.SearchWareSafeStockInput;
import com.sanlly.warehouse.models.output.safestock.SafeStockOutput;

/**
 * 
* Description:安全库存设置 
* @ClassName: SafeStockService
* @date 2019年7月25日
*
* @author jlx
 */
public interface SafeStockService {

	/**
	 * 安全库存设置列表取得
	 * @param input
	 * @return
	 */
	PagedList<SafeStockOutput> getPageListSafeStock(SearchWareSafeStockInput input);
	/**
	 * 删除安全库存设置
	 * @param input
	 */
	void deleteSafeStock(Integer[] wareSafeStockIds);
	/**
	 * 编辑安全库存设置
	 * @param input
	 */
	void editSafeStock(EditWareSafeStockInput input);
	/**
	 * 添加安全库存设置
	 * @param input
	 */
	void addSafeStock(AddWareSafeStockInput input);
	/**
	 * 添加安全库存设置
	 * @param input
	 */
	void importSafeStock(List<AddImportWareSafeStockInput> inputs);
	
	
	
	
}
