package com.sanlly.production.entity;

import java.util.Date;

public class Reason {
    private Integer prodReasonId;

    private String key;

    private String reasonType;

    private String reasonContentName;

    private String reasonContentEn;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private Integer isValid;

    public Integer getProdReasonId() {
        return prodReasonId;
    }

    public void setProdReasonId(Integer prodReasonId) {
        this.prodReasonId = prodReasonId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }

    public String getReasonType() {
        return reasonType;
    }

    public void setReasonType(String reasonType) {
        this.reasonType = reasonType == null ? null : reasonType.trim();
    }

    public String getReasonContentName() {
        return reasonContentName;
    }

    public void setReasonContentName(String reasonContentName) {
        this.reasonContentName = reasonContentName == null ? null : reasonContentName.trim();
    }

    public String getReasonContentEn() {
        return reasonContentEn;
    }

    public void setReasonContentEn(String reasonContentEn) {
        this.reasonContentEn = reasonContentEn == null ? null : reasonContentEn.trim();
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