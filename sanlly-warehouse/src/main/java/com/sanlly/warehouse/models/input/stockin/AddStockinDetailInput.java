package com.sanlly.warehouse.models.input.stockin;

import java.math.BigDecimal;

import com.sanlly.common.models.output.stock.StockOutput;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ClassName: AddStockinDetailInput Description: 新增入库单明细输入类 date: 2019/8/2 14:24
 *
 * @author wannt
 * @since JDK 1.8
 */
@ApiModel(value = "新增入库单明细输入类")
public class AddStockinDetailInput {

	@ApiModelProperty(value = "入库批次号", name = "stockinBatch")
	private String stockinBatch;
	
	private String originBatch;//原始批次
	
	private String sourceBatch;//源批次

	@ApiModelProperty(value = "备件", name = "spareParts")
	private String spareParts;

	@ApiModelProperty(value = "送货数量", name = "deliveryNum")
	private Double deliveryNum;

	@ApiModelProperty(value = "入库数量", name = "entryNum")
	private Double entryNum;

	@ApiModelProperty(value = "库位", name = "storageLocation")
	private String storageLocation;

	@ApiModelProperty(value = "关税", name = "tariff")
	private BigDecimal tariff;

	@ApiModelProperty(value = "增值税", name = "vat")
	private BigDecimal vat;

	@ApiModelProperty(value = "运费", name = "freight")
	private BigDecimal freight;

	@ApiModelProperty(value = "入库仓库", name = "warehouse")
	private String warehouse;

	@ApiModelProperty(value = "默认仓库类型", name = "warehouseType")
	private String warehouseType;

	@ApiModelProperty(value = "发票单价", name = "invoicePrice")
	private BigDecimal invoicePrice;

	@ApiModelProperty(value = "CORE(不含税)", name = "core")
	private BigDecimal core;

	@ApiModelProperty(value = "入库单价", name = "entryPrice")
	private BigDecimal entryPrice;

	@ApiModelProperty(value = "备注", name = "remark")
	private String remark;

	@ApiModelProperty(value = "备件key", name = "key")
	private String key;

	private Double length;// 长度

	private Double width;// 宽度
	
	private String sparePartsNo;
	
	private String sparePartsName;
	
	private StockOutput stock;

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

	public String getSourceBatch() {
		return sourceBatch;
	}

	public void setSourceBatch(String sourceBatch) {
		this.sourceBatch = sourceBatch;
	}

	public String getOriginBatch() {
		return originBatch;
	}

	public void setOriginBatch(String originBatch) {
		this.originBatch = originBatch;
	}

	public StockOutput getStock() {
		return stock;
	}

	public void setStock(StockOutput stock) {
		this.stock = stock;
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

	public String getStockinBatch() {
		return stockinBatch;
	}

	public void setStockinBatch(String stockinBatch) {
		this.stockinBatch = stockinBatch;
	}

	public String getSpareParts() {
		return spareParts;
	}

	public void setSpareParts(String spareParts) {
		this.spareParts = spareParts;
	}

	public Double getDeliveryNum() {
		return deliveryNum;
	}

	public void setDeliveryNum(Double deliveryNum) {
		this.deliveryNum = deliveryNum;
	}

	public Double getEntryNum() {
		return entryNum;
	}

	public void setEntryNum(Double entryNum) {
		this.entryNum = entryNum;
	}

	public String getStorageLocation() {
		return storageLocation;
	}

	public void setStorageLocation(String storageLocation) {
		this.storageLocation = storageLocation;
	}

	public BigDecimal getTariff() {
		return tariff;
	}

	public void setTariff(BigDecimal tariff) {
		this.tariff = tariff;
	}

	public BigDecimal getVat() {
		return vat;
	}

	public void setVat(BigDecimal vat) {
		this.vat = vat;
	}

	public BigDecimal getFreight() {
		return freight;
	}

	public void setFreight(BigDecimal freight) {
		this.freight = freight;
	}

	public String getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(String warehouse) {
		this.warehouse = warehouse;
	}

	public String getWarehouseType() {
		return warehouseType;
	}

	public void setWarehouseType(String warehouseType) {
		this.warehouseType = warehouseType;
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

	public BigDecimal getEntryPrice() {
		return entryPrice;
	}

	public void setEntryPrice(BigDecimal entryPrice) {
		this.entryPrice = entryPrice;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	@Override
	public String toString() {
		return "AddStockinDetailInput{" + "stockinBatch='" + stockinBatch + '\'' + ", spareParts='" + spareParts + '\''
				+ ", deliveryNum=" + deliveryNum + ", entryNum=" + entryNum + ", storageLocation='" + storageLocation
				+ '\'' + ", tariff=" + tariff + ", vat=" + vat + ", freight=" + freight + ", warehouse='" + warehouse
				+ '\'' + ", warehouseType='" + warehouseType + '\'' + ", invoicePrice=" + invoicePrice + ", core="
				+ core + ", entryPrice=" + entryPrice + '}';
	}
}
