package com.sanlly.purchase.entity;

import java.math.BigDecimal;
import java.util.Date;

public class SupplierTenderProduct {
    private Integer purcSupplierTenderProductId;

    private Integer tenderPurchaseId;

    private Integer supplierTenderId;

    private BigDecimal price;

    private String demandNo;

    private String product;

    private String productNum;

    private String productName;

    private Double weight;

    private Double productCount;

    private String invoice;

    private Date arriveTime;

    private String sparePartsUnit;

    private Integer rank;

    private String remark;

    private Integer createUser;

    private Date createTime;

    private Date updateTime;

    private Integer updateUser;

    private BigDecimal noTaxPrice;

    private String isWin;

    public Integer getPurcSupplierTenderProductId() {
        return purcSupplierTenderProductId;
    }

    public void setPurcSupplierTenderProductId(Integer purcSupplierTenderProductId) {
        this.purcSupplierTenderProductId = purcSupplierTenderProductId;
    }

    public Integer getTenderPurchaseId() {
        return tenderPurchaseId;
    }

    public void setTenderPurchaseId(Integer tenderPurchaseId) {
        this.tenderPurchaseId = tenderPurchaseId;
    }

    public Integer getSupplierTenderId() {
        return supplierTenderId;
    }

    public void setSupplierTenderId(Integer supplierTenderId) {
        this.supplierTenderId = supplierTenderId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getDemandNo() {
        return demandNo;
    }

    public void setDemandNo(String demandNo) {
        this.demandNo = demandNo == null ? null : demandNo.trim();
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

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getProductCount() {
        return productCount;
    }

    public void setProductCount(Double productCount) {
        this.productCount = productCount;
    }

    public String getInvoice() {
        return invoice;
    }

    public void setInvoice(String invoice) {
        this.invoice = invoice == null ? null : invoice.trim();
    }

    public Date getArriveTime() {
        return arriveTime;
    }

    public void setArriveTime(Date arriveTime) {
        this.arriveTime = arriveTime;
    }

    public String getSparePartsUnit() {
        return sparePartsUnit;
    }

    public void setSparePartsUnit(String sparePartsUnit) {
        this.sparePartsUnit = sparePartsUnit == null ? null : sparePartsUnit.trim();
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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

    public BigDecimal getNoTaxPrice() {
        return noTaxPrice;
    }

    public void setNoTaxPrice(BigDecimal noTaxPrice) {
        this.noTaxPrice = noTaxPrice;
    }

    public String getIsWin() {
        return isWin;
    }

    public void setIsWin(String isWin) {
        this.isWin = isWin == null ? null : isWin.trim();
    }
}