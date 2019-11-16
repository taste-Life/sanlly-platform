package com.sanlly.finance.service;

import java.util.List;

import com.sanlly.common.models.input.finance.PoolOutSourceRepairInput;
import com.sanlly.common.models.input.finance.PoolRepairInput;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.finance.models.input.PoolBaseInput;
import com.sanlly.finance.models.input.SearchBaseInput;
import com.sanlly.finance.models.output.PoolOutSourceRepairOutput;

/**
 * 	劳务外包费用池接口
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author fjy
 * @date 2019年8月26日  
 *
 */
public interface PoolOutSourceRepairService {
	
	/**
	 *  分页查询
	* @Description: TODO 
	* @param input
	* @return PagedList<PoolOutSourceRepairOutput>
	* @throws 
	 */
	PagedList<PoolOutSourceRepairOutput> getPage(SearchBaseInput input);
	

	/**
	 *	  添加或者修改
	 * @Description:（方法功能描述） 
	 * @param input
	 * @return（展示方法参数和返回值）
	 */
	Boolean addOrUpadte(PoolOutSourceRepairInput input);
	/**
	 *  批量添加费用
	* @Description: TODO 
	* @param input
	* @return Boolean
	* @throws 
	 */
	Boolean add(List<PoolOutSourceRepairInput> list);
	
	/**
	 *  取消批复，删除未加入账单的费用
	* @Description: TODO 
	* @param input
	* @return Boolean
	* @throws 
	 */
	Boolean cancleReply(PoolOutSourceRepairInput input);
	/**
	 * 批量修改
	* @Description: TODO 
	* @param input
	* @return Boolean
	* @throws 
	 */
	Boolean Upadtes(List<PoolOutSourceRepairInput> list);
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
	
	/**
	 * 外包完工时 调用生成 劳务外包费用  修箱
	* @Description: TODO 
	* @param input
	* @return Boolean
	* @throws 
	 */
	Boolean wbFinishedRepair(PoolOutSourceRepairInput input);
	
	/**
	 * 外包完工时 调用生成 劳务外包费用  洗箱
	* @Description: TODO 
	* @param input
	* @return Boolean
	* @throws 
	 */
	Boolean wbFinishedClean(PoolOutSourceRepairInput input);
	
	
	/**
	 * 修理账单确认  调用生成劳务外包成本费
	* @Description: TODO 
	* @param input
	* @return Boolean
	* @throws 
	 */
	Boolean wxBillOk(PoolRepairInput input);
	
	/**
	 * 3、报价材料费*比例（有需调整项，设计可调整项目）	批复产生
	* @Description: TODO 
	* @param input
	* @return Boolean
	* @throws 
	 */
	Boolean wxReply(PoolOutSourceRepairInput input);
	
	
	
}
