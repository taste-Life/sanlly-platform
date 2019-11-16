package com.sanlly.purchase.models.output.MatterDemand;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.util.Date;

public class MatterDemandOutput {

    private Integer purcMatterDemandId;
	// 需求编号
	private String demandNo;
	// 采购单位
    private String purchaseCompany;
    private String purchaseCompanyLangLang;
    // 大类
    private String genaralType;
    private String genaralTypeLangLang;
    // 二级分类
    private String secondType;
    private String secondTypeLangLang;
	// 单位
    private String productUnit;
    private String productUnitLangLang;
    // 备件号
    private String productNum;
    // 备件key
    private String product;
    private String productLangLang;
    // 规格
    private String productSpecial;
    // 型号
    private String productModel;
    // 参考价格
    private BigDecimal purchasingReferencePrice;
    // 上次采购价格
    private BigDecimal lastPrice;
    // 权重
    private Double weight;
    // 备注
    private String comments;
    // 仓库
    private String warehouse;
    private String warehouseLangLang;
    // 数量
    private Double productCount;
    // 价格
    private BigDecimal price;
    // 仓库上传采购模式
    private String purchasingPattern;
    private String purchasingPatternLangLang;
    // 实际采购模式
    private String tenderType;
    private String tenderTypeLangLang;
    // 需求申请人
    private Integer applicantUserId;
    private String strApplicantUser;
    // 需求添加日期
    @JsonFormat(locale="zh", timezone="GMT+8", pattern = "yyyy-MM-dd")
    private Date demandTime;
    // 要求到货日期
    @JsonFormat(locale="zh", timezone="GMT+8", pattern = "yyyy-MM-dd")
    private Date requireArriveTime;
	// 采购状态
    private String isCreateOrder;
    private String isCreateOrderLangLang;
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
	public String getPurchaseCompany() {
		return purchaseCompany;
	}
	public void setPurchaseCompany(String purchaseCompany) {
		this.purchaseCompany = purchaseCompany;
	}
	public String getPurchaseCompanyLangLang() {
		return purchaseCompanyLangLang;
	}
	public void setPurchaseCompanyLangLang(String purchaseCompanyLangLang) {
		this.purchaseCompanyLangLang = purchaseCompanyLangLang;
	}
	public String getGenaralType() {
		return genaralType;
	}
	public void setGenaralType(String genaralType) {
		this.genaralType = genaralType;
	}
	public String getGenaralTypeLangLang() {
		return genaralTypeLangLang;
	}
	public void setGenaralTypeLangLang(String genaralTypeLangLang) {
		this.genaralTypeLangLang = genaralTypeLangLang;
	}
	public String getSecondType() {
		return secondType;
	}
	public void setSecondType(String secondType) {
		this.secondType = secondType;
	}
	public String getSecondTypeLangLang() {
		return secondTypeLangLang;
	}
	public void setSecondTypeLangLang(String secondTypeLangLang) {
		this.secondTypeLangLang = secondTypeLangLang;
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
	public String getProductLangLang() {
		return productLangLang;
	}
	public void setProductLangLang(String productLangLang) {
		this.productLangLang = productLangLang;
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
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getWarehouse() {
		return warehouse;
	}
	public void setWarehouse(String warehouse) {
		this.warehouse = warehouse;
	}
	public String getWarehouseLangLang() {
		return warehouseLangLang;
	}
	public void setWarehouseLangLang(String warehouseLangLang) {
		this.warehouseLangLang = warehouseLangLang;
	}
	public Double getProductCount() {
		return productCount;
	}
	public void setProductCount(Double productCount) {
		this.productCount = productCount;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public String getPurchasingPattern() {
		return purchasingPattern;
	}
	public void setPurchasingPattern(String purchasingPattern) {
		this.purchasingPattern = purchasingPattern;
	}
	public String getPurchasingPatternLangLang() {
		return purchasingPatternLangLang;
	}
	public void setPurchasingPatternLangLang(String purchasingPatternLangLang) {
		this.purchasingPatternLangLang = purchasingPatternLangLang;
	}
	public String getTenderType() {
		return tenderType;
	}
	public void setTenderType(String tenderType) {
		this.tenderType = tenderType;
	}
	public String getTenderTypeLangLang() {
		return tenderTypeLangLang;
	}
	public void setTenderTypeLangLang(String tenderTypeLangLang) {
		this.tenderTypeLangLang = tenderTypeLangLang;
	}
	public Integer getApplicantUserId() {
		return applicantUserId;
	}
	public void setApplicantUserId(Integer applicantUserId) {
		this.applicantUserId = applicantUserId;
	}
	public String getStrApplicantUser() {
		return strApplicantUser;
	}
	public void setStrApplicantUser(String strApplicantUser) {
		this.strApplicantUser = strApplicantUser;
	}
	public Date getDemandTime() {
		return demandTime;
	}
	public void setDemandTime(Date demandTime) {
		this.demandTime = demandTime;
	}
	public Date getRequireArriveTime() {
		return requireArriveTime;
	}
	public void setRequireArriveTime(Date requireArriveTime) {
		this.requireArriveTime = requireArriveTime;
	}
	public String getIsCreateOrder() {
		return isCreateOrder;
	}
	public void setIsCreateOrder(String isCreateOrder) {
		this.isCreateOrder = isCreateOrder;
	}
	public String getIsCreateOrderLangLang() {
		return isCreateOrderLangLang;
	}
	public void setIsCreateOrderLangLang(String isCreateOrderLangLang) {
		this.isCreateOrderLangLang = isCreateOrderLangLang;
	}
	public String getProductUnit() {
		return productUnit;
	}
	public void setProductUnit(String productUnit) {
		this.productUnit = productUnit;
	}
	public String getProductUnitLangLang() {
		return productUnitLangLang;
	}
	public void setProductUnitLangLang(String productUnitLangLang) {
		this.productUnitLangLang = productUnitLangLang;
	}
	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	public BigDecimal getPurchasingReferencePrice() {
		return purchasingReferencePrice;
	}
	public void setPurchasingReferencePrice(BigDecimal purchasingReferencePrice) {
		this.purchasingReferencePrice = purchasingReferencePrice;
	}
	public BigDecimal getLastPrice() {
		return lastPrice;
	}
	public void setLastPrice(BigDecimal lastPrice) {
		this.lastPrice = lastPrice;
	}
    
}
