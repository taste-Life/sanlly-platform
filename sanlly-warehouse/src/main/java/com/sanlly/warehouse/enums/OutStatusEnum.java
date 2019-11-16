package com.sanlly.warehouse.enums;

/**
 * ClassName: IsStatusEnum
 * Description:
 * date: 2019/7/26 17:46
 *
 * @author wannt
 * @since JDK 1.8
 */
public enum OutStatusEnum {
	NO("LEWAREOUTEN001","未确认"),YES("LEWAREOUTEN002","已确认"),CANCEL("LEWAREOUTEN003","取消确认");


    private String code;

    private String message;

    OutStatusEnum(String code, String message) {
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
