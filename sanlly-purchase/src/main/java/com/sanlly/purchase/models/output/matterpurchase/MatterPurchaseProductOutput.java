package com.sanlly.purchase.models.output.matterpurchase;

import java.math.BigDecimal;

/**
 * 
* Description: 采购单列表-备件明细
* @ClassName: MatterPurchaseProductOutput
* @date 2019年8月8日
*
* @author jlx
 */
public class MatterPurchaseProductOutput {
	
    private Integer purcMatterTenderProductId;
    // 需求编号
    private String demandNo;
	// 备件号
    private String productNum;
	// 备件大类
    private String sparePartsCategoriesLangLang;
	// 二级分类
    private String sparePartsCategoriesDetailsLangLang;
	// 备件名称
    private String productLangLang;
	// 规格
    private String productSpecial;
	// 型号
    private String productModel;
    // 单位
    private String sparePartsUnitLangLang;
	// 数量
    private Double productCount;
	// 单价
    private BigDecimal price;
    // 上次采购价格
    private BigDecimal lastPrice;
	// 总金额
    private BigDecimal totalMoney;
	// 备注
    private String comments;
    
	public Integer getPurcMatterTenderProductId() {
		return purcMatterTenderProductId;
	}
	public void setPurcMatterTenderProductId(Integer purcMatterTenderProductId) {
		this.purcMatterTenderProductId = purcMatterTenderProductId;
	}
	public String getDemandNo() {
		return demandNo;
	}
	public void setDemandNo(String demandNo) {
		this.demandNo = demandNo;
	}
	public String getProductNum() {
		return productNum;
	}
	public void setProductNum(String productNum) {
		this.productNum = productNum;
	}
	public String getSparePartsCategoriesLangLang() {
		return sparePartsCategoriesLangLang;
	}
	public void setSparePartsCategoriesLangLang(String sparePartsCategoriesLangLang) {
		this.sparePartsCategoriesLangLang = sparePartsCategoriesLangLang;
	}
	public String getSparePartsCategoriesDetailsLangLang() {
		return sparePartsCategoriesDetailsLangLang;
	}
	public void setSparePartsCategoriesDetailsLangLang(String sparePartsCategoriesDetailsLangLang) {
		this.sparePartsCategoriesDetailsLangLang = sparePartsCategoriesDetailsLangLang;
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
	public String getSparePartsUnitLangLang() {
		return sparePartsUnitLangLang;
	}
	public void setSparePartsUnitLangLang(String sparePartsUnitLangLang) {
		this.sparePartsUnitLangLang = sparePartsUnitLangLang;
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
	public BigDecimal getLastPrice() {
		return lastPrice;
	}
	public void setLastPrice(BigDecimal lastPrice) {
		this.lastPrice = lastPrice;
	}
	public BigDecimal getTotalMoney() {
		return totalMoney;
	}
	public void setTotalMoney(BigDecimal totalMoney) {
		this.totalMoney = totalMoney;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
    
    
    
}
