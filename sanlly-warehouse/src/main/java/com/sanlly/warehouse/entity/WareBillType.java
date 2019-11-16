package com.sanlly.warehouse.entity;

import java.util.Date;

public class WareBillType {
    private Integer wareBillTypeId;

    private String key;

    private String billTypeCode;

    private String billTypeModule;

    private Integer billAutoincrement;

    private String billTypeName;

    private String billTypeNameEn;

    private Integer isShow;

    private String remark;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getWareBillTypeId() {
        return wareBillTypeId;
    }

    public void setWareBillTypeId(Integer wareBillTypeId) {
        this.wareBillTypeId = wareBillTypeId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }

    public String getBillTypeCode() {
        return billTypeCode;
    }

    public void setBillTypeCode(String billTypeCode) {
        this.billTypeCode = billTypeCode == null ? null : billTypeCode.trim();
    }

    public String getBillTypeModule() {
        return billTypeModule;
    }

    public void setBillTypeModule(String billTypeModule) {
        this.billTypeModule = billTypeModule == null ? null : billTypeModule.trim();
    }

    public Integer getBillAutoincrement() {
        return billAutoincrement;
    }

    public void setBillAutoincrement(Integer billAutoincrement) {
        this.billAutoincrement = billAutoincrement;
    }

    public String getBillTypeName() {
        return billTypeName;
    }

    public void setBillTypeName(String billTypeName) {
        this.billTypeName = billTypeName == null ? null : billTypeName.trim();
    }

    public String getBillTypeNameEn() {
        return billTypeNameEn;
    }

    public void setBillTypeNameEn(String billTypeNameEn) {
        this.billTypeNameEn = billTypeNameEn == null ? null : billTypeNameEn.trim();
    }

    public Integer getIsShow() {
        return isShow;
    }

    public void setIsShow(Integer isShow) {
        this.isShow = isShow;
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