package com.sanlly.production.enums;

/**
 * edi发送状态
 * @author RexSheng
 * 2019年10月14日 下午2:46:31
 */
public enum EdiSendStateEnum {
	/**
	 * eid状态-未发送
	 */
	unSend("EDI_UNSEND","未发送"),
	/**
	 * eid状态-已发送
	 */
	sended("EDI_SENDED","已发送");

	private final String code;
	
	private final String message;
	
	private EdiSendStateEnum(String code,String message) {
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
