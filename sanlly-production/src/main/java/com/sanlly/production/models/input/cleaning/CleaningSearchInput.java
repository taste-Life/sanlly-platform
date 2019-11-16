package com.sanlly.production.models.input.cleaning;

import com.sanlly.common.models.input.PageInput;

/**
 * 洗箱查询列表
 * @author RexSheng
 * 2019年8月21日 下午4:27:45
 */
public class CleaningSearchInput extends PageInput{

	/**
	 * 箱号
	 */
	private String containerNo;
	
	/**
	 * 区位
	 */
	private String zone;

	public String getContainerNo() {
		return containerNo;
	}

	public void setContainerNo(String containerNo) {
		this.containerNo = containerNo;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}
	
	
}
