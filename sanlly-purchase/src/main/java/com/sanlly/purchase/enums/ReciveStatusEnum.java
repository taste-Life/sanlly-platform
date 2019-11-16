package com.sanlly.purchase.enums;
/**
 * 
* @Package com.sanlly.purchase.enums 
* @Description: 收货状态 
* @author jlx   
* @date 2019年9月5日 下午2:30:05 
* @version V1.0   
 */
public enum ReciveStatusEnum {
	UNRECEIVE("ReciveStatusEnum0", "未入库"), RECEIVED("ReciveStatusEnum1", "全部入库"), PARTRECEIVED("ReciveStatusEnum2", "部分入库");

	private String code;

	private String message;

	ReciveStatusEnum() {
	}

	ReciveStatusEnum(String code, String message) {
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
