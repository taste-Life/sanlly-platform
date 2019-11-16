package com.sanlly.warehouse.entity;

import java.util.Date;

public class WareMasterDevice {
    private Integer wareMasterDeviceId;

    private String key;

    private String masterDeviceNo;

    private String masterDeviceNameEn;

    private String masterDeviceName;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private String defaultSpare;

    public Integer getWareMasterDeviceId() {
        return wareMasterDeviceId;
    }

    public void setWareMasterDeviceId(Integer wareMasterDeviceId) {
        this.wareMasterDeviceId = wareMasterDeviceId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }

    public String getMasterDeviceNo() {
        return masterDeviceNo;
    }

    public void setMasterDeviceNo(String masterDeviceNo) {
        this.masterDeviceNo = masterDeviceNo == null ? null : masterDeviceNo.trim();
    }

    public String getMasterDeviceNameEn() {
        return masterDeviceNameEn;
    }

    public void setMasterDeviceNameEn(String masterDeviceNameEn) {
        this.masterDeviceNameEn = masterDeviceNameEn == null ? null : masterDeviceNameEn.trim();
    }

    public String getMasterDeviceName() {
        return masterDeviceName;
    }

    public void setMasterDeviceName(String masterDeviceName) {
        this.masterDeviceName = masterDeviceName == null ? null : masterDeviceName.trim();
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

    public String getDefaultSpare() {
        return defaultSpare;
    }

    public void setDefaultSpare(String defaultSpare) {
        this.defaultSpare = defaultSpare == null ? null : defaultSpare.trim();
    }
}