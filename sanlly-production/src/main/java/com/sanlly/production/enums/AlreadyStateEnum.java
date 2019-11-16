package com.sanlly.production.enums;

/**
 * 派工单出库状态
* @Package com.sanlly.production.enums 
* @Description: TODO 
* @author wangxzh   
* @date 2019年9月5日 下午3:37:42 
* @version V1.0   
 */
public enum AlreadyStateEnum {
	/**
	 * 未出库
	 */
	NOOUT("ALREADYSTATE01", "未出库"),
	/**
	 * 部分出库
	 */
	PARTOUT("ALREADYSTATE02", "部分出库"),
	/**
	 * 全部出库
	 */
	ALLOUT("ALREADYSTATE03", "全部出库"),
	/**
	 * 强制不出库
	 */
	FORCENOOUT("ALREADYSTATE04", "强制不出库"),
	/**
	 * 延期出库
	 */
	DELAYOUT("ALREADYSTATE05", "延期出库"),
	/**
	 * 换件
	 */
	CHANGEPARTS("ALREADYSTATE06", "换件");

	private String code;

	private String message;

	AlreadyStateEnum() {

	}

	AlreadyStateEnum(String code, String message) {
		this.code = code;
		this.message = message;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
