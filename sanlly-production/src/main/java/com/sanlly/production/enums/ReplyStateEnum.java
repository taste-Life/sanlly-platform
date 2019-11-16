package com.sanlly.production.enums;

/**
 * 批复状态
 * @author RexSheng
 * 2019年8月27日 下午1:07:03
 */
public enum ReplyStateEnum {
	
	/**
	 * 待估价
	 */
	UNDO("LEReplyStateEnum01", "待估价"), 

	/**
	 * 待批复
	 */
	UNREPLY("LEReplyStateEnum02", "待批复"), 
	/**
	 * 已批复
	 */
	APPLYED("LEReplyStateEnum03", "已批复"),
	
	/**
	 * 批复不修
	 */
	REJECT("LEReplyStateEnum04", "批复不修"),
	
	/**
	 * 不修转好
	 */
	TURNGOOD("LEReplyStateEnum05", "不修转好"),
	
	/**
	 * 待处理
	 */
	UNPROCESS("LEReplyStateEnum06", "待处理"),
	/**
	 * 已驳回
	 */
	REJECTED("LEReplyStateEnum07", "已驳回");

	private String code;

	private String message;

	ReplyStateEnum() {

	}

	ReplyStateEnum(String code, String message) {
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
