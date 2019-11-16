package com.sanlly.warehouse.models.input.repair;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @author lishzh
 */
public class RepairReportInput {
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

    private List<ReportDetailInput> details;

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
        this.reportNo = reportNo;
    }

    public String getProcessingUnit() {
        return processingUnit;
    }

    public void setProcessingUnit(String processingUnit) {
        this.processingUnit = processingUnit;
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
        this.processingInvoiceType = processingInvoiceType;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getRepairDepartment() {
        return repairDepartment;
    }

    public void setRepairDepartment(String repairDepartment) {
        this.repairDepartment = repairDepartment;
    }

    public String getYard() {
        return yard;
    }

    public void setYard(String yard) {
        this.yard = yard;
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
        this.newSerial = newSerial;
    }

    public String getFaultStorage() {
        return faultStorage;
    }

    public void setFaultStorage(String faultStorage) {
        this.faultStorage = faultStorage;
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
        this.changeOriginal = changeOriginal;
    }

    public String getFaultRecord() {
        return faultRecord;
    }

    public void setFaultRecord(String faultRecord) {
        this.faultRecord = faultRecord;
    }

    public String getRepairRecord() {
        return repairRecord;
    }

    public void setRepairRecord(String repairRecord) {
        this.repairRecord = repairRecord;
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
        this.repairReason = repairReason;
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

    public List<ReportDetailInput> getDetails() {
        return details;
    }

    public void setDetails(List<ReportDetailInput> details) {
        this.details = details;
    }
}
