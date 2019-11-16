package com.sanlly.production.enums;

/**
 * 自动进入EDI池的条件，时间字段判断
 * @author RexSheng
 * 2019年10月22日 下午3:43:50
 */
public enum EdiImportTypeEnum {

	/**
	 * 箱体
	 */
	Container("0","箱体"),
	
	/**
	 * 机组
	 */
	Unit("1","机组"),
	
	/**
	 * 箱体+机组
	 */
	ContainerUnit("2","箱体+机组"),
	/**
	 * 冷箱
	 */
	Cold("3","冷箱"),
	/**
	 * 干箱
	 */
	Dry("4","干箱");
	
	private final String code;
	
	private final String message;
	
	private EdiImportTypeEnum(String code,String message) {
		this.code=code;
		this.message=message;
	}

	public String getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}
	
	
}
