package com.sanlly.production.entity;

import java.util.Date;

public class UnitFailure {
    private Integer prodUnitFailureId;

    private String key;

    private String unitFailureCode;

    private String unitFailureName;

    private String unitFailureNameEn;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private Integer isValid;

    public Integer getProdUnitFailureId() {
        return prodUnitFailureId;
    }

    public void setProdUnitFailureId(Integer prodUnitFailureId) {
        this.prodUnitFailureId = prodUnitFailureId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }

    public String getUnitFailureCode() {
        return unitFailureCode;
    }

    public void setUnitFailureCode(String unitFailureCode) {
        this.unitFailureCode = unitFailureCode == null ? null : unitFailureCode.trim();
    }

    public String getUnitFailureName() {
        return unitFailureName;
    }

    public void setUnitFailureName(String unitFailureName) {
        this.unitFailureName = unitFailureName == null ? null : unitFailureName.trim();
    }

    public String getUnitFailureNameEn() {
        return unitFailureNameEn;
    }

    public void setUnitFailureNameEn(String unitFailureNameEn) {
        this.unitFailureNameEn = unitFailureNameEn == null ? null : unitFailureNameEn.trim();
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