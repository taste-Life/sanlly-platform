package com.sanlly.warehouse.entity;

import java.util.Date;

public class WareCBSWarehouseType {
    private Integer wareCbsWarehouseTypeId;

    private String key;

    private String cbsWarehouseTypeNameEn;

    private String cbsWarehouseTypeName;

    private String isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private String code;

    public Integer getWareCbsWarehouseTypeId() {
        return wareCbsWarehouseTypeId;
    }

    public void setWareCbsWarehouseTypeId(Integer wareCbsWarehouseTypeId) {
        this.wareCbsWarehouseTypeId = wareCbsWarehouseTypeId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }

    public String getCbsWarehouseTypeNameEn() {
        return cbsWarehouseTypeNameEn;
    }

    public void setCbsWarehouseTypeNameEn(String cbsWarehouseTypeNameEn) {
        this.cbsWarehouseTypeNameEn = cbsWarehouseTypeNameEn == null ? null : cbsWarehouseTypeNameEn.trim();
    }

    public String getCbsWarehouseTypeName() {
        return cbsWarehouseTypeName;
    }

    public void setCbsWarehouseTypeName(String cbsWarehouseTypeName) {
        this.cbsWarehouseTypeName = cbsWarehouseTypeName == null ? null : cbsWarehouseTypeName.trim();
    }

    public String getIsDel() {
        return isDel;
    }

    public void setIsDel(String isDel) {
        this.isDel = isDel == null ? null : isDel.trim();
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }
}