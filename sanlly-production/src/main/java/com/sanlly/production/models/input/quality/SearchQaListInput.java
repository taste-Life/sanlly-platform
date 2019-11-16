package com.sanlly.production.models.input.quality;

import com.sanlly.common.models.input.PageInput;

/**
 * 安全品控部质检
 * 
 * @Package com.sanlly.production.models.input.quality 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年10月19日 上午10:51:21 
 * @version V1.0   
 */
public class SearchQaListInput extends PageInput {
	// 公司
	private String company;
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
	// 场站
	private String yard;
	// 子公司质检结果
	private String qualityResult;
	// 派工开始时间
	private String referralStartDate;
	// 派工结束时间
	private String referralEndDate;
	// 完工开始时间
	private String finishStartDate;
	// 完工结束时间
	private String finishEndDate;

	public SearchQaListInput(Integer pageIndex, Integer pageSize) {
		super(pageIndex, pageSize);
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
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

	public String getYard() {
		return yard;
	}

	public void setYard(String yard) {
		this.yard = yard;
	}

	public String getQualityResult() {
		return qualityResult;
	}

	public void setQualityResult(String qualityResult) {
		this.qualityResult = qualityResult;
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
