package com.sanlly.warehouse.entity;

import java.math.BigDecimal;
import java.util.Date;

public class WareStock {
    private Integer wareStockId;

    private String stockinNo;

    private String company;

    private String warehouseType;

    private String warehouse;

    private String escrowCompany;

    private String storageLocation;

    private String sparePartsCategories;

    private String sparePartsNo;

    private String spareParts;

    private String sparePartsUnit;

    private Double length;

    private Double width;

    private String sparePartsBatch;

    private String sparePartsOriginalBatch;

    private Double entryNum;

    private Double surplusNum;

    private Double actualSurplusNum;

    private Double originalArea;

    private Double surplusArea;

    private BigDecimal invoicePrice;

    private BigDecimal core;

    private BigDecimal vat;

    private String tariffStatus;

    private BigDecimal tariff;

    private String tariffNo;

    private Date tariffDate;

    private BigDecimal freight;

    private BigDecimal unitPrice;

    private Date oldStockinDate;

    private Date stockinDate;

    private String remark;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private String sparePartsName;

    private String sparePartsType;

    private String suffix;

    private String suffixNo;

    public Integer getWareStockId() {
        return wareStockId;
    }

    public void setWareStockId(Integer wareStockId) {
        this.wareStockId = wareStockId;
    }

    public String getStockinNo() {
        return stockinNo;
    }

    public void setStockinNo(String stockinNo) {
        this.stockinNo = stockinNo == null ? null : stockinNo.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
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

    public String getEscrowCompany() {
        return escrowCompany;
    }

    public void setEscrowCompany(String escrowCompany) {
        this.escrowCompany = escrowCompany == null ? null : escrowCompany.trim();
    }

    public String getStorageLocation() {
        return storageLocation;
    }

    public void setStorageLocation(String storageLocation) {
        this.storageLocation = storageLocation == null ? null : storageLocation.trim();
    }

    public String getSparePartsCategories() {
        return sparePartsCategories;
    }

    public void setSparePartsCategories(String sparePartsCategories) {
        this.sparePartsCategories = sparePartsCategories == null ? null : sparePartsCategories.trim();
    }

    public String getSparePartsNo() {
        return sparePartsNo;
    }

    public void setSparePartsNo(String sparePartsNo) {
        this.sparePartsNo = sparePartsNo == null ? null : sparePartsNo.trim();
    }

    public String getSpareParts() {
        return spareParts;
    }

    public void setSpareParts(String spareParts) {
        this.spareParts = spareParts == null ? null : spareParts.trim();
    }

    public String getSparePartsUnit() {
        return sparePartsUnit;
    }

    public void setSparePartsUnit(String sparePartsUnit) {
        this.sparePartsUnit = sparePartsUnit == null ? null : sparePartsUnit.trim();
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

    public String getSparePartsBatch() {
        return sparePartsBatch;
    }

    public void setSparePartsBatch(String sparePartsBatch) {
        this.sparePartsBatch = sparePartsBatch == null ? null : sparePartsBatch.trim();
    }

    public String getSparePartsOriginalBatch() {
        return sparePartsOriginalBatch;
    }

    public void setSparePartsOriginalBatch(String sparePartsOriginalBatch) {
        this.sparePartsOriginalBatch = sparePartsOriginalBatch == null ? null : sparePartsOriginalBatch.trim();
    }

    public Double getEntryNum() {
        return entryNum;
    }

    public void setEntryNum(Double entryNum) {
        this.entryNum = entryNum;
    }

    public Double getSurplusNum() {
        return surplusNum;
    }

    public void setSurplusNum(Double surplusNum) {
        this.surplusNum = surplusNum;
    }

    public Double getActualSurplusNum() {
        return actualSurplusNum;
    }

    public void setActualSurplusNum(Double actualSurplusNum) {
        this.actualSurplusNum = actualSurplusNum;
    }

    public Double getOriginalArea() {
        return originalArea;
    }

    public void setOriginalArea(Double originalArea) {
        this.originalArea = originalArea;
    }

    public Double getSurplusArea() {
        return surplusArea;
    }

    public void setSurplusArea(Double surplusArea) {
        this.surplusArea = surplusArea;
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

    public BigDecimal getVat() {
        return vat;
    }

    public void setVat(BigDecimal vat) {
        this.vat = vat;
    }

    public String getTariffStatus() {
        return tariffStatus;
    }

    public void setTariffStatus(String tariffStatus) {
        this.tariffStatus = tariffStatus == null ? null : tariffStatus.trim();
    }

    public BigDecimal getTariff() {
        return tariff;
    }

    public void setTariff(BigDecimal tariff) {
        this.tariff = tariff;
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

    public BigDecimal getFreight() {
        return freight;
    }

    public void setFreight(BigDecimal freight) {
        this.freight = freight;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Date getOldStockinDate() {
        return oldStockinDate;
    }

    public void setOldStockinDate(Date oldStockinDate) {
        this.oldStockinDate = oldStockinDate;
    }

    public Date getStockinDate() {
        return stockinDate;
    }

    public void setStockinDate(Date stockinDate) {
        this.stockinDate = stockinDate;
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

    public String getSparePartsName() {
        return sparePartsName;
    }

    public void setSparePartsName(String sparePartsName) {
        this.sparePartsName = sparePartsName == null ? null : sparePartsName.trim();
    }

    public String getSparePartsType() {
        return sparePartsType;
    }

    public void setSparePartsType(String sparePartsType) {
        this.sparePartsType = sparePartsType == null ? null : sparePartsType.trim();
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix == null ? null : suffix.trim();
    }

    public String getSuffixNo() {
        return suffixNo;
    }

    public void setSuffixNo(String suffixNo) {
        this.suffixNo = suffixNo == null ? null : suffixNo.trim();
    }
}