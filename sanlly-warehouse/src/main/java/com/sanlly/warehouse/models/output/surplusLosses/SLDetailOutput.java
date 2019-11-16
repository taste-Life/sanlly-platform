package com.sanlly.warehouse.models.output.surplusLosses;
/**
 * ClassName: SLDetailOutput
 * Description: 盘盈盘亏明细输出类
 * date: 2019/10/30 10:51
 *
 * @author zhh
 */

import java.math.BigDecimal;

public class SLDetailOutput {
	//主键id
	private Integer wareSurplusBillDetailId;
	//备件key
	private String sparePartsKey;
	//备件号
	private String sparePartsNo;
	//备件名称
	private String sparePartsName;
	//国际化备件
	private String sparePartsLangLang;
	//仓库类型
	private String warehouseType;
	//国际化仓库类型
	private String warehouseTypeLangLang;
	//所属公司
	private String company;
	//国际化所属公司
	private String companyLangLang;
	//库位
	private String storageLocation;
	//盘盈单价
	private BigDecimal price;
	//盘盈数量
	private BigDecimal num;
	//盘盈金额
	private BigDecimal amount;
	//备注
	private String remark;
	//出库批次
	private String sparePartsBatch;
	
	public Integer getWareSurplusBillDetailId() {
		return wareSurplusBillDetailId;
	}
	public void setWareSurplusBillDetailId(Integer wareSurplusBillDetailId) {
		this.wareSurplusBillDetailId = wareSurplusBillDetailId;
	}
	public String getSparePartsKey() {
		return sparePartsKey;
	}
	public void setSparePartsKey(String sparePartsKey) {
		this.sparePartsKey = sparePartsKey;
	}
	public String getSparePartsNo() {
		return sparePartsNo;
	}
	public void setSparePartsNo(String sparePartsNo) {
		this.sparePartsNo = sparePartsNo;
	}
	public String getSparePartsName() {
		return sparePartsName;
	}
	public void setSparePartsName(String sparePartsName) {
		this.sparePartsName = sparePartsName;
	}
	public String getSparePartsLangLang() {
		return sparePartsLangLang;
	}
	public void setSparePartsLangLang(String sparePartsLangLang) {
		this.sparePartsLangLang = sparePartsLangLang;
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
	public String getStorageLocation() {
		return storageLocation;
	}
	public void setStorageLocation(String storageLocation) {
		this.storageLocation = storageLocation;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public BigDecimal getNum() {
		return num;
	}
	public void setNum(BigDecimal num) {
		this.num = num;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
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
