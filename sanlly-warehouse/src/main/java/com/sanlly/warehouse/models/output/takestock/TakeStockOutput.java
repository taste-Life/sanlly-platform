package com.sanlly.warehouse.models.output.takestock;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 
* @Package com.sanlly.warehouse.models.output.takestock 
* @Description: 库存盘点分页输出 
* @author jlx   
* @date 2019年10月10日 下午5:09:30 
* @version V1.0   
 */
public class TakeStockOutput {
	// 入库单号
	private String stockinNo;

    // 所属公司
    private String company;
    private String companyLangLang;

    // 仓库类型
    private String warehouseType;
    private String warehouseTypeLangLang;

    // 仓库
    private String warehouse;
    private String warehouseLangLang;
    // 所属代管公司
    private String escrowCompany;
    private String escrowCompanyLangLang;

    // 库位
    private String storageLocation;

    // 备件大类
    private String sparePartsCategories;
    private String sparePartsCategoriesLangLang;

    // 备件号
    private String sparePartsNo;
    // 备件
    private String spareParts;
    private String sparePartsLangLang;
    private String sparePartsName;

    // 备件单位
    private String sparePartsUnit;
    private String sparePartsUnitLangLang;

    // 长度
    private Double length;

    // 宽度
    private Double width;

    // 备件批次号
    private String sparePartsBatch;

    // 备件原始批次号
    private String sparePartsOriginalBatch;

    // 入库数量
    private Double entryNum;

    // 剩余数量
    private Double surplusNum;

    // 实际剩余数量
    private Double actualSurplusNum;

    // 原始面积
    private Double originalArea;

    // 剩余面积
    private Double surplusArea;

    // 发票单价
    private BigDecimal invoicePrice;

    // CORE(不含税)
    private BigDecimal core;

    // 增值税
    private BigDecimal vat;

    // 关税状态
    private String tariffStatus;

    // 关税
    private BigDecimal tariff;

    // 关税编号
    private String tariffNo;

    // 关税日期
    private Date tariffDate;

    // 运费
    private BigDecimal freight;

    // 单价
    private BigDecimal unitPrice;

    // 库存金额
    private BigDecimal total;

    // 原始入库日期
    private Date oldStockinDate;

    // 入库日期
	@JsonFormat(locale="zh", timezone="GMT+8", pattern = "yyyy-MM-dd")
    private Date stockinDate;

    // 备注
    private String remark;

