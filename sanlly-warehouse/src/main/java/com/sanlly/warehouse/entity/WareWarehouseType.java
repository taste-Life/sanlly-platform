package com.sanlly.warehouse.entity;

import java.util.Date;

public class WareWarehouseType {
    private Integer wareWarehouseTypeId;

    private String key;

    private String warehouseTypeNameEn;

    private String warehouseTypeName;

    private String cbsWarehouseTypeNameEn;

    private String cbsWarehouseTypeName;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getWareWarehouseTypeId() {
        return wareWarehouseTypeId;
    }

    public void setWareWarehouseTypeId(Integer wareWarehouseTypeId) {
        this.wareWarehouseTypeId = wareWarehouseTypeId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }

    public String getWarehouseTypeNameEn() {
        return warehouseTypeNameEn;
    }

    public void setWarehouseTypeNameEn(String warehouseTypeNameEn) {
        this.warehouseTypeNameEn = warehouseTypeNameEn == null ? null : warehouseTypeNameEn.trim();
    }

    public String getWarehouseTypeName() {
        return warehouseTypeName;
    }

    public void setWarehouseTypeName(String warehouseTypeName) {
        this.warehouseTypeName = warehouseTypeName == null ? null : warehouseTypeName.trim();
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