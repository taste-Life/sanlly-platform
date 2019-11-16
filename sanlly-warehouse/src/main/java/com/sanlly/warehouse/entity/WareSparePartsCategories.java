package com.sanlly.warehouse.entity;

import java.util.Date;

public class WareSparePartsCategories {
    private Integer wareSparePartsCategoriesId;

    private String key;

    private String sparePartsCategoriesNameEn;

    private String sparePartsCategoriesName;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getWareSparePartsCategoriesId() {
        return wareSparePartsCategoriesId;
    }

    public void setWareSparePartsCategoriesId(Integer wareSparePartsCategoriesId) {
        this.wareSparePartsCategoriesId = wareSparePartsCategoriesId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }

    public String getSparePartsCategoriesNameEn() {
        return sparePartsCategoriesNameEn;
    }

    public void setSparePartsCategoriesNameEn(String sparePartsCategoriesNameEn) {
        this.sparePartsCategoriesNameEn = sparePartsCategoriesNameEn == null ? null : sparePartsCategoriesNameEn.trim();
    }

    public String getSparePartsCategoriesName() {
        return sparePartsCategoriesName;
    }

    public void setSparePartsCategoriesName(String sparePartsCategoriesName) {
        this.sparePartsCategoriesName = sparePartsCategoriesName == null ? null : sparePartsCategoriesName.trim();
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