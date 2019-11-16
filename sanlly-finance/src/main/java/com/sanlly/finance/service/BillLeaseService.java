package com.sanlly.finance.service;

import java.util.List;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.finance.models.input.BillLeaseInput;
import com.sanlly.finance.models.input.PoolLeaseInput;
import com.sanlly.finance.models.input.RejectInput;
import com.sanlly.finance.models.input.SearchBaseInput;
import com.sanlly.finance.models.output.BillLeaseOutput;

/**
 * 	租赁 场地账单接口类
* @Package com.sanlly.finance.service 
* @Description: TODO 
* @author fjy   
* @date 2019年9月3日 下午2:54:32 
* @version V1.0   
 */
public interface BillLeaseService {

	/**
	 *  分页查询
	* @Description: TODO 
	* @param input
	* @return PagedList<BillLeaseOutput>
	* @throws 
	 */
	PagedList<BillLeaseOutput> getPage(SearchBaseInput input);
	/**
	 * 创建账单和明细
	* @Description: TODO 
	* @return Boolean
	* @throws 
	 */
	Boolean createBill(List<PoolLeaseInput> list);
	
	
	
	/**
	 *	  添加
	 * @Description:（方法功能描述） 
	 * @param input
	 * @return（展示方法参数和返回值）
	 */
	Boolean add(BillLeaseInput input);
	
	/**
	 * 批量修改
	* @Description: TODO 
	* @param input
	* @return Boolean
	* @throws 
	 */
	Boolean Upadtes(List<BillLeaseInput> input);
	
	/**
	 *	 账单驳回
	 * @Description:（方法功能描述） 
	 * @param input
	 * @return（展示方法参数和返回值）
	 */
	Boolean billReturn(RejectInput input);
	
	
	/**
	 * 批量删除
	 * @Description:（方法功能描述） 
	 * @param ids
	 * @return（展示方法参数和返回值）
	 */
	Boolean deletes(String [] ids);
	
	/**
	 *	 账单提交
	 * @Description:（方法功能描述） 
	 * @param input
	 * @return（展示方法参数和返回值）
	 */
	Boolean billSubmit(String [] ids);
	
	/**
	 *	 账单审核
	 *	同时传账单主信息及明细汇总信息（根据成本利润中心分类汇总）到应收账款模块。
	 * @Description:（方法功能描述） 
	 * @param input
	 * @return（展示方法参数和返回值）
	 */
	Boolean billAudit(String [] ids);
	
	/**
	 *	 取消账单审核
	 * @Description:（方法功能描述） 
	 * @param input
	 * @return（展示方法参数和返回值）
	 */
	Boolean billCancleAudit(String [] ids);
	
	/**
	 *	 全额冲回
	 * @Description:（方法功能描述） 
	 * @param input
	 * @return（展示方法参数和返回值）
	 */
	Boolean billFullReturn(String [] ids);
	
	/**
	 *	 全额调账
	 * @Description:（方法功能描述） 
	 * @param input
	 * @return（展示方法参数和返回值）
	 */
	Boolean billFullAdjustment(String [] ids);
	
	
	
}
