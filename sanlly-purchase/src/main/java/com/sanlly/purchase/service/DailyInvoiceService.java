package com.sanlly.purchase.service;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.purchase.models.input.matterinvoice.AddMatterInvoiceInput;
import com.sanlly.purchase.models.input.matterinvoice.SearchMatterInvoiceInput;
import com.sanlly.purchase.models.output.matterinvoice.MatterInvoiceOutput;

/**
 * 
* @Package com.sanlly.purchase.service 
* @Description: 日常采购-发票管理   
* @author jlx   
* @date 2019年9月16日 上午11:22:55 
* @version V1.0   
 */
public interface DailyInvoiceService {

	/**
	 * 
	* @Description: 发票分页列表 
	* @param input
	* @return PagedList<MatterInvoiceOutput>
	* @throws 
	 */
	PagedList<MatterInvoiceOutput> getMatterInvoicePagedList(SearchMatterInvoiceInput input);

	/**
	 * 
	* @Description: 发票录入 
	* @param input void
	* @throws 
	 */
	void addInvoice(AddMatterInvoiceInput input);


	/**
	 * 
	* @Description: 删除发票 
	* @param purcPurchaseBillId
	* @throws 
	 */
	void delInvoice(Integer[] purcPurchaseBillId);
}
