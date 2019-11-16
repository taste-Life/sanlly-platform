package com.sanlly.purchase.entity;

import java.util.Date;

public class ProcureType {
    private Integer purcProcureTypeId;

    private String procureTypeName;

    private String procureTypeEn;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private String key;

    public Integer getPurcProcureTypeId() {
        return purcProcureTypeId;
    }

    public void setPurcProcureTypeId(Integer purcProcureTypeId) {
        this.purcProcureTypeId = purcProcureTypeId;
    }

    public String getProcureTypeName() {
        return procureTypeName;
    }

    public void setProcureTypeName(String procureTypeName) {
        this.procureTypeName = procureTypeName == null ? null : procureTypeName.trim();
    }

    public String getProcureTypeEn() {
        return procureTypeEn;
    }

    public void setProcureTypeEn(String procureTypeEn) {
        this.procureTypeEn = procureTypeEn == null ? null : procureTypeEn.trim();
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

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }
}