package com.sanlly.production.models.output.app.repair;

/**   
* @Package com.sanlly.production.models.output.app.repair 
* @Description: TODO 修理实体-输出
* @author tianzhl   
* @date 2019年8月12日 下午4:35:35 
* @version V1.0   
*/
public class RepairOutput {
	
	// TODO 修理代码
	private String repairCode;
	// TODO 修理名称
	private String repairName;
	// TODO 修理key
	private String repairKey;

	public String getRepairCode() {
		return repairCode;
	}

	public String getRepairName() {
		return repairName;
	}

	public String getRepairKey() {
		return repairKey;
	}

	public void setRepairCode(String repairCode) {
		this.repairCode = repairCode;
	}

	public void setRepairName(String repairName) {
		this.repairName = repairName;
	}

	public void setRepairKey(String repairKey) {
		this.repairKey = repairKey;
	}

}
