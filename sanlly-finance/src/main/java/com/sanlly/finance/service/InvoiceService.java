package com.sanlly.finance.service;

import java.util.List;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.finance.models.input.SearchInvoiceInput;
import com.sanlly.finance.models.output.BillCommonOutput;
import com.sanlly.finance.models.output.BusinessInvoiceOutput;

/**
 *	发票查询接口
* @Description: TODO(这里用一句话描述这个类的作用)  
* @author fjy
* @date 2019年8月8日  
*
 */
public interface InvoiceService {

	/**
	 * 商务结算发票分页查询列表
	 * @Description:   
	 * @param input
	 * @return
	 */
	PagedList<BusinessInvoiceOutput> getInvoicePage(SearchInvoiceInput input);
	/**
	 * 全部发票导出集合
	 *@Description:（方法功能描述） 
	 * @param input
	 * @return（展示方法参数和返回值）
	 */
	List<BusinessInvoiceOutput> exportInvoiceAll(SearchInvoiceInput input);
	
	/**
	 * 全部发票导出集合
	 *@Description:（方法功能描述） 
	 * @param input
	 * @return（展示方法参数和返回值）
	 */
	List<BillCommonOutput> getBillByInvoice(SearchInvoiceInput input) throws Exception;
	
	
}
