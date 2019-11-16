package com.sanlly.finance.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Business {
    private Integer id;

    private String billCode;

    private String billMonth;

    private String billType;

    private String merchantsKey;

    private String containerUser;

    private String sapid;

    private String currencyType;

    private BigDecimal exchangeRate;

    private BigDecimal taxTotalCostUsd;

    private BigDecimal notaxTotalCostUsd;

    private BigDecimal taxTotalCostRmb;

    private BigDecimal notaxTotalCostRmb;

    private BigDecimal taxRate;

    private BigDecimal taxAmountUsd;

    private BigDecimal taxAmountRmb;

    private String remark;

    private String sourceTable;

    private String sourceBillCode;

    private Integer sourceBillId;

    private String versionNo;

    private String chargeInoutType;

    private Integer createBillUser;

    private String isEnabled;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBillCode() {
        return billCode;
    }

    public void setBillCode(String billCode) {
        this.billCode = billCode == null ? null : billCode.trim();
    }

    public String getBillMonth() {
        return billMonth;
    }

    public void setBillMonth(String billMonth) {
        this.billMonth = billMonth == null ? null : billMonth.trim();
    }

    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType == null ? null : billType.trim();
    }

    public String getMerchantsKey() {
        return merchantsKey;
    }

    public void setMerchantsKey(String merchantsKey) {
        this.merchantsKey = merchantsKey == null ? null : merchantsKey.trim();
    }

    public String getContainerUser() {
        return containerUser;
    }

    public void setContainerUser(String containerUser) {
        this.containerUser = containerUser == null ? null : containerUser.trim();
    }

    public String getSapid() {
        return sapid;
    }

    public void setSapid(String sapid) {
        this.sapid = sapid == null ? null : sapid.trim();
    }

    public String getCurrencyType() {
        return currencyType;
    }

    public void setCurrencyType(String currencyType) {
        this.currencyType = currencyType == null ? null : currencyType.trim();
    }

    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(BigDecimal exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public BigDecimal getTaxTotalCostUsd() {
        return taxTotalCostUsd;
    }

    public void setTaxTotalCostUsd(BigDecimal taxTotalCostUsd) {
        this.taxTotalCostUsd = taxTotalCostUsd;
    }

    public BigDecimal getNotaxTotalCostUsd() {
        return notaxTotalCostUsd;
    }

    public void setNotaxTotalCostUsd(BigDecimal notaxTotalCostUsd) {
        this.notaxTotalCostUsd = notaxTotalCostUsd;
    }

    public BigDecimal getTaxTotalCostRmb() {
        return taxTotalCostRmb;
    }

    public void setTaxTotalCostRmb(BigDecimal taxTotalCostRmb) {
        this.taxTotalCostRmb = taxTotalCostRmb;
    }

    public BigDecimal getNotaxTotalCostRmb() {
        return notaxTotalCostRmb;
    }

    public void setNotaxTotalCostRmb(BigDecimal notaxTotalCostRmb) {
        this.notaxTotalCostRmb = notaxTotalCostRmb;
    }

    public BigDecimal getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(BigDecimal taxRate) {
        this.taxRate = taxRate;
    }

    public BigDecimal getTaxAmountUsd() {
        return taxAmountUsd;
    }

    public void setTaxAmountUsd(BigDecimal taxAmountUsd) {
        this.taxAmountUsd = taxAmountUsd;
    }

    public BigDecimal getTaxAmountRmb() {
        return taxAmountRmb;
    }

    public void setTaxAmountRmb(BigDecimal taxAmountRmb) {
        this.taxAmountRmb = taxAmountRmb;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getSourceTable() {
        return sourceTable;
    }

    public void setSourceTable(String sourceTable) {
        this.sourceTable = sourceTable == null ? null : sourceTable.trim();
    }

    public String getSourceBillCode() {
        return sourceBillCode;
    }

    public void setSourceBillCode(String sourceBillCode) {
        this.sourceBillCode = sourceBillCode == null ? null : sourceBillCode.trim();
    }

    public Integer getSourceBillId() {
        return sourceBillId;
    }

    public void setSourceBillId(Integer sourceBillId) {
        this.sourceBillId = sourceBillId;
    }

    public String getVersionNo() {
        return versionNo;
    }

    public void setVersionNo(String versionNo) {
        this.versionNo = versionNo == null ? null : versionNo.trim();
    }

    public String getChargeInoutType() {
        return chargeInoutType;
    }

    public void setChargeInoutType(String chargeInoutType) {
        this.chargeInoutType = chargeInoutType == null ? null : chargeInoutType.trim();
    }

    public Integer getCreateBillUser() {
        return createBillUser;
    }

    public void setCreateBillUser(Integer createBillUser) {
        this.createBillUser = createBillUser;
    }

    public String getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(String isEnabled) {
        this.isEnabled = isEnabled == null ? null : isEnabled.trim();
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