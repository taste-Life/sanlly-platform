package com.sanlly.production.enums;

/**
 * edi发送方式
 * @author RexSheng
 * 2019年10月14日 下午2:46:31
 */
public enum EdiSendTypeEnum {
	/**
	 * edi发送方式-邮件
	 */
	email("EDI_EMAIL","邮件发送"),
	/**
	 * edi发送方式-FTP
	 */
	ftp("EDI_FTP","FTP发送");

	private final String code;
	
	private final String message;
	
	private EdiSendTypeEnum(String code,String message) {
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
