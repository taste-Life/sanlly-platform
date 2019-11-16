package com.sanlly.production.models.output.fix;

import java.util.List;

import com.sanlly.common.models.output.spare.SpareTestingOutput;

/**
 *    
 * 
 * @Package com.sanlly.production.models.output.fix 
 * @Description: TODO 主件备件列表列表
 * @author tianzhl   
 * @date 2019年9月7日 下午4:13:22 
 * @version V1.0   
 */
public class FixSparesListOutput {

	// TODO 主件
	private String device;

	// TODO 备件号列表
	private List<SpareTestingOutput> sparesList;

	public String getDevice() {
		return device;
	}

	public void setDevice(String device) {
		this.device = device;
	}

	public List<SpareTestingOutput> getSparesList() {
		return sparesList;
	}

	public void setSparesList(List<SpareTestingOutput> sparesList) {
		this.sparesList = sparesList;
	}

}
