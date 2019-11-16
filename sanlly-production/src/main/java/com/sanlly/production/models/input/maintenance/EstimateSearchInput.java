package com.sanlly.production.models.input.maintenance;

import com.sanlly.common.models.input.PageInput;

/**
 * 估价单列表搜索
 * @author RexSheng
 * 2019年10月31日 下午2:08:06
 */
public class EstimateSearchInput extends PageInput{
	
	private String containerNo;
	
	private String ladingNo;
	
	
	
	private String beginCourseTime; 
	private String endCourseTime;
	
	private String beginValuationTime;
	
	private String endValuationTime;
	
	private String beginReplyTime;
	private String endReplyTime;
	
	
	private String containerUser;
	private String courseType;

	private String[] valuationStates;
	
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
	private String[] ownerValuationStates;

	public String getContainerNo() {
		return containerNo;
	}

	public void setContainerNo(String containerNo) {
		this.containerNo = containerNo;
	}

	public String getLadingNo() {
		return ladingNo;
	}

	public void setLadingNo(String ladingNo) {
		this.ladingNo = ladingNo;
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

	public String getBeginValuationTime() {
		return beginValuationTime;
	}

	public void setBeginValuationTime(String beginValuationTime) {
		this.beginValuationTime = beginValuationTime;
	}

	public String getEndValuationTime() {
		return endValuationTime;
	}

	public void setEndValuationTime(String endValuationTime) {
		this.endValuationTime = endValuationTime;
	}

	public String getBeginReplyTime() {
		return beginReplyTime;
	}

	public void setBeginReplyTime(String beginReplyTime) {
		this.beginReplyTime = beginReplyTime;
	}

	public String getEndReplyTime() {
		return endReplyTime;
	}

	public void setEndReplyTime(String endReplyTime) {
		this.endReplyTime = endReplyTime;
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

	public String[] getValuationStates() {
		return valuationStates;
	}

	public void setValuationStates(String[] valuationStates) {
		this.valuationStates = valuationStates;
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

	public String[] getOwnerValuationStates() {
		return ownerValuationStates;
	}

	public void setOwnerValuationStates(String[] ownerValuationStates) {
		this.ownerValuationStates = ownerValuationStates;
	}
	
	
}
