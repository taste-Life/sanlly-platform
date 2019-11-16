package com.sanlly.production.entity;

import java.util.Date;

public class QualityControlTime {
    private Integer prodQualityControlTimeId;

    private String company;

    private String containerCategory;

    private String qualityControlType;

    private Integer qualityControlTime;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private Integer isValid;

    public Integer getProdQualityControlTimeId() {
        return prodQualityControlTimeId;
    }

    public void setProdQualityControlTimeId(Integer prodQualityControlTimeId) {
        this.prodQualityControlTimeId = prodQualityControlTimeId;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getContainerCategory() {
        return containerCategory;
    }

    public void setContainerCategory(String containerCategory) {
        this.containerCategory = containerCategory == null ? null : containerCategory.trim();
    }

    public String getQualityControlType() {
        return qualityControlType;
    }

    public void setQualityControlType(String qualityControlType) {
        this.qualityControlType = qualityControlType == null ? null : qualityControlType.trim();
    }

    public Integer getQualityControlTime() {
        return qualityControlTime;
    }

    public void setQualityControlTime(Integer qualityControlTime) {
        this.qualityControlTime = qualityControlTime;
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