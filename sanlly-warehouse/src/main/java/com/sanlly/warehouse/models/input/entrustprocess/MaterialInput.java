package com.sanlly.warehouse.models.input.entrustprocess;

import java.math.BigDecimal;

/**
 * 委托加工材料
 * 
 * @author lishzh
 *
 */
public class MaterialInput {

	private Integer wareEntrustedProcessingMaterialId;

	private Integer entrustedProcessingId;

	private String spareParts;//备件

	private String warehouseType;//仓库类型

	private String warehouse;//仓库

	private String company;

	private String stockoutStatus;//出库状态

	private BigDecimal price;//单价

	private Double processingNum;//加工数量

	private String remark;
	
	private String sparePartsBatch;

	public String getSparePartsBatch() {
		return sparePartsBatch;
	}

	public void setSparePartsBatch(String sparePartsBatch) {
		this.sparePartsBatch = sparePartsBatch;
	}

	public Integer getWareEntrustedProcessingMaterialId() {
		return wareEntrustedProcessingMaterialId;
	}

	public void setWareEntrustedProcessingMaterialId(Integer wareEntrustedProcessingMaterialId) {
		this.wareEntrustedProcessingMaterialId = wareEntrustedProcessingMaterialId;
	}

	public Integer getEntrustedProcessingId() {
		return entrustedProcessingId;
	}

	public void setEntrustedProcessingId(Integer entrustedProcessingId) {
		this.entrustedProcessingId = entrustedProcessingId;
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

	public String getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(String warehouse) {
		this.warehouse = warehouse;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getStockoutStatus() {
		return stockoutStatus;
	}

	public void setStockoutStatus(String stockoutStatus) {
		this.stockoutStatus = stockoutStatus;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Double getProcessingNum() {
		return processingNum;
	}

	public void setProcessingNum(Double processingNum) {
		this.processingNum = processingNum;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
