package com.sanlly.purchase.models.input.demand;

import java.util.Date;

/**
 * @Description: TODO
 * @ClassName: editMatterDemandInput
 * @Date: 2019/11/4 13:54
 * @Version 1.0
 * @Author mqz
 */
public class editMatterDemandInput {
    private Integer purcMatterDemandId;
    // 需求编号
        private String demandNo;
        // 是否日常采购
        private String isDayPruchase;
        // 备件号
        private String productNum;
        // 备件key
        private String product;
        // 大类
        private String genaralType;
        // 二级分类
        private String secondType;
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
        // 采购模式
        private String purchasingPattern;
        // 需求申请人
        private Integer applicantUserId;
        // 需求添加日期
        private Date demandTime;
        // 审核状态
        private String auditStatus;
        // 备注
        private String comments;

    public Integer getPurcMatterDemandId() {
        return purcMatterDemandId;
    }

    public void setPurcMatterDemandId(Integer purcMatterDemandId) {
        this.purcMatterDemandId = purcMatterDemandId;
    }

    public String getDemandNo() {
        return demandNo;
    }

    public void setDemandNo(String demandNo) {
        this.demandNo = demandNo;
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

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getGenaralType() {
        return genaralType;
    }

    public void setGenaralType(String genaralType) {
        this.genaralType = genaralType;
    }

    public String getSecondType() {
        return secondType;
    }

    public void setSecondType(String secondType) {
        this.secondType = secondType;
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

    public Date getRequireArriveTime() {
        return requireArriveTime;
    }

    public void setRequireArriveTime(Date requireArriveTime) {
        this.requireArriveTime = requireArriveTime;
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

    public String getPurchasingPattern() {
        return purchasingPattern;
    }

    public void setPurchasingPattern(String purchasingPattern) {
        this.purchasingPattern = purchasingPattern;
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

    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