    // 盘点时间
	@JsonFormat(locale="zh", timezone="GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;
	public String getStockinNo() {
		return stockinNo;
	}
	public void setStockinNo(String stockinNo) {
		this.stockinNo = stockinNo;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getWarehouseType() {
		return warehouseType;
	}
	public void setWarehouseType(String warehouseType) {
		this.warehouseType = warehouseType;
	}
	public String getWarehouse() {
		return warehouse;
	}
	public void setWarehouse(String warehouse) {
		this.warehouse = warehouse;
	}
	public String getEscrowCompany() {
		return escrowCompany;
	}
	public void setEscrowCompany(String escrowCompany) {
		this.escrowCompany = escrowCompany;
	}
	public String getStorageLocation() {
		return storageLocation;
	}
	public void setStorageLocation(String storageLocation) {
		this.storageLocation = storageLocation;
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
	public String getSparePartsUnit() {
		return sparePartsUnit;
	}
	public void setSparePartsUnit(String sparePartsUnit) {
		this.sparePartsUnit = sparePartsUnit;
	}
	public Double getLength() {
		return length;
	}
	public void setLength(Double length) {
		this.length = length;
	}
	public Double getWidth() {
		return width;
	}
	public void setWidth(Double width) {
		this.width = width;
	}
	public String getSparePartsBatch() {
		return sparePartsBatch;
	}
	public void setSparePartsBatch(String sparePartsBatch) {
		this.sparePartsBatch = sparePartsBatch;
	}
	public String getSparePartsOriginalBatch() {
		return sparePartsOriginalBatch;
	}
	public void setSparePartsOriginalBatch(String sparePartsOriginalBatch) {
		this.sparePartsOriginalBatch = sparePartsOriginalBatch;
	}
	public Double getEntryNum() {
		return entryNum;
	}
	public void setEntryNum(Double entryNum) {
		this.entryNum = entryNum;
	}
	public Double getSurplusNum() {
		return surplusNum;
	}
	public void setSurplusNum(Double surplusNum) {
		this.surplusNum = surplusNum;
	}
	public Double getActualSurplusNum() {
		return actualSurplusNum;
	}
	public void setActualSurplusNum(Double actualSurplusNum) {
		this.actualSurplusNum = actualSurplusNum;
	}
	public Double getOriginalArea() {
		return originalArea;
	}
	public void setOriginalArea(Double originalArea) {
		this.originalArea = originalArea;
	}
	public Double getSurplusArea() {
		return surplusArea;
	}
	public void setSurplusArea(Double surplusArea) {
		this.surplusArea = surplusArea;
	}
	public BigDecimal getInvoicePrice() {
		return invoicePrice;
	}
	public void setInvoicePrice(BigDecimal invoicePrice) {
		this.invoicePrice = invoicePrice;
	}
	public BigDecimal getCore() {
		return core;
	}
	public void setCore(BigDecimal core) {
		this.core = core;
	}
	public BigDecimal getVat() {
		return vat;
	}
	public void setVat(BigDecimal vat) {
		this.vat = vat;
	}
	public String getTariffStatus() {
		return tariffStatus;
	}
	public void setTariffStatus(String tariffStatus) {
		this.tariffStatus = tariffStatus;
	}
	public BigDecimal getTariff() {
		return tariff;
	}
	public void setTariff(BigDecimal tariff) {
		this.tariff = tariff;
	}
	public String getTariffNo() {
		return tariffNo;
	}
	public void setTariffNo(String tariffNo) {
		this.tariffNo = tariffNo;
	}
	public Date getTariffDate() {
		return tariffDate;
	}
	public void setTariffDate(Date tariffDate) {
		this.tariffDate = tariffDate;
	}
	public BigDecimal getFreight() {
		return freight;
	}
	public void setFreight(BigDecimal freight) {
		this.freight = freight;
	}
	public BigDecimal getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}
	public Date getOldStockinDate() {
		return oldStockinDate;
	}
	public void setOldStockinDate(Date oldStockinDate) {
		this.oldStockinDate = oldStockinDate;
	}
	public Date getStockinDate() {
		return stockinDate;
	}
	public void setStockinDate(Date stockinDate) {
		this.stockinDate = stockinDate;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getSparePartsName() {
		return sparePartsName;
	}
	public void setSparePartsName(String sparePartsName) {
		this.sparePartsName = sparePartsName;
	}
	public String getCompanyLangLang() {
		return companyLangLang;
	}
	public void setCompanyLangLang(String companyLangLang) {
		this.companyLangLang = companyLangLang;
	}
	public String getWarehouseTypeLangLang() {
		return warehouseTypeLangLang;
	}
	public void setWarehouseTypeLangLang(String warehouseTypeLangLang) {
		this.warehouseTypeLangLang = warehouseTypeLangLang;
	}
	public String getWarehouseLangLang() {
		return warehouseLangLang;
	}
	public void setWarehouseLangLang(String warehouseLangLang) {
		this.warehouseLangLang = warehouseLangLang;
	}
	public String getEscrowCompanyLangLang() {
		return escrowCompanyLangLang;
	}
	public void setEscrowCompanyLangLang(String escrowCompanyLangLang) {
		this.escrowCompanyLangLang = escrowCompanyLangLang;
	}
	public String getSparePartsCategoriesLangLang() {
		return sparePartsCategoriesLangLang;
	}
	public void setSparePartsCategoriesLangLang(String sparePartsCategoriesLangLang) {
		this.sparePartsCategoriesLangLang = sparePartsCategoriesLangLang;
	}
	public String getSparePartsUnitLangLang() {
		return sparePartsUnitLangLang;
	}
	public void setSparePartsUnitLangLang(String sparePartsUnitLangLang) {
		this.sparePartsUnitLangLang = sparePartsUnitLangLang;
	}
	public String getSparePartsLangLang() {
		return sparePartsLangLang;
	}
	public void setSparePartsLangLang(String sparePartsLangLang) {
		this.sparePartsLangLang = sparePartsLangLang;
	}
	public BigDecimal getTotal() {
		return total;
	}
	public void setTotal(BigDecimal total) {
		this.total = total;
	}
    
    
}
