package com.sanlly.auth.entity;

import java.util.Date;

public class Yard {
    private Integer prodYardId;

    private String key;

    private String company;

    private String yardCode;

    private String yardName;

    private String yardNameEn;

    private String defaultWarehouse;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getProdYardId() {
        return prodYardId;
    }

    public void setProdYardId(Integer prodYardId) {
        this.prodYardId = prodYardId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getYardCode() {
        return yardCode;
    }

    public void setYardCode(String yardCode) {
        this.yardCode = yardCode == null ? null : yardCode.trim();
    }

    public String getYardName() {
        return yardName;
    }

    public void setYardName(String yardName) {
        this.yardName = yardName == null ? null : yardName.trim();
    }

    public String getYardNameEn() {
        return yardNameEn;
    }

    public void setYardNameEn(String yardNameEn) {
        this.yardNameEn = yardNameEn == null ? null : yardNameEn.trim();
    }

    public String getDefaultWarehouse() {
        return defaultWarehouse;
    }

    public void setDefaultWarehouse(String defaultWarehouse) {
        this.defaultWarehouse = defaultWarehouse == null ? null : defaultWarehouse.trim();
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