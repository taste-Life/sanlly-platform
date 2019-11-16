package com.sanlly.purchase.entity;

import java.math.BigDecimal;
import java.util.Date;

public class PeriodProductRemind {
    private Integer purcPeriodProductRemindId;

    private Integer tenderPurchaseId;

    private String productNum;

    private String product;

    private String productBrand;

    private String productStandards;

    private String productModel;

    private String productUnit;

    private String purchaseCompany;

    private String reciverAddress;

    private String purchaseType;

    private Date purchaseDeadline;

    private BigDecimal lastPrice;

    private BigDecimal lastTotalAmount;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getPurcPeriodProductRemindId() {
        return purcPeriodProductRemindId;
    }

    public void setPurcPeriodProductRemindId(Integer purcPeriodProductRemindId) {
        this.purcPeriodProductRemindId = purcPeriodProductRemindId;
    }

    public Integer getTenderPurchaseId() {
        return tenderPurchaseId;
    }

    public void setTenderPurchaseId(Integer tenderPurchaseId) {
        this.tenderPurchaseId = tenderPurchaseId;
    }

    public String getProductNum() {
        return productNum;
    }

    public void setProductNum(String productNum) {
        this.productNum = productNum == null ? null : productNum.trim();
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product == null ? null : product.trim();
    }

    public String getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand == null ? null : productBrand.trim();
    }

    public String getProductStandards() {
        return productStandards;
    }

    public void setProductStandards(String productStandards) {
        this.productStandards = productStandards == null ? null : productStandards.trim();
    }

    public String getProductModel() {
        return productModel;
    }

    public void setProductModel(String productModel) {
        this.productModel = productModel == null ? null : productModel.trim();
    }

    public String getProductUnit() {
        return productUnit;
    }

    public void setProductUnit(String productUnit) {
        this.productUnit = productUnit == null ? null : productUnit.trim();
    }

    public String getPurchaseCompany() {
        return purchaseCompany;
    }

    public void setPurchaseCompany(String purchaseCompany) {
        this.purchaseCompany = purchaseCompany == null ? null : purchaseCompany.trim();
    }

    public String getReciverAddress() {
        return reciverAddress;
    }

    public void setReciverAddress(String reciverAddress) {
        this.reciverAddress = reciverAddress == null ? null : reciverAddress.trim();
    }

    public String getPurchaseType() {
        return purchaseType;
    }

    public void setPurchaseType(String purchaseType) {
        this.purchaseType = purchaseType == null ? null : purchaseType.trim();
    }

    public Date getPurchaseDeadline() {
        return purchaseDeadline;
    }

    public void setPurchaseDeadline(Date purchaseDeadline) {
        this.purchaseDeadline = purchaseDeadline;
    }

    public BigDecimal getLastPrice() {
        return lastPrice;
    }

    public void setLastPrice(BigDecimal lastPrice) {
        this.lastPrice = lastPrice;
    }

    public BigDecimal getLastTotalAmount() {
        return lastTotalAmount;
    }

    public void setLastTotalAmount(BigDecimal lastTotalAmount) {
        this.lastTotalAmount = lastTotalAmount;
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