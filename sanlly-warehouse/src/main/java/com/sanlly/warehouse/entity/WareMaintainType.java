package com.sanlly.warehouse.entity;

import java.util.Date;

public class WareMaintainType {
    private Integer wareMaintainTypeId;

    private String key;

    private String maintainTypeNameEn;

    private String maintainTypeName;

    private String remark;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getWareMaintainTypeId() {
        return wareMaintainTypeId;
    }

    public void setWareMaintainTypeId(Integer wareMaintainTypeId) {
        this.wareMaintainTypeId = wareMaintainTypeId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }

    public String getMaintainTypeNameEn() {
        return maintainTypeNameEn;
    }

    public void setMaintainTypeNameEn(String maintainTypeNameEn) {
        this.maintainTypeNameEn = maintainTypeNameEn == null ? null : maintainTypeNameEn.trim();
    }

    public String getMaintainTypeName() {
        return maintainTypeName;
    }

    public void setMaintainTypeName(String maintainTypeName) {
        this.maintainTypeName = maintainTypeName == null ? null : maintainTypeName.trim();
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