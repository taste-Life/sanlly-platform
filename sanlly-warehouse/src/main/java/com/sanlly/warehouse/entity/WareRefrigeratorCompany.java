package com.sanlly.warehouse.entity;

import java.util.Date;

public class WareRefrigeratorCompany {
    private Integer wareRefrigeratorCompanyId;

    private String key;

    private String refrigeratorCompanyName;

    private String refrigeratorCompanyAddr;

    private String applicableModels;

    private String remark;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private String refrigeratorCompanyNameEn;

    private String refrigeratorCompanyCode;

    public Integer getWareRefrigeratorCompanyId() {
        return wareRefrigeratorCompanyId;
    }

    public void setWareRefrigeratorCompanyId(Integer wareRefrigeratorCompanyId) {
        this.wareRefrigeratorCompanyId = wareRefrigeratorCompanyId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }

    public String getRefrigeratorCompanyName() {
        return refrigeratorCompanyName;
    }

    public void setRefrigeratorCompanyName(String refrigeratorCompanyName) {
        this.refrigeratorCompanyName = refrigeratorCompanyName == null ? null : refrigeratorCompanyName.trim();
    }

    public String getRefrigeratorCompanyAddr() {
        return refrigeratorCompanyAddr;
    }

    public void setRefrigeratorCompanyAddr(String refrigeratorCompanyAddr) {
        this.refrigeratorCompanyAddr = refrigeratorCompanyAddr == null ? null : refrigeratorCompanyAddr.trim();
    }

    public String getApplicableModels() {
        return applicableModels;
    }

    public void setApplicableModels(String applicableModels) {
        this.applicableModels = applicableModels == null ? null : applicableModels.trim();
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

    public String getRefrigeratorCompanyNameEn() {
        return refrigeratorCompanyNameEn;
    }

    public void setRefrigeratorCompanyNameEn(String refrigeratorCompanyNameEn) {
        this.refrigeratorCompanyNameEn = refrigeratorCompanyNameEn == null ? null : refrigeratorCompanyNameEn.trim();
    }

    public String getRefrigeratorCompanyCode() {
        return refrigeratorCompanyCode;
    }

    public void setRefrigeratorCompanyCode(String refrigeratorCompanyCode) {
        this.refrigeratorCompanyCode = refrigeratorCompanyCode == null ? null : refrigeratorCompanyCode.trim();
    }
}