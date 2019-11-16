package com.sanlly.purchase.models.output.dailydemand;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Description: TODO
 * @ClassName: DailyDemandOutput
 * @Version 1.0
 * @Author mqz
 */
public class DailyDemandOutput {
    //主键
    private Integer purcMatterDemandId;
    //商品名称
    private String productNum;
    //需求编号
    private String demandNo;
    //品牌
    private String productBrand;
    //规格
    private String productSpecial;
    //型号
    private String productModel;
    //数量
    private Double productCount;
    //要求到货日期
    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date requireArriveTime;

    // 采购单位
    private String purchaseCompany;
    private String purchaseCompanyLangLang;
    // 权重
    private Double weight;
    // 价格
    private BigDecimal price;
    //采购类型
    private String purchaseType;

    private String warehouse;
    //需求申请人
    private Integer applicantUserId;
    //删除标识
    private String isDel;
    //需求申请时间
    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date demandTime;
    //是否生成采购单
    private String isCreateOrder;
    //审核状态
    private String auditStatus;
    //备注
    private String comments;
    private String auditStatusLangLang;
    // 需求申请人
    private Integer applicantUser;
    private String strApplicantUser;
    private String isCreateOrderLangLang;
    // 实际采购模式
    private String tenderType;
    private String tenderTypeLangLang;
    //商品单位
    private String sparePartsUnit;
    //送货地址
    private String address;

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

    public String getTenderTypeLangLang() {
        return tenderTypeLangLang;
    }

    public void setTenderTypeLangLang(String tenderTypeLangLang) {
        this.tenderTypeLangLang = tenderTypeLangLang;
    }

    public String getTenderType() {
        return tenderType;
    }

    public void setTenderType(String tenderType) {
        this.tenderType = tenderType;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getDemandNo() {
        return demandNo;
    }

    public void setDemandNo(String demandNo) {
        this.demandNo = demandNo;
    }

    public String getIsCreateOrderLangLang() {
        return isCreateOrderLangLang;
    }

    public void setIsCreateOrderLangLang(String isCreateOrderLangLang) {
        this.isCreateOrderLangLang = isCreateOrderLangLang;
    }

    public String getPurchaseCompanyLangLang() {
        return purchaseCompanyLangLang;
    }

    public void setPurchaseCompanyLangLang(String purchaseCompanyLangLang) {
        this.purchaseCompanyLangLang = purchaseCompanyLangLang;
    }

    public String getAuditStatusLangLang() {
        return auditStatusLangLang;
    }

    public void setAuditStatusLangLang(String auditStatusLangLang) {
        this.auditStatusLangLang = auditStatusLangLang;
    }

    public Integer getApplicantUser() {
        return applicantUser;
    }

    public void setApplicantUser(Integer applicantUser) {
        this.applicantUser = applicantUser;
    }

    public String getStrApplicantUser() {
        return strApplicantUser;
    }

    public void setStrApplicantUser(String strApplicantUser) {
        this.strApplicantUser = strApplicantUser;
    }

    public Integer getPurcMatterDemandId() {
        return purcMatterDemandId;
    }

    public void setPurcMatterDemandId(Integer purcMatterDemandId) {
        this.purcMatterDemandId = purcMatterDemandId;
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

    public String getPurchaseType() {
        return purchaseType;
    }

    public void setPurchaseType(String purchaseType) {
        this.purchaseType = purchaseType;
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

    public String getIsDel() {
        return isDel;
    }

    public void setIsDel(String isDel) {
        this.isDel = isDel;
    }

    public Date getDemandTime() {
        return demandTime;
    }

    public void setDemandTime(Date demandTime) {
        this.demandTime = demandTime;
    }

    public String getIsCreateOrder() {
        return isCreateOrder;
    }

    public void setIsCreateOrder(String isCreateOrder) {
        this.isCreateOrder = isCreateOrder;
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
