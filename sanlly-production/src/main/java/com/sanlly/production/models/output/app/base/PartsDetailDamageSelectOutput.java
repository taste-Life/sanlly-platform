package com.sanlly.production.models.output.app.base;
/**
 * APP端损坏代表列表输出类
 * @author zhangkai
 *
 */
public class PartsDetailDamageSelectOutput {

	/*
	 * 部件明细代码
	 */
	private String partsDetailsCode;
	/*
	 * 修理代码
	 */
	private String repairCode;
	/*
	 * 损坏代码
	 */
	private String damageCode;
	/*
	 * 损坏中文名
	 */
	private String damageName = "";
	/*
	 * 损坏英文名
	 */
	private String damageNameEn = "";

	public String getPartsDetailsCode() {
		return partsDetailsCode;
	}

	public void setPartsDetailsCode(String partsDetailsCode) {
		this.partsDetailsCode = partsDetailsCode;
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

	public String getDamageName() {
		return damageName;
	}

	public void setDamageName(String damageName) {
		this.damageName = damageName;
	}

	public String getDamageNameEn() {
		return damageNameEn;
	}

	public void setDamageNameEn(String damageNameEn) {
		this.damageNameEn = damageNameEn;
	}
	
	
}
