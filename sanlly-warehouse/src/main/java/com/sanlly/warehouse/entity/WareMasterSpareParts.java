package com.sanlly.warehouse.entity;

import java.util.Date;

public class WareMasterSpareParts {
    private Integer wareMasterSparePartsId;

    private String masterDevice;

    private String spareParts;

    private String remark;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getWareMasterSparePartsId() {
        return wareMasterSparePartsId;
    }

    public void setWareMasterSparePartsId(Integer wareMasterSparePartsId) {
        this.wareMasterSparePartsId = wareMasterSparePartsId;
    }

    public String getMasterDevice() {
        return masterDevice;
    }

    public void setMasterDevice(String masterDevice) {
        this.masterDevice = masterDevice == null ? null : masterDevice.trim();
    }

    public String getSpareParts() {
        return spareParts;
    }

    public void setSpareParts(String spareParts) {
        this.spareParts = spareParts == null ? null : spareParts.trim();
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