package com.sanlly.purchase.entity;

import java.math.BigDecimal;
import java.util.Date;

public class PurchaseOrderDetail {
    private Integer purcPurchaseOrderDetailId;

    private String demandNo;

    private Integer purcPurchaseOrder;

    private Date demandTime;

    private String product;

    private String sparePartsNo;

    private Double orderNum;

    private Double deliverNum;

    private Date requiredDeliveryDate;

    private BigDecimal unitPrice;

    private String specification;

    private String brand;

    private String model;

    private String comments;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private String sparePartsUnit;

    private String invoice;

    public Integer getPurcPurchaseOrderDetailId() {
        return purcPurchaseOrderDetailId;
    }

    public void setPurcPurchaseOrderDetailId(Integer purcPurchaseOrderDetailId) {
        this.purcPurchaseOrderDetailId = purcPurchaseOrderDetailId;
    }

    public String getDemandNo() {
        return demandNo;
    }

    public void setDemandNo(String demandNo) {
        this.demandNo = demandNo == null ? null : demandNo.trim();
    }

    public Integer getPurcPurchaseOrder() {
        return purcPurchaseOrder;
    }

    public void setPurcPurchaseOrder(Integer purcPurchaseOrder) {
        this.purcPurchaseOrder = purcPurchaseOrder;
    }

    public Date getDemandTime() {
        return demandTime;
    }

    public void setDemandTime(Date demandTime) {
        this.demandTime = demandTime;
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

    public Double getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Double orderNum) {
        this.orderNum = orderNum;
    }

    public Double getDeliverNum() {
        return deliverNum;
    }

    public void setDeliverNum(Double deliverNum) {
        this.deliverNum = deliverNum;
    }

    public Date getRequiredDeliveryDate() {
        return requiredDeliveryDate;
    }

    public void setRequiredDeliveryDate(Date requiredDeliveryDate) {
        this.requiredDeliveryDate = requiredDeliveryDate;
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

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
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

    public String getSparePartsUnit() {
        return sparePartsUnit;
    }

    public void setSparePartsUnit(String sparePartsUnit) {
        this.sparePartsUnit = sparePartsUnit == null ? null : sparePartsUnit.trim();
    }

    public String getInvoice() {
        return invoice;
    }

    public void setInvoice(String invoice) {
        this.invoice = invoice == null ? null : invoice.trim();
    }
}