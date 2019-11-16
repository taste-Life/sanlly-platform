package com.sanlly.warehouse.entity;

import java.util.Date;

public class WareYard {
    private Integer wareYardId;

    private String key;

    private String yardNameEn;

    private String yardName;

    private Integer defaultWarehouse;

    private Integer duration;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getWareYardId() {
        return wareYardId;
    }

    public void setWareYardId(Integer wareYardId) {
        this.wareYardId = wareYardId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }

    public String getYardNameEn() {
        return yardNameEn;
    }

    public void setYardNameEn(String yardNameEn) {
        this.yardNameEn = yardNameEn == null ? null : yardNameEn.trim();
    }

    public String getYardName() {
        return yardName;
    }

    public void setYardName(String yardName) {
        this.yardName = yardName == null ? null : yardName.trim();
    }

    public Integer getDefaultWarehouse() {
        return defaultWarehouse;
    }

    public void setDefaultWarehouse(Integer defaultWarehouse) {
        this.defaultWarehouse = defaultWarehouse;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
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