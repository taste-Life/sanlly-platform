package com.sanlly.purchase.entity;

import java.math.BigDecimal;
import java.util.Date;

public class PurchaseDeliveryDetail {
    private Integer purcPurchaseDeliveryDetailId;

    private String demandNo;

    private Integer purcPurchaseDelivery;

    private String product;

    private String sparePartsNo;

    private BigDecimal entryPrice;

    private BigDecimal unitPrice;

    private String specification;

    private String brand;

    private String model;

    private Date requiredDeliveryDate;

    private Double deliveryCount;

    private Double reciveCount;

    private String sparePartsUnit;

    private BigDecimal reciveSumAmount;

    private String comments;

    private String isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private Date actualArrivalDate;

    public Integer getPurcPurchaseDeliveryDetailId() {
        return purcPurchaseDeliveryDetailId;
    }

    public void setPurcPurchaseDeliveryDetailId(Integer purcPurchaseDeliveryDetailId) {
        this.purcPurchaseDeliveryDetailId = purcPurchaseDeliveryDetailId;
    }

    public String getDemandNo() {
        return demandNo;
    }

    public void setDemandNo(String demandNo) {
        this.demandNo = demandNo == null ? null : demandNo.trim();
    }

    public Integer getPurcPurchaseDelivery() {
        return purcPurchaseDelivery;
    }

    public void setPurcPurchaseDelivery(Integer purcPurchaseDelivery) {
        this.purcPurchaseDelivery = purcPurchaseDelivery;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product == null ? null : product.trim();
    }

    public String getSparePartsNo() {
        return sparePartsNo;
    }

    public void setSparePartsNo(String sparePartsNo) {
        this.sparePartsNo = sparePartsNo == null ? null : sparePartsNo.trim();
    }

    public BigDecimal getEntryPrice() {
        return entryPrice;
    }

    public void setEntryPrice(BigDecimal entryPrice) {
        this.entryPrice = entryPrice;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification == null ? null : specification.trim();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
    }

    public Date getRequiredDeliveryDate() {
        return requiredDeliveryDate;
    }

    public void setRequiredDeliveryDate(Date requiredDeliveryDate) {
        this.requiredDeliveryDate = requiredDeliveryDate;
    }

    public Double getDeliveryCount() {
        return deliveryCount;
    }

    public void setDeliveryCount(Double deliveryCount) {
        this.deliveryCount = deliveryCount;
    }

    public Double getReciveCount() {
        return reciveCount;
    }

    public void setReciveCount(Double reciveCount) {
        this.reciveCount = reciveCount;
    }

    public String getSparePartsUnit() {
        return sparePartsUnit;
    }

    public void setSparePartsUnit(String sparePartsUnit) {
        this.sparePartsUnit = sparePartsUnit == null ? null : sparePartsUnit.trim();
    }

    public BigDecimal getReciveSumAmount() {
        return reciveSumAmount;
    }

    public void setReciveSumAmount(BigDecimal reciveSumAmount) {
        this.reciveSumAmount = reciveSumAmount;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
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

    public Date getActualArrivalDate() {
        return actualArrivalDate;
    }

    public void setActualArrivalDate(Date actualArrivalDate) {
        this.actualArrivalDate = actualArrivalDate;
    }
}