package com.sanlly.warehouse.models.output.entrustprocess;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 委托加工output
 * 
 * @author lishzh
 *
 */
public class EntrustProcessOutput {

	private Integer wareEntrustedProcessingId;

	private String entrustedProcessingNo;// 单号

	private String company;

	private String processingUnit;// 加工单位

	private String entrustedProcessingType;

	private String processingInvoiceType;

	private String invoiceTypeLangLang;// 发票类型

	private BigDecimal processingChargesTax;// 加工费含税

	private BigDecimal processingChargesVat;// 增值税

	private BigDecimal processingCharges;// 加工费

	private BigDecimal stockoutAmount;// 出库金额

	private BigDecimal entryAmount;// 入库金额

	private String billStatus;// 单据状态

	private String billStatusLangLang;// 单据状态

	private String remark;// 备注

	private String auditStatus;// 审核状态

	private String auditStatusLangLang;// 审核状态

	private String reasonsRejection;

	private String createUser;

	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date createTime;// 制单时间

	private List<MaterialOutput> materials;// 加工材料

	private List<ProductOutput> products;// 加工成品

	public String getInvoiceTypeLangLang() {
		return invoiceTypeLangLang;
	}

	public void setInvoiceTypeLangLang(String invoiceTypeLangLang) {
		this.invoiceTypeLangLang = invoiceTypeLangLang;
	}

	public String getBillStatusLangLang() {
		return billStatusLangLang;
	}

	public void setBillStatusLangLang(String billStatusLangLang) {
		this.billStatusLangLang = billStatusLangLang;
	}

	public String getAuditStatusLangLang() {
		return auditStatusLangLang;
	}

	public void setAuditStatusLangLang(String auditStatusLangLang) {
		this.auditStatusLangLang = auditStatusLangLang;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public List<MaterialOutput> getMaterials() {
		return materials;
	}

	public void setMaterials(List<MaterialOutput> materials) {
		this.materials = materials;
	}

	public List<ProductOutput> getProducts() {
		return products;
	}

	public void setProducts(List<ProductOutput> products) {
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

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
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
