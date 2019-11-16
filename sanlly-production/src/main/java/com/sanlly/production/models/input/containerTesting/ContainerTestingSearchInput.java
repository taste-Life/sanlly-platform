package com.sanlly.production.models.input.containerTesting;

import com.sanlly.common.models.input.PageInput;

/**
 *    
 * 
 * @Package com.sanlly.production.models.input.containerTesting 
 * @Description: TODO 箱体检验检索实体-输入
 * @author tianzhl   
 * @date 2019年8月14日 上午11:21:53 
 * @version V1.0   
 */
public class ContainerTestingSearchInput extends PageInput {

	// TODO 开始日期
	private String startDate;

	// TODO 结束日期
	private String endDate;

	// TODO 箱号
	private String containerNo;

	// TODO 用箱人
	private String containerUser;

	// TODO 箱东
	private String containerOwner;

	// TODO 退租箱
	private String isSurrender;

	// TODO 箱型
	private String containerType;

	// TODO 箱类别
	private String containerCategory;

	// TODO 进场类型
	private String courseType;

	// TODO 箱况
	private String containerCondition;

	// TODO 场站
	private String yard;

	// TODO 检验人
	private String testingUser;

	// TODO 检验类型
	private String[] testingState;

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

	public String getContainerOwner() {
		return containerOwner;
	}

	public void setContainerOwner(String containerOwner) {
		this.containerOwner = containerOwner;
	}

	public String getIsSurrender() {
		return isSurrender;
	}

	public void setIsSurrender(String isSurrender) {
		this.isSurrender = isSurrender;
	}

	public String getContainerType() {
		return containerType;
	}

	public void setContainerType(String containerType) {
		this.containerType = containerType;
	}

	public String getContainerCategory() {
		return containerCategory;
	}

	public void setContainerCategory(String containerCategory) {
		this.containerCategory = containerCategory;
	}

	public String getCourseType() {
		return courseType;
	}

	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}

	public String getContainerCondition() {
		return containerCondition;
	}

	public void setContainerCondition(String containerCondition) {
		this.containerCondition = containerCondition;
	}

	public String getYard() {
		return yard;
	}

	public void setYard(String yard) {
		this.yard = yard;
	}

	public String getTestingUser() {
		return testingUser;
	}

	public void setTestingUser(String testingUser) {
		this.testingUser = testingUser;
	}

	public String[] getTestingState() {
		return testingState;
	}

	public void setTestingState(String[] testingState) {
		this.testingState = testingState;
	}

}
