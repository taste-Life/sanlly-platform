package com.sanlly.production.entity;

import java.util.Date;

public class PtiType {
    private Integer prodPtiTypeId;

    private String key;

    private String company;

    private String ptiTypeName;

    private String ptiTypeNameEn;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private Integer isValid;

    public Integer getProdPtiTypeId() {
        return prodPtiTypeId;
    }

    public void setProdPtiTypeId(Integer prodPtiTypeId) {
        this.prodPtiTypeId = prodPtiTypeId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getPtiTypeName() {
        return ptiTypeName;
    }

    public void setPtiTypeName(String ptiTypeName) {
        this.ptiTypeName = ptiTypeName == null ? null : ptiTypeName.trim();
    }

    public String getPtiTypeNameEn() {
        return ptiTypeNameEn;
    }

    public void setPtiTypeNameEn(String ptiTypeNameEn) {
        this.ptiTypeNameEn = ptiTypeNameEn == null ? null : ptiTypeNameEn.trim();
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