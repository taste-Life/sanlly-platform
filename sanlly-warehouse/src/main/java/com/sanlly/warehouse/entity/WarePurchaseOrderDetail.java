package com.sanlly.warehouse.entity;

import java.math.BigDecimal;
import java.util.Date;

public class WarePurchaseOrderDetail {
    private Integer warePurchaseOrderDetailId;

    private Integer warePurchaseOrderId;

    private String stockoutStatus;

    private String stockinStatus;

    private String spareParts;

    private Double num;

    private Double surplusNum;

    private BigDecimal freight;

    private BigDecimal price;

    private BigDecimal totalAmount;

    private String company;

    private String outWarehouse;

    private String isFinish;

    private String remark;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getWarePurchaseOrderDetailId() {
        return warePurchaseOrderDetailId;
    }

    public void setWarePurchaseOrderDetailId(Integer warePurchaseOrderDetailId) {
        this.warePurchaseOrderDetailId = warePurchaseOrderDetailId;
    }

    public Integer getWarePurchaseOrderId() {
        return warePurchaseOrderId;
    }

    public void setWarePurchaseOrderId(Integer warePurchaseOrderId) {
        this.warePurchaseOrderId = warePurchaseOrderId;
    }

    public String getStockoutStatus() {
        return stockoutStatus;
    }

    public void setStockoutStatus(String stockoutStatus) {
        this.stockoutStatus = stockoutStatus == null ? null : stockoutStatus.trim();
    }

    public String getStockinStatus() {
        return stockinStatus;
    }

    public void setStockinStatus(String stockinStatus) {
        this.stockinStatus = stockinStatus == null ? null : stockinStatus.trim();
    }

    public String getSpareParts() {
        return spareParts;
    }

    public void setSpareParts(String spareParts) {
        this.spareParts = spareParts == null ? null : spareParts.trim();
    }

    public Double getNum() {
        return num;
    }

    public void setNum(Double num) {
        this.num = num;
    }

    public Double getSurplusNum() {
        return surplusNum;
    }

    public void setSurplusNum(Double surplusNum) {
        this.surplusNum = surplusNum;
    }

    public BigDecimal getFreight() {
        return freight;
    }

    public void setFreight(BigDecimal freight) {
        this.freight = freight;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getOutWarehouse() {
        return outWarehouse;
    }

    public void setOutWarehouse(String outWarehouse) {
        this.outWarehouse = outWarehouse == null ? null : outWarehouse.trim();
    }

    public String getIsFinish() {
        return isFinish;
    }

    public void setIsFinish(String isFinish) {
        this.isFinish = isFinish == null ? null : isFinish.trim();
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