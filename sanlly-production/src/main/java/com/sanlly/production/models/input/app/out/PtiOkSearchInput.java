package com.sanlly.production.models.input.app.out;

import com.sanlly.common.models.input.PageInput;

/**
 * 已确认pti ok列表查询
 * @author RexSheng
 * 2019年8月27日 下午4:10:34
 */
public class PtiOkSearchInput  extends PageInput{
	
	/**
	 * 箱号
	 */
	private String containerNo;

	public String getContainerNo() {
		return containerNo;
	}

	public void setContainerNo(String containerNo) {
		this.containerNo = containerNo;
	}
}
