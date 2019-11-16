package com.sanlly.warehouse.entity;

import java.util.Date;

public class WareDebitSlip {
    private Integer wareDebitSlipId;

    private String debitSlipNo;

    private String containerNo;

    private String company;

    private String yard;

    private String debitType;

    private String warehouse;

    private String debitDepartment;

    private Integer debitPeople;

    private String billStatus;

    private String auditStatus;

    private String reasonsRejection;

    private String remark;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getWareDebitSlipId() {
        return wareDebitSlipId;
    }

    public void setWareDebitSlipId(Integer wareDebitSlipId) {
        this.wareDebitSlipId = wareDebitSlipId;
    }

    public String getDebitSlipNo() {
        return debitSlipNo;
    }

    public void setDebitSlipNo(String debitSlipNo) {
        this.debitSlipNo = debitSlipNo == null ? null : debitSlipNo.trim();
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

    public String getDebitType() {
        return debitType;
    }

    public void setDebitType(String debitType) {
        this.debitType = debitType == null ? null : debitType.trim();
    }

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse == null ? null : warehouse.trim();
    }

    public String getDebitDepartment() {
        return debitDepartment;
    }

    public void setDebitDepartment(String debitDepartment) {
        this.debitDepartment = debitDepartment == null ? null : debitDepartment.trim();
    }

    public Integer getDebitPeople() {
        return debitPeople;
    }

    public void setDebitPeople(Integer debitPeople) {
        this.debitPeople = debitPeople;
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