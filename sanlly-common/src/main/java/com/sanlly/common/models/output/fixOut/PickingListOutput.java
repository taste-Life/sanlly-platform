package com.sanlly.common.models.output.fixOut;

/**
 *    
 * 
 * @Package com.sanlly.production.models.output.fix 
 * @Description: TODO 领料备件列表
 * @author tianzhl   
 * @date 2019年9月7日 下午4:08:09 
 * @version V1.0   
 */
public class PickingListOutput {

	private String prodPickingListId;

	private String referralNo;

	private String pickingUser;

	private String pickingUserName;

	private String pickingState;

	private String pickingStateNameLang;

	private String pickingTime;

	private String remarks;

	private String createUser;

	public String getProdPickingListId() {
		return prodPickingListId;
	}

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

	public String getPickingUserName() {
		return pickingUserName;
	}

	public void setPickingUserName(String pickingUserName) {
		this.pickingUserName = pickingUserName;
	}

	public String getPickingState() {
		return pickingState;
	}

	public void setPickingState(String pickingState) {
		this.pickingState = pickingState;
	}

	public String getPickingStateNameLang() {
		return pickingStateNameLang;
	}

	public void setPickingStateNameLang(String pickingStateNameLang) {
		this.pickingStateNameLang = pickingStateNameLang;
	}

	public String getPickingTime() {
		return pickingTime;
	}

	public void setPickingTime(String pickingTime) {
		this.pickingTime = pickingTime;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public void setProdPickingListId(String prodPickingListId) {
		this.prodPickingListId = prodPickingListId;
	}

}
