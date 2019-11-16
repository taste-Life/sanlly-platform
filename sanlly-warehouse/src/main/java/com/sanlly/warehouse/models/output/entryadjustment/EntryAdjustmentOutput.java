package com.sanlly.warehouse.models.output.entryadjustment;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 
* @Package com.sanlly.warehouse.models.output.entryadjustment 
* @Description: 调账单输出 
* @author jlx   
* @date 2019年9月2日 上午10:50:12 
* @version V1.0   
 */
public class EntryAdjustmentOutput {

	private Integer wareEntryAdjustmentId;
	// 调账单号
    private String entryAdjustmentNo;
	// 入库单号
    private String stockinNo;
	// 
//    private String adjustmentStatus;
	// 调账人
    private Integer adjustmentPerson;
    private Integer strAdjustmentPerson;
	// 入库公司
    private String company;
    private String companyLangLang;
	// 入库仓库
    private String entryWarehouse;
    private String entryWarehouseLangLang;
	// 单据类型
    private String billType;
    private String billTypeLangLang;
    // 原始发票类型
    private String oldInvoice;
    private String oldInvoiceLangLang;
    // 调整发票类型
    private String adjustmentInvoice;
    private String adjustmentInvoiceLangLang;
    // 原始运费
    private BigDecimal oldFreight;
    // 调整运费
    private BigDecimal adjustmentFreight;
	// 审核状态
    private String auditStatus;
    private String auditStatusLangLang;
	// 删除标识
//    private Integer isDel;
	// 驳回原因
    private String reasonsRejection;
	// 创建时间
    private Date createTime;
    
    private List<EntryAdjustmentDetailOutput> entryAdjustmentDetailOutputs;
	public Integer getWareEntryAdjustmentId() {
		return wareEntryAdjustmentId;
	}
	public void setWareEntryAdjustmentId(Integer wareEntryAdjustmentId) {
		this.wareEntryAdjustmentId = wareEntryAdjustmentId;
	}
	public String getEntryAdjustmentNo() {
		return entryAdjustmentNo;
	}
	public void setEntryAdjustmentNo(String entryAdjustmentNo) {
		this.entryAdjustmentNo = entryAdjustmentNo;
	}
	public String getStockinNo() {
		return stockinNo;
	}
	public void setStockinNo(String stockinNo) {
		this.stockinNo = stockinNo;
	}
	public Integer getAdjustmentPerson() {
		return adjustmentPerson;
	}
	public void setAdjustmentPerson(Integer adjustmentPerson) {
		this.adjustmentPerson = adjustmentPerson;
	}
	public String getBillType() {
		return billType;
	}
	public void setBillType(String billType) {
		this.billType = billType;
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
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public List<EntryAdjustmentDetailOutput> getEntryAdjustmentDetailOutputs() {
		return entryAdjustmentDetailOutputs;
	}
	public void setEntryAdjustmentDetailOutputs(List<EntryAdjustmentDetailOutput> entryAdjustmentDetailOutputs) {
		this.entryAdjustmentDetailOutputs = entryAdjustmentDetailOutputs;
	}
	public Integer getStrAdjustmentPerson() {
		return strAdjustmentPerson;
	}
	public void setStrAdjustmentPerson(Integer strAdjustmentPerson) {
		this.strAdjustmentPerson = strAdjustmentPerson;
	}
	public String getBillTypeLangLang() {
		return billTypeLangLang;
	}
	public void setBillTypeLangLang(String billTypeLangLang) {
		this.billTypeLangLang = billTypeLangLang;
	}
	public String getAuditStatusLangLang() {
		return auditStatusLangLang;
	}
	public void setAuditStatusLangLang(String auditStatusLangLang) {
		this.auditStatusLangLang = auditStatusLangLang;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getCompanyLangLang() {
		return companyLangLang;
	}
	public void setCompanyLangLang(String companyLangLang) {
		this.companyLangLang = companyLangLang;
	}
	public String getEntryWarehouse() {
		return entryWarehouse;
	}
	public void setEntryWarehouse(String entryWarehouse) {
		this.entryWarehouse = entryWarehouse;
	}
	public String getEntryWarehouseLangLang() {
		return entryWarehouseLangLang;
	}
	public void setEntryWarehouseLangLang(String entryWarehouseLangLang) {
		this.entryWarehouseLangLang = entryWarehouseLangLang;
	}
	public String getOldInvoice() {
		return oldInvoice;
	}
	public void setOldInvoice(String oldInvoice) {
		this.oldInvoice = oldInvoice;
	}
	public String getOldInvoiceLangLang() {
		return oldInvoiceLangLang;
	}
	public void setOldInvoiceLangLang(String oldInvoiceLangLang) {
		this.oldInvoiceLangLang = oldInvoiceLangLang;
	}
	public String getAdjustmentInvoice() {
		return adjustmentInvoice;
	}
	public void setAdjustmentInvoice(String adjustmentInvoice) {
		this.adjustmentInvoice = adjustmentInvoice;
	}
	public String getAdjustmentInvoiceLangLang() {
		return adjustmentInvoiceLangLang;
	}
	public void setAdjustmentInvoiceLangLang(String adjustmentInvoiceLangLang) {
		this.adjustmentInvoiceLangLang = adjustmentInvoiceLangLang;
	}
	public BigDecimal getOldFreight() {
		return oldFreight;
	}
	public void setOldFreight(BigDecimal oldFreight) {
		this.oldFreight = oldFreight;
	}
	public BigDecimal getAdjustmentFreight() {
		return adjustmentFreight;
	}
	public void setAdjustmentFreight(BigDecimal adjustmentFreight) {
		this.adjustmentFreight = adjustmentFreight;
	}
    
    
}
