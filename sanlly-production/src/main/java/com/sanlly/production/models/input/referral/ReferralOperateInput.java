package com.sanlly.production.models.input.referral;

/**
 * 派工
 * 
 * @Package com.sanlly.production.models.input.referral 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年9月11日 下午5:09:14 
 * @version V1.0   
 */
public class ReferralOperateInput {
	/**
	 * 进场id
	 */
	private String courseId;
	/**
	 * 进场类型
	 */
	private String containerCategory;
	/**
	 * 派工类型 ReferralTypeEnum
	 */
	private String referralType;

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getContainerCategory() {
		return containerCategory;
	}

	public void setContainerCategory(String containerCategory) {
		this.containerCategory = containerCategory;
	}

	public String getReferralType() {
		return referralType;
	}

	public void setReferralType(String referralType) {
		this.referralType = referralType;
	}

}
