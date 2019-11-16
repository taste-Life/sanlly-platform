package com.sanlly.production.models.input.app.partsType;

public class PartsDetailSearchInput {

	/**
	 * 部件大类key
	 */
	private String partsTypeKey;
	
	/**
	 * 部件明细搜索内容
	 */
	private String partsDetailSearch;
	
	/**
	 * 机组/箱体
	 */
	private String type;

	public String getPartsTypeKey() {
		return partsTypeKey;
	}

	public void setPartsTypeKey(String partsTypeKey) {
		this.partsTypeKey = partsTypeKey;
	}

	public String getPartsDetailSearch() {
		return partsDetailSearch;
	}

	public void setPartsDetailSearch(String partsDetailSearch) {
		this.partsDetailSearch = partsDetailSearch;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	
	
}
