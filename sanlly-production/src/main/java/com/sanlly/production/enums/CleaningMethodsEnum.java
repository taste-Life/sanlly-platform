package com.sanlly.production.enums;

public enum CleaningMethodsEnum {
	/**
	 * 水洗
	 */
	MCOWW("水洗", "IXXX", "MCO", "MCOWW", "WW", "DY"),
	/**
	 * 化洗
	 */
	MCOCC("化洗", "IXXX", "MCO", "MCOCC", "CC", "DY");

	// TODO 方式名称
	private String methodsName;
	// TODO 位置代码
	private String positionCode;
	// TODO 部件修理代码
	private String partsDetailsCode;
	// TODO 部件明细代码
	private String partsRepairCode;
	// TODO 修理代码
	private String repairCode;
	// TODO 损坏代码
	private String damageCode;

	CleaningMethodsEnum() {

	}

	private CleaningMethodsEnum(String methodsName, String positionCode, String partsDetailsCode,
			String partsRepairCode, String repairCode, String damageCode) {
		this.methodsName = methodsName;
		this.positionCode = positionCode;
		this.partsDetailsCode = partsDetailsCode;
		this.partsRepairCode = partsRepairCode;
		this.repairCode = repairCode;
		this.damageCode = damageCode;
	}

	public String getMethodsName() {
		return methodsName;
	}

	public void setMethodsName(String methodsName) {
		this.methodsName = methodsName;
	}

	public String getPositionCode() {
		return positionCode;
	}

	public void setPositionCode(String positionCode) {
		this.positionCode = positionCode;
	}

	public String getPartsDetailsCode() {
		return partsDetailsCode;
	}

	public void setPartsDetailsCode(String partsDetailsCode) {
		this.partsDetailsCode = partsDetailsCode;
	}

	public String getPartsRepairCode() {
		return partsRepairCode;
	}

	public void setPartsRepairCode(String partsRepairCode) {
		this.partsRepairCode = partsRepairCode;
	}

	public String getRepairCode() {
		return repairCode;
	}

	public void setRepairCode(String repairCode) {
		this.repairCode = repairCode;
	}

	public String getDamageCode() {
		return damageCode;
	}

	public void setDamageCode(String damageCode) {
		this.damageCode = damageCode;
	}

}
