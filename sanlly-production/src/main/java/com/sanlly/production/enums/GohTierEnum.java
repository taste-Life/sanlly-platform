package com.sanlly.production.enums;

/**
 * 挂衣箱层数
 * 
 * @Package com.sanlly.production.enums 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年10月25日 上午10:12:41 
 * @version V1.0   
 */
public enum GohTierEnum {
	/**
	 * 单层
	 */
	ONE("LEGOHTIER01", "单层"),
	/**
	 * 双层
	 */
	TWO("LEGOHTIER02", "双层"),
	/**
	 * 三层
	 */
	THREE("LEGOHTIER03", "三层"),
	/**
	 * 四层
	 */
	FOUR("LEGOHTIER04", "四层"),
	/**
	 * 其他
	 */
	OTHER("LEGOHTIER05", "其他");

	private String code;

	private String message;

	GohTierEnum() {

	}

	GohTierEnum(String code, String message) {
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
