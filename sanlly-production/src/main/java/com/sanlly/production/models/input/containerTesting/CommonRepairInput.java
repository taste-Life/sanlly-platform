package com.sanlly.production.models.input.containerTesting;

/**
 *    
 * 
 * @Package com.sanlly.production.models.input.containerTesting 
 * @Description: TODO 常用修理方案-输入
 * @author tianzhl   
 * @date 2019年8月20日 上午10:40:04 
 * @version V1.0   
 */
public class CommonRepairInput {
	
	// TODO 位置代码
	private String positionCode;

	// TODO 部件修理
	private String partsRepairCode;

	// TODO 部件明细
	private String partsDetailsCode;

	// TODO 修理
	private String repairCode;

	public String getPartsRepairCode() {
		return partsRepairCode;
	}

	public void setPartsRepairCode(String partsRepairCode) {
		this.partsRepairCode = partsRepairCode;
	}

	public String getPositionCode() {
		return positionCode;
	}

	public String getPartsDetailsCode() {
		return partsDetailsCode;
	}

	public String getRepairCode() {
		return repairCode;
	}

	public void setPositionCode(String positionCode) {
		this.positionCode = positionCode;
	}

	public void setPartsDetailsCode(String partsDetailsCode) {
		this.partsDetailsCode = partsDetailsCode;
	}

	public void setRepairCode(String repairCode) {
		this.repairCode = repairCode;
	}

}
