package com.sanlly.purchase.entity;

import java.util.Date;

public class EmailRecord {
    private Integer purcEmailRecordId;

    private String taskType;

    private Integer sendEmailAddress;

    private Integer reciveEmailAddress;

    private String content;

    private Integer status;

    private Date sendTime;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getPurcEmailRecordId() {
        return purcEmailRecordId;
    }

    public void setPurcEmailRecordId(Integer purcEmailRecordId) {
        this.purcEmailRecordId = purcEmailRecordId;
    }

    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType == null ? null : taskType.trim();
    }

    public Integer getSendEmailAddress() {
        return sendEmailAddress;
    }

    public void setSendEmailAddress(Integer sendEmailAddress) {
        this.sendEmailAddress = sendEmailAddress;
    }

    public Integer getReciveEmailAddress() {
        return reciveEmailAddress;
    }

    public void setReciveEmailAddress(Integer reciveEmailAddress) {
        this.reciveEmailAddress = reciveEmailAddress;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
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