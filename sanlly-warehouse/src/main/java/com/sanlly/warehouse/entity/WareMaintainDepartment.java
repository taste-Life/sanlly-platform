package com.sanlly.warehouse.entity;

import java.util.Date;

public class WareMaintainDepartment {
    private Integer wareMaintainDepartmentId;

    private String key;

    private String maintainDepartmentNameEn;

    private String maintainDepartmentName;

    private String remark;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getWareMaintainDepartmentId() {
        return wareMaintainDepartmentId;
    }

    public void setWareMaintainDepartmentId(Integer wareMaintainDepartmentId) {
        this.wareMaintainDepartmentId = wareMaintainDepartmentId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }

    public String getMaintainDepartmentNameEn() {
        return maintainDepartmentNameEn;
    }

    public void setMaintainDepartmentNameEn(String maintainDepartmentNameEn) {
        this.maintainDepartmentNameEn = maintainDepartmentNameEn == null ? null : maintainDepartmentNameEn.trim();
    }

    public String getMaintainDepartmentName() {
        return maintainDepartmentName;
    }

    public void setMaintainDepartmentName(String maintainDepartmentName) {
        this.maintainDepartmentName = maintainDepartmentName == null ? null : maintainDepartmentName.trim();
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