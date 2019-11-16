package com.sanlly.warehouse.models.output.staffborrow;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sanlly.warehouse.models.output.stockout.StockoutDetailOutput;

/**
 * 员工借件output
 * 
 * @author lishzh
 *
 */
public class StaffBorrowOutput {

	private Integer wareStaffBorrowId;// 主键id

	private String staffBorrowNo;// 借件单号

	private String containerNo;// 箱号

	private String company;// 所属公司

	private String companyLangLang;// 所属公司

	private String yard;// 所属场站

	private String yardLangLang;// 所属场站

	private String borrowType;// 借件类型

	private String borrowTypeLangLang;// 借件类型

	private String borrowDepartment;// 借件部门

	private Integer borrowUser;// 借件人

	private String borrowUserName;// 借件人

	private String billStatus;// 单据状态

	private String billStatusLangLang;// 单据状态

	private String auditStatus;// 审核状态

	private String reasonsRejection;// 驳回原因

	private String remark;// 备注
	
	private String createUser;// 制单人
	
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date createTime;// 制单时间

	List<StaffBorrowDetailOutput> details;// 明细
	
	List<StockoutDetailOutput> outDetails;//出库明细
	
	public List<StockoutDetailOutput> getOutDetails() {
		return outDetails;
	}

	public void setOutDetails(List<StockoutDetailOutput> outDetails) {
		this.outDetails = outDetails;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}


	public Integer getWareStaffBorrowId() {
		return wareStaffBorrowId;
	}

	public void setWareStaffBorrowId(Integer wareStaffBorrowId) {
		this.wareStaffBorrowId = wareStaffBorrowId;
	}

	public String getStaffBorrowNo() {
		return staffBorrowNo;
	}

	public void setStaffBorrowNo(String staffBorrowNo) {
		this.staffBorrowNo = staffBorrowNo;
	}

	public String getContainerNo() {
		return containerNo;
	}

	public void setContainerNo(String containerNo) {
		this.containerNo = containerNo;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCompanyLangLang() {
		return companyLangLang;
	}

	public void setCompanyLangLang(String companyLangLang) {
		this.companyLangLang = companyLangLang;
	}

	public String getYard() {
		return yard;
	}

	public void setYard(String yard) {
		this.yard = yard;
	}

	public String getYardLangLang() {
		return yardLangLang;
	}

	public void setYardLangLang(String yardLangLang) {
		this.yardLangLang = yardLangLang;
	}

	public String getBorrowType() {
		return borrowType;
	}

	public void setBorrowType(String borrowType) {
		this.borrowType = borrowType;
	}

	public String getBorrowTypeLangLang() {
		return borrowTypeLangLang;
	}

	public void setBorrowTypeLangLang(String borrowTypeLangLang) {
		this.borrowTypeLangLang = borrowTypeLangLang;
	}

	public String getBorrowDepartment() {
		return borrowDepartment;
	}

	public void setBorrowDepartment(String borrowDepartment) {
		this.borrowDepartment = borrowDepartment;
	}

	public Integer getBorrowUser() {
		return borrowUser;
	}

	public void setBorrowUser(Integer borrowUser) {
		this.borrowUser = borrowUser;
	}

	public String getBorrowUserName() {
		return borrowUserName;
	}

	public void setBorrowUserName(String borrowUserName) {
		this.borrowUserName = borrowUserName;
	}

	public String getBillStatus() {
		return billStatus;
	}

	public void setBillStatus(String billStatus) {
		this.billStatus = billStatus;
	}

	public String getBillStatusLangLang() {
		return billStatusLangLang;
	}

	public void setBillStatusLangLang(String billStatusLangLang) {
		this.billStatusLangLang = billStatusLangLang;
	}

	public String getAuditStatus() {
		return auditStatus;
	}

	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}

	public String getReasonsRejection() {
		return reasonsRejection;
	}

	public void setReasonsRejection(String reasonsRejection) {
		this.reasonsRejection = reasonsRejection;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public List<StaffBorrowDetailOutput> getDetails() {
		return details;
	}

	public void setDetails(List<StaffBorrowDetailOutput> details) {
		this.details = details;
	}

}
