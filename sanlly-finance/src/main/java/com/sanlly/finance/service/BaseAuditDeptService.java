package com.sanlly.finance.service;

import java.util.List;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.finance.entity.BaseAuditDept;
import com.sanlly.finance.models.input.BaseAuditDeptInput;
import com.sanlly.finance.models.input.SearchBaseInput;
import com.sanlly.finance.models.output.BaseAuditDeptOutput;

/**
 * 核算部门
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author fjy
 * @date 2019年8月20日  
 *
 */
public interface BaseAuditDeptService {
	
	/**
	 *  获取核算部门
	* @Description: TODO 
	* @param input
	* @return PagedList<BaseAuditDeptOutput>
	* @throws 
	 */
	BaseAuditDept getInfo(BaseAuditDeptInput input);
	
	/**
	 *  查询
	* @Description: TODO 
	* @param input
	* @return PagedList<BaseAuditDeptOutput>
	* @throws 
	 */
	List<BaseAuditDeptOutput> list(SearchBaseInput input);

	/**
	 *  分页查询
	* @Description: TODO 
	* @param input
	* @return PagedList<BaseAuditDeptOutput>
	* @throws 
	 */
	PagedList<BaseAuditDeptOutput> getPage(SearchBaseInput input);
	

	/**
	 *	  添加或者修改
	 * @Description:（方法功能描述） 
	 * @param input
	 * @return（展示方法参数和返回值）
	 */
	Boolean addOrUpadte(BaseAuditDeptInput input);
	/**
	 * 批量删除
	 * @Description:（方法功能描述） 
	 * @param ids
	 * @return（展示方法参数和返回值）
	 */
	Boolean deletes(String [] ids);
	
}
