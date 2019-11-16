package com.sanlly.warehouse.models.input.staffborrow;

/**
 * 员工借件明细Input
 * 
 * @author lishzh
 *
 */
public class StaffBorrowDetailInput {

	private Integer wareStaffBorrowDetailId;// 主键id

	private Integer wareStaffBorrow;// 借件单id

	private String sparePartsCategories;// 备件大类

	private String spareParts;// 备件

	private String warehouseType;// 仓库类型

	private Double borrowNum;// 借件数量

	private Double returnNum;// 还件数量

	private Double upperContainerNum;// 上箱数量

	private String remark;// 备注

	private String sparePartsBatch;// 备件批次
	
	private String sparePartsOriginalBatch;//原始批次

	private String warehouse;//仓库
	
	private Double repayNum;//还件数量
	
	private String storageLocation;//出库库位

	public String getSparePartsOriginalBatch() {
		return sparePartsOriginalBatch;
	}

	public void setSparePartsOriginalBatch(String sparePartsOriginalBatch) {
		this.sparePartsOriginalBatch = sparePartsOriginalBatch;
	}

	public String getStorageLocation() {
		return storageLocation;
	}

	public void setStorageLocation(String storageLocation) {
		this.storageLocation = storageLocation;
	}

	public Double getRepayNum() {
		return repayNum;
	}

	public void setRepayNum(Double repayNum) {
		this.repayNum = repayNum;
	}

	public String getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(String warehouse) {
		this.warehouse = warehouse;
	}

	public Integer getWareStaffBorrowDetailId() {
		return wareStaffBorrowDetailId;
	}

	public void setWareStaffBorrowDetailId(Integer wareStaffBorrowDetailId) {
		this.wareStaffBorrowDetailId = wareStaffBorrowDetailId;
	}

	public Integer getWareStaffBorrow() {
		return wareStaffBorrow;
	}

	public void setWareStaffBorrow(Integer wareStaffBorrow) {
		this.wareStaffBorrow = wareStaffBorrow;
	}

	public String getSparePartsCategories() {
		return sparePartsCategories;
	}

	public void setSparePartsCategories(String sparePartsCategories) {
		this.sparePartsCategories = sparePartsCategories;
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

	public Double getUpperContainerNum() {
		return upperContainerNum;
	}

	public void setUpperContainerNum(Double upperContainerNum) {
		this.upperContainerNum = upperContainerNum;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getSparePartsBatch() {
		return sparePartsBatch;
	}

	public void setSparePartsBatch(String sparePartsBatch) {
		this.sparePartsBatch = sparePartsBatch;
	}

}
