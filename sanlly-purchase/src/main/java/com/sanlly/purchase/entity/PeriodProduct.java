package com.sanlly.purchase.entity;

import java.math.BigDecimal;
import java.util.Date;

public class PeriodProduct {
    private Integer purcPeriodProductId;

    private String demandNo;

    private Integer tenderPurchaseId;

    private String product;

    private String productNum;

    private String productBrand;

    private String productStandards;

    private String productModel;

    private String purchaseCompany;

    private String warehouse;

    private String productUnit;

    private BigDecimal productPrice;

    private String invoice;

    private String supplier;

    private String tenderType;

    private Date endTime;

    private String comments;

    private Date priceChangeTime;

    private Integer priceChangePerson;

    private String isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getPurcPeriodProductId() {
        return purcPeriodProductId;
    }

    public void setPurcPeriodProductId(Integer purcPeriodProductId) {
        this.purcPeriodProductId = purcPeriodProductId;
    }

    public String getDemandNo() {
        return demandNo;
    }

    public void setDemandNo(String demandNo) {
        this.demandNo = demandNo == null ? null : demandNo.trim();
    }

    public Integer getTenderPurchaseId() {
        return tenderPurchaseId;
    }

    public void setTenderPurchaseId(Integer tenderPurchaseId) {
        this.tenderPurchaseId = tenderPurchaseId;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product == null ? null : product.trim();
    }

    public String getProductNum() {
        return productNum;
    }

    public void setProductNum(String productNum) {
        this.productNum = productNum == null ? null : productNum.trim();
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

    public String getPurchaseCompany() {
        return purchaseCompany;
    }

    public void setPurchaseCompany(String purchaseCompany) {
        this.purchaseCompany = purchaseCompany == null ? null : purchaseCompany.trim();
    }

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse == null ? null : warehouse.trim();
    }

    public String getProductUnit() {
        return productUnit;
    }

    public void setProductUnit(String productUnit) {
        this.productUnit = productUnit == null ? null : productUnit.trim();
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public String getInvoice() {
        return invoice;
    }

    public void setInvoice(String invoice) {
        this.invoice = invoice == null ? null : invoice.trim();
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier == null ? null : supplier.trim();
    }

    public String getTenderType() {
        return tenderType;
    }

    public void setTenderType(String tenderType) {
        this.tenderType = tenderType == null ? null : tenderType.trim();
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
    }

    public Date getPriceChangeTime() {
        return priceChangeTime;
    }

    public void setPriceChangeTime(Date priceChangeTime) {
        this.priceChangeTime = priceChangeTime;
    }

    public Integer getPriceChangePerson() {
        return priceChangePerson;
    }

    public void setPriceChangePerson(Integer priceChangePerson) {
        this.priceChangePerson = priceChangePerson;
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
}