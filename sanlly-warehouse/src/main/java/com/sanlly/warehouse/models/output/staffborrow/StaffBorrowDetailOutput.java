package com.sanlly.warehouse.models.output.staffborrow;

/**
 * 员工借件明细output
 * 
 * @author lishzh
 *
 */
public class StaffBorrowDetailOutput {

	private Integer wareStaffBorrowDetailId;// 主键id

	private String sparePartsCategories;// 备件大类

	private String sparePartsNo;// 备件号

	private String spareParts;// 备件

	private String sparePartsLangLang;// 备件

	private String warehouse;// 仓库

	private String warehouseLangLang;// 仓库

	private String warehouseType;// 仓库类型

	private String warehouseTypeLangLang;// 仓库类型

	private Double borrowNum;// 借件数量

	private Double returnNum;// 还件数量

	private Double upperContainerNum;// 上箱数量

	private String remark;// 备注

	private String sparePartsBatch;// 备件批次

	private String storageLocation;// 库位

	private String companyLangLang;// 所属公司

	private Double surplusNum;// 库存

	private String billStatus;// 单据状态

	private String billStatusLangLang;// 单据状态

	public String getBillStatusLangLang() {
		return billStatusLangLang;
	}

	public void setBillStatusLangLang(String billStatusLangLang) {
		this.billStatusLangLang = billStatusLangLang;
	}

	public String getBillStatus() {
		return billStatus;
	}

	public void setBillStatus(String billStatus) {
		this.billStatus = billStatus;
	}

	public Double getSurplusNum() {
		return surplusNum;
	}

	public void setSurplusNum(Double surplusNum) {
		this.surplusNum = surplusNum;
	}

	public String getStorageLocation() {
		return storageLocation;
	}

	public void setStorageLocation(String storageLocation) {
		this.storageLocation = storageLocation;
	}

	public String getCompanyLangLang() {
		return companyLangLang;
	}

	public void setCompanyLangLang(String companyLangLang) {
		this.companyLangLang = companyLangLang;
	}

	public Integer getWareStaffBorrowDetailId() {
		return wareStaffBorrowDetailId;
	}

	public void setWareStaffBorrowDetailId(Integer wareStaffBorrowDetailId) {
		this.wareStaffBorrowDetailId = wareStaffBorrowDetailId;
	}

	public String getSparePartsCategories() {
		return sparePartsCategories;
	}

	public void setSparePartsCategories(String sparePartsCategories) {
		this.sparePartsCategories = sparePartsCategories;
	}

	public String getSparePartsNo() {
		return sparePartsNo;
	}

	public void setSparePartsNo(String sparePartsNo) {
		this.sparePartsNo = sparePartsNo;
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

	public String getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(String warehouse) {
		this.warehouse = warehouse;
	}

	public String getWarehouseLangLang() {
		return warehouseLangLang;
	}

	public void setWarehouseLangLang(String warehouseLangLang) {
		this.warehouseLangLang = warehouseLangLang;
	}

	public String getWarehouseType() {
		return warehouseType;
	}

	public void setWarehouseType(String warehouseType) {
		this.warehouseType = warehouseType;
	}

	public String getWarehouseTypeLangLang() {
		return warehouseTypeLangLang;
	}

	public void setWarehouseTypeLangLang(String warehouseTypeLangLang) {
		this.warehouseTypeLangLang = warehouseTypeLangLang;
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
