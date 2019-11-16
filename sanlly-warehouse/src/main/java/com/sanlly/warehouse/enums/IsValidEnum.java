package com.sanlly.warehouse.enums;

/**
 * ClassName: IsValidEnum
 * Description: 劳保方案是否有效
 * date: 2019/8/15 17:46
 *
 * @author zhh
 */
public enum IsValidEnum {

	VALID("LELAVALID0000001","有效"),INVALID("LELAVALID0000002","无效");


    private String code;

    private String message;

    IsValidEnum(String code, String message) {
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
