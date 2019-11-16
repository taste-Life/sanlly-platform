package com.sanlly.warehouse.models.output.entrustprocess;

import java.math.BigDecimal;

/**
 * 委托加工材料output
 * 
 * @author lishzh
 *
 */
public class MaterialOutput {

	private Integer wareEntrustedProcessingMaterialId;

	private Integer entrustedProcessingId;

	private String spareParts;
	
	private String sparePartsLangLang;
	
	private String sparePartsNo;
	
	private String companyLangLang;

	private String warehouseType;
	
	private String warehouseTypeLangLang;

	private String warehouse;
	
	private String warehouseLangLang;

	private String company;

	private String stockoutStatus;

	private BigDecimal price;

	private Double processingNum;

	private String remark;
	
	private String storageLocation;
	
	private Double actualSurplusNum;
	
	private String sparePartsBatch;

	public String getSparePartsBatch() {
		return sparePartsBatch;
	}

	public void setSparePartsBatch(String sparePartsBatch) {
		this.sparePartsBatch = sparePartsBatch;
	}

	public Double getActualSurplusNum() {
		return actualSurplusNum;
	}

	public void setActualSurplusNum(Double actualSurplusNum) {
		this.actualSurplusNum = actualSurplusNum;
	}

	public String getSparePartsLangLang() {
		return sparePartsLangLang;
	}

	public void setSparePartsLangLang(String sparePartsLangLang) {
		this.sparePartsLangLang = sparePartsLangLang;
	}

	public String getSparePartsNo() {
		return sparePartsNo;
	}

	public void setSparePartsNo(String sparePartsNo) {
		this.sparePartsNo = sparePartsNo;
	}

	public String getCompanyLangLang() {
		return companyLangLang;
	}

	public void setCompanyLangLang(String companyLangLang) {
		this.companyLangLang = companyLangLang;
	}

	public String getWarehouseTypeLangLang() {
		return warehouseTypeLangLang;
	}

	public void setWarehouseTypeLangLang(String warehouseTypeLangLang) {
		this.warehouseTypeLangLang = warehouseTypeLangLang;
	}

	public String getWarehouseLangLang() {
		return warehouseLangLang;
	}

	public void setWarehouseLangLang(String warehouseLangLang) {
		this.warehouseLangLang = warehouseLangLang;
	}

	public String getStorageLocation() {
		return storageLocation;
	}

	public void setStorageLocation(String storageLocation) {
		this.storageLocation = storageLocation;
	}

	public Integer getWareEntrustedProcessingMaterialId() {
		return wareEntrustedProcessingMaterialId;
	}

	public void setWareEntrustedProcessingMaterialId(Integer wareEntrustedProcessingMaterialId) {
		this.wareEntrustedProcessingMaterialId = wareEntrustedProcessingMaterialId;
	}

	public Integer getEntrustedProcessingId() {
		return entrustedProcessingId;
	}

	public void setEntrustedProcessingId(Integer entrustedProcessingId) {
		this.entrustedProcessingId = entrustedProcessingId;
	}

	public String getSpareParts() {
		return spareParts;
	}

	public void setSpareParts(String spareParts) {
		this.spareParts = spareParts;
	}

	public String getWarehouseType() {
		return warehouseType;
	}

	public void setWarehouseType(String warehouseType) {
		this.warehouseType = warehouseType;
	}

	public String getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(String warehouse) {
		this.warehouse = warehouse;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getStockoutStatus() {
		return stockoutStatus;
	}

	public void setStockoutStatus(String stockoutStatus) {
		this.stockoutStatus = stockoutStatus;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Double getProcessingNum() {
		return processingNum;
	}

	public void setProcessingNum(Double processingNum) {
		this.processingNum = processingNum;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
