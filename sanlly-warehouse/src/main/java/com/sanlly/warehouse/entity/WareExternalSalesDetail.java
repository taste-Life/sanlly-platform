package com.sanlly.warehouse.entity;

import java.math.BigDecimal;
import java.util.Date;

public class WareExternalSalesDetail {
    private Integer wareExternalSalesDetailId;

    private Integer wareExternalSales;

    private String warehouseType;

    private String warehouse;

    private String spareParts;

    private String sparePartsBatch;

    private Double externalSalesNum;

    private Double stockoutNum;

    private BigDecimal price;

    private String remark;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getWareExternalSalesDetailId() {
        return wareExternalSalesDetailId;
    }

    public void setWareExternalSalesDetailId(Integer wareExternalSalesDetailId) {
        this.wareExternalSalesDetailId = wareExternalSalesDetailId;
    }

    public Integer getWareExternalSales() {
        return wareExternalSales;
    }

    public void setWareExternalSales(Integer wareExternalSales) {
        this.wareExternalSales = wareExternalSales;
    }

    public String getWarehouseType() {
        return warehouseType;
    }

    public void setWarehouseType(String warehouseType) {
        this.warehouseType = warehouseType == null ? null : warehouseType.trim();
    }

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse == null ? null : warehouse.trim();
    }

    public String getSpareParts() {
        return spareParts;
    }

    public void setSpareParts(String spareParts) {
        this.spareParts = spareParts == null ? null : spareParts.trim();
    }

    public String getSparePartsBatch() {
        return sparePartsBatch;
    }

    public void setSparePartsBatch(String sparePartsBatch) {
        this.sparePartsBatch = sparePartsBatch == null ? null : sparePartsBatch.trim();
    }

    public Double getExternalSalesNum() {
        return externalSalesNum;
    }

    public void setExternalSalesNum(Double externalSalesNum) {
        this.externalSalesNum = externalSalesNum;
    }

    public Double getStockoutNum() {
        return stockoutNum;
    }

    public void setStockoutNum(Double stockoutNum) {
        this.stockoutNum = stockoutNum;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
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