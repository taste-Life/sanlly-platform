package com.sanlly.warehouse.entity;

import java.util.Date;

public class BorrowLend {
    private Integer wareBorrowLendSlipId;

    private String borrowLendNo;

    private String containerNo;

    private String yard;

    private String company;

    private String borrowUnit;

    private Integer borrowUser;

    private String borrowType;

    private String outWarehouse;

    private String inWarehouse;

    private String escrowWarehouse;

    private String auditStatus;

    private String reasonsRejection;

    private String billStatus;

    private String remark;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private Integer category;

    public Integer getWareBorrowLendSlipId() {
        return wareBorrowLendSlipId;
    }

    public void setWareBorrowLendSlipId(Integer wareBorrowLendSlipId) {
        this.wareBorrowLendSlipId = wareBorrowLendSlipId;
    }

    public String getBorrowLendNo() {
        return borrowLendNo;
    }

    public void setBorrowLendNo(String borrowLendNo) {
        this.borrowLendNo = borrowLendNo == null ? null : borrowLendNo.trim();
    }

    public String getContainerNo() {
        return containerNo;
    }

    public void setContainerNo(String containerNo) {
        this.containerNo = containerNo == null ? null : containerNo.trim();
    }

    public String getYard() {
        return yard;
    }

    public void setYard(String yard) {
        this.yard = yard == null ? null : yard.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getBorrowUnit() {
        return borrowUnit;
    }

    public void setBorrowUnit(String borrowUnit) {
        this.borrowUnit = borrowUnit == null ? null : borrowUnit.trim();
    }

    public Integer getBorrowUser() {
        return borrowUser;
    }

    public void setBorrowUser(Integer borrowUser) {
        this.borrowUser = borrowUser;
    }

    public String getBorrowType() {
        return borrowType;
    }

    public void setBorrowType(String borrowType) {
        this.borrowType = borrowType == null ? null : borrowType.trim();
    }

    public String getOutWarehouse() {
        return outWarehouse;
    }

    public void setOutWarehouse(String outWarehouse) {
        this.outWarehouse = outWarehouse == null ? null : outWarehouse.trim();
    }

    public String getInWarehouse() {
        return inWarehouse;
    }

    public void setInWarehouse(String inWarehouse) {
        this.inWarehouse = inWarehouse == null ? null : inWarehouse.trim();
    }

    public String getEscrowWarehouse() {
        return escrowWarehouse;
    }

    public void setEscrowWarehouse(String escrowWarehouse) {
        this.escrowWarehouse = escrowWarehouse == null ? null : escrowWarehouse.trim();
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

    public String getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(String billStatus) {
        this.billStatus = billStatus == null ? null : billStatus.trim();
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

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }
}