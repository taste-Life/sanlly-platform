package com.sanlly.purchase.enums;

/**
 * ClassName: PayMethodEnum
 * Description:
 * date: 2019/7/26 17:46
 *
 * @author jlx
 * @since JDK 1.8
 */
public enum PayMethodEnum {
    BEFORE("LEBEFORE","预付款"),AFTER("LEAFTER","后付款");


    private String code;

    private String message;

    PayMethodEnum(String code, String message) {
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
