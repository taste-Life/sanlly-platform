package com.sanlly.purchase.service;

import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.purchase.models.input.demand.AddMatterTemporaryPurchaseInput;
import com.sanlly.purchase.models.input.demand.SearchMatterTemporaryPurchaseInput;
import com.sanlly.purchase.models.output.matterpurchase.MatterPurchaseOutput;

/**
 * 
* Description: 物料采购单接口
* @ClassName: PurcMatterTemporaryPurchaseService
* @date 2019年8月1日
*
* @author jlx
 */
public interface MatterTemporaryPurchaseService {

	/**
	 * 添加采购单
	 */
	Result addMatterTemporaryPurchase(AddMatterTemporaryPurchaseInput input);
	/**
	 * 采购单分页列表
	 * @param input
	 * @return
	 */
	PagedList<MatterPurchaseOutput> getMatterTemporaryPurchasePagedList(SearchMatterTemporaryPurchaseInput input);
	
	/**
	 * 采购审核列表
	 * @param input
	 * @return
	 */
	PagedList<MatterPurchaseOutput> getAuditPurchasePagedList(SearchMatterTemporaryPurchaseInput input);
	/**
	 * 采购单审核
	 * @param purcMatterTemporaryPurchaseId
	 */
	void auditMatterPurchase(Integer[] purcMatterTemporaryPurchaseId,String[] processInstanceIds,String[] taskIds);
	/**
	 * 采购单驳回
	 * @param purcMatterTemporaryPurchaseId
	 */
	void rejectMatterPurchase(Integer[] purcMatterTemporaryPurchaseId,String[] processInstanceIds,String[] taskIds);
	/**
	 * 
	* @Description: 取得采购单编辑信息 
	* @param purcMatterTemporaryPurchaseId
	* @return MatterPurchaseOutput
	* @throws 
	 */
	MatterPurchaseOutput getMatterTemporaryPurchaseInfo(Integer purcMatterTemporaryPurchaseId);
	
	/**
	 * 
	* @Description: 采购单编辑 
	* @param input void
	* @throws 
	 */
	void editMatterTemporaryPurchase(MatterPurchaseOutput input);
	
	void delMatterTemporaryPurchase(Integer[] purchaseIds);
	public void auditMatterPurchase(Integer[] purcMatterTemporaryPurchaseIds);

	public void rejectMatterPurchase(Integer[] purcMatterTemporaryPurchaseIds);
}
