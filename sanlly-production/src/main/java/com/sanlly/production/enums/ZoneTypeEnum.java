package com.sanlly.production.enums;

/**
 * 区位类型
 * @author RexSheng
 * 2019年8月3日 下午3:23:16
 */
public enum ZoneTypeEnum {
	/**
	 * 预检区
	 */
	PRE_ZONE("LEZoneTypeEnum00", "预检区"), 
	/**
	 * 修理区
	 */
	REPAIR_ZONE("LEZoneTypeEnum01", "修理区");

	private String code;

	private String message;

	ZoneTypeEnum() {

	}

	ZoneTypeEnum(String code, String message) {
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
	
	/**
	 * 根据值 获取枚举对象
	 * 
	 * @param value
	 * @return
	 */
	public static ZoneTypeEnum convertToEnum(String key) {
		for (ZoneTypeEnum examType : ZoneTypeEnum.values()) {
			if (key.equals(examType.getCode())) {
				return examType;
			}
		}
		return null;
	}
}
