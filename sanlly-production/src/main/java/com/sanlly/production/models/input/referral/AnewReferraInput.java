package com.sanlly.production.models.input.referral;

/**
 * 重新派工参数接收
 * 
 * @Package com.sanlly.production.models.input.referral 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年9月16日 下午4:34:33 
 * @version V1.0   
 */
public class AnewReferraInput {
	// 进场id
	private String courseId;
	// 箱类别
	private String containerCategory;
	// 派工类型
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
