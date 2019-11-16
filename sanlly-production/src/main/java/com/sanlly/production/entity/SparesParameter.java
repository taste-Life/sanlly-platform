package com.sanlly.production.entity;

import java.util.Date;

public class SparesParameter {
    private Integer prodSparesParameterId;

    private String key;

    private String sparesParameterName;

    private String sparesParameterNameEn;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getProdSparesParameterId() {
        return prodSparesParameterId;
    }

    public void setProdSparesParameterId(Integer prodSparesParameterId) {
        this.prodSparesParameterId = prodSparesParameterId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }

    public String getSparesParameterName() {
        return sparesParameterName;
    }

    public void setSparesParameterName(String sparesParameterName) {
        this.sparesParameterName = sparesParameterName == null ? null : sparesParameterName.trim();
    }

    public String getSparesParameterNameEn() {
        return sparesParameterNameEn;
    }

    public void setSparesParameterNameEn(String sparesParameterNameEn) {
        this.sparesParameterNameEn = sparesParameterNameEn == null ? null : sparesParameterNameEn.trim();
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