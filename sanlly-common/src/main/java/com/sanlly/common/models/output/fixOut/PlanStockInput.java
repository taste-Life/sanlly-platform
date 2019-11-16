package com.sanlly.common.models.output.fixOut;

/**
 *    
 * 
 * @Package com.sanlly.production.models.input.fix 
 * @Description: TODO 派工单类型查询条件
 * @author tianzhl   
 * @date 2019年9月7日 下午3:50:12 
 * @version V1.0   
 */
public class PlanStockInput {

	// TODO 明细Id
	private String referralEntryId;

	// TODO 出库数量
	private String quantity;

	public String getReferralEntryId() {
		return referralEntryId;
	}

	public void setReferralEntryId(String referralEntryId) {
		this.referralEntryId = referralEntryId;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

}
