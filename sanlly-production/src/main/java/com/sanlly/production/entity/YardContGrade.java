package com.sanlly.production.entity;

import java.util.Date;

public class YardContGrade {
    private Integer prodYardContGradeId;

    private String key;

    private String yard;

    private String containerCategory;

    private String yardContGradeName;

    private String yardContGradeEn;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private Integer isValid;

    public Integer getProdYardContGradeId() {
        return prodYardContGradeId;
    }

    public void setProdYardContGradeId(Integer prodYardContGradeId) {
        this.prodYardContGradeId = prodYardContGradeId;
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

    public String getContainerCategory() {
        return containerCategory;
    }

    public void setContainerCategory(String containerCategory) {
        this.containerCategory = containerCategory == null ? null : containerCategory.trim();
    }

    public String getYardContGradeName() {
        return yardContGradeName;
    }

    public void setYardContGradeName(String yardContGradeName) {
        this.yardContGradeName = yardContGradeName == null ? null : yardContGradeName.trim();
    }

    public String getYardContGradeEn() {
        return yardContGradeEn;
    }

    public void setYardContGradeEn(String yardContGradeEn) {
        this.yardContGradeEn = yardContGradeEn == null ? null : yardContGradeEn.trim();
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