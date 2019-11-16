package com.sanlly.production.models.input.xx;

import com.sanlly.common.models.input.PageInput;

/**
 * xx箱搜索条件
 * @author RexSheng
 * 2019年8月30日 下午2:31:05
 */
public class XxSearchInput extends PageInput{

	/**
	 * 箱号
	 */
	private String containerNo;
	
	/**
	 * 用箱人
	 */
	private String containerUser;
	
	/**
	 * xx箱状态
	 */
	private String xxState;

	public String getContainerNo() {
		return containerNo;
	}

	public void setContainerNo(String containerNo) {
		this.containerNo = containerNo;
	}

	public String getContainerUser() {
		return containerUser;
	}

	public void setContainerUser(String containerUser) {
		this.containerUser = containerUser;
	}

	public String getXxState() {
		return xxState;
	}

	public void setXxState(String xxState) {
		this.xxState = xxState;
	}
	
	
}
