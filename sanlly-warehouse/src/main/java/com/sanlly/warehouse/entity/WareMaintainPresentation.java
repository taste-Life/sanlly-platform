package com.sanlly.warehouse.entity;

import java.math.BigDecimal;
import java.util.Date;

public class WareMaintainPresentation {
    private Integer wareMaintainPresentationId;

    private String maintainPresentationNo;

    private String manufacturer;

    private String company;

    private String maintainNo;

    private String maintainDepartments;

    private String yard;

    private Integer testUser;

    private Integer inputUser;

    private Integer maintainUser;

    private Double maintainNum;

    private String newMaintainSerial;

    private String faultStorage;

    private Double scrapNum;

    private String changeOriginal;

    private String faultRecord;

    private String maintainRecord;

    private BigDecimal maintainMoney;

    private String repairReason;

    private Date inputNum;

    private String auditStatus;

    private String reasonsRejection;

    private String remark;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getWareMaintainPresentationId() {
        return wareMaintainPresentationId;
    }

    public void setWareMaintainPresentationId(Integer wareMaintainPresentationId) {
        this.wareMaintainPresentationId = wareMaintainPresentationId;
    }

    public String getMaintainPresentationNo() {
        return maintainPresentationNo;
    }

    public void setMaintainPresentationNo(String maintainPresentationNo) {
        this.maintainPresentationNo = maintainPresentationNo == null ? null : maintainPresentationNo.trim();
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer == null ? null : manufacturer.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getMaintainNo() {
        return maintainNo;
    }

    public void setMaintainNo(String maintainNo) {
        this.maintainNo = maintainNo == null ? null : maintainNo.trim();
    }

    public String getMaintainDepartments() {
        return maintainDepartments;
    }

    public void setMaintainDepartments(String maintainDepartments) {
        this.maintainDepartments = maintainDepartments == null ? null : maintainDepartments.trim();
    }

    public String getYard() {
        return yard;
    }

    public void setYard(String yard) {
        this.yard = yard == null ? null : yard.trim();
    }

    public Integer getTestUser() {
        return testUser;
    }

    public void setTestUser(Integer testUser) {
        this.testUser = testUser;
    }

    public Integer getInputUser() {
        return inputUser;
    }

    public void setInputUser(Integer inputUser) {
        this.inputUser = inputUser;
    }

    public Integer getMaintainUser() {
        return maintainUser;
    }

    public void setMaintainUser(Integer maintainUser) {
        this.maintainUser = maintainUser;
    }

    public Double getMaintainNum() {
        return maintainNum;
    }

    public void setMaintainNum(Double maintainNum) {
        this.maintainNum = maintainNum;
    }

    public String getNewMaintainSerial() {
        return newMaintainSerial;
    }

    public void setNewMaintainSerial(String newMaintainSerial) {
        this.newMaintainSerial = newMaintainSerial == null ? null : newMaintainSerial.trim();
    }

    public String getFaultStorage() {
        return faultStorage;
    }

    public void setFaultStorage(String faultStorage) {
        this.faultStorage = faultStorage == null ? null : faultStorage.trim();
    }

    public Double getScrapNum() {
        return scrapNum;
    }

    public void setScrapNum(Double scrapNum) {
        this.scrapNum = scrapNum;
    }

    public String getChangeOriginal() {
        return changeOriginal;
    }

    public void setChangeOriginal(String changeOriginal) {
        this.changeOriginal = changeOriginal == null ? null : changeOriginal.trim();
    }

    public String getFaultRecord() {
        return faultRecord;
    }

    public void setFaultRecord(String faultRecord) {
        this.faultRecord = faultRecord == null ? null : faultRecord.trim();
    }

    public String getMaintainRecord() {
        return maintainRecord;
    }

    public void setMaintainRecord(String maintainRecord) {
        this.maintainRecord = maintainRecord == null ? null : maintainRecord.trim();
    }

    public BigDecimal getMaintainMoney() {
        return maintainMoney;
    }

    public void setMaintainMoney(BigDecimal maintainMoney) {
        this.maintainMoney = maintainMoney;
    }

    public String getRepairReason() {
        return repairReason;
    }

    public void setRepairReason(String repairReason) {
        this.repairReason = repairReason == null ? null : repairReason.trim();
    }

    public Date getInputNum() {
        return inputNum;
    }

    public void setInputNum(Date inputNum) {
        this.inputNum = inputNum;
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