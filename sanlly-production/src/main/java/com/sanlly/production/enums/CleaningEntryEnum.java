package com.sanlly.production.enums;

/**
 * 洗箱条目
 * 
 * @Package com.sanlly.production.enums 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年9月3日 下午2:24:52 
 * @version V1.0   
 */
public enum CleaningEntryEnum {
	/**
	 * 干箱洗箱条目,判断部件修理代码
	 */
	MCOWW("MCOWW", "干箱洗箱条目"),
	/**
	 * 干箱洗箱条目,判断部件修理代码
	 */
	MCOCC("MCOCC", "干箱洗箱条目"),
	/**
	 * 冷箱洗箱条目，判断维修代码
	 */
	WW("WW", "冷箱洗箱条目"),
	/**
	 * 冷箱洗箱条目，判断维修代码
	 */
	CC("CC", "冷箱洗箱条目");

	private String code;

	private String message;

	CleaningEntryEnum() {

	}

	CleaningEntryEnum(String code, String message) {
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
