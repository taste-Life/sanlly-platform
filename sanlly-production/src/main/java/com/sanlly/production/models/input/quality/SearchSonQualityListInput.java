package com.sanlly.production.models.input.quality;

import com.sanlly.common.models.input.PageInput;

/**
 * 子公司现场质检列表查询参数
 * 
 * @Package com.sanlly.production.models.input.quality 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年10月10日 下午1:32:54 
 * @version V1.0   
 */
public class SearchSonQualityListInput extends PageInput {
	// 箱况
	private String containerCondition;
	// 箱类别
	private String containerCategory;
	// 箱号
	private String containerNo;
	// 进场类型
	private String courseType;
	// 指派班组
	private Integer designateUser;
	// 用箱人
	private String containerUser;
	// 维修状态
	private String referralState;
	// 质检类型
	private String qualityType;
	// 派工开始时间
	private String referralStartDate;
	// 派工结束时间
	private String referralEndDate;
	// 完工开始时间
	private String finishStartDate;
	// 完工结束时间
	private String finishEndDate;

	public String getContainerCondition() {
		return containerCondition;
	}

	public void setContainerCondition(String containerCondition) {
		this.containerCondition = containerCondition;
	}

	public SearchSonQualityListInput(Integer pageIndex, Integer pageSize) {
		super(pageIndex, pageSize);
	}

	public String getContainerNo() {
		return containerNo;
	}

	public String getContainerCategory() {
		return containerCategory;
	}

	public void setContainerCategory(String containerCategory) {
		this.containerCategory = containerCategory;
	}

	public void setContainerNo(String containerNo) {
		this.containerNo = containerNo;
	}

	public String getCourseType() {
		return courseType;
	}

	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}

	public Integer getDesignateUser() {
		return designateUser;
	}

	public void setDesignateUser(Integer designateUser) {
		this.designateUser = designateUser;
	}

	public String getContainerUser() {
		return containerUser;
	}

	public void setContainerUser(String containerUser) {
		this.containerUser = containerUser;
	}

	public String getReferralState() {
		return referralState;
	}

	public void setReferralState(String referralState) {
		this.referralState = referralState;
	}

	public String getQualityType() {
		return qualityType;
	}

	public void setQualityType(String qualityType) {
		this.qualityType = qualityType;
	}

	public String getReferralStartDate() {
		return referralStartDate;
	}

	public void setReferralStartDate(String referralStartDate) {
		this.referralStartDate = referralStartDate;
	}

	public String getReferralEndDate() {
		return referralEndDate;
	}

	public void setReferralEndDate(String referralEndDate) {
		this.referralEndDate = referralEndDate;
	}

	public String getFinishStartDate() {
		return finishStartDate;
	}

	public void setFinishStartDate(String finishStartDate) {
		this.finishStartDate = finishStartDate;
	}

	public String getFinishEndDate() {
		return finishEndDate;
	}

	public void setFinishEndDate(String finishEndDate) {
		this.finishEndDate = finishEndDate;
	}

}
