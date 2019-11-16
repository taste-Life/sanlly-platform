package com.sanlly.production.models.input.fix;

import com.sanlly.common.models.input.PageInput;

/**
 *    
 * 
 * @Package com.sanlly.production.models.input.fix 
 * @Description: TODO 派工单列表查询条件
 * @author tianzhl   
 * @date 2019年9月7日 下午3:50:12 
 * @version V1.0   
 */
public class FixReferralsListInput extends PageInput {

	// TODO 箱类别
	private String containerCategory;

	// TODO 派工状态
	private String[] referralState;

	// TODO 箱型
	private String containerType;

	// TODO 箱号
	private String containerNo;

	// TODO 箱类别
	private String containerUser;

	// TODO 指派班组
	private String designateUser;

	// TODO 进场类型
	private String courseType;

	// TODO 派工开始日期
	private String startDate;

	// TODO 派工结束日期
	private String endDate;

	// TODO 场站
	private String yard;

	public String getContainerCategory() {
		return containerCategory;
	}

	public void setContainerCategory(String containerCategory) {
		this.containerCategory = containerCategory;
	}

	public String[] getReferralState() {
		return referralState;
	}

	public String getContainerType() {
		return containerType;
	}

	public String getContainerNo() {
		return containerNo;
	}

	public String getContainerUser() {
		return containerUser;
	}

	public String getDesignateUser() {
		return designateUser;
	}

	public String getCourseType() {
		return courseType;
	}

	public String getStartDate() {
		return startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public String getYard() {
		return yard;
	}

	public void setReferralState(String[] referralState) {
		this.referralState = referralState;
	}

	public void setContainerType(String containerType) {
		this.containerType = containerType;
	}

	public void setContainerNo(String containerNo) {
		this.containerNo = containerNo;
	}

	public void setContainerUser(String containerUser) {
		this.containerUser = containerUser;
	}

	public void setDesignateUser(String designateUser) {
		this.designateUser = designateUser;
	}

	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public void setYard(String yard) {
		this.yard = yard;
	}

}
