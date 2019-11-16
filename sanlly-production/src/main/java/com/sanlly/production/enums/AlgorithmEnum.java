package com.sanlly.production.enums;

/**
 * 中远费率算法类型
* @Package com.sanlly.production.enums 
* @Description: TODO 
* @author wangxzh   
* @date 2019年8月19日 下午1:55:24 
* @version V1.0   
 */
public enum AlgorithmEnum {

	/**
	 * 长度
	 */
	ALGORITHM_01("LEAlgorithm1", "长度"),
	/**
	 * 长宽
	 */
	ALGORITHM_02("LEAlgorithm2", "长宽"),
	/**
	 * 面积
	 */
	ALGORITHM_03("LEAlgorithm3", "面积"),
	/**
	 * 数量
	 */
	ALGORITHM_04("LEAlgorithm4", "数量");

	private String code;

	private String message;

	AlgorithmEnum() {

	}

	AlgorithmEnum(String code, String message) {
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
