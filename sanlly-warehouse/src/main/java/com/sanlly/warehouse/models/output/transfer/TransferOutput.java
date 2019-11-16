package com.sanlly.warehouse.models.output.transfer;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 调拨单output
 * 
 * @author lishzh
 *
 */
public class TransferOutput {

	private Integer wareTransferId;

	private String transferSlipNo;

	private String companyLangLang;

	private String outWarehouseLangLang;

	private String outWarehouseTypeLangLang;

	private String inWarehouseLangLang;

	private String inWarehouseTypeLangLang;

	private String outWarehouse;

	private String outWarehouseType;

	private String inWarehouse;

	private String inWarehouseType;

	private String auditStatusLangLang;

	private String billStatusLangLang;

	private String auditStatus;

	private String billStatus;

	private String user;

	private String reasonsRejection;

	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date createTime;

	private List<TransferDetailOutput> details;

	public String getAuditStatus() {
		return auditStatus;
	}

	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}

	public String getBillStatus() {
		return billStatus;
	}

	public void setBillStatus(String billStatus) {
		this.billStatus = billStatus;
	}

	public Integer getWareTransferId() {
		return wareTransferId;
	}

	public void setWareTransferId(Integer wareTransferId) {
		this.wareTransferId = wareTransferId;
	}

	public String getTransferSlipNo() {
		return transferSlipNo;
	}

	public void setTransferSlipNo(String transferSlipNo) {
		this.transferSlipNo = transferSlipNo;
	}

	public String getCompanyLangLang() {
		return companyLangLang;
	}

	public void setCompanyLangLang(String companyLangLang) {
		this.companyLangLang = companyLangLang;
	}

	public String getOutWarehouseLangLang() {
		return outWarehouseLangLang;
	}

	public void setOutWarehouseLangLang(String outWarehouseLangLang) {
		this.outWarehouseLangLang = outWarehouseLangLang;
	}

	public String getOutWarehouseTypeLangLang() {
		return outWarehouseTypeLangLang;
	}

	public void setOutWarehouseTypeLangLang(String outWarehouseTypeLangLang) {
		this.outWarehouseTypeLangLang = outWarehouseTypeLangLang;
	}

	public String getInWarehouseLangLang() {
		return inWarehouseLangLang;
	}

	public void setInWarehouseLangLang(String inWarehouseLangLang) {
		this.inWarehouseLangLang = inWarehouseLangLang;
	}

	public String getInWarehouseTypeLangLang() {
		return inWarehouseTypeLangLang;
	}

	public void setInWarehouseTypeLangLang(String inWarehouseTypeLangLang) {
		this.inWarehouseTypeLangLang = inWarehouseTypeLangLang;
	}

	public String getOutWarehouse() {
		return outWarehouse;
	}

	public void setOutWarehouse(String outWarehouse) {
		this.outWarehouse = outWarehouse;
	}

	public String getOutWarehouseType() {
		return outWarehouseType;
	}

	public void setOutWarehouseType(String outWarehouseType) {
		this.outWarehouseType = outWarehouseType;
	}

	public String getInWarehouse() {
		return inWarehouse;
	}

	public void setInWarehouse(String inWarehouse) {
		this.inWarehouse = inWarehouse;
	}

	public String getInWarehouseType() {
		return inWarehouseType;
	}

	public void setInWarehouseType(String inWarehouseType) {
		this.inWarehouseType = inWarehouseType;
	}

	public String getAuditStatusLangLang() {
		return auditStatusLangLang;
	}

	public void setAuditStatusLangLang(String auditStatusLangLang) {
		this.auditStatusLangLang = auditStatusLangLang;
	}

	public String getBillStatusLangLang() {
		return billStatusLangLang;
	}

	public void setBillStatusLangLang(String billStatusLangLang) {
		this.billStatusLangLang = billStatusLangLang;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
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

	public List<TransferDetailOutput> getDetails() {
		return details;
	}

	public void setDetails(List<TransferDetailOutput> details) {
		this.details = details;
	}

}
