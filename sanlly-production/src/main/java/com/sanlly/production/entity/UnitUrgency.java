package com.sanlly.production.entity;

import java.util.Date;

public class UnitUrgency {
    private Integer prodUnitUrgencyId;

    private String key;

    private Integer grade;

    private String urgency;

    private String urgencyEn;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getProdUnitUrgencyId() {
        return prodUnitUrgencyId;
    }

    public void setProdUnitUrgencyId(Integer prodUnitUrgencyId) {
        this.prodUnitUrgencyId = prodUnitUrgencyId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public String getUrgency() {
        return urgency;
    }

    public void setUrgency(String urgency) {
        this.urgency = urgency == null ? null : urgency.trim();
    }

    public String getUrgencyEn() {
        return urgencyEn;
    }

    public void setUrgencyEn(String urgencyEn) {
        this.urgencyEn = urgencyEn == null ? null : urgencyEn.trim();
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