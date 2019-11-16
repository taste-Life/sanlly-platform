package com.sanlly.production.entity;

import java.util.Date;

public class CourseKeyRule {
    private Integer ruleId;

    private String containerNo;

    private Integer courseValue;

    private Integer courseEntryValue;

    private Integer maintenanceValue;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getRuleId() {
        return ruleId;
    }

    public void setRuleId(Integer ruleId) {
        this.ruleId = ruleId;
    }

    public String getContainerNo() {
        return containerNo;
    }

    public void setContainerNo(String containerNo) {
        this.containerNo = containerNo == null ? null : containerNo.trim();
    }

    public Integer getCourseValue() {
        return courseValue;
    }

    public void setCourseValue(Integer courseValue) {
        this.courseValue = courseValue;
    }

    public Integer getCourseEntryValue() {
        return courseEntryValue;
    }

    public void setCourseEntryValue(Integer courseEntryValue) {
        this.courseEntryValue = courseEntryValue;
    }

    public Integer getMaintenanceValue() {
        return maintenanceValue;
    }

    public void setMaintenanceValue(Integer maintenanceValue) {
        this.maintenanceValue = maintenanceValue;
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