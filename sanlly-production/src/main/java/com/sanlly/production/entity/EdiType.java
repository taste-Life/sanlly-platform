package com.sanlly.production.entity;

import java.util.Date;

public class EdiType {
    private Integer prodEdiTypeId;

    private String key;

    private String ediTypeCode;

    private String ediTypeName;

    private String ediTypeNameEn;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private Integer isValid;

    public Integer getProdEdiTypeId() {
        return prodEdiTypeId;
    }

    public void setProdEdiTypeId(Integer prodEdiTypeId) {
        this.prodEdiTypeId = prodEdiTypeId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }

    public String getEdiTypeCode() {
        return ediTypeCode;
    }

    public void setEdiTypeCode(String ediTypeCode) {
        this.ediTypeCode = ediTypeCode == null ? null : ediTypeCode.trim();
    }

    public String getEdiTypeName() {
        return ediTypeName;
    }

    public void setEdiTypeName(String ediTypeName) {
        this.ediTypeName = ediTypeName == null ? null : ediTypeName.trim();
    }

    public String getEdiTypeNameEn() {
        return ediTypeNameEn;
    }

    public void setEdiTypeNameEn(String ediTypeNameEn) {
        this.ediTypeNameEn = ediTypeNameEn == null ? null : ediTypeNameEn.trim();
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