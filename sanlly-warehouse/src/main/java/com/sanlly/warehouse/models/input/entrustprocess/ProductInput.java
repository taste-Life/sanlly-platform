package com.sanlly.warehouse.models.input.entrustprocess;

import java.math.BigDecimal;

/**
 * 委托加工成品input
 * 
 * @author lishzh
 *
 */
public class ProductInput {

	private Integer wareEntrustedProcessingProducId;

	private Integer entrustedProcessingId;

	private String spareParts;

	private String warehouseType;

	private String warehouse;

	private String company;

	private String entryStatus;

	private Double entryLength;

	private Double entryWide;

	private Double entryNum;//入库数量

	private BigDecimal entryPrice;//入库单价

	private BigDecimal invoicePrice;//发票单价

	private BigDecimal processingCharges;

	private BigDecimal vat;//增值税

	private BigDecimal totalAmount;//总金额

	private String remark;
	
	private String sparePartsBatch;
	
	private String storageLocation;

	public String getStorageLocation() {
		return storageLocation;
	}

	public void setStorageLocation(String storageLocation) {
		this.storageLocation = storageLocation;
	}

	public String getSparePartsBatch() {
		return sparePartsBatch;
	}

	public void setSparePartsBatch(String sparePartsBatch) {
		this.sparePartsBatch = sparePartsBatch;
	}

	public Integer getWareEntrustedProcessingProducId() {
		return wareEntrustedProcessingProducId;
	}

	public void setWareEntrustedProcessingProducId(Integer wareEntrustedProcessingProducId) {
		this.wareEntrustedProcessingProducId = wareEntrustedProcessingProducId;
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

	public String getEntryStatus() {
		return entryStatus;
	}

	public void setEntryStatus(String entryStatus) {
		this.entryStatus = entryStatus;
	}

	public Double getEntryLength() {
		return entryLength;
	}

	public void setEntryLength(Double entryLength) {
		this.entryLength = entryLength;
	}

	public Double getEntryWide() {
		return entryWide;
	}

	public void setEntryWide(Double entryWide) {
		this.entryWide = entryWide;
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

	public BigDecimal getInvoicePrice() {
		return invoicePrice;
	}

	public void setInvoicePrice(BigDecimal invoicePrice) {
		this.invoicePrice = invoicePrice;
	}

	public BigDecimal getProcessingCharges() {
		return processingCharges;
	}

	public void setProcessingCharges(BigDecimal processingCharges) {
		this.processingCharges = processingCharges;
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

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
