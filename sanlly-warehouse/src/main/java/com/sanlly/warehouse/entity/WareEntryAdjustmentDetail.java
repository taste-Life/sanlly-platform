package com.sanlly.warehouse.entity;

import java.math.BigDecimal;
import java.util.Date;

public class WareEntryAdjustmentDetail {
    private Integer wareReturnWarehouseDetailId;

    private Integer entryAdjustment;

    private String spareParts;

    private String oldWarehouseType;

    private String adjustmentWarehouseType;

    private BigDecimal oldVat;

    private BigDecimal adjustmentVat;

    private Double oldNum;

    private Double adjustmentNum;

    private BigDecimal oldTariff;

    private BigDecimal adjustmentTariff;

    private BigDecimal oldFreight;

    private BigDecimal adjustmentFreight;

    private BigDecimal invoicePrice;

    private BigDecimal entryPrice;

    private BigDecimal totalAmount;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Integer updateUser;

    private Date updateTime;

    public Integer getWareReturnWarehouseDetailId() {
        return wareReturnWarehouseDetailId;
    }

    public void setWareReturnWarehouseDetailId(Integer wareReturnWarehouseDetailId) {
        this.wareReturnWarehouseDetailId = wareReturnWarehouseDetailId;
    }

    public Integer getEntryAdjustment() {
        return entryAdjustment;
    }

    public void setEntryAdjustment(Integer entryAdjustment) {
        this.entryAdjustment = entryAdjustment;
    }

    public String getSpareParts() {
        return spareParts;
    }

    public void setSpareParts(String spareParts) {
        this.spareParts = spareParts == null ? null : spareParts.trim();
    }

    public String getOldWarehouseType() {
        return oldWarehouseType;
    }

    public void setOldWarehouseType(String oldWarehouseType) {
        this.oldWarehouseType = oldWarehouseType == null ? null : oldWarehouseType.trim();
    }

    public String getAdjustmentWarehouseType() {
        return adjustmentWarehouseType;
    }

    public void setAdjustmentWarehouseType(String adjustmentWarehouseType) {
        this.adjustmentWarehouseType = adjustmentWarehouseType == null ? null : adjustmentWarehouseType.trim();
    }

    public BigDecimal getOldVat() {
        return oldVat;
    }

    public void setOldVat(BigDecimal oldVat) {
        this.oldVat = oldVat;
    }

    public BigDecimal getAdjustmentVat() {
        return adjustmentVat;
    }

    public void setAdjustmentVat(BigDecimal adjustmentVat) {
        this.adjustmentVat = adjustmentVat;
    }

    public Double getOldNum() {
        return oldNum;
    }

    public void setOldNum(Double oldNum) {
        this.oldNum = oldNum;
    }

    public Double getAdjustmentNum() {
        return adjustmentNum;
    }

    public void setAdjustmentNum(Double adjustmentNum) {
        this.adjustmentNum = adjustmentNum;
    }

    public BigDecimal getOldTariff() {
        return oldTariff;
    }

    public void setOldTariff(BigDecimal oldTariff) {
        this.oldTariff = oldTariff;
    }

    public BigDecimal getAdjustmentTariff() {
        return adjustmentTariff;
    }

    public void setAdjustmentTariff(BigDecimal adjustmentTariff) {
        this.adjustmentTariff = adjustmentTariff;
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

    public BigDecimal getInvoicePrice() {
        return invoicePrice;
    }

    public void setInvoicePrice(BigDecimal invoicePrice) {
        this.invoicePrice = invoicePrice;
    }

    public BigDecimal getEntryPrice() {
        return entryPrice;
    }

    public void setEntryPrice(BigDecimal entryPrice) {
        this.entryPrice = entryPrice;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
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

    public Integer getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}