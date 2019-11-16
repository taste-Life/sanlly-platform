package com.sanlly.production.models.input.app.out;

import com.sanlly.common.models.input.PageInput;

/**
 * 出箱列表搜索条件
 * @author RexSheng
 * 2019年8月26日 下午4:30:59
 */
public class OutSearchInput extends PageInput{

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
