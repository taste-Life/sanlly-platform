package com.sanlly.production.entity;

import java.util.Date;

public class PayingParty {
    private Integer prodPayingPartyId;

    private String key;

    private String payingPartyCode;

    private String payingPartyName;

    private String payingPartyNameEn;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private Integer isValid;

    public Integer getProdPayingPartyId() {
        return prodPayingPartyId;
    }

    public void setProdPayingPartyId(Integer prodPayingPartyId) {
        this.prodPayingPartyId = prodPayingPartyId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }

    public String getPayingPartyCode() {
        return payingPartyCode;
    }

    public void setPayingPartyCode(String payingPartyCode) {
        this.payingPartyCode = payingPartyCode == null ? null : payingPartyCode.trim();
    }

    public String getPayingPartyName() {
        return payingPartyName;
    }

    public void setPayingPartyName(String payingPartyName) {
        this.payingPartyName = payingPartyName == null ? null : payingPartyName.trim();
    }

    public String getPayingPartyNameEn() {
        return payingPartyNameEn;
    }

    public void setPayingPartyNameEn(String payingPartyNameEn) {
        this.payingPartyNameEn = payingPartyNameEn == null ? null : payingPartyNameEn.trim();
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