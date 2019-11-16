package com.sanlly.production.entity;

import java.util.Date;

public class ContainerBelong {
    private Integer prodContainerBelongId;

    private String key;

    private String containerBelongCode;

    private String containerBelongName;

    private String containerBelongNameEn;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getProdContainerBelongId() {
        return prodContainerBelongId;
    }

    public void setProdContainerBelongId(Integer prodContainerBelongId) {
        this.prodContainerBelongId = prodContainerBelongId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }

    public String getContainerBelongCode() {
        return containerBelongCode;
    }

    public void setContainerBelongCode(String containerBelongCode) {
        this.containerBelongCode = containerBelongCode == null ? null : containerBelongCode.trim();
    }

    public String getContainerBelongName() {
        return containerBelongName;
    }

    public void setContainerBelongName(String containerBelongName) {
        this.containerBelongName = containerBelongName == null ? null : containerBelongName.trim();
    }

    public String getContainerBelongNameEn() {
        return containerBelongNameEn;
    }

    public void setContainerBelongNameEn(String containerBelongNameEn) {
        this.containerBelongNameEn = containerBelongNameEn == null ? null : containerBelongNameEn.trim();
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