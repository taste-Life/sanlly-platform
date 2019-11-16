package com.sanlly.warehouse.models.output.repairdepartment;

/**
 * @author lishzh
 */
public class RepairDepartmentOutput {

	private Integer wareRepairDepartmentId;

	private String key;

	private String keyLangLang;

	private String departmentNameEn;

	private String departmentName;

	private String remark;

	public Integer getWareRepairDepartmentId() {
		return wareRepairDepartmentId;
	}

	public void setWareRepairDepartmentId(Integer wareRepairDepartmentId) {
		this.wareRepairDepartmentId = wareRepairDepartmentId;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getKeyLangLang() {
		return keyLangLang;
	}

	public void setKeyLangLang(String keyLangLang) {
		this.keyLangLang = keyLangLang;
	}

	public String getDepartmentNameEn() {
		return departmentNameEn;
	}

	public void setDepartmentNameEn(String departmentNameEn) {
		this.departmentNameEn = departmentNameEn;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}
