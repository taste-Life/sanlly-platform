package com.sanlly.production.models.input.app.spare;

/**
 *    
 * 
 * @Package com.sanlly.production.models.input.app.spare 
 * @Description: TODO 机组选择备件号 库存
 * @author tianzhl   
 * @date 2019年10月30日 下午3:12:30 
 * @version V1.0   
 */
public class SpareStockInput {

	// TODO 备件号
	private String sparesNum;

	// TODO 选件模块
	private String spareStockModule;

	// TODO 修理代码
	private String repairCode;

	// TODO 用箱人
	private String containerUser;

	public String getSparesNum() {
		return sparesNum;
	}

	public void setSparesNum(String sparesNum) {
		this.sparesNum = sparesNum;
	}

	public String getSpareStockModule() {
		return spareStockModule;
	}

	public void setSpareStockModule(String spareStockModule) {
		this.spareStockModule = spareStockModule;
	}

	public String getRepairCode() {
		return repairCode;
	}

	public void setRepairCode(String repairCode) {
		this.repairCode = repairCode;
	}

	public String getContainerUser() {
		return containerUser;
	}

	public void setContainerUser(String containerUser) {
		this.containerUser = containerUser;
	}

}
