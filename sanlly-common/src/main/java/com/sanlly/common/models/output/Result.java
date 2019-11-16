package com.sanlly.common.models.output;

import com.sanlly.common.enums.ResultCodeEnum;

/**
 * 返回結果
 * 
 * @author 生旭鹏
 *
 */
public class Result<T> {

	/**
	 * 代码
	 */
	private Integer code;

	/**
	 * 消息
	 */
	private String message;

	/**
	 * 数据
	 */
	private T data;

	public Result() {

	}

	public Result(T data) {
		if (data instanceof Exception) {
			this.code = ResultCodeEnum.ERROR.getCode();
			this.message = ((Exception) data).getMessage();
		} else {
			this.code = ResultCodeEnum.SUCCESS.getCode();
			this.data = data;
		}
	}

	public Result(Integer code, T data) {
		this.code = code;
		this.data = data;
	}

	public Result(Integer code, T data, String message) {
		this(code, data);
		this.message = message;
	}

	public static <T> Result<T> Success() {
		Result<T> result = new Result<T>();
		result.setCode(ResultCodeEnum.SUCCESS.getCode());
		return result;
	}
	
	public static <T> Result<T> Success(T data) {
		Result<T> result = new Result<T>();
		result.setCode(ResultCodeEnum.SUCCESS.getCode());
		result.setData(data);
		return result;
	}
	
	public static <T> Result<T> Success(T data,String message) {
		Result<T> result = new Result<T>();
		result.setCode(ResultCodeEnum.SUCCESS.getCode());
		result.setData(data);
		result.setMessage(message);
		return result;
	}
	
	public static <T> Result<T> Error(T data) {
		Result<T> result = new Result<T>();
		result.setCode(ResultCodeEnum.ERROR.getCode());
		result.setData(data);
		return result;
	}
	
	public static <T> Result<T> Error(Integer code,String message) {
		Result<T> result = new Result<T>();
		result.setCode(code);
		result.setMessage(message);
		return result;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}
