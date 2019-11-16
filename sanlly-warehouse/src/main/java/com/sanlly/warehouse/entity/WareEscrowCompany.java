package com.sanlly.warehouse.entity;

import java.util.Date;

public class WareEscrowCompany {
    private Integer wareEscrowCompanyId;

    private String key;

    private String escrowCompanyName;

    private String escrowCompanyNameEn;

    private String escrowCompanyAddr;

    private String remark;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private String escrowCompanyNo;

    public Integer getWareEscrowCompanyId() {
        return wareEscrowCompanyId;
    }

    public void setWareEscrowCompanyId(Integer wareEscrowCompanyId) {
        this.wareEscrowCompanyId = wareEscrowCompanyId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }

    public String getEscrowCompanyName() {
        return escrowCompanyName;
    }

    public void setEscrowCompanyName(String escrowCompanyName) {
        this.escrowCompanyName = escrowCompanyName == null ? null : escrowCompanyName.trim();
    }

    public String getEscrowCompanyNameEn() {
        return escrowCompanyNameEn;
    }

    public void setEscrowCompanyNameEn(String escrowCompanyNameEn) {
        this.escrowCompanyNameEn = escrowCompanyNameEn == null ? null : escrowCompanyNameEn.trim();
    }

    public String getEscrowCompanyAddr() {
        return escrowCompanyAddr;
    }

    public void setEscrowCompanyAddr(String escrowCompanyAddr) {
        this.escrowCompanyAddr = escrowCompanyAddr == null ? null : escrowCompanyAddr.trim();
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

    public String getEscrowCompanyNo() {
        return escrowCompanyNo;
    }

    public void setEscrowCompanyNo(String escrowCompanyNo) {
        this.escrowCompanyNo = escrowCompanyNo == null ? null : escrowCompanyNo.trim();
    }
}