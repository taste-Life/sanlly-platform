package com.sanlly.finance.service;

import java.util.List;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.finance.models.input.BaseChargeTypeInput;
import com.sanlly.finance.models.input.SearchBaseInput;
import com.sanlly.finance.models.output.BaseChargeTypeOutput;

/**
 * 费用类型对应表
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author fjy
 * @date 2019年8月20日  
 *
 */
public interface BaseChargeTypeService {
	
	/**
	 *  查询
	* @Description: TODO 
	* @param input
	* @return PagedList<BaseChargeTypeOutput>
	* @throws 
	 */
	List<BaseChargeTypeOutput> list(SearchBaseInput input);
	
	/**
	 *  根据业务大类 分类 收支类型查询相应的费用类型
	* @Description: TODO 
	* @param input
	* @return PagedList<BaseChargeTypeOutput>
	* @throws 
	 */
	List<BaseChargeTypeOutput> listForBussiness(SearchBaseInput input);

	/**
	 *  分页查询
	* @Description: TODO 
	* @param input
	* @return PagedList<BaseChargeTypeOutput>
	* @throws 
	 */
	PagedList<BaseChargeTypeOutput> getPage(SearchBaseInput input);
	

	/**
	 *	  添加或者修改
	 * @Description:（方法功能描述） 
	 * @param input
	 * @return（展示方法参数和返回值）
	 */
	Boolean addOrUpadte(BaseChargeTypeInput input);
	/**
	 * 批量删除
	 * @Description:（方法功能描述） 
	 * @param ids
	 * @return（展示方法参数和返回值）
	 */
	Boolean deletes(String [] ids);
	
}
