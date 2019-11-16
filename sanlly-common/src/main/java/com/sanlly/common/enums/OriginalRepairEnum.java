package com.sanlly.common.enums;

/**
 *    
 * 
 * @Package com.sanlly.common.enums 
 * @Description: TODO 机组选件--原件维修
 * @author tianzhl   
 * @date 2019年10月31日 下午2:23:21 
 * @version V1.0   
 */
public enum OriginalRepairEnum {
	/**
	 * 原件维修
	 */
	ORIGINAL("LEWHTORIG01", "原件维修");
	private String code;
	private String message;

	OriginalRepairEnum(String code, String message) {
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
