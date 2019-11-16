package com.sanlly.production.entity;

import java.util.Date;

public class PickingList {
    private Integer prodPickingListId;

    private String referralNo;

    private Integer pickingUser;

    private String pickingState;

    private Date pickingTime;

    private String remarks;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getProdPickingListId() {
        return prodPickingListId;
    }

    public void setProdPickingListId(Integer prodPickingListId) {
        this.prodPickingListId = prodPickingListId;
    }

    public String getReferralNo() {
        return referralNo;
    }

    public void setReferralNo(String referralNo) {
        this.referralNo = referralNo == null ? null : referralNo.trim();
    }

    public Integer getPickingUser() {
        return pickingUser;
    }

    public void setPickingUser(Integer pickingUser) {
        this.pickingUser = pickingUser;
    }

    public String getPickingState() {
        return pickingState;
    }

    public void setPickingState(String pickingState) {
        this.pickingState = pickingState == null ? null : pickingState.trim();
    }

    public Date getPickingTime() {
        return pickingTime;
    }

    public void setPickingTime(Date pickingTime) {
        this.pickingTime = pickingTime;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
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