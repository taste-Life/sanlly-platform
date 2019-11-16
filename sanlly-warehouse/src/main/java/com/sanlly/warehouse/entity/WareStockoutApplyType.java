package com.sanlly.warehouse.entity;

import java.util.Date;

public class WareStockoutApplyType {
    private Integer wareStockoutApplyTypeId;

    private String key;

    private String stockoutApplyTypeNameEn;

    private String stockoutApplyTypeName;

    private String remark;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getWareStockoutApplyTypeId() {
        return wareStockoutApplyTypeId;
    }

    public void setWareStockoutApplyTypeId(Integer wareStockoutApplyTypeId) {
        this.wareStockoutApplyTypeId = wareStockoutApplyTypeId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }

    public String getStockoutApplyTypeNameEn() {
        return stockoutApplyTypeNameEn;
    }

    public void setStockoutApplyTypeNameEn(String stockoutApplyTypeNameEn) {
        this.stockoutApplyTypeNameEn = stockoutApplyTypeNameEn == null ? null : stockoutApplyTypeNameEn.trim();
    }

    public String getStockoutApplyTypeName() {
        return stockoutApplyTypeName;
    }

    public void setStockoutApplyTypeName(String stockoutApplyTypeName) {
        this.stockoutApplyTypeName = stockoutApplyTypeName == null ? null : stockoutApplyTypeName.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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