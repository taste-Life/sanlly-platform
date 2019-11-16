package com.sanlly.common.models.output.spare;

/**
 * 备件
 * 
 * @author RexSheng 2019年8月16日 下午1:05:29
 */
public class SpareTestingOutput {

	/**
	 * 备件号
	 */
	private String sparesNum;

	/**
	 * 备件名称
	 */
	private String sparesNameLang;

	/**
	 * 默认仓库类型
	 */
	private String defaultWarehouseType;

	/**
	 * 默认仓库类型名
	 */
	private String defaultWarehouseTypeNameLang;

	public String getSparesNum() {
		return sparesNum;
	}

	public void setSparesNum(String sparesNum) {
		this.sparesNum = sparesNum;
	}

	public String getSparesNameLang() {
		return sparesNameLang;
	}

	public void setSparesNameLang(String sparesNameLang) {
		this.sparesNameLang = sparesNameLang;
	}

	public String getDefaultWarehouseType() {
		return defaultWarehouseType;
	}

	public void setDefaultWarehouseType(String defaultWarehouseType) {
		this.defaultWarehouseType = defaultWarehouseType;
	}

	public String getDefaultWarehouseTypeNameLang() {
		return defaultWarehouseTypeNameLang;
	}

	public void setDefaultWarehouseTypeNameLang(String defaultWarehouseTypeNameLang) {
		this.defaultWarehouseTypeNameLang = defaultWarehouseTypeNameLang;
	}

}
