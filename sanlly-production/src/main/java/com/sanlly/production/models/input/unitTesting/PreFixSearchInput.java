package com.sanlly.production.models.input.unitTesting;

import com.sanlly.common.models.input.PageInput;

/**
 * 先修列表搜索条件
 * @author RexSheng
 * 2019年9月23日 下午4:24:58
 */
public class PreFixSearchInput extends PageInput {

	/**
	 * 区位
	 */
	private String zone;
	
	/**
	 * 箱号
	 */
	private String containerNo;

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public String getContainerNo() {
		return containerNo;
	}

	public void setContainerNo(String containerNo) {
		this.containerNo = containerNo;
	}
	
	
}
