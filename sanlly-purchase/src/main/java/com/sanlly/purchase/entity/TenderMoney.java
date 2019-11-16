package com.sanlly.purchase.entity;

import java.util.Date;

public class TenderMoney {
    private Integer purcMatterTenderSuppierId;

    private String purchaseType;

    private Integer moneyTop;

    private Integer moneyLow;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getPurcMatterTenderSuppierId() {
        return purcMatterTenderSuppierId;
    }

    public void setPurcMatterTenderSuppierId(Integer purcMatterTenderSuppierId) {
        this.purcMatterTenderSuppierId = purcMatterTenderSuppierId;
    }

    public String getPurchaseType() {
        return purchaseType;
    }

    public void setPurchaseType(String purchaseType) {
        this.purchaseType = purchaseType == null ? null : purchaseType.trim();
    }

    public Integer getMoneyTop() {
        return moneyTop;
    }

    public void setMoneyTop(Integer moneyTop) {
        this.moneyTop = moneyTop;
    }

    public Integer getMoneyLow() {
        return moneyLow;
    }

    public void setMoneyLow(Integer moneyLow) {
        this.moneyLow = moneyLow;
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