package com.sanlly.warehouse.models.input.laborInsurance;

import java.math.BigDecimal;

/**
 * ClassName: AddLaborInsuranceInput
 * Description: 添加劳保信息输入类
 * date: 2019/7/25 17:51
 *
 * @author zhh
 */
public class AddLaborInsuranceInput {
	//备件key
	private String spareParts;
	//备件号
	private String sparePartsNo;
    //备件名称
    private String sparePartsName;
    //备件名称英文
    private String sparePartsNameEn;
    //劳保类别
    private String sparePartsCategoriesDetails;
    //使用年限
    private Integer durableYears;
    //出库限制月份
    private String stockoutRestrictMonth;
    //是否耗材
    private String isConsumable;
    //备注
    private String remark;
    //数量
    private Double entryNum;
    //单价
    private BigDecimal entryPrice;
    //库位
  	private String storageLocation;
  	//型号
  	private String model;
  	//备件批次
  	private String sparePartsCode;
  	//增值税
  	private BigDecimal vat;
  	//总金额
  	private BigDecimal totalAmount;
  	//发票单价
  	private BigDecimal invoicePrice;
    
	public String getSparePartsNo() {
		return sparePartsNo;
	}

	public void setSparePartsNo(String sparePartsNo) {
		this.sparePartsNo = sparePartsNo;
	}

	public String getSparePartsName() {
		return sparePartsName;
	}

	public void setSparePartsName(String sparePartsName) {
		this.sparePartsName = sparePartsName;
	}

	public String getSparePartsNameEn() {
		return sparePartsNameEn;
	}

	public void setSparePartsNameEn(String sparePartsNameEn) {
		this.sparePartsNameEn = sparePartsNameEn;
	}

	public String getSparePartsCategoriesDetails() {
		return sparePartsCategoriesDetails;
	}

	public void setSparePartsCategoriesDetails(String sparePartsCategoriesDetails) {
		this.sparePartsCategoriesDetails = sparePartsCategoriesDetails;
	}

	public Integer getDurableYears() {
		return durableYears;
	}

	public void setDurableYears(Integer durableYears) {
		this.durableYears = durableYears;
	}

	public String getStockoutRestrictMonth() {
		return stockoutRestrictMonth;
	}

	public void setStockoutRestrictMonth(String stockoutRestrictMonth) {
		this.stockoutRestrictMonth = stockoutRestrictMonth;
	}

	public String getIsConsumable() {
		return isConsumable;
	}

	public void setIsConsumable(String isConsumable) {
		this.isConsumable = isConsumable;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Double getEntryNum() {
		return entryNum;
	}

	public void setEntryNum(Double entryNum) {
		this.entryNum = entryNum;
	}

	public BigDecimal getEntryPrice() {
		return entryPrice;
	}

	public void setEntryPrice(BigDecimal entryPrice) {
		this.entryPrice = entryPrice;
	}

	public String getSpareParts() {
		return spareParts;
	}

	public void setSpareParts(String spareParts) {
		this.spareParts = spareParts;
	}

	public String getStorageLocation() {
		return storageLocation;
	}

	public void setStorageLocation(String storageLocation) {
		this.storageLocation = storageLocation;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getSparePartsCode() {
		return sparePartsCode;
	}

	public void setSparePartsCode(String sparePartsCode) {
		this.sparePartsCode = sparePartsCode;
	}

	public BigDecimal getVat() {
		return vat;
	}

	public void setVat(BigDecimal vat) {
		this.vat = vat;
	}

	public BigDecimal getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}

	public BigDecimal getInvoicePrice() {
		return invoicePrice;
	}

	public void setInvoicePrice(BigDecimal invoicePrice) {
		this.invoicePrice = invoicePrice;
	}
    
    

}
