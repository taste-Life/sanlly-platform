package com.sanlly.production.models.input.fix;

/**
 *    
 * 
 * @Package com.sanlly.production.models.input.fix 
 * @Description: TODO 批量提交备件号
 * @author tianzhl   
 * @date 2019年9月7日 下午3:50:12 
 * @version V1.0   
 */
public class FixSparesNumSubmitInput {

	// TODO 派工条目Id
	private String referralEntryId;

	// TODO 箱类别
	private String containerCategory;

	// TODO 备件号
	private String sparesNum;

	public String getReferralEntryId() {
		return referralEntryId;
	}

	public String getContainerCategory() {
		return containerCategory;
	}

	public String getSparesNum() {
		return sparesNum;
	}

	public void setReferralEntryId(String referralEntryId) {
		this.referralEntryId = referralEntryId;
	}

	public void setContainerCategory(String containerCategory) {
		this.containerCategory = containerCategory;
	}

	public void setSparesNum(String sparesNum) {
		this.sparesNum = sparesNum;
	}

}
