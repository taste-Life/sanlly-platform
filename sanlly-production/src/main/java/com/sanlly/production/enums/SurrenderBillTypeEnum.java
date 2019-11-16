package com.sanlly.production.enums;

/**
 *    
 * 
 * @Package com.sanlly.production.enums 
 * @Description: TODO 退租箱-账单类型
 * @author tianzhl   
 * @date 2019年10月21日 上午10:42:53 
 * @version V1.0   
 */
public enum SurrenderBillTypeEnum {
	/**
	 * L
	 */
	L("LESURDBILLTYPE01", "L"),
	/**
	 * C
	 */
	C("LESURDBILLTYPE02", "C");

	private String code;

	private String message;

	SurrenderBillTypeEnum() {

	}

	SurrenderBillTypeEnum(String code, String message) {
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
