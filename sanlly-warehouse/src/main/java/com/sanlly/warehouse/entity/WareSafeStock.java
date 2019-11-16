package com.sanlly.warehouse.entity;

import java.util.Date;

public class WareSafeStock {
    private Integer wareSafeStockId;

    private String warehouse;

    private String spareParts;

    private Double safeStockNum;

    private Double stockUpperNum;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getWareSafeStockId() {
        return wareSafeStockId;
    }

    public void setWareSafeStockId(Integer wareSafeStockId) {
        this.wareSafeStockId = wareSafeStockId;
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

    public Double getSafeStockNum() {
        return safeStockNum;
    }

    public void setSafeStockNum(Double safeStockNum) {
        this.safeStockNum = safeStockNum;
    }

    public Double getStockUpperNum() {
        return stockUpperNum;
    }

    public void setStockUpperNum(Double stockUpperNum) {
        this.stockUpperNum = stockUpperNum;
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