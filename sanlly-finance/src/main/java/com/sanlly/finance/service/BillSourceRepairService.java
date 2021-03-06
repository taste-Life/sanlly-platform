package com.sanlly.finance.service;

import java.util.List;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.finance.models.input.BillSourceRepairInput;
import com.sanlly.finance.models.input.RejectInput;
import com.sanlly.finance.models.input.SearchBaseInput;
import com.sanlly.finance.models.output.BillSourceRepairDetailOutput;
import com.sanlly.finance.models.output.BillSourceRepairOutput;
import com.sanlly.finance.models.output.PoolSourceRepairOutput;

/**
 * 	维修账单接口
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author fjy
 * @date 2019年8月20日  
 *
 */
public interface BillSourceRepairService {
	

	/**
	 *  分页查询
	* @Description: TODO 
	* @param input
	* @return PagedList<BillSourceRepairOutput>
	* @throws 
	 */
	PagedList<BillSourceRepairOutput> getPage(SearchBaseInput input);
	
	/**
	 * 创建账单和明细
	* @Description: TODO 
	* @return Boolean
	* @throws 
	 */
	Boolean createBill(BillSourceRepairInput input);
	
	/**
	 *	  添加
	 * @Description:（方法功能描述） 
	 * @param input
	 * @return（展示方法参数和返回值）
	 */
	Boolean add(BillSourceRepairInput input);
	
	/**
	 * 批量修改
	* @Description: TODO 
	* @param input
	* @return Boolean
	* @throws 
	 */
	Boolean Upadtes(List<BillSourceRepairInput> input);
	
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
	
	
	
	/**
	 * 明细相关方法
	 * 
	 */
	
	/**
	 *  账单明细查询
	* @Description: TODO 
	* @param input
	* @return PagedList<BillSourceRepairOutput>
	* @throws 
	 */
	List<BillSourceRepairDetailOutput> listDetail(SearchBaseInput input);
	
	/**
	 *  费用池查询
	* @Description: TODO 
	* @param input
	* @return PagedList<BillSourceRepairOutput>
	* @throws 
	 */
	List<PoolSourceRepairOutput> listPoolDetail(SearchBaseInput input);
	
	/**
	 * 	批量删除账单明细  修改费用池状态
	* @Description: TODO 
	* @param ids
	* @return Boolean
	* @throws 
	 */
	Boolean deleteDetail(String [] ids);
	
	/**
	 * 取消费用确认
	* @Description: TODO 
	* @param ids
	* @return Boolean
	* @throws 
	 */
	Boolean cancleFreeOk(String [] ids);
	
	/**
	 *  加入账单
	* @Description: TODO 
	* @param ids
	* @return Boolean
	* @throws 
	 */
	Boolean billAdd(String [] ids,Integer billId);
	
	/**
	 * 调账驳回
	 */
	Boolean billFullAdjustmentReturn(String[] ids);
	
	
	
}
