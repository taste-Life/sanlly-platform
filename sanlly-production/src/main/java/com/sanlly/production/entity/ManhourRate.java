package com.sanlly.production.entity;

import java.math.BigDecimal;
import java.util.Date;

public class ManhourRate {
    private Integer prodManhourRateId;

    private String company;

    private String containerUser;

    private BigDecimal contbodyManhourRate;

    private String contbodyQuotedCurrency;

    private String contbodyRateCurrency;

    private BigDecimal contbodyExchangeRate;

    private BigDecimal unitManhourRate;

    private String unitQuotedCurrency;

    private String unitRateCurrency;

    private BigDecimal unitExchangeRate;

    private BigDecimal drycontManhourRate;

    private String drycontQuotedCurrency;

    private String drycontRateCurrency;

    private BigDecimal drycontExchangeRate;

    private BigDecimal ptiRate;

    private BigDecimal billDiscountRate;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private String remark;

    public Integer getProdManhourRateId() {
        return prodManhourRateId;
    }

    public void setProdManhourRateId(Integer prodManhourRateId) {
        this.prodManhourRateId = prodManhourRateId;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getContainerUser() {
        return containerUser;
    }

    public void setContainerUser(String containerUser) {
        this.containerUser = containerUser == null ? null : containerUser.trim();
    }

    public BigDecimal getContbodyManhourRate() {
        return contbodyManhourRate;
    }

    public void setContbodyManhourRate(BigDecimal contbodyManhourRate) {
        this.contbodyManhourRate = contbodyManhourRate;
    }

    public String getContbodyQuotedCurrency() {
        return contbodyQuotedCurrency;
    }

    public void setContbodyQuotedCurrency(String contbodyQuotedCurrency) {
        this.contbodyQuotedCurrency = contbodyQuotedCurrency == null ? null : contbodyQuotedCurrency.trim();
    }

    public String getContbodyRateCurrency() {
        return contbodyRateCurrency;
    }

    public void setContbodyRateCurrency(String contbodyRateCurrency) {
        this.contbodyRateCurrency = contbodyRateCurrency == null ? null : contbodyRateCurrency.trim();
    }

    public BigDecimal getContbodyExchangeRate() {
        return contbodyExchangeRate;
    }

    public void setContbodyExchangeRate(BigDecimal contbodyExchangeRate) {
        this.contbodyExchangeRate = contbodyExchangeRate;
    }

    public BigDecimal getUnitManhourRate() {
        return unitManhourRate;
    }

    public void setUnitManhourRate(BigDecimal unitManhourRate) {
        this.unitManhourRate = unitManhourRate;
    }

    public String getUnitQuotedCurrency() {
        return unitQuotedCurrency;
    }

    public void setUnitQuotedCurrency(String unitQuotedCurrency) {
        this.unitQuotedCurrency = unitQuotedCurrency == null ? null : unitQuotedCurrency.trim();
    }

    public String getUnitRateCurrency() {
        return unitRateCurrency;
    }

    public void setUnitRateCurrency(String unitRateCurrency) {
        this.unitRateCurrency = unitRateCurrency == null ? null : unitRateCurrency.trim();
    }

    public BigDecimal getUnitExchangeRate() {
        return unitExchangeRate;
    }

    public void setUnitExchangeRate(BigDecimal unitExchangeRate) {
        this.unitExchangeRate = unitExchangeRate;
    }

    public BigDecimal getDrycontManhourRate() {
        return drycontManhourRate;
    }

    public void setDrycontManhourRate(BigDecimal drycontManhourRate) {
        this.drycontManhourRate = drycontManhourRate;
    }

    public String getDrycontQuotedCurrency() {
        return drycontQuotedCurrency;
    }

    public void setDrycontQuotedCurrency(String drycontQuotedCurrency) {
        this.drycontQuotedCurrency = drycontQuotedCurrency == null ? null : drycontQuotedCurrency.trim();
    }

    public String getDrycontRateCurrency() {
        return drycontRateCurrency;
    }

    public void setDrycontRateCurrency(String drycontRateCurrency) {
        this.drycontRateCurrency = drycontRateCurrency == null ? null : drycontRateCurrency.trim();
    }

    public BigDecimal getDrycontExchangeRate() {
        return drycontExchangeRate;
    }

    public void setDrycontExchangeRate(BigDecimal drycontExchangeRate) {
        this.drycontExchangeRate = drycontExchangeRate;
    }

    public BigDecimal getPtiRate() {
        return ptiRate;
    }

    public void setPtiRate(BigDecimal ptiRate) {
        this.ptiRate = ptiRate;
    }

    public BigDecimal getBillDiscountRate() {
        return billDiscountRate;
    }

    public void setBillDiscountRate(BigDecimal billDiscountRate) {
        this.billDiscountRate = billDiscountRate;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}