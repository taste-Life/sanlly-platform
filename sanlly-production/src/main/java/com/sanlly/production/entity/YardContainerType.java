package com.sanlly.production.entity;

import java.util.Date;

public class YardContainerType {
    private Integer prodYardContainerTypeId;

    private String key;

    private String yard;

    private String containerCondition;

    private String courseTypeName;

    private String courseTypeNameEn;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private Integer isValid;

    public Integer getProdYardContainerTypeId() {
        return prodYardContainerTypeId;
    }

    public void setProdYardContainerTypeId(Integer prodYardContainerTypeId) {
        this.prodYardContainerTypeId = prodYardContainerTypeId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }

    public String getYard() {
        return yard;
    }

    public void setYard(String yard) {
        this.yard = yard == null ? null : yard.trim();
    }

    public String getContainerCondition() {
        return containerCondition;
    }

    public void setContainerCondition(String containerCondition) {
        this.containerCondition = containerCondition == null ? null : containerCondition.trim();
    }

    public String getCourseTypeName() {
        return courseTypeName;
    }

    public void setCourseTypeName(String courseTypeName) {
        this.courseTypeName = courseTypeName == null ? null : courseTypeName.trim();
    }

    public String getCourseTypeNameEn() {
        return courseTypeNameEn;
    }

    public void setCourseTypeNameEn(String courseTypeNameEn) {
        this.courseTypeNameEn = courseTypeNameEn == null ? null : courseTypeNameEn.trim();
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