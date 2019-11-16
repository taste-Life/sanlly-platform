package com.sanlly.common.models.output.fixOut;

import com.sanlly.common.models.input.PageInput;

/**
 *    
 * 
 * @Package com.sanlly.production.models.input.fix 
 * @Description: TODO 派工单类型查询条件
 * @author tianzhl   
 * @date 2019年9月7日 下午3:50:12 
 * @version V1.0   
 */
public class PickingListSearchInput extends PageInput {

	// TODO 领料单号
	private String referralNo;

	// TODO 领料人
	private String pickingUser;

	// TODO 领料状态
	private String pickingState;

	// TODO 领料开始时间
	private String startDate;

	// TODO 领料接受时间
	private String endDate;

	public String getReferralNo() {
		return referralNo;
	}

	public void setReferralNo(String referralNo) {
		this.referralNo = referralNo;
	}

	public String getPickingUser() {
		return pickingUser;
	}

	public void setPickingUser(String pickingUser) {
		this.pickingUser = pickingUser;
	}

	public String getPickingState() {
		return pickingState;
	}

	public void setPickingState(String pickingState) {
		this.pickingState = pickingState;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

}
