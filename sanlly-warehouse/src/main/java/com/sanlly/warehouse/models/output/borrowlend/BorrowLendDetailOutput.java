package com.sanlly.warehouse.models.output.borrowlend;

import java.math.BigDecimal;

/**
 * 借入借出明细output
 * 
 * @author lishzh
 *
 */
public class BorrowLendDetailOutput {

	private Integer wareBorrowSlipDetailId;// 主键id

	private Integer wareBorrowLendSlip;// 主表id

	private String spareParts;// 备件

	private String sparePartsNo;// 备件号

	private String sparePartsLangLang;// 备件

	private String sparePartsBatch;// 批次

	private String stockinSpareParts;// 入库备件

	private String stockinSparePartsName;// 入库备件名

	private String escrowCompany;// 代管公司
	
	private String escrowCompanyLangLang;// 代管公司

	private String inStorageLocation;// 入库库位
	
	private String outStorageLocation;// 入库库位

	private String outWarehouseType;// 出库仓库类型

	private String outWarehouseTypeLangLang;// 出库仓库类型

	private String inWarehouseType;// 入库仓库类型

	private String inWarehouseLangLang;// 入库仓库

	private String inWarehouseTypeLangLang;// 入库仓库类型

	private Double borrowNum;// 借入数量

	private Double returnNum;// 还件数量

	private BigDecimal borrowPrice;// 借入单价

	private String remark;// 备注

	private String companyLangLang;// 所属公司

	private Double surplusNum;// 库存

	private Double repayNum;

	private BigDecimal repayPrice;

	public String getOutStorageLocation() {
		return outStorageLocation;
	}

	public void setOutStorageLocation(String outStorageLocation) {
		this.outStorageLocation = outStorageLocation;
	}

	public String getEscrowCompanyLangLang() {
		return escrowCompanyLangLang;
	}

	public void setEscrowCompanyLangLang(String escrowCompanyLangLang) {
		this.escrowCompanyLangLang = escrowCompanyLangLang;
	}

	public Double getRepayNum() {
		return repayNum;
	}

	public void setRepayNum(Double repayNum) {
		this.repayNum = repayNum;
	}

	public BigDecimal getRepayPrice() {
		return repayPrice;
	}

	public void setRepayPrice(BigDecimal repayPrice) {
		this.repayPrice = repayPrice;
	}

	public Double getSurplusNum() {
		return surplusNum;
	}

	public void setSurplusNum(Double surplusNum) {
		this.surplusNum = surplusNum;
	}

	public String getCompanyLangLang() {
		return companyLangLang;
	}

	public void setCompanyLangLang(String companyLangLang) {
		this.companyLangLang = companyLangLang;
	}

	public String getOutWarehouseTypeLangLang() {
		return outWarehouseTypeLangLang;
	}

	public void setOutWarehouseTypeLangLang(String outWarehouseTypeLangLang) {
		this.outWarehouseTypeLangLang = outWarehouseTypeLangLang;
	}

	public String getSparePartsNo() {
		return sparePartsNo;
	}

	public void setSparePartsNo(String sparePartsNo) {
		this.sparePartsNo = sparePartsNo;
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

	public Integer getWareBorrowSlipDetailId() {
		return wareBorrowSlipDetailId;
	}

	public void setWareBorrowSlipDetailId(Integer wareBorrowSlipDetailId) {
		this.wareBorrowSlipDetailId = wareBorrowSlipDetailId;
	}

	public Integer getWareBorrowLendSlip() {
		return wareBorrowLendSlip;
	}

	public void setWareBorrowLendSlip(Integer wareBorrowLendSlip) {
		this.wareBorrowLendSlip = wareBorrowLendSlip;
	}

	public String getSpareParts() {
		return spareParts;
	}

	public void setSpareParts(String spareParts) {
		this.spareParts = spareParts;
	}

	public String getSparePartsLangLang() {
		return sparePartsLangLang;
	}

	public void setSparePartsLangLang(String sparePartsLangLang) {
		this.sparePartsLangLang = sparePartsLangLang;
	}

	public String getSparePartsBatch() {
		return sparePartsBatch;
	}

	public void setSparePartsBatch(String sparePartsBatch) {
		this.sparePartsBatch = sparePartsBatch;
	}

	public String getStockinSpareParts() {
		return stockinSpareParts;
	}

	public void setStockinSpareParts(String stockinSpareParts) {
		this.stockinSpareParts = stockinSpareParts;
	}

	public String getStockinSparePartsName() {
		return stockinSparePartsName;
	}

	public void setStockinSparePartsName(String stockinSparePartsName) {
		this.stockinSparePartsName = stockinSparePartsName;
	}

	public String getEscrowCompany() {
		return escrowCompany;
	}

	public void setEscrowCompany(String escrowCompany) {
		this.escrowCompany = escrowCompany;
	}


	public String getInStorageLocation() {
		return inStorageLocation;
	}

	public void setInStorageLocation(String inStorageLocation) {
		this.inStorageLocation = inStorageLocation;
	}

	public String getOutWarehouseType() {
		return outWarehouseType;
	}

	public void setOutWarehouseType(String outWarehouseType) {
		this.outWarehouseType = outWarehouseType;
	}

	public String getInWarehouseType() {
		return inWarehouseType;
	}

	public void setInWarehouseType(String inWarehouseType) {
		this.inWarehouseType = inWarehouseType;
	}

	public Double getBorrowNum() {
		return borrowNum;
	}

	public void setBorrowNum(Double borrowNum) {
		this.borrowNum = borrowNum;
	}

	public Double getReturnNum() {
		return returnNum;
	}

	public void setReturnNum(Double returnNum) {
		this.returnNum = returnNum;
	}

	public BigDecimal getBorrowPrice() {
		return borrowPrice;
	}

	public void setBorrowPrice(BigDecimal borrowPrice) {
		this.borrowPrice = borrowPrice;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
