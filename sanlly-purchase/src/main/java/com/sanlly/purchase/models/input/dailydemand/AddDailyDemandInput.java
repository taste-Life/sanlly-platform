package com.sanlly.purchase.models.input.dailydemand;

import java.util.Date;

public class AddDailyDemandInput {
    // 采购状态
    private Integer isCreateOrder;
    // 是否日常采购
    private String isDayPruchase;
    // 备件号
    private String productNum;

    // 品牌
    private String productBrand;
    // 规格
    private String productSpecial;
    // 型号
    private String productModel;
    // 数量
    private Double productCount;
    // 要求到货日期
    private Date requireArriveTime;
    // 采购单位
    private String purchaseCompany;
    // 仓库
    private String warehouse;
    // 需求申请人
    private Integer applicantUserId;
    // 需求添加日期
    private Date demandTime;
    // 审核状态
    // 备注
    private String comments;
    //商品单位
    private String sparePartsUnit;
    //送货地址
    private String address;

    public Date getRequireArriveTime() {
        return requireArriveTime;
    }

    public void setRequireArriveTime(Date requireArriveTime) {
        this.requireArriveTime = requireArriveTime;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSparePartsUnit() {
        return sparePartsUnit;
    }

    public void setSparePartsUnit(String sparePartsUnit) {
        this.sparePartsUnit = sparePartsUnit;
    }

    public Integer getIsCreateOrder() {
        return isCreateOrder;
    }

    public void setIsCreateOrder(Integer isCreateOrder) {
        this.isCreateOrder = isCreateOrder;
    }

    public String getIsDayPruchase() {
        return isDayPruchase;
    }

    public void setIsDayPruchase(String isDayPruchase) {
        this.isDayPruchase = isDayPruchase;
    }

    public String getProductNum() {
        return productNum;
    }

    public void setProductNum(String productNum) {
        this.productNum = productNum;
    }

    public String getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    public String getProductSpecial() {
        return productSpecial;
    }

    public void setProductSpecial(String productSpecial) {
        this.productSpecial = productSpecial;
    }

    public String getProductModel() {
        return productModel;
    }

    public void setProductModel(String productModel) {
        this.productModel = productModel;
    }

    public Double getProductCount() {
        return productCount;
    }

    public void setProductCount(Double productCount) {
        this.productCount = productCount;
    }

    public String getPurchaseCompany() {
        return purchaseCompany;
    }

    public void setPurchaseCompany(String purchaseCompany) {
        this.purchaseCompany = purchaseCompany;
    }

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
    }

    public Integer getApplicantUserId() {
        return applicantUserId;
    }

    public void setApplicantUserId(Integer applicantUserId) {
        this.applicantUserId = applicantUserId;
    }

    public Date getDemandTime() {
        return demandTime;
    }

    public void setDemandTime(Date demandTime) {
        this.demandTime = demandTime;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }


}
