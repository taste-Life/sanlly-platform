package com.sanlly.production.models.output.containerTesting;

import java.util.List;

/**
 * @Package com.sanlly.production.models.output.app.containerTesting 
 * @Description: TODO 常用修理方案实体-输出
 * @author tianzhl   
 * @date 2019年8月9日 下午5:09:06 
 * @version V1.0   
 */
public class CommonRepairOutput {

	// TODO 常用修理方式编码
	private String commonRepairCode;
	// TODO 常用修理方式名称
	private String commonRepairName;
	// TODO 必选条目列表
	private List<CommonRepairEntryOutput> requiredList;
	// TODO 可选条目列表
	private List<CommonRepairEntryOutput> optionalList;

	public String getCommonRepairCode() {
		return commonRepairCode;
	}

	public String getCommonRepairName() {
		return commonRepairName;
	}

	public List<CommonRepairEntryOutput> getRequiredList() {
		return requiredList;
	}

	public List<CommonRepairEntryOutput> getOptionalList() {
		return optionalList;
	}

	public void setCommonRepairCode(String commonRepairCode) {
		this.commonRepairCode = commonRepairCode;
	}

	public void setCommonRepairName(String commonRepairName) {
		this.commonRepairName = commonRepairName;
	}

	public void setRequiredList(List<CommonRepairEntryOutput> requiredList) {
		this.requiredList = requiredList;
	}

	public void setOptionalList(List<CommonRepairEntryOutput> optionalList) {
		this.optionalList = optionalList;
	}

}
