package com.sanlly.purchase.entity;

import java.util.Date;

public class SupplierSpecial {
    private Integer supplierSpecialId;

    private String supplier;

    private String firstSpecial;

    private String secondSpecial;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getSupplierSpecialId() {
        return supplierSpecialId;
    }

    public void setSupplierSpecialId(Integer supplierSpecialId) {
        this.supplierSpecialId = supplierSpecialId;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier == null ? null : supplier.trim();
    }

    public String getFirstSpecial() {
        return firstSpecial;
    }

    public void setFirstSpecial(String firstSpecial) {
        this.firstSpecial = firstSpecial == null ? null : firstSpecial.trim();
    }

    public String getSecondSpecial() {
        return secondSpecial;
    }

    public void setSecondSpecial(String secondSpecial) {
        this.secondSpecial = secondSpecial == null ? null : secondSpecial.trim();
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