package com.sanlly.production.models.input.referral;

import com.sanlly.common.models.input.PageInput;

/**
 * 自动排程检索条件
 * 
 * @Package com.sanlly.production.models.input.referral 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年9月10日 上午11:03:15 
 * @version V1.0   
 */
public class SearchAutomationInput extends PageInput {
	// 派工开始时间
	private String startDate;
	// 派工结束时间
	private String endDate;
	// 箱类别
	private String containerCategory;
	// 箱号
	private String containerNo;
	// 用箱人
	private String containerUser;
	// 进场类型
	private String courseType;
	// 班组
	private String workGroup;

	// 派工状态
	private String referralState;
	// 场站
	private String yard;

	public SearchAutomationInput() {

	}

	public SearchAutomationInput(Integer pageIndex, Integer pageSize) {
		super(pageIndex, pageSize);
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

	public String getContainerCategory() {
		return containerCategory;
	}

	public void setContainerCategory(String containerCategory) {
		this.containerCategory = containerCategory;
	}

	public String getContainerNo() {
		return containerNo;
	}

	public void setContainerNo(String containerNo) {
		this.containerNo = containerNo;
	}

	public String getContainerUser() {
		return containerUser;
	}

	public void setContainerUser(String containerUser) {
		this.containerUser = containerUser;
	}

	public String getCourseType() {
		return courseType;
	}

	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}

	public String getWorkGroup() {
		return workGroup;
	}

	public void setWorkGroup(String workGroup) {
		this.workGroup = workGroup;
	}

	public String getReferralState() {
		return referralState;
	}

	public void setReferralState(String referralState) {
		this.referralState = referralState;
	}

	public String getYard() {
		return yard;
	}

	public void setYard(String yard) {
		this.yard = yard;
	}

}
