package com.sanlly.finance.entity;

import java.math.BigDecimal;
import java.util.Date;

public class BaseMerchants {
    private Integer id;

    private String merchantsKey;

    private String merchantsName;

    private String merchantssubName;

    private String merchantsNameEn;

    private String merchantsSubNameEn;

    private String sapid;

    private String companyKey;

    private BigDecimal creditDate;

    private String remark;

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

    public String getMerchantsKey() {
        return merchantsKey;
    }

    public void setMerchantsKey(String merchantsKey) {
        this.merchantsKey = merchantsKey == null ? null : merchantsKey.trim();
    }

    public String getMerchantsName() {
        return merchantsName;
    }

    public void setMerchantsName(String merchantsName) {
        this.merchantsName = merchantsName == null ? null : merchantsName.trim();
    }

    public String getMerchantssubName() {
        return merchantssubName;
    }

    public void setMerchantssubName(String merchantssubName) {
        this.merchantssubName = merchantssubName == null ? null : merchantssubName.trim();
    }

    public String getMerchantsNameEn() {
        return merchantsNameEn;
    }

    public void setMerchantsNameEn(String merchantsNameEn) {
        this.merchantsNameEn = merchantsNameEn == null ? null : merchantsNameEn.trim();
    }

    public String getMerchantsSubNameEn() {
        return merchantsSubNameEn;
    }

    public void setMerchantsSubNameEn(String merchantsSubNameEn) {
        this.merchantsSubNameEn = merchantsSubNameEn == null ? null : merchantsSubNameEn.trim();
    }

    public String getSapid() {
        return sapid;
    }

    public void setSapid(String sapid) {
        this.sapid = sapid == null ? null : sapid.trim();
    }

    public String getCompanyKey() {
        return companyKey;
    }

    public void setCompanyKey(String companyKey) {
        this.companyKey = companyKey == null ? null : companyKey.trim();
    }

    public BigDecimal getCreditDate() {
        return creditDate;
    }

    public void setCreditDate(BigDecimal creditDate) {
        this.creditDate = creditDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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