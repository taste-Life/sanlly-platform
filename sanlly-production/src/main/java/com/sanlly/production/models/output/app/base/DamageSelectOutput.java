package com.sanlly.production.models.output.app.base;
/**
 * APP端损坏代码列表输出类（干箱）
 * @author zhangkai
 *
 */
public class DamageSelectOutput {

	/*
	 * 部件修理代码
	 */
	private String partsRepairCode;
	/*
	 * 损坏代码
	 */
	private String damageCode;
	/*
	 * 损坏代码中文名
	 */
	private String damageName = "";
	/*
	 * 损坏代码英文名
	 */
	private String damageNameEn = "";
	
	public String getPartsRepairCode() {
		return partsRepairCode;
	}

	public void setPartsRepairCode(String partsRepairCode) {
		this.partsRepairCode = partsRepairCode;
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
