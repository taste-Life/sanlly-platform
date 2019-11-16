package com.sanlly.warehouse.entity;

import java.util.Date;

public class WareLaborAdvanceReceive {
    private Integer wareLaborAdvanceReceive;

    private String wareLaborAdvanceReceiveNo;

    private Integer user;

    private String spareParts;

    private String model;

    private Double receiveNum;

    private Date receiveDate;

    private String isReceive;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getWareLaborAdvanceReceive() {
        return wareLaborAdvanceReceive;
    }

    public void setWareLaborAdvanceReceive(Integer wareLaborAdvanceReceive) {
        this.wareLaborAdvanceReceive = wareLaborAdvanceReceive;
    }

    public String getWareLaborAdvanceReceiveNo() {
        return wareLaborAdvanceReceiveNo;
    }

    public void setWareLaborAdvanceReceiveNo(String wareLaborAdvanceReceiveNo) {
        this.wareLaborAdvanceReceiveNo = wareLaborAdvanceReceiveNo == null ? null : wareLaborAdvanceReceiveNo.trim();
    }

    public Integer getUser() {
        return user;
    }

    public void setUser(Integer user) {
        this.user = user;
    }

    public String getSpareParts() {
        return spareParts;
    }

    public void setSpareParts(String spareParts) {
        this.spareParts = spareParts == null ? null : spareParts.trim();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
    }

    public Double getReceiveNum() {
        return receiveNum;
    }

    public void setReceiveNum(Double receiveNum) {
        this.receiveNum = receiveNum;
    }

    public Date getReceiveDate() {
        return receiveDate;
    }

    public void setReceiveDate(Date receiveDate) {
        this.receiveDate = receiveDate;
    }

    public String getIsReceive() {
        return isReceive;
    }

    public void setIsReceive(String isReceive) {
        this.isReceive = isReceive == null ? null : isReceive.trim();
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