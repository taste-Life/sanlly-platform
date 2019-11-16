package com.sanlly.finance.entity;

import java.math.BigDecimal;
import java.util.Date;

public class BusinessDetail {
    private Integer businessDetaillId;

    private Integer businessId;

    private String prodCourseId;

    private String billCode;

    private String chargeTypeKey;

    private String merchantsKey;

    private String sapid;

    private String currencyType;

    private BigDecimal exchangeRate;

    private BigDecimal taxRate;

    private BigDecimal taxAmount;

    private BigDecimal amountRmb;

    private BigDecimal amountUsd;

    private String invoiceType;

    private String remarks;

    private String deptKey;

    private String deptCode;

    private String versionNo;

    private String companyKey;

    private String yard;

    private String chargeInoutType;

    private String interfaceType;

    private String legacyDocType;

    private String billMonth;

    private String containerUser;

    private String sourceTable;

    private String sourceBillCode;

    private Integer sourceBillId;

    private BigDecimal netAmount;

    private Integer billAuditor;

    private Date billAuditorTime;

    private String materialCode;

    private String materialName;

    private BigDecimal materialPrice;

    private BigDecimal number;

    private Date inBillTime;

    private Integer inBillUser;

    private Integer createBillUser;

    private String isEnabled;

    private Integer isDel;

    private String freeStatus;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getBusinessDetaillId() {
        return businessDetaillId;
    }

    public void setBusinessDetaillId(Integer businessDetaillId) {
        this.businessDetaillId = businessDetaillId;
    }

    public Integer getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Integer businessId) {
        this.businessId = businessId;
    }

    public String getProdCourseId() {
        return prodCourseId;
    }

    public void setProdCourseId(String prodCourseId) {
        this.prodCourseId = prodCourseId == null ? null : prodCourseId.trim();
    }

    public String getBillCode() {
        return billCode;
    }

    public void setBillCode(String billCode) {
        this.billCode = billCode == null ? null : billCode.trim();
    }

    public String getChargeTypeKey() {
        return chargeTypeKey;
    }

    public void setChargeTypeKey(String chargeTypeKey) {
        this.chargeTypeKey = chargeTypeKey == null ? null : chargeTypeKey.trim();
    }

    public String getMerchantsKey() {
        return merchantsKey;
    }

    public void setMerchantsKey(String merchantsKey) {
        this.merchantsKey = merchantsKey == null ? null : merchantsKey.trim();
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

    public BigDecimal getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(BigDecimal taxRate) {
        this.taxRate = taxRate;
    }

    public BigDecimal getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(BigDecimal taxAmount) {
        this.taxAmount = taxAmount;
    }

    public BigDecimal getAmountRmb() {
        return amountRmb;
    }

    public void setAmountRmb(BigDecimal amountRmb) {
        this.amountRmb = amountRmb;
    }

    public BigDecimal getAmountUsd() {
        return amountUsd;
    }

    public void setAmountUsd(BigDecimal amountUsd) {
        this.amountUsd = amountUsd;
    }

    public String getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType == null ? null : invoiceType.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getDeptKey() {
        return deptKey;
    }

    public void setDeptKey(String deptKey) {
        this.deptKey = deptKey == null ? null : deptKey.trim();
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode == null ? null : deptCode.trim();
    }

    public String getVersionNo() {
        return versionNo;
    }

    public void setVersionNo(String versionNo) {
        this.versionNo = versionNo == null ? null : versionNo.trim();
    }

    public String getCompanyKey() {
        return companyKey;
    }

    public void setCompanyKey(String companyKey) {
        this.companyKey = companyKey == null ? null : companyKey.trim();
    }

    public String getYard() {
        return yard;
    }

    public void setYard(String yard) {
        this.yard = yard == null ? null : yard.trim();
    }

    public String getChargeInoutType() {
        return chargeInoutType;
    }

    public void setChargeInoutType(String chargeInoutType) {
        this.chargeInoutType = chargeInoutType == null ? null : chargeInoutType.trim();
    }

    public String getInterfaceType() {
        return interfaceType;
    }

    public void setInterfaceType(String interfaceType) {
        this.interfaceType = interfaceType == null ? null : interfaceType.trim();
    }

    public String getLegacyDocType() {
        return legacyDocType;
    }

    public void setLegacyDocType(String legacyDocType) {
        this.legacyDocType = legacyDocType == null ? null : legacyDocType.trim();
    }

    public String getBillMonth() {
        return billMonth;
    }

    public void setBillMonth(String billMonth) {
        this.billMonth = billMonth == null ? null : billMonth.trim();
    }

    public String getContainerUser() {
        return containerUser;
    }

    public void setContainerUser(String containerUser) {
        this.containerUser = containerUser == null ? null : containerUser.trim();
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

    public BigDecimal getNetAmount() {
        return netAmount;
    }

    public void setNetAmount(BigDecimal netAmount) {
        this.netAmount = netAmount;
    }

    public Integer getBillAuditor() {
        return billAuditor;
    }

    public void setBillAuditor(Integer billAuditor) {
        this.billAuditor = billAuditor;
    }

    public Date getBillAuditorTime() {
        return billAuditorTime;
    }

    public void setBillAuditorTime(Date billAuditorTime) {
        this.billAuditorTime = billAuditorTime;
    }

    public String getMaterialCode() {
        return materialCode;
    }

    public void setMaterialCode(String materialCode) {
        this.materialCode = materialCode == null ? null : materialCode.trim();
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName == null ? null : materialName.trim();
    }

    public BigDecimal getMaterialPrice() {
        return materialPrice;
    }

    public void setMaterialPrice(BigDecimal materialPrice) {
        this.materialPrice = materialPrice;
    }

    public BigDecimal getNumber() {
        return number;
    }

    public void setNumber(BigDecimal number) {
        this.number = number;
    }

    public Date getInBillTime() {
        return inBillTime;
    }

    public void setInBillTime(Date inBillTime) {
        this.inBillTime = inBillTime;
    }

    public Integer getInBillUser() {
        return inBillUser;
    }

    public void setInBillUser(Integer inBillUser) {
        this.inBillUser = inBillUser;
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

    public String getFreeStatus() {
        return freeStatus;
    }

    public void setFreeStatus(String freeStatus) {
        this.freeStatus = freeStatus == null ? null : freeStatus.trim();
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