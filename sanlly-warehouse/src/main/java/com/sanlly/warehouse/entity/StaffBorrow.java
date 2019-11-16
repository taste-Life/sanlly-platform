package com.sanlly.warehouse.entity;

import java.util.Date;

public class StaffBorrow {
    private Integer wareStaffBorrowId;

    private String staffBorrowNo;

    private String containerNo;

    private String company;

    private String yard;

    private String borrowType;

    private String borrowDepartment;

    private Integer borrowUser;

    private String billStatus;

    private String auditStatus;

    private String reasonsRejection;

    private String remark;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

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
        this.staffBorrowNo = staffBorrowNo == null ? null : staffBorrowNo.trim();
    }

    public String getContainerNo() {
        return containerNo;
    }

    public void setContainerNo(String containerNo) {
        this.containerNo = containerNo == null ? null : containerNo.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getYard() {
        return yard;
    }

    public void setYard(String yard) {
        this.yard = yard == null ? null : yard.trim();
    }

    public String getBorrowType() {
        return borrowType;
    }

    public void setBorrowType(String borrowType) {
        this.borrowType = borrowType == null ? null : borrowType.trim();
    }

    public String getBorrowDepartment() {
        return borrowDepartment;
    }

    public void setBorrowDepartment(String borrowDepartment) {
        this.borrowDepartment = borrowDepartment == null ? null : borrowDepartment.trim();
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
        this.billStatus = billStatus == null ? null : billStatus.trim();
    }

    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus == null ? null : auditStatus.trim();
    }

    public String getReasonsRejection() {
        return reasonsRejection;
    }

    public void setReasonsRejection(String reasonsRejection) {
        this.reasonsRejection = reasonsRejection == null ? null : reasonsRejection.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }
}