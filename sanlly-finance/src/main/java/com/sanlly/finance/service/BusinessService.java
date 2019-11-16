package com.sanlly.finance.service;

import java.util.List;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.finance.models.input.RejectInput;
import com.sanlly.finance.models.input.SearchBusinessInput;
import com.sanlly.finance.models.output.BaseChargeTypeOutput;
import com.sanlly.finance.models.output.BusinessDetailOutput;
import com.sanlly.finance.models.output.BusinessInvoiceOutput;
import com.sanlly.finance.models.output.BusinessOutput;
import com.sanlly.finance.models.output.RejectEnumOutput;

/**
 * 商务结算服务接口
* @Description: TODO(这里用一句话描述这个类的作用)  
* @author fjy
* @date 2019年8月8日  
*
 */
public interface BusinessService {

	/**
	 * 商务结算分页查询列表
	 * @Description:   
	 * @param input
	 * @return
	 */
	PagedList<BusinessOutput> getBusinessPage(SearchBusinessInput input);
	/**
	 * 入账
	 *@Description:（方法功能描述） 
	 * @param businessId（展示方法参数和返回值）
	 */
	Boolean inBill(String [] ids);
	/**
	 * 财务驳回
	 *@Description:（方法功能描述） 
	 * @param input（展示方法参数和返回值）
	 */
	void Reject(RejectInput input);
	
	/**
	 * 获取费用类型字典表
	 *@Description:（方法功能描述） 
	 * @return（展示方法参数和返回值）
	 */
	List<BaseChargeTypeOutput> getChargeTypeList();
	
	/**
	 * 商务结算明细分页查询列表
	 * @Description:   
	 * @param input
	 * @return
	 */
	PagedList<BusinessDetailOutput> getBusinessDetailPage(SearchBusinessInput input);
	
	/**
	 * 查询可入账的明细
	* @Description: TODO 
	* @param input
	* @return List<BusinessDetailOutput>
	* @throws 
	 */
	List<BusinessDetailOutput> getBusinessDetailList(SearchBusinessInput input);
	
	/**
	 * 商务结算发票分页查询列表
	 * @Description:   
	 * @param input
	 * @return
	 */
	PagedList<BusinessInvoiceOutput> getBusinessInvoicePage(SearchBusinessInput input);

	/**
	 * 获取财务驳回原因列表
	 * @Description:（方法功能描述） 
	 * @return（展示方法参数和返回值）
	 */
	List<RejectEnumOutput> getRejectList();
}
