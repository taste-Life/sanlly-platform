package com.sanlly.production.models.input.fix;

import java.util.List;

/**
 *    
 * 
 * @Package com.sanlly.production.models.input.fix 
 * @Description: TODO 派工单类型查询条件
 * @author tianzhl   
 * @date 2019年9月7日 下午3:50:12 
 * @version V1.0   
 */
public class PickingListOutInput {

	// TODO 领料单号
	private String referralNo;

	// TODO 预出库单明细列表
	private List<PlanStockInput> planStockList;

	public String getReferralNo() {
		return referralNo;
	}

	public void setReferralNo(String referralNo) {
		this.referralNo = referralNo;
	}

	public List<PlanStockInput> getPlanStockList() {
		return planStockList;
	}

	public void setPlanStockList(List<PlanStockInput> planStockList) {
		this.planStockList = planStockList;
	}

}
