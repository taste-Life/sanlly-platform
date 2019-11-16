package com.sanlly.common.models.output.fixOut;

import java.util.List;

/**
 *    
 *
 * @Package com.sanlly.production.models.output.fix 
 * @Description: TODO 领料备件列表
 * @author tianzhl   
 * @date 2019年9月7日 下午4:08:09 
 * @version V1.0   
 */
public class PickingListDetailOutput {

	// 主键ID
	private String prodPickingListId;

	// 领料单号
	private String referralNo;

	// 领料人
	private String pickingUser;

	// 领料状态
	private String pickingStateLang;

	// 领料时间
	private String pickingTime;

	// 备注
	private String remarks;

	// 制单人
	private String createUser;

	private List<PickingListSparesOutput> sparesList;

	public String getProdPickingListId() {
		return prodPickingListId;
	}

	public void setProdPickingListId(String prodPickingListId) {
		this.prodPickingListId = prodPickingListId;
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

	public String getPickingStateLang() {
		return pickingStateLang;
	}

	public void setPickingStateLang(String pickingStateLang) {
		this.pickingStateLang = pickingStateLang;
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

	public List<PickingListSparesOutput> getSparesList() {
		return sparesList;
	}

	public void setSparesList(List<PickingListSparesOutput> sparesList) {
		this.sparesList = sparesList;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

}
