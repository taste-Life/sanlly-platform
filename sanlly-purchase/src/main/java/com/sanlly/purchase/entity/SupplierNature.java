package com.sanlly.purchase.entity;

import java.util.Date;

public class SupplierNature {
    private Integer purcSupplierNatureId;

    private String key;

    private String supplierNatureName;

    private String supplierNatureEn;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getPurcSupplierNatureId() {
        return purcSupplierNatureId;
    }

    public void setPurcSupplierNatureId(Integer purcSupplierNatureId) {
        this.purcSupplierNatureId = purcSupplierNatureId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }

    public String getSupplierNatureName() {
        return supplierNatureName;
    }

    public void setSupplierNatureName(String supplierNatureName) {
        this.supplierNatureName = supplierNatureName == null ? null : supplierNatureName.trim();
    }

    public String getSupplierNatureEn() {
        return supplierNatureEn;
    }

    public void setSupplierNatureEn(String supplierNatureEn) {
        this.supplierNatureEn = supplierNatureEn == null ? null : supplierNatureEn.trim();
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