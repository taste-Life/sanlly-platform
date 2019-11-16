package com.sanlly.warehouse.entity;

import java.util.Date;

public class WareSparepartsCategoriesDetails {
    private Integer wareSparepartsCategoriesDetailsId;

    private String key;

    private String sparePartsCategories;

    private String sparepartsCategoriesDetailsNameEn;

    private String sparepartsCategoriesDetailsName;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getWareSparepartsCategoriesDetailsId() {
        return wareSparepartsCategoriesDetailsId;
    }

    public void setWareSparepartsCategoriesDetailsId(Integer wareSparepartsCategoriesDetailsId) {
        this.wareSparepartsCategoriesDetailsId = wareSparepartsCategoriesDetailsId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }

    public String getSparePartsCategories() {
        return sparePartsCategories;
    }

    public void setSparePartsCategories(String sparePartsCategories) {
        this.sparePartsCategories = sparePartsCategories == null ? null : sparePartsCategories.trim();
    }

    public String getSparepartsCategoriesDetailsNameEn() {
        return sparepartsCategoriesDetailsNameEn;
    }

    public void setSparepartsCategoriesDetailsNameEn(String sparepartsCategoriesDetailsNameEn) {
        this.sparepartsCategoriesDetailsNameEn = sparepartsCategoriesDetailsNameEn == null ? null : sparepartsCategoriesDetailsNameEn.trim();
    }

    public String getSparepartsCategoriesDetailsName() {
        return sparepartsCategoriesDetailsName;
    }

    public void setSparepartsCategoriesDetailsName(String sparepartsCategoriesDetailsName) {
        this.sparepartsCategoriesDetailsName = sparepartsCategoriesDetailsName == null ? null : sparepartsCategoriesDetailsName.trim();
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