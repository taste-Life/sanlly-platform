package com.sanlly.purchase.entity;

import java.util.Date;

public class SupplierTypeRelational {
    private Integer purcSupplierTypeRelationalId;

    private String supplier;

    private String supplierType;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getPurcSupplierTypeRelationalId() {
        return purcSupplierTypeRelationalId;
    }

    public void setPurcSupplierTypeRelationalId(Integer purcSupplierTypeRelationalId) {
        this.purcSupplierTypeRelationalId = purcSupplierTypeRelationalId;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier == null ? null : supplier.trim();
    }

    public String getSupplierType() {
        return supplierType;
    }

    public void setSupplierType(String supplierType) {
        this.supplierType = supplierType == null ? null : supplierType.trim();
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