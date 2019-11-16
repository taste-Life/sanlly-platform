package com.sanlly.warehouse.models.input.tool;

import java.util.Date;

import com.sanlly.common.models.input.PageInput;

/**
 * 工具检索input
 * 
 * @author lishzh
 *
 */
public class SearchToolInput extends PageInput {

	private String no;// 单号

	private Date startDate;// 起始时间

	private Date endDate;// 结束时间

	private Integer userId;// 用户id

	private String auditStatus;// 审核状态

	private String department;// 部门

	private String name;// 名称

	private String sparePartsNo;// 备件号

	private String distributeStatus;// 派发状态

	private String toolStatus;// 工具状态

	public String getDistributeStatus() {
		return distributeStatus;
	}

	public void setDistributeStatus(String distributeStatus) {
		this.distributeStatus = distributeStatus;
	}

	public String getToolStatus() {
		return toolStatus;
	}

	public void setToolStatus(String toolStatus) {
		this.toolStatus = toolStatus;
	}

	public String getSparePartsNo() {
		return sparePartsNo;
	}

	public void setSparePartsNo(String sparePartsNo) {
		this.sparePartsNo = sparePartsNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public SearchToolInput(Integer index, Integer size) {
		super(index, size);
	}

	public String getAuditStatus() {
		return auditStatus;
	}

	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

}
