package com.sanlly.production.entity;

import java.util.Date;

public class AutomaticEdiPool {
    private Integer prodAutomaticEdiPoolId;

    private String company;

    private String containerUser;

    private String containerCategory;

    private String replyState;

    private String timeField;

    private Integer waitMiniute;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getProdAutomaticEdiPoolId() {
        return prodAutomaticEdiPoolId;
    }

    public void setProdAutomaticEdiPoolId(Integer prodAutomaticEdiPoolId) {
        this.prodAutomaticEdiPoolId = prodAutomaticEdiPoolId;
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

    public String getContainerCategory() {
        return containerCategory;
    }

    public void setContainerCategory(String containerCategory) {
        this.containerCategory = containerCategory == null ? null : containerCategory.trim();
    }

    public String getReplyState() {
        return replyState;
    }

    public void setReplyState(String replyState) {
        this.replyState = replyState == null ? null : replyState.trim();
    }

    public String getTimeField() {
        return timeField;
    }

    public void setTimeField(String timeField) {
        this.timeField = timeField == null ? null : timeField.trim();
    }

    public Integer getWaitMiniute() {
        return waitMiniute;
    }

    public void setWaitMiniute(Integer waitMiniute) {
        this.waitMiniute = waitMiniute;
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
}