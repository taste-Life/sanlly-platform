package com.sanlly.warehouse.models.input.borrowlend;

import java.math.BigDecimal;

/**
 * 借入借出明细input
 * 
 * @author lishzh
 *
 */
public class BorrowLendDetailInput {

	private Integer wareBorrowSlipDetailId;// 主键id

	private Integer wareBorrowLendSlip;// 借入借出单id

	private String spareParts;// 备件

	private String sparePartsBatch;// 批次

	private String stockinSpareParts;// 入库备件

	private String stockinSparePartsName;// 入库备件名

	private String escrowCompany;// 代管公司

	private String outStorageLocation;

	private String inStorageLocation;

	private String outWarehouseType;// 出库仓库类型

	private String inWarehouseType;// 入库仓库类型

	private Double borrowNum;// 借入数量

	private Double returnNum;// 还件数量

	private BigDecimal borrowPrice;// 借件单价

	private String remark;// 备注

	private Double repayNum;// 本次还件数量

	private Double saleNum;// 售出数量

	private BigDecimal salePrice;// 售出单价

	private BigDecimal repayPrice;// 还件单价

	public BigDecimal getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(BigDecimal salePrice) {
		this.salePrice = salePrice;
	}

	public BigDecimal getRepayPrice() {
		return repayPrice;
	}

	public void setRepayPrice(BigDecimal repayPrice) {
		this.repayPrice = repayPrice;
	}

	public Double getSaleNum() {
		return saleNum;
	}

	public void setSaleNum(Double saleNum) {
		this.saleNum = saleNum;
	}

	public Double getRepayNum() {
		return repayNum;
	}

	public void setRepayNum(Double repayNum) {
		this.repayNum = repayNum;
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

	public String getOutStorageLocation() {
		return outStorageLocation;
	}

	public void setOutStorageLocation(String outStorageLocation) {
		this.outStorageLocation = outStorageLocation;
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
