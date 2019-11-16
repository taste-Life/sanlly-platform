package com.sanlly.production.models.output.guarantee;

/**
 *    
 * 
 * @Package com.sanlly.production.models.output.guarantee 
 * @Description: TODO 保修批量提醒明细
 * @author tianzhl   
 * @date 2019年10月11日 下午3:28:36 
 * @version V1.0   
 */
public class MaintenanceBatchDetailOutput {

	// TODO 部件大类
	private String partsTypeCode;

	// TODO 部件明细
	private String partsDetailsCode;

	// TODO 损坏代码
	private String damageCode;

	// TODO 维修代码
	private String repairCode;

	// TODO 数量
	private String quantity;

	// TODO 备件号
	private String sparesNumber;

	// TODO 备注
	private String remarks;

	public String getPartsTypeCode() {
		return partsTypeCode;
	}

	public void setPartsTypeCode(String partsTypeCode) {
		this.partsTypeCode = partsTypeCode;
	}

	public String getPartsDetailsCode() {
		return partsDetailsCode;
	}

	public void setPartsDetailsCode(String partsDetailsCode) {
		this.partsDetailsCode = partsDetailsCode;
	}

	public String getDamageCode() {
		return damageCode;
	}

	public void setDamageCode(String damageCode) {
		this.damageCode = damageCode;
	}

	public String getRepairCode() {
		return repairCode;
	}

	public void setRepairCode(String repairCode) {
		this.repairCode = repairCode;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getSparesNumber() {
		return sparesNumber;
	}

	public void setSparesNumber(String sparesNumber) {
		this.sparesNumber = sparesNumber;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
