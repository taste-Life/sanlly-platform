package com.sanlly.purchase.models.output.matterinquiry;

import java.math.BigDecimal;
import java.util.List;

/**
 * 
 * @Package com.sanlly.purchase.models.output.matterbidding 
 * @Description: 供应商报价商品详细信息
 * @author jlx   
 * @date 2019年8月27日 上午11:10:35 
 * @version V1.0   
 */
public class MatterPeriodProductOutput {
    private Integer purcMatterTenderProductId;
	// 需求编号
	private String demandNo;
	// 备件
	private String product;
	private String productLangLang;
	// 备件号
	private String sparePartsNo;
	// 大类
	private String genaralType;
	private String genaralTypeLangLang;
	// 二级分类
	private String secondType;
	private String secondTypeLangLang;
	// 规格
	private String productSpecial;
	// 型号
	private String productModel;
	// 单位
	private String sparePartsUnit;
	private String sparePartsUnitLangLang;
	// 备注
	private String remark;
	// 中标报价
    private BigDecimal price;
	// 中标发票类型
	private  String invoice;
	// 中标供应商
    private String supplier;
    private  String reason;
    private String supplierLangLang;

	public String getSupplierLangLang() {
		return supplierLangLang;
	}

	public void setSupplierLangLang(String supplierLangLang) {
		this.supplierLangLang = supplierLangLang;
	}

	// 供应商报价
	private List<MatterPeriodSupplierTenderOutput> supplierTenderOutputList;

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

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
	public String getSparePartsNo() {
		return sparePartsNo;
	}
	public void setSparePartsNo(String sparePartsNo) {
		this.sparePartsNo = sparePartsNo;
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
	public String getSparePartsUnit() {
		return sparePartsUnit;
	}
	public void setSparePartsUnit(String sparePartsUnit) {
		this.sparePartsUnit = sparePartsUnit;
	}
	public String getSparePartsUnitLangLang() {
		return sparePartsUnitLangLang;
	}
	public void setSparePartsUnitLangLang(String sparePartsUnitLangLang) {
		this.sparePartsUnitLangLang = sparePartsUnitLangLang;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public List<MatterPeriodSupplierTenderOutput> getSupplierTenderOutputList() {
		return supplierTenderOutputList;
	}
	public void setSupplierTenderOutputList(List<MatterPeriodSupplierTenderOutput> supplierTenderOutputList) {
		this.supplierTenderOutputList = supplierTenderOutputList;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public String getInvoice() {
		return invoice;
	}
	public void setInvoice(String invoice) {
		this.invoice = invoice;
	}
	public String getSupplier() {
		return supplier;
	}
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	
	

}
