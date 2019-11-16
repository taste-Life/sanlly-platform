package com.sanlly.finance.entity;

import java.math.BigDecimal;
import java.util.Date;

public class BasePtiRate {
    private Integer id;

    private String companyKey;

    private String containerUser;

    private String yard;

    private String containerSize;

    private String ptiType;

    private String currencyType;

    private BigDecimal receivable;

    private String isFormulaYs;

    private String computeFormulaYs;

    private String currencyTypeYs;

    private String optionValueYs;

    private String payCurrencyType;

    private BigDecimal payFee;

    private String isFormulaYf;

    private String computeFormulaYf;

    private String currencyTypeYf;

    private String optionValueYf;

    private String remarks;

    private String isEnabled;

    private Integer isDel;

    private String freeStatus;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private Integer status;

    private String formulaYs;

    private String formulaYf;

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

    public String getContainerUser() {
        return containerUser;
    }

    public void setContainerUser(String containerUser) {
        this.containerUser = containerUser == null ? null : containerUser.trim();
    }

    public String getYard() {
        return yard;
    }

    public void setYard(String yard) {
        this.yard = yard == null ? null : yard.trim();
    }

    public String getContainerSize() {
        return containerSize;
    }

    public void setContainerSize(String containerSize) {
        this.containerSize = containerSize == null ? null : containerSize.trim();
    }

    public String getPtiType() {
        return ptiType;
    }

    public void setPtiType(String ptiType) {
        this.ptiType = ptiType == null ? null : ptiType.trim();
    }

    public String getCurrencyType() {
        return currencyType;
    }

    public void setCurrencyType(String currencyType) {
        this.currencyType = currencyType == null ? null : currencyType.trim();
    }

    public BigDecimal getReceivable() {
        return receivable;
    }

    public void setReceivable(BigDecimal receivable) {
        this.receivable = receivable;
    }

    public String getIsFormulaYs() {
        return isFormulaYs;
    }

    public void setIsFormulaYs(String isFormulaYs) {
        this.isFormulaYs = isFormulaYs == null ? null : isFormulaYs.trim();
    }

    public String getComputeFormulaYs() {
        return computeFormulaYs;
    }

    public void setComputeFormulaYs(String computeFormulaYs) {
        this.computeFormulaYs = computeFormulaYs == null ? null : computeFormulaYs.trim();
    }

    public String getCurrencyTypeYs() {
        return currencyTypeYs;
    }

    public void setCurrencyTypeYs(String currencyTypeYs) {
        this.currencyTypeYs = currencyTypeYs == null ? null : currencyTypeYs.trim();
    }

    public String getOptionValueYs() {
        return optionValueYs;
    }

    public void setOptionValueYs(String optionValueYs) {
        this.optionValueYs = optionValueYs == null ? null : optionValueYs.trim();
    }

    public String getPayCurrencyType() {
        return payCurrencyType;
    }

    public void setPayCurrencyType(String payCurrencyType) {
        this.payCurrencyType = payCurrencyType == null ? null : payCurrencyType.trim();
    }

    public BigDecimal getPayFee() {
        return payFee;
    }

    public void setPayFee(BigDecimal payFee) {
        this.payFee = payFee;
    }

    public String getIsFormulaYf() {
        return isFormulaYf;
    }

    public void setIsFormulaYf(String isFormulaYf) {
        this.isFormulaYf = isFormulaYf == null ? null : isFormulaYf.trim();
    }

    public String getComputeFormulaYf() {
        return computeFormulaYf;
    }

    public void setComputeFormulaYf(String computeFormulaYf) {
        this.computeFormulaYf = computeFormulaYf == null ? null : computeFormulaYf.trim();
    }

    public String getCurrencyTypeYf() {
        return currencyTypeYf;
    }

    public void setCurrencyTypeYf(String currencyTypeYf) {
        this.currencyTypeYf = currencyTypeYf == null ? null : currencyTypeYf.trim();
    }

    public String getOptionValueYf() {
        return optionValueYf;
    }

    public void setOptionValueYf(String optionValueYf) {
        this.optionValueYf = optionValueYf == null ? null : optionValueYf.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getFormulaYs() {
        return formulaYs;
    }

    public void setFormulaYs(String formulaYs) {
        this.formulaYs = formulaYs == null ? null : formulaYs.trim();
    }

    public String getFormulaYf() {
        return formulaYf;
    }

    public void setFormulaYf(String formulaYf) {
        this.formulaYf = formulaYf == null ? null : formulaYf.trim();
    }
}