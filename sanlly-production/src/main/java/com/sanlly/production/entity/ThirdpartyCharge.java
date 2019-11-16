package com.sanlly.production.entity;

import java.util.Date;

public class ThirdpartyCharge {
    private Integer prodThirdpartyChargeId;

    private String company;

    private String containerUser;

    private String thirdpartyChargeType;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private Integer isValid;

    public Integer getProdThirdpartyChargeId() {
        return prodThirdpartyChargeId;
    }

    public void setProdThirdpartyChargeId(Integer prodThirdpartyChargeId) {
        this.prodThirdpartyChargeId = prodThirdpartyChargeId;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getContainerUser() {
        return containerUser;
    }

    public void setContainerUser(String containerUser) {
        this.containerUser = containerUser == null ? null : containerUser.trim();
    }

    public String getThirdpartyChargeType() {
        return thirdpartyChargeType;
    }

    public void setThirdpartyChargeType(String thirdpartyChargeType) {
        this.thirdpartyChargeType = thirdpartyChargeType == null ? null : thirdpartyChargeType.trim();
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