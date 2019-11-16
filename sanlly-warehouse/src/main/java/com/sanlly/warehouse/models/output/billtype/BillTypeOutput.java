package com.sanlly.warehouse.models.output.billtype;

import java.util.List;

import com.sanlly.warehouse.models.output.KeyOutput;

public class BillTypeOutput extends KeyOutput{
	
	private Integer wareBillTypeId;
	
	private String billTypeName;

    private String billTypeNameEn;

	private String billTypeCode;
	
	private String billTypeModule;

    private String billTypeModuleLangLang;
	
	private String remark;

	private List<KeyOutput> warehouseTypes;

	public String getBillTypeModule() {
		return billTypeModule;
	}

	public void setBillTypeModule(String billTypeModule) {
		this.billTypeModule = billTypeModule;
	}


	public String getBillTypeModuleLangLang() {
		return billTypeModuleLangLang;
	}

	public void setBillTypeModuleLangLang(String billTypeModuleLangLang) {
		this.billTypeModuleLangLang = billTypeModuleLangLang;
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

	public String getBillTypeCode() {
		return billTypeCode;
	}

	public void setBillTypeCode(String billTypeCode) {
		this.billTypeCode = billTypeCode;
	}

	public List<KeyOutput> getWarehouseTypes() {
		return warehouseTypes;
	}

	public void setWarehouseTypes(List<KeyOutput> warehouseTypes) {
		this.warehouseTypes = warehouseTypes;
	}

	public Integer getWareBillTypeId() {
		return wareBillTypeId;
	}

	public void setWareBillTypeId(Integer wareBillTypeId) {
		this.wareBillTypeId = wareBillTypeId;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}


}
