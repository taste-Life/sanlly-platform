package com.sanlly.warehouse.enums;
/**
 * 
* Description: 劳保申请类型
* @ClassName: ApplyTypeEnum
* @date 2019年8月17日
*
* @author zhh
 */
public enum ApplyTypeEnum {

	APPLY("LELAAPPLYTYPE001", "劳保申请"), PAID("LELAAPPLYTYPE002", "有偿申请"), FREE("LELAAPPLYTYPE003", "无偿申请"),SELL("LELAAPPLYTYPE004", "劳保销售");

	private String code;

	private String message;

	ApplyTypeEnum() {
	}

	ApplyTypeEnum(String code, String message) {
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
