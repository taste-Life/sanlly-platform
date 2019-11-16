package com.sanlly.warehouse.models.input.laborInsurance.laborReceive;

import java.util.Date;

import com.sanlly.common.models.input.PageInput;
/**
 * ClassName: SearchLaborReceiveInput
 * Description: 查询劳保申请单信息输入类
 * date: 2019/7/25 17:51
 *
 * @author zhh
 */
public class SearchLaborReceiveInput extends PageInput{
	//开始日期
	private Date startDate;
	//截止日期
	private Date endDate;
	//申请部门
	private String applicantDepartment;
	//申请类型
	private String applicantType;
	//出库状态
	private String stockoutStatus;
	//备件号
	private String sparePartsNo;
	//备件名称
	private String sparePartsName;
	
	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getApplicantDepartment() {
		return applicantDepartment;
	}

	public void setApplicantDepartment(String applicantDepartment) {
		this.applicantDepartment = applicantDepartment;
	}

	public String getApplicantType() {
		return applicantType;
	}

	public void setApplicantType(String applicantType) {
		this.applicantType = applicantType;
	}

	public String getStockoutStatus() {
		return stockoutStatus;
	}

	public void setStockoutStatus(String stockoutStatus) {
		this.stockoutStatus = stockoutStatus;
	}

	public SearchLaborReceiveInput() {
		super();
	}

	public SearchLaborReceiveInput(Integer pageIndex, Integer pageSize) {
		super(pageIndex, pageSize);
		// TODO Auto-generated constructor stub
	}

	public String getSparePartsNo() {
		return sparePartsNo;
	}

	public void setSparePartsNo(String sparePartsNo) {
		this.sparePartsNo = sparePartsNo;
	}

	public String getSparePartsName() {
		return sparePartsName;
	}

	public void setSparePartsName(String sparePartsName) {
		this.sparePartsName = sparePartsName;
	}
	
	

}
