package com.sanlly.warehouse.entity;

import java.util.Date;

public class WareMaintainDepartmentType {
    private Integer wareMaintainDepartmentTypeId;

    private String maintainDepartment;

    private String maintainType;

    private String remark;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getWareMaintainDepartmentTypeId() {
        return wareMaintainDepartmentTypeId;
    }

    public void setWareMaintainDepartmentTypeId(Integer wareMaintainDepartmentTypeId) {
        this.wareMaintainDepartmentTypeId = wareMaintainDepartmentTypeId;
    }

    public String getMaintainDepartment() {
        return maintainDepartment;
    }

    public void setMaintainDepartment(String maintainDepartment) {
        this.maintainDepartment = maintainDepartment == null ? null : maintainDepartment.trim();
    }

    public String getMaintainType() {
        return maintainType;
    }

    public void setMaintainType(String maintainType) {
        this.maintainType = maintainType == null ? null : maintainType.trim();
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