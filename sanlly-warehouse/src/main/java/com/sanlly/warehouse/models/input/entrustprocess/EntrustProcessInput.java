package com.sanlly.warehouse.models.input.entrustprocess;

import java.math.BigDecimal;
import java.util.List;

/**
 * 委托加工input
 * @author lishzh
 *
 */
public class EntrustProcessInput {

	private Integer wareEntrustedProcessingId;//id

	private String entrustedProcessingNo;//委托加工单号

	private String processingUnit;//加工单位

	private String entrustedProcessingType;//加工类型

	private String processingInvoiceType;//发票类型

	private BigDecimal processingChargesTax;//含税加工费

	private BigDecimal processingChargesVat;//增值税

	private BigDecimal processingCharges;//加工费

	private BigDecimal stockoutAmount;//出库金额

	private BigDecimal entryAmount;//入库金额

	private String billStatus;

	private String billTypeName;

	private String remark;

	private String auditStatus;

	private String reasonsRejection;
	
	private List<MaterialInput> materials;
	
	private List<ProductInput> products;

	public String getBillTypeName() {
		return billTypeName;
	}

	public void setBillTypeName(String billTypeName) {
		this.billTypeName = billTypeName;
	}

	public List<MaterialInput> getMaterials() {
		return materials;
	}

	public void setMaterials(List<MaterialInput> materials) {
		this.materials = materials;
	}

	public List<ProductInput> getProducts() {
		return products;
	}

	public void setProducts(List<ProductInput> products) {
		this.products = products;
	}

	public Integer getWareEntrustedProcessingId() {
		return wareEntrustedProcessingId;
	}

	public void setWareEntrustedProcessingId(Integer wareEntrustedProcessingId) {
		this.wareEntrustedProcessingId = wareEntrustedProcessingId;
	}

	public String getEntrustedProcessingNo() {
		return entrustedProcessingNo;
	}

	public void setEntrustedProcessingNo(String entrustedProcessingNo) {
		this.entrustedProcessingNo = entrustedProcessingNo;
	}

	public String getProcessingUnit() {
		return processingUnit;
	}

	public void setProcessingUnit(String processingUnit) {
		this.processingUnit = processingUnit;
	}

	public String getEntrustedProcessingType() {
		return entrustedProcessingType;
	}

	public void setEntrustedProcessingType(String entrustedProcessingType) {
		this.entrustedProcessingType = entrustedProcessingType;
	}

	public String getProcessingInvoiceType() {
		return processingInvoiceType;
	}

	public void setProcessingInvoiceType(String processingInvoiceType) {
		this.processingInvoiceType = processingInvoiceType;
	}

	public BigDecimal getProcessingChargesTax() {
		return processingChargesTax;
	}

	public void setProcessingChargesTax(BigDecimal processingChargesTax) {
		this.processingChargesTax = processingChargesTax;
	}

	public BigDecimal getProcessingChargesVat() {
		return processingChargesVat;
	}

	public void setProcessingChargesVat(BigDecimal processingChargesVat) {
		this.processingChargesVat = processingChargesVat;
	}

	public BigDecimal getProcessingCharges() {
		return processingCharges;
	}

	public void setProcessingCharges(BigDecimal processingCharges) {
		this.processingCharges = processingCharges;
	}

	public BigDecimal getStockoutAmount() {
		return stockoutAmount;
	}

	public void setStockoutAmount(BigDecimal stockoutAmount) {
		this.stockoutAmount = stockoutAmount;
	}

	public BigDecimal getEntryAmount() {
		return entryAmount;
	}

	public void setEntryAmount(BigDecimal entryAmount) {
		this.entryAmount = entryAmount;
	}

	public String getBillStatus() {
		return billStatus;
	}

	public void setBillStatus(String billStatus) {
		this.billStatus = billStatus;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getAuditStatus() {
		return auditStatus;
	}

	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}

	public String getReasonsRejection() {
		return reasonsRejection;
	}

	public void setReasonsRejection(String reasonsRejection) {
		this.reasonsRejection = reasonsRejection;
	}

}
