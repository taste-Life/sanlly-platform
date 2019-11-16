package com.sanlly.warehouse.models.output.borrowlend;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sanlly.warehouse.models.output.stockout.StockoutDetailOutput;

/**
 * 借入借出output
 * 
 * @author lishzh
 *
 */
public class BorrowLendOutput {

	private Integer wareBorrowLendSlipId;// 主键id
	
	private Integer borrowRepayId;

	private String borrowLendNo;// 借入单号

	private String containerNo;// 箱号

	private String yard;// 场站
	
	private String yardLangLang;// 场站

	private String company;// 所属公司

	private String borrowUnit;// 借件单位

	private Integer borrowUser;// 借件人

	private String borrowType;// 借件类型

	private String borrowTypeLangLang;// 借件类型

	private String outWarehouse;// 出库仓库

	private String inWarehouse;// 入库仓库
	
	private String inWarehouseLangLang;// 入库仓库

	private String escrowWarehouse;// 代管库

	private String auditStatus;// 审核状态
	
	private String auditStatusLangLang;// 审核状态

	private String reasonsRejection;// 驳回原因

	private String billStatus;// 单据状态

	private String billStatusLangLang;// 单据状态

	private String remark;// 备注
	
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date createTime;// 制单时间

	private String createUser;// 制单人

	List<BorrowLendDetailOutput> details;//明细
	
	List<StockoutDetailOutput> outDetails;//出库明细

	public Integer getBorrowRepayId() {
		return borrowRepayId;
	}

	public void setBorrowRepayId(Integer borrowRepayId) {
		this.borrowRepayId = borrowRepayId;
	}

	public List<StockoutDetailOutput> getOutDetails() {
		return outDetails;
	}

	public void setOutDetails(List<StockoutDetailOutput> outDetails) {
		this.outDetails = outDetails;
	}

	public String getInWarehouseLangLang() {
		return inWarehouseLangLang;
	}

	public void setInWarehouseLangLang(String inWarehouseLangLang) {
		this.inWarehouseLangLang = inWarehouseLangLang;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getAuditStatusLangLang() {
		return auditStatusLangLang;
	}

	public void setAuditStatusLangLang(String auditStatusLangLang) {
		this.auditStatusLangLang = auditStatusLangLang;
	}

	public String getYardLangLang() {
		return yardLangLang;
	}

	public void setYardLangLang(String yardLangLang) {
		this.yardLangLang = yardLangLang;
	}

	public String getBorrowTypeLangLang() {
		return borrowTypeLangLang;
	}

	public void setBorrowTypeLangLang(String borrowTypeLangLang) {
		this.borrowTypeLangLang = borrowTypeLangLang;
	}

	public String getBillStatusLangLang() {
		return billStatusLangLang;
	}

	public void setBillStatusLangLang(String billStatusLangLang) {
		this.billStatusLangLang = billStatusLangLang;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public Integer getWareBorrowLendSlipId() {
		return wareBorrowLendSlipId;
	}

	public void setWareBorrowLendSlipId(Integer wareBorrowLendSlipId) {
		this.wareBorrowLendSlipId = wareBorrowLendSlipId;
	}

	public String getBorrowLendNo() {
		return borrowLendNo;
	}

	public void setBorrowLendNo(String borrowLendNo) {
		this.borrowLendNo = borrowLendNo;
	}

	public String getContainerNo() {
		return containerNo;
	}

	public void setContainerNo(String containerNo) {
		this.containerNo = containerNo;
	}

	public String getYard() {
		return yard;
	}

	public void setYard(String yard) {
		this.yard = yard;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getBorrowUnit() {
		return borrowUnit;
	}

	public void setBorrowUnit(String borrowUnit) {
		this.borrowUnit = borrowUnit;
	}

	public Integer getBorrowUser() {
		return borrowUser;
	}

	public void setBorrowUser(Integer borrowUser) {
		this.borrowUser = borrowUser;
	}

	public String getBorrowType() {
		return borrowType;
	}

	public void setBorrowType(String borrowType) {
		this.borrowType = borrowType;
	}

	public String getOutWarehouse() {
		return outWarehouse;
	}

	public void setOutWarehouse(String outWarehouse) {
		this.outWarehouse = outWarehouse;
	}

	public String getInWarehouse() {
		return inWarehouse;
	}

	public void setInWarehouse(String inWarehouse) {
		this.inWarehouse = inWarehouse;
	}

	public String getEscrowWarehouse() {
		return escrowWarehouse;
	}

	public void setEscrowWarehouse(String escrowWarehouse) {
		this.escrowWarehouse = escrowWarehouse;
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

	public List<BorrowLendDetailOutput> getDetails() {
		return details;
	}

	public void setDetails(List<BorrowLendDetailOutput> details) {
		this.details = details;
	}

}
