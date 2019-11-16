package com.sanlly.production.enums;

/**
 * 挂衣箱改制类型
 * 
 * @Package com.sanlly.production.enums 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年10月23日 下午3:39:39 
 * @version V1.0   
 */
public enum GohTypeEnum {
	/**
	 * 改制
	 */
	REFORM("LEGOHTYPE01", "改制"),
	/**
	 * 铺制
	 */
	PAVING("LEGOHTYPE02", "铺制"),
	/**
	 * 拆箱
	 */
	DISMANTLE("LEGOHTYPE03", "拆箱");

	private String code;

	private String message;

	GohTypeEnum() {

	}

	GohTypeEnum(String code, String message) {
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
