package com.sanlly.production.entity;

import java.util.Date;

public class ContainerGrade {
    private Integer prodContainerGradeId;

    private String key;

    private String containerUser;

    private String containerGradeName;

    private String containerGradeNameEn;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private Integer isValid;

    public Integer getProdContainerGradeId() {
        return prodContainerGradeId;
    }

    public void setProdContainerGradeId(Integer prodContainerGradeId) {
        this.prodContainerGradeId = prodContainerGradeId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }

    public String getContainerUser() {
        return containerUser;
    }

    public void setContainerUser(String containerUser) {
        this.containerUser = containerUser == null ? null : containerUser.trim();
    }

    public String getContainerGradeName() {
        return containerGradeName;
    }

    public void setContainerGradeName(String containerGradeName) {
        this.containerGradeName = containerGradeName == null ? null : containerGradeName.trim();
    }

    public String getContainerGradeNameEn() {
        return containerGradeNameEn;
    }

    public void setContainerGradeNameEn(String containerGradeNameEn) {
        this.containerGradeNameEn = containerGradeNameEn == null ? null : containerGradeNameEn.trim();
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