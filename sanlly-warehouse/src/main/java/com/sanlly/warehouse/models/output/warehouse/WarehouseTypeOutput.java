package com.sanlly.warehouse.models.output.warehouse;
/**
 * ClassName: WarehouseTypeOutput
 * Description: 仓库类型输出类
 * date: 2019/7/25 19:36
 *
 * @author zhh
 */
public class WarehouseTypeOutput {
	//仓库类型key
	private String key;
	//国际化仓库类型key
	private String keyLangLang;
	//仓库类型名称
	private String warehouseTypeName;
	//仓库类型名称英文
	private String warehouseTypeNameEn;
	
	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getKeyLangLang() {
		return keyLangLang;
	}

	public void setKeyLangLang(String keyLangLang) {
		this.keyLangLang = keyLangLang;
	}

	public String getWarehouseTypeName() {
		return warehouseTypeName;
	}

	public void setWarehouseTypeName(String warehouseTypeName) {
		this.warehouseTypeName = warehouseTypeName;
	}

	public String getWarehouseTypeNameEn() {
		return warehouseTypeNameEn;
	}

	public void setWarehouseTypeNameEn(String warehouseTypeNameEn) {
		this.warehouseTypeNameEn = warehouseTypeNameEn;
	}

	
	

}
