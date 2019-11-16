package com.sanlly.finance.service;

import java.util.List;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.finance.models.input.PoolBaseInput;
import com.sanlly.finance.models.input.PoolNewboxInput;
import com.sanlly.finance.models.input.SearchBaseInput;
import com.sanlly.finance.models.output.PoolNewboxOutput;

/**
 * 新箱费用池接口
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author fjy
 * @date 2019年8月26日  
 *
 */
public interface PoolNewboxService {
	
	/**
	 *  分页查询
	* @Description: TODO 
	* @param input
	* @return PagedList<PoolNewboxOutput>
	* @throws 
	 */
	PagedList<PoolNewboxOutput> getPage(SearchBaseInput input);
	

	/**
	 *	  添加或者修改
	 * @Description:（方法功能描述） 
	 * @param input
	 * @return（展示方法参数和返回值）
	 */
	Boolean addOrUpadte(PoolNewboxInput input);
	/**
	 * 批量修改
	* @Description: TODO 
	* @param input
	* @return Boolean
	* @throws 
	 */
	Boolean Upadtes(List<PoolNewboxInput> input);
	/**
	 * 批量删除
	 * @Description:（方法功能描述） 
	 * @param ids
	 * @return（展示方法参数和返回值）
	 */
	Boolean deletes(String [] ids);
	/**
	 * 费用确认
	* @Description: TODO 
	* @param ids
	* @return Boolean
	* @throws 
	 */
	Boolean costOk(String [] ids);
	
	/**
	 * 无法收费
	* @Description: TODO 
	* @param input
	* @return Boolean
	* @throws 
	 */
	Boolean NoCharge(PoolBaseInput input);
	
	
	
}
