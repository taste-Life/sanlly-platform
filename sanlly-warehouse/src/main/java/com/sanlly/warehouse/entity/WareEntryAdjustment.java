package com.sanlly.warehouse.entity;

import java.math.BigDecimal;
import java.util.Date;

public class WareEntryAdjustment {
    private Integer wareEntryAdjustmentId;

    private String entryAdjustmentNo;

    private String stockinNo;

    private String adjustmentStatus;

    private Integer adjustmentPerson;

    private String company;

    private String entryWarehouse;

    private String billType;

    private String oldInvoice;

    private String adjustmentInvoice;

    private BigDecimal oldFreight;

    private BigDecimal adjustmentFreight;

    private BigDecimal billTotalAmount;

    private BigDecimal tariff;

    private BigDecimal vat;

    private String auditStatus;

    private Integer isDel;

    private String reasonsRejection;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getWareEntryAdjustmentId() {
        return wareEntryAdjustmentId;
    }

    public void setWareEntryAdjustmentId(Integer wareEntryAdjustmentId) {
        this.wareEntryAdjustmentId = wareEntryAdjustmentId;
    }

    public String getEntryAdjustmentNo() {
        return entryAdjustmentNo;
    }

    public void setEntryAdjustmentNo(String entryAdjustmentNo) {
        this.entryAdjustmentNo = entryAdjustmentNo == null ? null : entryAdjustmentNo.trim();
    }

    public String getStockinNo() {
        return stockinNo;
    }

    public void setStockinNo(String stockinNo) {
        this.stockinNo = stockinNo == null ? null : stockinNo.trim();
    }

    public String getAdjustmentStatus() {
        return adjustmentStatus;
    }

    public void setAdjustmentStatus(String adjustmentStatus) {
        this.adjustmentStatus = adjustmentStatus == null ? null : adjustmentStatus.trim();
    }

    public Integer getAdjustmentPerson() {
        return adjustmentPerson;
    }

    public void setAdjustmentPerson(Integer adjustmentPerson) {
        this.adjustmentPerson = adjustmentPerson;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getEntryWarehouse() {
        return entryWarehouse;
    }

    public void setEntryWarehouse(String entryWarehouse) {
        this.entryWarehouse = entryWarehouse == null ? null : entryWarehouse.trim();
    }

    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType == null ? null : billType.trim();
    }

    public String getOldInvoice() {
        return oldInvoice;
    }

    public void setOldInvoice(String oldInvoice) {
        this.oldInvoice = oldInvoice == null ? null : oldInvoice.trim();
    }

    public String getAdjustmentInvoice() {
        return adjustmentInvoice;
    }

    public void setAdjustmentInvoice(String adjustmentInvoice) {
        this.adjustmentInvoice = adjustmentInvoice == null ? null : adjustmentInvoice.trim();
    }

    public BigDecimal getOldFreight() {
        return oldFreight;
    }

    public void setOldFreight(BigDecimal oldFreight) {
        this.oldFreight = oldFreight;
    }

    public BigDecimal getAdjustmentFreight() {
        return adjustmentFreight;
    }

    public void setAdjustmentFreight(BigDecimal adjustmentFreight) {
        this.adjustmentFreight = adjustmentFreight;
    }

    public BigDecimal getBillTotalAmount() {
        return billTotalAmount;
    }

    public void setBillTotalAmount(BigDecimal billTotalAmount) {
        this.billTotalAmount = billTotalAmount;
    }

    public BigDecimal getTariff() {
        return tariff;
    }

    public void setTariff(BigDecimal tariff) {
        this.tariff = tariff;
    }

    public BigDecimal getVat() {
        return vat;
    }

    public void setVat(BigDecimal vat) {
        this.vat = vat;
    }

    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus == null ? null : auditStatus.trim();
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public String getReasonsRejection() {
        return reasonsRejection;
    }

    public void setReasonsRejection(String reasonsRejection) {
        this.reasonsRejection = reasonsRejection == null ? null : reasonsRejection.trim();
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