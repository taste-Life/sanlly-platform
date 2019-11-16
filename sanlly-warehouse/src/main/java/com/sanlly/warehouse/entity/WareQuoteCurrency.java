package com.sanlly.warehouse.entity;

import java.util.Date;

public class WareQuoteCurrency {
    private Integer wareQuoteCurrencyId;

    private String key;

    private String quoteCurrencyNo;

    private String quoteCurrencyNameEn;

    private String quoteCurrencyName;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getWareQuoteCurrencyId() {
        return wareQuoteCurrencyId;
    }

    public void setWareQuoteCurrencyId(Integer wareQuoteCurrencyId) {
        this.wareQuoteCurrencyId = wareQuoteCurrencyId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }

    public String getQuoteCurrencyNo() {
        return quoteCurrencyNo;
    }

    public void setQuoteCurrencyNo(String quoteCurrencyNo) {
        this.quoteCurrencyNo = quoteCurrencyNo == null ? null : quoteCurrencyNo.trim();
    }

    public String getQuoteCurrencyNameEn() {
        return quoteCurrencyNameEn;
    }

    public void setQuoteCurrencyNameEn(String quoteCurrencyNameEn) {
        this.quoteCurrencyNameEn = quoteCurrencyNameEn == null ? null : quoteCurrencyNameEn.trim();
    }

    public String getQuoteCurrencyName() {
        return quoteCurrencyName;
    }

    public void setQuoteCurrencyName(String quoteCurrencyName) {
        this.quoteCurrencyName = quoteCurrencyName == null ? null : quoteCurrencyName.trim();
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