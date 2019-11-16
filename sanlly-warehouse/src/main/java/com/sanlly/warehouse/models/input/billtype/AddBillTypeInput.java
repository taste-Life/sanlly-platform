package com.sanlly.warehouse.models.input.billtype;

import java.util.List;

public class AddBillTypeInput {

	private String billTypeCode;
	
	private String billTypeModule;

	private String billTypeName;

	private String billTypeNameEn;

	private String remark;

	private Integer createUser;

	public String getBillTypeModule() {
		return billTypeModule;
	}

	public void setBillTypeModule(String billTypeModule) {
		this.billTypeModule = billTypeModule;
	}

	private List<String> warehouseTypeKeys;

	public List<String> getWarehouseTypeKeys() {
		return warehouseTypeKeys;
	}

	public void setWarehouseTypeKeys(List<String> warehouseTypeKeys) {
		this.warehouseTypeKeys = warehouseTypeKeys;
	}

	public String getBillTypeCode() {
		return billTypeCode;
	}

	public void setBillTypeCode(String billTypeCode) {
		this.billTypeCode = billTypeCode;
	}

	public String getBillTypeName() {
		return billTypeName;
	}

	public void setBillTypeName(String billTypeName) {
		this.billTypeName = billTypeName;
	}

	public String getBillTypeNameEn() {
		return billTypeNameEn;
	}

	public void setBillTypeNameEn(String billTypeNameEn) {
		this.billTypeNameEn = billTypeNameEn;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getCreateUser() {
		return createUser;
	}

	public void setCreateUser(Integer createUser) {
		this.createUser = createUser;
	}

}
