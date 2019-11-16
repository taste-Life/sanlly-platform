package com.sanlly.production.entity;

import java.util.Date;

public class UnitCompany {
    private Integer prodUnitCompanyId;

    private String key;

    private String unitCompanyCode;

    private String unitCompanyName;

    private String unitCompanyNameEn;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private Integer isValid;

    public Integer getProdUnitCompanyId() {
        return prodUnitCompanyId;
    }

    public void setProdUnitCompanyId(Integer prodUnitCompanyId) {
        this.prodUnitCompanyId = prodUnitCompanyId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }

    public String getUnitCompanyCode() {
        return unitCompanyCode;
    }

    public void setUnitCompanyCode(String unitCompanyCode) {
        this.unitCompanyCode = unitCompanyCode == null ? null : unitCompanyCode.trim();
    }

    public String getUnitCompanyName() {
        return unitCompanyName;
    }

    public void setUnitCompanyName(String unitCompanyName) {
        this.unitCompanyName = unitCompanyName == null ? null : unitCompanyName.trim();
    }

    public String getUnitCompanyNameEn() {
        return unitCompanyNameEn;
    }

    public void setUnitCompanyNameEn(String unitCompanyNameEn) {
        this.unitCompanyNameEn = unitCompanyNameEn == null ? null : unitCompanyNameEn.trim();
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

    public Integer getIsValid() {
        return isValid;
    }

    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }
}