package com.sanlly.warehouse.entity;

import java.util.Date;

public class WareSurplusLosses {
    private Integer wareSurplusLossesId;

    private String surplusLossesNo;

    private String type;

    private String company;

    private String warehouse;

    private String billStatus;

    private String remark;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private String yard;

    private String isSbs;

    public Integer getWareSurplusLossesId() {
        return wareSurplusLossesId;
    }

    public void setWareSurplusLossesId(Integer wareSurplusLossesId) {
        this.wareSurplusLossesId = wareSurplusLossesId;
    }

    public String getSurplusLossesNo() {
        return surplusLossesNo;
    }

    public void setSurplusLossesNo(String surplusLossesNo) {
        this.surplusLossesNo = surplusLossesNo == null ? null : surplusLossesNo.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse == null ? null : warehouse.trim();
    }

    public String getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(String billStatus) {
        this.billStatus = billStatus == null ? null : billStatus.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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

    public String getYard() {
        return yard;
    }

    public void setYard(String yard) {
        this.yard = yard == null ? null : yard.trim();
    }

    public String getIsSbs() {
        return isSbs;
    }

    public void setIsSbs(String isSbs) {
        this.isSbs = isSbs == null ? null : isSbs.trim();
    }
}