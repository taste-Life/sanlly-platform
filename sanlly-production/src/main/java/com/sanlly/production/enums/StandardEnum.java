package com.sanlly.production.enums;

/**
 * 整改标准枚举
 * 
 * @Package com.sanlly.production.enums 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年10月9日 下午2:53:37 
 * @version V1.0   
 */
public enum StandardEnum {
	/**
	 * 喷砂
	 */
	STANDARD_PS("LESTANDARD001", "喷砂"),
	/**
	 * 切割
	 */
	STANDARD_QG("LESTANDARD002", "切割"),
	/**
	 * 整形
	 */
	STANDARD_ZX("LESTANDARD003", "整形"),
	/**
	 * 装配
	 */
	STANDARD_ZP("LESTANDARD004", "装配"),
	/**
	 * 焊接
	 */
	STANDARD_HJ("LESTANDARD005", "焊接"),
	/**
	 * 喷涂
	 */
	STANDARD_PT("LESTANDARD006", "喷涂"),
	/**
	 * 施密封胶
	 */
	STANDARD_MF("LESTANDARD007", "施密封胶"),
	/**
	 * 贴标及除标
	 */
	STANDARD_TB("LESTANDARD008", "贴标及除标"),
	/**
	 * 清洁
	 */
	STANDARD_QJ("LESTANDARD009", "清洁"),
	/**
	 * 剪板
	 */
	STANDARD_JB("LESTANDARD010", "剪板"),
	/**
	 * 拆板、梁、角柱与除泡
	 */
	STANDARD_CB("LESTANDARD011", "拆板、梁、角柱与除泡"),
	/**
	 * 发泡
	 */
	STANDARD_FP("LESTANDARD012", "发泡"),
	/**
	 * 铆接
	 */
	STANDARD_MJ("LESTANDARD013", "铆接"),
	/**
	 * 拆装机组
	 */
	STANDARD_CZ("LESTANDARD014", "拆装机组"),
	/**
	 * 试压、抽空、充注冷媒
	 */
	STANDARD_SY("LESTANDARD015", "试压、抽空、充注冷媒"),
	/**
	 * 导线连接
	 */
	STANDARD_DX("LESTANDARD016", "导线连接");

	private String code;

	private String message;

	StandardEnum() {

	}

	StandardEnum(String code, String message) {
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
