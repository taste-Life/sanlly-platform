package com.sanlly.purchase.models.output.matterbidding;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 
* @Package com.sanlly.purchase.models.output.matterbidding 
* @Description: 供应商报价商品详细信息
* @author jlx   
* @date 2019年8月27日 上午11:10:35 
* @version V1.0   
 */
public class MatterSupplierTenderProductOutput {
	
	private Integer purcSupplierTenderProductId;
	// 供应商报价记录id
    private Integer supplierTenderId;
	// 报价
    private BigDecimal price;
    // 到货时间
	@JsonFormat(locale="zh", timezone="GMT+8", pattern = "yyyy-MM-dd")
    private Date arriveTime;
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
    // 数量
    private Double productCount;
	// 合计
    private BigDecimal total;
    // 权重
    private Double weight;
	// 当前排名
    private Integer rank;
	// 备注
    private String remark;
	//需求编号
	private  String demandNo;
 private  String warehouseAddress;
 //发票类型
	private  String invoice;
	private  String invoiceLangLang;
//招标商品id
private Integer purcMatterTenderProductId;

	public Integer getPurcMatterTenderProductId() {
		return purcMatterTenderProductId;
	}

	public void setPurcMatterTenderProductId(Integer purcMatterTenderProductId) {
		this.purcMatterTenderProductId = purcMatterTenderProductId;
	}

	public String getInvoice() {
		return invoice;
	}

	public void setInvoice(String invoice) {
		this.invoice = invoice;
	}

	public String getInvoiceLangLang() {
		return invoiceLangLang;
	}

	public void setInvoiceLangLang(String invoiceLangLang) {
		this.invoiceLangLang = invoiceLangLang;
	}

	public String getWarehouseAddress() {
		return warehouseAddress;
	}

	public void setWarehouseAddress(String warehouseAddress) {
		this.warehouseAddress = warehouseAddress;
	}

	public String getDemandNo() {
		return demandNo;
	}

	public void setDemandNo(String demandNo) {
		this.demandNo = demandNo;
	}

	public Integer getPurcSupplierTenderProductId() {
		return purcSupplierTenderProductId;
	}
	public void setPurcSupplierTenderProductId(Integer purcSupplierTenderProductId) {
		this.purcSupplierTenderProductId = purcSupplierTenderProductId;
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
	public Date getArriveTime() {
		return arriveTime;
	}
	public void setArriveTime(Date arriveTime) {
		this.arriveTime = arriveTime;
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
	public Double getProductCount() {
		return productCount;
	}
	public void setProductCount(Double productCount) {
		this.productCount = productCount;
	}
	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
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
		this.remark = remark;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}
    
    
}
