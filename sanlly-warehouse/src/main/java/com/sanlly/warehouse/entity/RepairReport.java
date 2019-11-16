package com.sanlly.warehouse.entity;

import java.math.BigDecimal;
import java.util.Date;

public class RepairReport {
    private Integer wareRepairReportId;

    private Integer wareRepairStoreId;

    private String reportNo;

    private String processingUnit;

    private BigDecimal processingChargesTax;

    private String processingInvoiceType;

    private String manufacturer;

    private String company;

    private String repairDepartment;

    private String yard;

    private Integer testUser;

    private Integer recordUser;

    private Integer repairUser;

    private Double repairNum;

    private String newSerial;

    private String faultStorage;

    private Double wasteNum;

    private String changeOriginal;

    private String faultRecord;

    private String repairRecord;

    private BigDecimal repairAmount;

    private String repairReason;

    private String auditStatus;

    private String reasonsRejection;

    private String remark;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private Integer wareEntrustedProcessingId;

    public Integer getWareRepairReportId() {
        return wareRepairReportId;
    }

    public void setWareRepairReportId(Integer wareRepairReportId) {
        this.wareRepairReportId = wareRepairReportId;
    }

    public Integer getWareRepairStoreId() {
        return wareRepairStoreId;
    }

    public void setWareRepairStoreId(Integer wareRepairStoreId) {
        this.wareRepairStoreId = wareRepairStoreId;
    }

    public String getReportNo() {
        return reportNo;
    }

    public void setReportNo(String reportNo) {
        this.reportNo = reportNo == null ? null : reportNo.trim();
    }

    public String getProcessingUnit() {
        return processingUnit;
    }

    public void setProcessingUnit(String processingUnit) {
        this.processingUnit = processingUnit == null ? null : processingUnit.trim();
    }

    public BigDecimal getProcessingChargesTax() {
        return processingChargesTax;
    }

    public void setProcessingChargesTax(BigDecimal processingChargesTax) {
        this.processingChargesTax = processingChargesTax;
    }

    public String getProcessingInvoiceType() {
        return processingInvoiceType;
    }

    public void setProcessingInvoiceType(String processingInvoiceType) {
        this.processingInvoiceType = processingInvoiceType == null ? null : processingInvoiceType.trim();
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

    public String getRepairDepartment() {
        return repairDepartment;
    }

    public void setRepairDepartment(String repairDepartment) {
        this.repairDepartment = repairDepartment == null ? null : repairDepartment.trim();
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

    public Integer getRecordUser() {
        return recordUser;
    }

    public void setRecordUser(Integer recordUser) {
        this.recordUser = recordUser;
    }

    public Integer getRepairUser() {
        return repairUser;
    }

    public void setRepairUser(Integer repairUser) {
        this.repairUser = repairUser;
    }

    public Double getRepairNum() {
        return repairNum;
    }

    public void setRepairNum(Double repairNum) {
        this.repairNum = repairNum;
    }

    public String getNewSerial() {
        return newSerial;
    }

    public void setNewSerial(String newSerial) {
        this.newSerial = newSerial == null ? null : newSerial.trim();
    }

    public String getFaultStorage() {
        return faultStorage;
    }

    public void setFaultStorage(String faultStorage) {
        this.faultStorage = faultStorage == null ? null : faultStorage.trim();
    }

    public Double getWasteNum() {
        return wasteNum;
    }

    public void setWasteNum(Double wasteNum) {
        this.wasteNum = wasteNum;
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

    public String getRepairRecord() {
        return repairRecord;
    }

    public void setRepairRecord(String repairRecord) {
        this.repairRecord = repairRecord == null ? null : repairRecord.trim();
    }

    public BigDecimal getRepairAmount() {
        return repairAmount;
    }

    public void setRepairAmount(BigDecimal repairAmount) {
        this.repairAmount = repairAmount;
    }

    public String getRepairReason() {
        return repairReason;
    }

    public void setRepairReason(String repairReason) {
        this.repairReason = repairReason == null ? null : repairReason.trim();
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

    public Integer getWareEntrustedProcessingId() {
        return wareEntrustedProcessingId;
    }

    public void setWareEntrustedProcessingId(Integer wareEntrustedProcessingId) {
        this.wareEntrustedProcessingId = wareEntrustedProcessingId;
    }
}