package com.sanlly.warehouse.models.input.staffborrow;

import java.util.List;

/**
 * 员工借件input
 * @author lishzh
 *
 */
public class StaffborrowInput {
	
	private Integer wareStaffBorrowId;//主键id

    private String staffBorrowNo;//借件单号

    private String containerNo;//箱号

    private String company;//所属公司

    private String yard;//所属场站

    private String borrowType;//借件类型

    private String borrowDepartment;//借件部门

    private Integer borrowUser;//借件人

    private String billStatus;//单据状态

    private String auditStatus;//审核状态

    private String reasonsRejection;//驳回原因

    private String remark;//备注
    
    private List<StaffBorrowDetailInput> details;

	public List<StaffBorrowDetailInput> getDetails() {
		return details;
	}

	public void setDetails(List<StaffBorrowDetailInput> details) {
		this.details = details;
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

	public String getYard() {
		return yard;
	}

	public void setYard(String yard) {
		this.yard = yard;
	}

	public String getBorrowType() {
		return borrowType;
	}

	public void setBorrowType(String borrowType) {
		this.borrowType = borrowType;
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

	public String getBillStatus() {
		return billStatus;
	}

	public void setBillStatus(String billStatus) {
		this.billStatus = billStatus;
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


}
