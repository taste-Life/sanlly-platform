package com.sanlly.production.service;

import java.util.List;

import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.surrender.SurrenderPlanDeleteInput;
import com.sanlly.production.models.input.surrender.SurrenderPlanDetailInput;
import com.sanlly.production.models.input.surrender.SurrenderPlanFinishInput;
import com.sanlly.production.models.input.surrender.SurrenderPlanInput;
import com.sanlly.production.models.input.surrender.SurrenderPlanSearchInput;
import com.sanlly.production.models.output.surrender.SurrenderPlanDetailOutput;
import com.sanlly.production.models.output.surrender.SurrenderPlanOutput;

/**
 *    
 * 
 * @Package com.sanlly.production.service 
 * @Description: TODO 退租箱-相关接口
 * @author tianzhl   
 * @date 2019年10月21日 上午11:19:07 
 * @version V1.0   
 */
public interface SurrenderService {

	/**
	 *  
	 * 
	 * @Description: TODO 退租计划列表
	 * @param input
	 * @return List<SurrenderPlanOutput> @throws 
	 */
	PagedList<SurrenderPlanOutput> surrenderPlanlist(SurrenderPlanSearchInput input) throws Exception;

	/**
	 *  
	 * 
	 * @Description: TODO 保存退租计划
	 * @param input
	 * @return String @throws 
	 */
	Integer saveSurrenderPlan(SurrenderPlanInput input) throws Exception;
	
	/**
	 *  
	 * 
	 * @Description: TODO 批量删除退租计划
	 * @param input
	 * @return String @throws 
	 */
	void deleteSurrenderPlans(SurrenderPlanDeleteInput input) throws Exception;

	/**
	 *  
	 * 
	 * @Description: TODO 退租计划明细列表
	 * @return List<SurrenderPlanDetailOutput> @throws 
	 */
	List<SurrenderPlanDetailOutput> surrenderPlanDetailist(Integer prodSurrenderPlanId) throws Exception;

	/**
	 *  
	 * 
	 * @Description: TODO 保存退租计划明细
	 * @param input
	 * @return String @throws 
	 */
	Integer saveSurrenderPlanDetail(SurrenderPlanDetailInput input) throws Exception;
	
	/**
	 *  
	 * 
	 * @Description: TODO 批量删除退租计划明细
	 * @param input
	 * @return String @throws 
	 */
	void deleteSurrenderPlanDetails(SurrenderPlanDeleteInput input) throws Exception;
	
	/**
	 *  
	 * 
	 * @Description: TODO 批量完工退租计划
	 * @param input
	 * @return String @throws 
	 */
	void finishSurrenderPlans(SurrenderPlanFinishInput input) throws Exception;
}
