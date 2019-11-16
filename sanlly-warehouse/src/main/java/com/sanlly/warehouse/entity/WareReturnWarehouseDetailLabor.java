package com.sanlly.warehouse.entity;

import java.util.Date;

public class WareReturnWarehouseDetailLabor {
    private Integer wareReturnWarehouseDetailLaborId;

    private Integer returnId;

    private Date returnDate;

    private Integer operator;

    private String spareParts;

    private String sparePartsBatch;

    private String model;

    private Double returnNum;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private Integer stockoutDetailId;

    public Integer getWareReturnWarehouseDetailLaborId() {
        return wareReturnWarehouseDetailLaborId;
    }

    public void setWareReturnWarehouseDetailLaborId(Integer wareReturnWarehouseDetailLaborId) {
        this.wareReturnWarehouseDetailLaborId = wareReturnWarehouseDetailLaborId;
    }

    public Integer getReturnId() {
        return returnId;
    }

    public void setReturnId(Integer returnId) {
        this.returnId = returnId;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public Integer getOperator() {
        return operator;
    }

    public void setOperator(Integer operator) {
        this.operator = operator;
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

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
    }

    public Double getReturnNum() {
        return returnNum;
    }

    public void setReturnNum(Double returnNum) {
        this.returnNum = returnNum;
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

    public Integer getStockoutDetailId() {
        return stockoutDetailId;
    }

    public void setStockoutDetailId(Integer stockoutDetailId) {
        this.stockoutDetailId = stockoutDetailId;
    }
}