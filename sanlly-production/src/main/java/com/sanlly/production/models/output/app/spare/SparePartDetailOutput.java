package com.sanlly.production.models.output.app.spare;

public class SparePartDetailOutput {

	private String sparesNum;

	private String sparesNameLang;

	private String defaultWarehouseType;
 
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
