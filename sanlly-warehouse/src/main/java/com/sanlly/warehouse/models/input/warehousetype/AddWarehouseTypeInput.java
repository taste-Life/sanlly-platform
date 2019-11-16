package com.sanlly.warehouse.models.input.warehousetype;

public class AddWarehouseTypeInput {

	private String warehouseTypeNameEn;

	private String warehouseTypeName;

	private String cbsWarehouseTypeNameEn;

	private String cbsWarehouseTypeName;

	private Integer createUser;

	private Integer updateUser;

	public String getWarehouseTypeNameEn() {
		return warehouseTypeNameEn;
	}

	public void setWarehouseTypeNameEn(String warehouseTypeNameEn) {
		this.warehouseTypeNameEn = warehouseTypeNameEn;
	}

	public String getWarehouseTypeName() {
		return warehouseTypeName;
	}

	public void setWarehouseTypeName(String warehouseTypeName) {
		this.warehouseTypeName = warehouseTypeName;
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

	public Integer getCreateUser() {
		return createUser;
	}

	public void setCreateUser(Integer createUser) {
		this.createUser = createUser;
	}

	public Integer getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(Integer updateUser) {
		this.updateUser = updateUser;
	}

}
