package com.sanlly.production.enums;

/**
 * 自动进入EDI池的条件，时间字段判断
 * @author RexSheng
 * 2019年10月22日 下午3:43:50
 */
public enum EdiAutoPoolTimeEnum {

	/**
	 * 估价时间
	 */
	ValuationTime("AutoPoolValuation","估价时间"),
	/**
	 * 批复时间
	 */
	ReplyTime("AutoPoolReply","批复时间"),
	/**
	 * 完工时间
	 */
	FinishTime("AutoPoolFinish","完工时间");
	
	private final String code;
	
	private final String message;
	
	private EdiAutoPoolTimeEnum(String code,String message) {
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
