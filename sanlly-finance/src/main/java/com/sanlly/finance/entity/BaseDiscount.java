package com.sanlly.finance.entity;

import java.math.BigDecimal;
import java.util.Date;

public class BaseDiscount {
    private Integer id;

    private String companyKey;

    private String yard;

    private String containerUser;

    private BigDecimal discountXt;

    private BigDecimal discountJz;

    private BigDecimal discountGx;

    private String remarks;

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

    public BigDecimal getDiscountXt() {
        return discountXt;
    }

    public void setDiscountXt(BigDecimal discountXt) {
        this.discountXt = discountXt;
    }

    public BigDecimal getDiscountJz() {
        return discountJz;
    }

    public void setDiscountJz(BigDecimal discountJz) {
        this.discountJz = discountJz;
    }

    public BigDecimal getDiscountGx() {
        return discountGx;
    }

    public void setDiscountGx(BigDecimal discountGx) {
        this.discountGx = discountGx;
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