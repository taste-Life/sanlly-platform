package com.sanlly.warehouse.entity;

import java.math.BigDecimal;
import java.util.Date;

public class WareEntrustedProcessingProduc {
    private Integer wareEntrustedProcessingProducId;

    private String entrustedProcessingNo;

    private String spareParts;

    private String warehouseType;

    private String warehouse;

    private String company;

    private String entryStatus;

    private Double entryLength;

    private Double entryWide;

    private Double entryNum;

    private BigDecimal entryPrice;

    private BigDecimal invoicePrice;

    private BigDecimal processingCharges;

    private BigDecimal vat;

    private BigDecimal totalAmount;

    private String remark;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getWareEntrustedProcessingProducId() {
        return wareEntrustedProcessingProducId;
    }

    public void setWareEntrustedProcessingProducId(Integer wareEntrustedProcessingProducId) {
        this.wareEntrustedProcessingProducId = wareEntrustedProcessingProducId;
    }

    public String getEntrustedProcessingNo() {
        return entrustedProcessingNo;
    }

    public void setEntrustedProcessingNo(String entrustedProcessingNo) {
        this.entrustedProcessingNo = entrustedProcessingNo == null ? null : entrustedProcessingNo.trim();
    }

    public String getSpareParts() {
        return spareParts;
    }

    public void setSpareParts(String spareParts) {
        this.spareParts = spareParts == null ? null : spareParts.trim();
    }

    public String getWarehouseType() {
        return warehouseType;
    }

    public void setWarehouseType(String warehouseType) {
        this.warehouseType = warehouseType == null ? null : warehouseType.trim();
    }

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse == null ? null : warehouse.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getEntryStatus() {
        return entryStatus;
    }

    public void setEntryStatus(String entryStatus) {
        this.entryStatus = entryStatus == null ? null : entryStatus.trim();
    }

    public Double getEntryLength() {
        return entryLength;
    }

    public void setEntryLength(Double entryLength) {
        this.entryLength = entryLength;
    }

    public Double getEntryWide() {
        return entryWide;
    }

    public void setEntryWide(Double entryWide) {
        this.entryWide = entryWide;
    }

    public Double getEntryNum() {
        return entryNum;
    }

    public void setEntryNum(Double entryNum) {
        this.entryNum = entryNum;
    }

    public BigDecimal getEntryPrice() {
        return entryPrice;
    }

    public void setEntryPrice(BigDecimal entryPrice) {
        this.entryPrice = entryPrice;
    }

    public BigDecimal getInvoicePrice() {
        return invoicePrice;
    }

    public void setInvoicePrice(BigDecimal invoicePrice) {
        this.invoicePrice = invoicePrice;
    }

    public BigDecimal getProcessingCharges() {
        return processingCharges;
    }

    public void setProcessingCharges(BigDecimal processingCharges) {
        this.processingCharges = processingCharges;
    }

    public BigDecimal getVat() {
        return vat;
    }

    public void setVat(BigDecimal vat) {
        this.vat = vat;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
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