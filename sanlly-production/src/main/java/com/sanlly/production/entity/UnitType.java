package com.sanlly.production.entity;

import com.alibaba.fastjson.JSON;

import java.util.Date;

public class UnitType {
    private Integer prodUnitTypeId;

    private String key;

    private String unitCompany;

    private String unitTypeScope;

    private String unitTypeCode;

    private Integer isValid;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getProdUnitTypeId() {
        return prodUnitTypeId;
    }

    public void setProdUnitTypeId(Integer prodUnitTypeId) {
        this.prodUnitTypeId = prodUnitTypeId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }

    public String getUnitCompany() {
        return unitCompany;
    }

    public void setUnitCompany(String unitCompany) {
        this.unitCompany = unitCompany == null ? null : unitCompany.trim();
    }

    public String getUnitTypeScope() {
        return unitTypeScope;
    }

    public void setUnitTypeScope(String unitTypeScope) {
        this.unitTypeScope = unitTypeScope == null ? null : unitTypeScope.trim();
    }

    public String getUnitTypeCode() {
        return unitTypeCode;
    }

    public void setUnitTypeCode(String unitTypeCode) {
        this.unitTypeCode = unitTypeCode == null ? null : unitTypeCode.trim();
    }

    public Integer getIsValid() {
        return isValid;
    }

    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
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

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}