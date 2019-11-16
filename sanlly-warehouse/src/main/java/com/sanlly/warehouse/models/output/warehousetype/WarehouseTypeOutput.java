package com.sanlly.warehouse.models.output.warehousetype;

import com.sanlly.warehouse.models.output.KeyOutput;

public class WarehouseTypeOutput extends KeyOutput {

	private Integer wareWarehouseTypeId;

	private String warehouseTypeName;

	private String warehouseTypeNameEn;
	
	private String cbsLangLang;

	private String cbsWarehouseTypeNameEn;

	private String cbsWarehouseTypeName;

	public String getCbsLangLang() {
		return cbsLangLang;
	}

	public void setCbsLangLang(String cbsLangLang) {
		this.cbsLangLang = cbsLangLang;
	}

	public Integer getWareWarehouseTypeId() {
		return wareWarehouseTypeId;
	}

	public void setWareWarehouseTypeId(Integer wareWarehouseTypeId) {
		this.wareWarehouseTypeId = wareWarehouseTypeId;
	}

	public String getWarehouseTypeName() {
		return warehouseTypeName;
	}

	public void setWarehouseTypeName(String warehouseTypeName) {
		this.warehouseTypeName = warehouseTypeName;
	}

	public String getWarehouseTypeNameEn() {
		return warehouseTypeNameEn;
	}

	public void setWarehouseTypeNameEn(String warehouseTypeNameEn) {
		this.warehouseTypeNameEn = warehouseTypeNameEn;
	}

	public String getCbsWarehouseTypeNameEn() {
		return cbsWarehouseTypeNameEn;
	}

	public void setCbsWarehouseTypeNameEn(String cbsWarehouseTypeNameEn) {
		this.cbsWarehouseTypeNameEn = cbsWarehouseTypeNameEn;
	}

	public String getCbsWarehouseTypeName() {
		return cbsWarehouseTypeName;
	}

	public void setCbsWarehouseTypeName(String cbsWarehouseTypeName) {
		this.cbsWarehouseTypeName = cbsWarehouseTypeName;
	}

}
