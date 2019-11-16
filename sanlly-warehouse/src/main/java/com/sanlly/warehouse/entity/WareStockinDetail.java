package com.sanlly.warehouse.entity;

import java.math.BigDecimal;
import java.util.Date;

public class WareStockinDetail {
    private Integer wareStockinDetailId;

    private Integer wareStockinId;

    private String stockinBatch;

    private String sparePartsOriginalBatch;

    private String spareParts;

    private Double length;

    private Double width;

    private Double entryArea;

    private Double deliveryNum;

    private BigDecimal totalAmount;

    private Double entryNum;

    private String storageLocation;

    private BigDecimal tariff;

    private String tariffStatus;

    private String tariffNo;

    private Date tariffDate;

    private BigDecimal vat;

    private BigDecimal freight;

    private String warehouse;

    private String warehouseType;

    private BigDecimal invoicePrice;

    private BigDecimal core;

    private BigDecimal entryPrice;

    private Date oldStockinDate;

    private Integer isDel;

    private String remark;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private Double surplusNum;

    public Integer getWareStockinDetailId() {
        return wareStockinDetailId;
    }

    public void setWareStockinDetailId(Integer wareStockinDetailId) {
        this.wareStockinDetailId = wareStockinDetailId;
    }

    public Integer getWareStockinId() {
        return wareStockinId;
    }

    public void setWareStockinId(Integer wareStockinId) {
        this.wareStockinId = wareStockinId;
    }

    public String getStockinBatch() {
        return stockinBatch;
    }

    public void setStockinBatch(String stockinBatch) {
        this.stockinBatch = stockinBatch == null ? null : stockinBatch.trim();
    }

    public String getSparePartsOriginalBatch() {
        return sparePartsOriginalBatch;
    }

    public void setSparePartsOriginalBatch(String sparePartsOriginalBatch) {
        this.sparePartsOriginalBatch = sparePartsOriginalBatch == null ? null : sparePartsOriginalBatch.trim();
    }

    public String getSpareParts() {
        return spareParts;
    }

    public void setSpareParts(String spareParts) {
        this.spareParts = spareParts == null ? null : spareParts.trim();
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getEntryArea() {
        return entryArea;
    }

    public void setEntryArea(Double entryArea) {
        this.entryArea = entryArea;
    }

    public Double getDeliveryNum() {
        return deliveryNum;
    }

    public void setDeliveryNum(Double deliveryNum) {
        this.deliveryNum = deliveryNum;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Double getEntryNum() {
        return entryNum;
    }

    public void setEntryNum(Double entryNum) {
        this.entryNum = entryNum;
    }

    public String getStorageLocation() {
        return storageLocation;
    }

    public void setStorageLocation(String storageLocation) {
        this.storageLocation = storageLocation == null ? null : storageLocation.trim();
    }

    public BigDecimal getTariff() {
        return tariff;
    }

    public void setTariff(BigDecimal tariff) {
        this.tariff = tariff;
    }

    public String getTariffStatus() {
        return tariffStatus;
    }

    public void setTariffStatus(String tariffStatus) {
        this.tariffStatus = tariffStatus == null ? null : tariffStatus.trim();
    }

    public String getTariffNo() {
        return tariffNo;
    }

    public void setTariffNo(String tariffNo) {
        this.tariffNo = tariffNo == null ? null : tariffNo.trim();
    }

    public Date getTariffDate() {
        return tariffDate;
    }

    public void setTariffDate(Date tariffDate) {
        this.tariffDate = tariffDate;
    }

    public BigDecimal getVat() {
        return vat;
    }

    public void setVat(BigDecimal vat) {
        this.vat = vat;
    }

    public BigDecimal getFreight() {
        return freight;
    }

    public void setFreight(BigDecimal freight) {
        this.freight = freight;
    }

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse == null ? null : warehouse.trim();
    }

    public String getWarehouseType() {
        return warehouseType;
    }

    public void setWarehouseType(String warehouseType) {
        this.warehouseType = warehouseType == null ? null : warehouseType.trim();
    }

    public BigDecimal getInvoicePrice() {
        return invoicePrice;
    }

    public void setInvoicePrice(BigDecimal invoicePrice) {
        this.invoicePrice = invoicePrice;
    }

    public BigDecimal getCore() {
        return core;
    }

    public void setCore(BigDecimal core) {
        this.core = core;
    }

    public BigDecimal getEntryPrice() {
        return entryPrice;
    }

    public void setEntryPrice(BigDecimal entryPrice) {
        this.entryPrice = entryPrice;
    }

    public Date getOldStockinDate() {
        return oldStockinDate;
    }

    public void setOldStockinDate(Date oldStockinDate) {
        this.oldStockinDate = oldStockinDate;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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

    public Double getSurplusNum() {
        return surplusNum;
    }

    public void setSurplusNum(Double surplusNum) {
        this.surplusNum = surplusNum;
    }
}