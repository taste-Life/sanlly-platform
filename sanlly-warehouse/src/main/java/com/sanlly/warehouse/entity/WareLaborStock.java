package com.sanlly.warehouse.entity;

import java.math.BigDecimal;
import java.util.Date;

public class WareLaborStock {
    private Integer wareLaborStockId;

    private String laborStockNo;

    private String no;

    private String company;

    private String warehouseType;

    private String warehouse;

    private String storageLocation;

    private String spareParts;

    private String sparePartsCode;

    private String sparePartsOriginalCode;

    private String stockoutRestrictMonth;

    private Integer durableYears;

    private String isConsumable;

    private String model;

    private Double entryNum;

    private Double surplusNum;

    private Double actualSurplusNum;

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

    public Integer getWareLaborStockId() {
        return wareLaborStockId;
    }

    public void setWareLaborStockId(Integer wareLaborStockId) {
        this.wareLaborStockId = wareLaborStockId;
    }

    public String getLaborStockNo() {
        return laborStockNo;
    }

    public void setLaborStockNo(String laborStockNo) {
        this.laborStockNo = laborStockNo == null ? null : laborStockNo.trim();
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no == null ? null : no.trim();
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

    public String getStorageLocation() {
        return storageLocation;
    }

    public void setStorageLocation(String storageLocation) {
        this.storageLocation = storageLocation == null ? null : storageLocation.trim();
    }

    public String getSpareParts() {
        return spareParts;
    }

    public void setSpareParts(String spareParts) {
        this.spareParts = spareParts == null ? null : spareParts.trim();
    }

    public String getSparePartsCode() {
        return sparePartsCode;
    }

    public void setSparePartsCode(String sparePartsCode) {
        this.sparePartsCode = sparePartsCode == null ? null : sparePartsCode.trim();
    }

    public String getSparePartsOriginalCode() {
        return sparePartsOriginalCode;
    }

    public void setSparePartsOriginalCode(String sparePartsOriginalCode) {
        this.sparePartsOriginalCode = sparePartsOriginalCode == null ? null : sparePartsOriginalCode.trim();
    }

    public String getStockoutRestrictMonth() {
        return stockoutRestrictMonth;
    }

    public void setStockoutRestrictMonth(String stockoutRestrictMonth) {
        this.stockoutRestrictMonth = stockoutRestrictMonth == null ? null : stockoutRestrictMonth.trim();
    }

    public Integer getDurableYears() {
        return durableYears;
    }

    public void setDurableYears(Integer durableYears) {
        this.durableYears = durableYears;
    }

    public String getIsConsumable() {
        return isConsumable;
    }

    public void setIsConsumable(String isConsumable) {
        this.isConsumable = isConsumable == null ? null : isConsumable.trim();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
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
}