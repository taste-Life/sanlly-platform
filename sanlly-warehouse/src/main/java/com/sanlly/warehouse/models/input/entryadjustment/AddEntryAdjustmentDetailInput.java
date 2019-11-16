package com.sanlly.warehouse.models.input.entryadjustment;

import java.math.BigDecimal;

public class AddEntryAdjustmentDetailInput {
	
	// 备件
    private String spareParts;
    // 调整仓库类型
    private String warehouseType;
    // 调整增值税
    private BigDecimal vat;
    // 调整关税
    private BigDecimal tariff;
    // 调整数量
    private Double entryNum;
    // 发票单价
    private BigDecimal invoicePrice;
    // 入库单价
    private BigDecimal entryPrice;
    // 单据总金额
    private BigDecimal billTotalAmount;
    // 含税价总金额
    private BigDecimal totalAmount;   
    
    
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
	public BigDecimal getVat() {
		return vat;
	}
	public void setVat(BigDecimal vat) {
		this.vat = vat;
	}
	public BigDecimal getTariff() {
		return tariff;
	}
	public void setTariff(BigDecimal tariff) {
		this.tariff = tariff;
	}
	public Double getEntryNum() {
		return entryNum;
	}
	public void setEntryNum(Double entryNum) {
		this.entryNum = entryNum;
	}
	public BigDecimal getInvoicePrice() {
		return invoicePrice;
	}
	public void setInvoicePrice(BigDecimal invoicePrice) {
		this.invoicePrice = invoicePrice;
	}
	public BigDecimal getEntryPrice() {
		return entryPrice;
	}
	public void setEntryPrice(BigDecimal entryPrice) {
		this.entryPrice = entryPrice;
	}
	public BigDecimal getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}
	public BigDecimal getBillTotalAmount() {
		return billTotalAmount;
	}
	public void setBillTotalAmount(BigDecimal billTotalAmount) {
		this.billTotalAmount = billTotalAmount;
	}
	
	
    
}
