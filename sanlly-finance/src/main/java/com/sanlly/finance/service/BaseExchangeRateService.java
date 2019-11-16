package com.sanlly.finance.service;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.finance.models.input.BaseExchangeRateInput;
import com.sanlly.finance.models.input.SearchBaseInput;
import com.sanlly.finance.models.output.BaseExchangeRateOutput;

/**
 * 汇率表接口
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author fjy
 * @date 2019年8月20日  
 *
 */
public interface BaseExchangeRateService {

	/**
	 *  分页查询
	* @Description: TODO 
	* @param input
	* @return PagedList<AuditDeptOutput>
	* @throws 
	 */
	PagedList<BaseExchangeRateOutput> getPage(SearchBaseInput input);
	

	/**
	 *	  添加或者修改
	 * @Description:（方法功能描述） 
	 * @param input
	 * @return（展示方法参数和返回值）
	 */
	Boolean addOrUpadte(BaseExchangeRateInput input);
	/**
	 * 批量删除
	 * @Description:（方法功能描述） 
	 * @param ids
	 * @return（展示方法参数和返回值）
	 */
	Boolean deletes(String [] ids);
	/**
	 * 获取最新汇率
	* @Description: TODO 
	* @return String
	* @throws 
	 */
	String getNewRate();
}
