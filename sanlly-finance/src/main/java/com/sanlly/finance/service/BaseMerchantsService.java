package com.sanlly.finance.service;

import java.util.List;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.finance.models.input.BaseMerchantsInput;
import com.sanlly.finance.models.input.SearchMerchantsInput;
import com.sanlly.finance.models.output.BaseMerchantsOutput;

/**
 * 客商信息服务接口
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author fjy
 * @date 2019年8月14日  
 *
 */
public interface BaseMerchantsService {
	
	/**
	 * 查询客户信息列表
	 *@Description:（方法功能描述） 
	 * @param input
	 * @return（展示方法参数和返回值）
	 */
	List<BaseMerchantsOutput> list(SearchMerchantsInput input);
	/**
	 * 分页查询客户信息列表
	 *@Description:（方法功能描述） 
	 * @param input
	 * @return（展示方法参数和返回值）
	 */
	PagedList<BaseMerchantsOutput> getMerchantsPage(SearchMerchantsInput input);
	
	
	/**
	 * 全部导出集合
	 *@Description:（方法功能描述） 
	 * @param input
	 * @return（展示方法参数和返回值）
	 */
	List<BaseMerchantsOutput> exportMerchantsAll(SearchMerchantsInput input);
	/**
	 *	  添加或者修改客户信息
	 * @Description:（方法功能描述） 
	 * @param input
	 * @return（展示方法参数和返回值）
	 */
	Boolean addOrUpadteMerchants(BaseMerchantsInput input);
	/**
	 * 批量删除客户信息
	 * @Description:（方法功能描述） 
	 * @param ids
	 * @return（展示方法参数和返回值）
	 */
	Boolean deletesMerchants(String [] ids);
	
}
