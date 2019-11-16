package com.sanlly.warehouse.entity;

import java.util.Date;

public class WareLaborInsurance {
    private Integer wareLaborInsuranceId;

    private String key;

    private String laborInsuranceNo;

    private String laborInsuranceNameEn;

    private String laborInsuranceName;

    private String laborInsuranceStatus;

    private String remark;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getWareLaborInsuranceId() {
        return wareLaborInsuranceId;
    }

    public void setWareLaborInsuranceId(Integer wareLaborInsuranceId) {
        this.wareLaborInsuranceId = wareLaborInsuranceId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }

    public String getLaborInsuranceNo() {
        return laborInsuranceNo;
    }

    public void setLaborInsuranceNo(String laborInsuranceNo) {
        this.laborInsuranceNo = laborInsuranceNo == null ? null : laborInsuranceNo.trim();
    }

    public String getLaborInsuranceNameEn() {
        return laborInsuranceNameEn;
    }

    public void setLaborInsuranceNameEn(String laborInsuranceNameEn) {
        this.laborInsuranceNameEn = laborInsuranceNameEn == null ? null : laborInsuranceNameEn.trim();
    }

    public String getLaborInsuranceName() {
        return laborInsuranceName;
    }

    public void setLaborInsuranceName(String laborInsuranceName) {
        this.laborInsuranceName = laborInsuranceName == null ? null : laborInsuranceName.trim();
    }

    public String getLaborInsuranceStatus() {
        return laborInsuranceStatus;
    }

    public void setLaborInsuranceStatus(String laborInsuranceStatus) {
        this.laborInsuranceStatus = laborInsuranceStatus == null ? null : laborInsuranceStatus.trim();
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
}