package com.sanlly.production.models.output.containerTesting;

/**
 * @Package com.sanlly.production.models.output.app.containerTesting 
 * @Description: TODO 常用修理方案明细-输出
 * @author tianzhl   
 * @date 2019年8月9日 下午5:09:06 
 * @version V1.0   
 */
public class CommonRepairEntryOutput {

	// TODO 位置代码
	private String positionCode;
	// TODO 部件明细代码
	private String partsDetailsCode;
	// TODO 部件明细名称
	private String partsDetailsName;
	// TODO 部件修理代码
	private String partsRepairCode;
	// TODO 部件修理名称
	private String partsRepairName;
	// TODO 修理代码
	private String repairCode;
	// TODO 修理名称
	private String repairName;
	// TODO 损坏代码
	private String damageCode;
	// TODO 损坏名称
	private String damageName;
	// TODO 数量
	private String quantity;

	public String getPositionCode() {
		return positionCode;
	}

	public String getPartsDetailsCode() {
		return partsDetailsCode;
	}

	public String getPartsDetailsName() {
		return partsDetailsName;
	}

	public String getPartsRepairCode() {
		return partsRepairCode;
	}

	public String getPartsRepairName() {
		return partsRepairName;
	}

	public String getRepairCode() {
		return repairCode;
	}

	public String getRepairName() {
		return repairName;
	}

	public String getDamageCode() {
		return damageCode;
	}

	public String getDamageName() {
		return damageName;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setPositionCode(String positionCode) {
		this.positionCode = positionCode;
	}

	public void setPartsDetailsCode(String partsDetailsCode) {
		this.partsDetailsCode = partsDetailsCode;
	}

	public void setPartsDetailsName(String partsDetailsName) {
		this.partsDetailsName = partsDetailsName;
	}

	public void setPartsRepairCode(String partsRepairCode) {
		this.partsRepairCode = partsRepairCode;
	}

	public void setPartsRepairName(String partsRepairName) {
		this.partsRepairName = partsRepairName;
	}

	public void setRepairCode(String repairCode) {
		this.repairCode = repairCode;
	}

	public void setRepairName(String repairName) {
		this.repairName = repairName;
	}

	public void setDamageCode(String damageCode) {
		this.damageCode = damageCode;
	}

	public void setDamageName(String damageName) {
		this.damageName = damageName;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

}
