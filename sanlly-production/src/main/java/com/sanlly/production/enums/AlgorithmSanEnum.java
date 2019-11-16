package com.sanlly.production.enums;

/**
 * 标准费率算法依据
 * 
 * @Package com.sanlly.production.enums 
 * @Description: TODO
 * @author tianzhl   
 * @date 2019年8月19日 下午1:55:53 
 * @version V1.0   
 */
public enum AlgorithmSanEnum {
	/**
	 * 长度
	 */
	ALGORITHMSAN01("LEAlgorithmSan01", "长度"),
	/**
	 * 宽度
	 */
	ALGORITHMSAN02("LEAlgorithmSan02", "宽度"),
	/**
	 * 数量
	 */
	ALGORITHMSAN03("LEAlgorithmSan03", "数量"),
	/**
	 * 周长
	 */
	ALGORITHMSAN04("LEAlgorithmSan04", "周长"),
	/**
	 * 面积
	 */
	ALGORITHMSAN05("LEAlgorithmSan05", "面积"),
	/**
	 * 其他
	 */
	ALGORITHMSAN06("LEAlgorithmSan06", "其他"),
	/**
	 * 面积取整
	 */
	ALGORITHMSAN07("LEAlgorithmSan07", "面积取整"),
	/**
	 * 周长取整
	 */
	ALGORITHMSAN08("LEAlgorithmSan08", "周长取整");

	private String code;

	private String message;

	AlgorithmSanEnum() {

	}

	AlgorithmSanEnum(String code, String message) {
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
