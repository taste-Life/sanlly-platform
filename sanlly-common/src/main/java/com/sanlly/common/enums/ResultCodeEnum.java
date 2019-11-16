package com.sanlly.common.enums;

/**
 * 返回结果枚举
 * @author RexSheng
 * 2019年8月16日 上午9:49:48
 */
public enum ResultCodeEnum {

	SUCCESS(0,"Success"),ERROR(1,"Error"),INTERNAL_SERVER_ERROR(500,"Internal Server Error"),UNAUTHORIZED(401,"Unauthorized")
	,NOT_FOUND(404,"Not Found"),BAD_REQUEST(400,"Bad request");
	
	private final Integer code;
	
	private final String message;
	
	private ResultCodeEnum(Integer code,String message){
		this.code=code;
		this.message=message;
	}
	public Integer getCode() {
		return code;
	}
	public String getMessage() {
		return message;
	}
}
