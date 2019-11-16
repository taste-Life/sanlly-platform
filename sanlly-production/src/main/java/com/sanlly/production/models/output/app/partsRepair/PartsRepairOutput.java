package com.sanlly.production.models.output.app.partsRepair;

/**   
* @Package com.sanlly.production.models.output.app.partsRepair 
* @Description: TODO 部件修理实体-输出
* @author tianzhl   
* @date 2019年8月12日 下午4:35:35 
* @version V1.0   
*/
public class PartsRepairOutput {
	
	// TODO 部件修理代码
	private String partsRepairCode;
	// TODO 部件修理名称
	private String partsRepairName;
	// TODO 部件修理key
	private String partsRepairKey;

	public String getPartsRepairCode() {
		return partsRepairCode;
	}

	public String getPartsRepairName() {
		return partsRepairName;
	}

	public String getPartsRepairKey() {
		return partsRepairKey;
	}

	public void setPartsRepairCode(String partsRepairCode) {
		this.partsRepairCode = partsRepairCode;
	}

	public void setPartsRepairName(String partsRepairName) {
		this.partsRepairName = partsRepairName;
	}

	public void setPartsRepairKey(String partsRepairKey) {
		this.partsRepairKey = partsRepairKey;
	}

}
