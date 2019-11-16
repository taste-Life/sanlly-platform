package com.sanlly.warehouse.models.output.laborInsurance.LaborInsuranceStockIn;

import java.math.BigDecimal;
/**
 * ClassName: LaborStockInDetailOutput
 * Description: 入库单明细输出类
 * date: 2019/8/26 10:30
 *
 * @author zhh
 */
public class LaborStockInDetailOutput {
	//明细id
	private Integer wareStockinDetailLabaorId;
    //入库单id
    private Integer labaorStockin;
    //入库批次号
    private String stockinBatch;
    //备件key
    private String spareParts;
    //备件名称
    private String sparePartsNameLang;
    //备件号
    private String sparePartsNo;
    //总金额
    private BigDecimal totalAmount;
    //入库数量
    private Double entryNum;
    //库位
    private String storageLocation;
    //仓库key
    private String warehouse;
    //国际化仓库key
    private String warehouseNameLang;
    //默认仓库类型
    private String warehouseType;
    //国际化仓库类型key
    private String warehouseTypeNameLang;
    //入库单价
    private BigDecimal entryPrice;
    //备注
    private String remark;
    //型号
    private String model;
    
	public Integer getWareStockinDetailLabaorId() {
		return wareStockinDetailLabaorId;
	}
	public void setWareStockinDetailLabaorId(Integer wareStockinDetailLabaorId) {
		this.wareStockinDetailLabaorId = wareStockinDetailLabaorId;
	}
	public Integer getLabaorStockin() {
		return labaorStockin;
	}
	public void setLabaorStockin(Integer labaorStockin) {
		this.labaorStockin = labaorStockin;
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
	public String getSparePartsNameLang() {
		return sparePartsNameLang;
	}
	public void setSparePartsNameLang(String sparePartsNameLang) {
		this.sparePartsNameLang = sparePartsNameLang;
	}
	public String getSparePartsNo() {
		return sparePartsNo;
	}
	public void setSparePartsNo(String sparePartsNo) {
		this.sparePartsNo = sparePartsNo;
	}
	public BigDecimal getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}
	public Double getEntryNum() {
		return entryNum;
	}
	public void setEntryNum(Double entryNum) {
		this.entryNum = entryNum;
	}
	public String getWarehouseType() {
		return warehouseType;
	}
	public void setWarehouseType(String warehouseType) {
		this.warehouseType = warehouseType;
	}
	public String getWarehouseTypeNameLang() {
		return warehouseTypeNameLang;
	}
	public void setWarehouseTypeNameLang(String warehouseTypeNameLang) {
		this.warehouseTypeNameLang = warehouseTypeNameLang;
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
	public String getStorageLocation() {
		return storageLocation;
	}
	public void setStorageLocation(String storageLocation) {
		this.storageLocation = storageLocation;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getWarehouse() {
		return warehouse;
	}
	public void setWarehouse(String warehouse) {
		this.warehouse = warehouse;
	}
	public String getWarehouseNameLang() {
		return warehouseNameLang;
	}
	public void setWarehouseNameLang(String warehouseNameLang) {
		this.warehouseNameLang = warehouseNameLang;
	}
	
    
	
}
