package com.sanlly.production.enums;

/**
 *    
 * 
 * @Package com.sanlly.production.enums 
 * @Description: TODO 退租箱-退租类型
 * @author tianzhl   
 * @date 2019年10月21日 上午10:42:53 
 * @version V1.0   
 */
public enum SurrenderTypeEnum {
	/**
	 * IICL
	 */
	IICL("LESURDTYPE01", "IICL"),
	/**
	 * CW
	 */
	CW("LESURDTYPE02", "CW"),
	/**
	 * 退前修
	 */
	BBR("LESURDTYPE03", "退前修");

	private String code;

	private String message;

	SurrenderTypeEnum() {

	}

	SurrenderTypeEnum(String code, String message) {
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
