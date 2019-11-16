package com.sanlly.finance.service;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.finance.models.input.BillDetailInput;
import com.sanlly.finance.models.input.BillPtiDetailInput;
import com.sanlly.finance.models.output.BillPtiDetailOutput;

/**
 * 	PTI账单接口类
* @Package com.sanlly.finance.service 
* @Description: TODO 
* @author fjy   
* @date 2019年9月3日 下午2:54:32 
* @version V1.0   
 */
public interface BillPtiDetailService {

	/**
	 *  分页查询
	* @Description: TODO 
	* @param input
	* @return PagedList<BillPtiDetailOutput>
	* @throws 
	 */
	PagedList<BillPtiDetailOutput> getPage(BillDetailInput input);
	
	/**
	 *	  添加或者修改
	 * @Description:（方法功能描述） 
	 * @param input
	 * @return（展示方法参数和返回值）
	 */
	Boolean addOrUpadte(BillPtiDetailInput input);
	/**
	 * 批量删除
	 * @Description:（方法功能描述） 
	 * @param ids
	 * @return（展示方法参数和返回值）
	 */
	Boolean deletes(String [] ids);
	
}
