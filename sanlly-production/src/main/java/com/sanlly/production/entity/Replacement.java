package com.sanlly.production.entity;

import java.util.Date;

public class Replacement {
    private Integer prodReplacementId;

    private String course;

    private String entry;

    private String spares;

    private String replaceSpares;

    private Integer replacementUser;

    private Date replacementTime;

    private String remarks;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getProdReplacementId() {
        return prodReplacementId;
    }

    public void setProdReplacementId(Integer prodReplacementId) {
        this.prodReplacementId = prodReplacementId;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course == null ? null : course.trim();
    }

    public String getEntry() {
        return entry;
    }

    public void setEntry(String entry) {
        this.entry = entry == null ? null : entry.trim();
    }

    public String getSpares() {
        return spares;
    }

    public void setSpares(String spares) {
        this.spares = spares == null ? null : spares.trim();
    }

    public String getReplaceSpares() {
        return replaceSpares;
    }

    public void setReplaceSpares(String replaceSpares) {
        this.replaceSpares = replaceSpares == null ? null : replaceSpares.trim();
    }

    public Integer getReplacementUser() {
        return replacementUser;
    }

    public void setReplacementUser(Integer replacementUser) {
        this.replacementUser = replacementUser;
    }

    public Date getReplacementTime() {
        return replacementTime;
    }

    public void setReplacementTime(Date replacementTime) {
        this.replacementTime = replacementTime;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
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