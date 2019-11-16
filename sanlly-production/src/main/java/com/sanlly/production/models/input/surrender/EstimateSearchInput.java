package com.sanlly.production.models.input.surrender;

import com.sanlly.common.models.input.PageInput;

/**
 * 估价单列表搜索
 * @author RexSheng
 * 2019年10月31日 下午2:08:06
 */
public class EstimateSearchInput extends PageInput{
	
	private String containerNo;
	
	private String beginCourseTime; 
	private String endCourseTime;
	
	
	
	private String containerUser;
	private String courseType;

	private String valuationState;
	
	/**
	 * 箱东-退租箱
	 */
	private String containerOwner;
	
	/**
	 * 箱类别-退租箱
	 */
	private String containerCategory;
	
	/**
	 * 箱东批复状态
	 */
	private String ownerValuationState;

	public String getContainerNo() {
		return containerNo;
	}

	public void setContainerNo(String containerNo) {
		this.containerNo = containerNo;
	}

	public String getBeginCourseTime() {
		return beginCourseTime;
	}

	public void setBeginCourseTime(String beginCourseTime) {
		this.beginCourseTime = beginCourseTime;
	}

	public String getEndCourseTime() {
		return endCourseTime;
	}

	public void setEndCourseTime(String endCourseTime) {
		this.endCourseTime = endCourseTime;
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

	public String getValuationState() {
		return valuationState;
	}

	public void setValuationState(String valuationState) {
		this.valuationState = valuationState;
	}

	public String getContainerOwner() {
		return containerOwner;
	}

	public void setContainerOwner(String containerOwner) {
		this.containerOwner = containerOwner;
	}

	public String getContainerCategory() {
		return containerCategory;
	}

	public void setContainerCategory(String containerCategory) {
		this.containerCategory = containerCategory;
	}

	public String getOwnerValuationState() {
		return ownerValuationState;
	}

	public void setOwnerValuationState(String ownerValuationState) {
		this.ownerValuationState = ownerValuationState;
	}

	
	
}
