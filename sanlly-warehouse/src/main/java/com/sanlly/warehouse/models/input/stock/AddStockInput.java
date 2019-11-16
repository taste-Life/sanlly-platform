package com.sanlly.warehouse.models.input.stock;

import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.Date;

/**
 * ClassName: AddStockInput Description: 库存添加输入类 date: 2019/7/29 9:54
 *
 * @author wannt
 * @since JDK 1.8
 */
public class AddStockInput {

	@ApiModelProperty(value = "入库单号", name = "stockinNo")
	private String stockinNo;

	@ApiModelProperty(value = "所属公司", name = "company")
	private String company;

	@ApiModelProperty(value = "仓库类型", name = "warehouseType")
	private String warehouseType;

	@ApiModelProperty(value = "所属仓库", name = "warehouse")
	private String warehouse;

	@ApiModelProperty(value = "所属代管公司", name = "escrowCompany")
	private String escrowCompany;

	@ApiModelProperty(value = "库位", name = "storageLocation")
	private String storageLocation;

	@ApiModelProperty(value = "备件大类", name = "sparePartsCategories")
	private String sparePartsCategories;

	@ApiModelProperty(value = "备件号", name = "sparePartsNo")
	private String sparePartsNo;

	@ApiModelProperty(value = "备件key", name = "spareParts")
	private String spareParts;

	@ApiModelProperty(value = "备件名称", name = "sparePartsName")
	private String sparePartsName;

	@ApiModelProperty(value = "备件单位", name = "sparePartsUnit")
	private String sparePartsUnit;

	@ApiModelProperty(value = "长度", name = "length")
	private Double length;

	@ApiModelProperty(value = "宽度", name = "width")
	private Double width;

	@ApiModelProperty(value = "备件批次号", name = "sparePartsBatch")
	private String sparePartsBatch;

	@ApiModelProperty(value = "备件原始批次号", name = "sparePartsOriginalBatch")
	private String sparePartsOriginalBatch;

	@ApiModelProperty(value = "入库数量", name = "entryNum")
	private Double entryNum;

	@ApiModelProperty(value = "原始面积", name = "originalArea")
	private Double originalArea;

	@ApiModelProperty(value = "发票单价", name = "invoicePrice")
	private BigDecimal invoicePrice;

	@ApiModelProperty(value = "CORE(不含税)", name = "core")
	private BigDecimal core;

	@ApiModelProperty(value = "增值税", name = "vat")
	private BigDecimal vat;

	@ApiModelProperty(value = "关税状态", name = "tariffStatus")
	private String tariffStatus;

	@ApiModelProperty(value = "关税", name = "tariff")
	private BigDecimal tariff;

	@ApiModelProperty(value = "关税编号", name = "tariffNo")
	private String tariffNo;

	@ApiModelProperty(value = "关税日期", name = "tariffDate")
	private Date tariffDate;

	@ApiModelProperty(value = "运费", name = "freight")
	private BigDecimal freight;

	@ApiModelProperty(value = "单价", name = "unitPrice")
	private BigDecimal unitPrice;

	@ApiModelProperty(value = "原始入库日期", name = "oldStockinDate")
	private Date oldStockinDate;

	@ApiModelProperty(value = "入库日期", name = "stockinDate")
	private Date stockinDate;

	@ApiModelProperty(value = "备注", name = "remark")
	private String remark;

	private String sourceBatch;//源批次

	public String getSourceBatch() {
		return sourceBatch;
	}

	public void setSourceBatch(String sourceBatch) {
		this.sourceBatch = sourceBatch;
	}

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

	public Double getOriginalArea() {
		return originalArea;
	}

	public void setOriginalArea(Double originalArea) {
		this.originalArea = originalArea;
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

	public String getSparePartsName() {
		return sparePartsName;
	}

	public void setSparePartsName(String sparePartsName) {
		this.sparePartsName = sparePartsName;
	}
}
