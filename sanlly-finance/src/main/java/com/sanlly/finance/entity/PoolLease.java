package com.sanlly.finance.entity;

import java.math.BigDecimal;
import java.util.Date;

public class PoolLease {
    private Integer id;

    private String companyKey;

    private String yard;

    private String containerUser;

    private String chargeObject;

    private String customerName;

    private String sapid;

    private String contractPath;

    private String startMonth;

    private String endMonth;

    private String chargeTypeKey;

    private String chargeInoutType;

    private String chargecode;

    private String realCurrencyType;

    private String formulaType;

    private BigDecimal amount;

    private String deptKey;

    private String isEnabled;

    private String remarks;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private String deptCode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getContainerUser() {
        return containerUser;
    }

    public void setContainerUser(String containerUser) {
        this.containerUser = containerUser == null ? null : containerUser.trim();
    }

    public String getChargeObject() {
        return chargeObject;
    }

    public void setChargeObject(String chargeObject) {
        this.chargeObject = chargeObject == null ? null : chargeObject.trim();
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    public String getSapid() {
        return sapid;
    }

    public void setSapid(String sapid) {
        this.sapid = sapid == null ? null : sapid.trim();
    }

    public String getContractPath() {
        return contractPath;
    }

    public void setContractPath(String contractPath) {
        this.contractPath = contractPath == null ? null : contractPath.trim();
    }

    public String getStartMonth() {
        return startMonth;
    }

    public void setStartMonth(String startMonth) {
        this.startMonth = startMonth == null ? null : startMonth.trim();
    }

    public String getEndMonth() {
        return endMonth;
    }

    public void setEndMonth(String endMonth) {
        this.endMonth = endMonth == null ? null : endMonth.trim();
    }

    public String getChargeTypeKey() {
        return chargeTypeKey;
    }

    public void setChargeTypeKey(String chargeTypeKey) {
        this.chargeTypeKey = chargeTypeKey == null ? null : chargeTypeKey.trim();
    }

    public String getChargeInoutType() {
        return chargeInoutType;
    }

    public void setChargeInoutType(String chargeInoutType) {
        this.chargeInoutType = chargeInoutType == null ? null : chargeInoutType.trim();
    }

    public String getChargecode() {
        return chargecode;
    }

    public void setChargecode(String chargecode) {
        this.chargecode = chargecode == null ? null : chargecode.trim();
    }

    public String getRealCurrencyType() {
        return realCurrencyType;
    }

    public void setRealCurrencyType(String realCurrencyType) {
        this.realCurrencyType = realCurrencyType == null ? null : realCurrencyType.trim();
    }

    public String getFormulaType() {
        return formulaType;
    }

    public void setFormulaType(String formulaType) {
        this.formulaType = formulaType == null ? null : formulaType.trim();
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getDeptKey() {
        return deptKey;
    }

    public void setDeptKey(String deptKey) {
        this.deptKey = deptKey == null ? null : deptKey.trim();
    }

    public String getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(String isEnabled) {
        this.isEnabled = isEnabled == null ? null : isEnabled.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
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

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode == null ? null : deptCode.trim();
    }
}