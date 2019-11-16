package com.sanlly.production.models.input.surrender;

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
public class SurrenderCourseSearchInput extends PageInput {

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

	// TODO 箱类别
	private String containerCategory;

	// TODO 进场类型
	private String courseType;

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

}
