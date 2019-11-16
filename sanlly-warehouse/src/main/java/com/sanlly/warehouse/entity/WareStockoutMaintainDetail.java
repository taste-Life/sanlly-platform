package com.sanlly.warehouse.entity;

import java.util.Date;

public class WareStockoutMaintainDetail {
    private Integer wareStockoutMaintainDetailId;

    private Integer stockoutMaintain;

    private String defaultWarehouseType;

    private String stockoutStatus;

    private Double stockoutNum;

    private String sparePartsBatch;

    private String spareParts;

    private String yard;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getWareStockoutMaintainDetailId() {
        return wareStockoutMaintainDetailId;
    }

    public void setWareStockoutMaintainDetailId(Integer wareStockoutMaintainDetailId) {
        this.wareStockoutMaintainDetailId = wareStockoutMaintainDetailId;
    }

    public Integer getStockoutMaintain() {
        return stockoutMaintain;
    }

    public void setStockoutMaintain(Integer stockoutMaintain) {
        this.stockoutMaintain = stockoutMaintain;
    }

    public String getDefaultWarehouseType() {
        return defaultWarehouseType;
    }

    public void setDefaultWarehouseType(String defaultWarehouseType) {
        this.defaultWarehouseType = defaultWarehouseType == null ? null : defaultWarehouseType.trim();
    }

    public String getStockoutStatus() {
        return stockoutStatus;
    }

    public void setStockoutStatus(String stockoutStatus) {
        this.stockoutStatus = stockoutStatus == null ? null : stockoutStatus.trim();
    }

    public Double getStockoutNum() {
        return stockoutNum;
    }

    public void setStockoutNum(Double stockoutNum) {
        this.stockoutNum = stockoutNum;
    }

    public String getSparePartsBatch() {
        return sparePartsBatch;
    }

    public void setSparePartsBatch(String sparePartsBatch) {
        this.sparePartsBatch = sparePartsBatch == null ? null : sparePartsBatch.trim();
    }

    public String getSpareParts() {
        return spareParts;
    }

    public void setSpareParts(String spareParts) {
        this.spareParts = spareParts == null ? null : spareParts.trim();
    }

    public String getYard() {
        return yard;
    }

    public void setYard(String yard) {
        this.yard = yard == null ? null : yard.trim();
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