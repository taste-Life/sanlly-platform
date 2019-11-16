package com.sanlly.warehouse.entity;

import java.math.BigDecimal;
import java.util.Date;

public class WareLaborReceive {
    private Integer wareLaborReceiveId;

    private Integer laborReceive;

    private String advanceWarehouseReceiptNo;

    private String company;

    private String applicantDepartment;

    private Integer applicantUser;

    private String applicantType;

    private BigDecimal billAmount;

    private String stockoutStatus;

    private Date applicantDate;

    private String applicantDetails;

    private String remark;

    private String auditStatus;

    private String reasonsRejection;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getWareLaborReceiveId() {
        return wareLaborReceiveId;
    }

    public void setWareLaborReceiveId(Integer wareLaborReceiveId) {
        this.wareLaborReceiveId = wareLaborReceiveId;
    }

    public Integer getLaborReceive() {
        return laborReceive;
    }

    public void setLaborReceive(Integer laborReceive) {
        this.laborReceive = laborReceive;
    }

    public String getAdvanceWarehouseReceiptNo() {
        return advanceWarehouseReceiptNo;
    }

    public void setAdvanceWarehouseReceiptNo(String advanceWarehouseReceiptNo) {
        this.advanceWarehouseReceiptNo = advanceWarehouseReceiptNo == null ? null : advanceWarehouseReceiptNo.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getApplicantDepartment() {
        return applicantDepartment;
    }

    public void setApplicantDepartment(String applicantDepartment) {
        this.applicantDepartment = applicantDepartment == null ? null : applicantDepartment.trim();
    }

    public Integer getApplicantUser() {
        return applicantUser;
    }

    public void setApplicantUser(Integer applicantUser) {
        this.applicantUser = applicantUser;
    }

    public String getApplicantType() {
        return applicantType;
    }

    public void setApplicantType(String applicantType) {
        this.applicantType = applicantType == null ? null : applicantType.trim();
    }

    public BigDecimal getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(BigDecimal billAmount) {
        this.billAmount = billAmount;
    }

    public String getStockoutStatus() {
        return stockoutStatus;
    }

    public void setStockoutStatus(String stockoutStatus) {
        this.stockoutStatus = stockoutStatus == null ? null : stockoutStatus.trim();
    }

    public Date getApplicantDate() {
        return applicantDate;
    }

    public void setApplicantDate(Date applicantDate) {
        this.applicantDate = applicantDate;
    }

    public String getApplicantDetails() {
        return applicantDetails;
    }

    public void setApplicantDetails(String applicantDetails) {
        this.applicantDetails = applicantDetails == null ? null : applicantDetails.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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