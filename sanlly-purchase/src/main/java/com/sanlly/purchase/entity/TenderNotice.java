package com.sanlly.purchase.entity;

import java.util.Date;

public class TenderNotice {
    private Integer purcTenderNoticeId;

    private Integer tenderPurchaseId;

    private String noticeType;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getPurcTenderNoticeId() {
        return purcTenderNoticeId;
    }

    public void setPurcTenderNoticeId(Integer purcTenderNoticeId) {
        this.purcTenderNoticeId = purcTenderNoticeId;
    }

    public Integer getTenderPurchaseId() {
        return tenderPurchaseId;
    }

    public void setTenderPurchaseId(Integer tenderPurchaseId) {
        this.tenderPurchaseId = tenderPurchaseId;
    }

    public String getNoticeType() {
        return noticeType;
    }

    public void setNoticeType(String noticeType) {
        this.noticeType = noticeType == null ? null : noticeType.trim();
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