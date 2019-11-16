package com.sanlly.warehouse.entity;

import java.math.BigDecimal;
import java.util.Date;

public class EntrustProcess {
    private Integer wareEntrustedProcessingId;

    private String entrustedProcessingNo;

    private String company;

    private String processingUnit;

    private String entrustedProcessingType;

    private String processingInvoiceType;

    private BigDecimal processingChargesTax;

    private BigDecimal processingChargesVat;

    private BigDecimal processingCharges;

    private BigDecimal stockoutAmount;

    private BigDecimal entryAmount;

    private String billStatus;

    private String remark;

    private String auditStatus;

    private String reasonsRejection;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getWareEntrustedProcessingId() {
        return wareEntrustedProcessingId;
    }

    public void setWareEntrustedProcessingId(Integer wareEntrustedProcessingId) {
        this.wareEntrustedProcessingId = wareEntrustedProcessingId;
    }

    public String getEntrustedProcessingNo() {
        return entrustedProcessingNo;
    }

    public void setEntrustedProcessingNo(String entrustedProcessingNo) {
        this.entrustedProcessingNo = entrustedProcessingNo == null ? null : entrustedProcessingNo.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getProcessingUnit() {
        return processingUnit;
    }

    public void setProcessingUnit(String processingUnit) {
        this.processingUnit = processingUnit == null ? null : processingUnit.trim();
    }

    public String getEntrustedProcessingType() {
        return entrustedProcessingType;
    }

    public void setEntrustedProcessingType(String entrustedProcessingType) {
        this.entrustedProcessingType = entrustedProcessingType == null ? null : entrustedProcessingType.trim();
    }

    public String getProcessingInvoiceType() {
        return processingInvoiceType;
    }

    public void setProcessingInvoiceType(String processingInvoiceType) {
        this.processingInvoiceType = processingInvoiceType == null ? null : processingInvoiceType.trim();
    }

    public BigDecimal getProcessingChargesTax() {
        return processingChargesTax;
    }

    public void setProcessingChargesTax(BigDecimal processingChargesTax) {
        this.processingChargesTax = processingChargesTax;
    }

    public BigDecimal getProcessingChargesVat() {
        return processingChargesVat;
    }

    public void setProcessingChargesVat(BigDecimal processingChargesVat) {
        this.processingChargesVat = processingChargesVat;
    }

    public BigDecimal getProcessingCharges() {
        return processingCharges;
    }

    public void setProcessingCharges(BigDecimal processingCharges) {
        this.processingCharges = processingCharges;
    }

    public BigDecimal getStockoutAmount() {
        return stockoutAmount;
    }

    public void setStockoutAmount(BigDecimal stockoutAmount) {
        this.stockoutAmount = stockoutAmount;
    }

    public BigDecimal getEntryAmount() {
        return entryAmount;
    }

    public void setEntryAmount(BigDecimal entryAmount) {
        this.entryAmount = entryAmount;
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