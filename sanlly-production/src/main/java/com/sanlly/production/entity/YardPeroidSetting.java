package com.sanlly.production.entity;

import java.util.Date;

public class YardPeroidSetting {
    private Integer prodYardPeroidSettingId;

    private String company;

    private String recordingPeroid;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private Integer isDel;

    private Integer isValid;

    public Integer getProdYardPeroidSettingId() {
        return prodYardPeroidSettingId;
    }

    public void setProdYardPeroidSettingId(Integer prodYardPeroidSettingId) {
        this.prodYardPeroidSettingId = prodYardPeroidSettingId;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getRecordingPeroid() {
        return recordingPeroid;
    }

    public void setRecordingPeroid(String recordingPeroid) {
        this.recordingPeroid = recordingPeroid == null ? null : recordingPeroid.trim();
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

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public Integer getIsValid() {
        return isValid;
    }

    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }
}