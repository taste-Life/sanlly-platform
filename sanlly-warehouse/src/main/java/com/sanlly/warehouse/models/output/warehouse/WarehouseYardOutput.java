package com.sanlly.warehouse.models.output.warehouse;

import java.util.List;

/**
 * ClassName: WarehouseYardOutput
 * Description: 场站输出类
 * date: 2019/7/25 19:36
 *
 * @author zhh
 */
public class WarehouseYardOutput {
	//场站id
	private Integer prodYardId;
	//场站key
	private String key;
	//国际化场站key
	private String keyLangLang;
	//场站名称
	private String yardName;
	//产会战英文名称
	private String yardNameEn;
	//场站表中默认仓库对应的仓库key
	private String warehouse;
	//国际化仓库key
	private String warehouseLangLang;
	//仓库列表
	private List<WarehouseOutput> warehouseList;
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
	public String getYardName() {
		return yardName;
	}
	public void setYardName(String yardName) {
		this.yardName = yardName;
	}
	public String getYardNameEn() {
		return yardNameEn;
	}
	public void setYardNameEn(String yardNameEn) {
		this.yardNameEn = yardNameEn;
	}
	public String getWarehouse() {
		return warehouse;
	}
	public void setWarehouse(String warehouse) {
		this.warehouse = warehouse;
	}
	public String getWarehouseLangLang() {
		return warehouseLangLang;
	}
	public void setWarehouseLangLang(String warehouseLangLang) {
		this.warehouseLangLang = warehouseLangLang;
	}
	public List<WarehouseOutput> getWarehouseList() {
		return warehouseList;
	}
	public void setWarehouseList(List<WarehouseOutput> warehouseList) {
		this.warehouseList = warehouseList;
	}
	public Integer getProdYardId() {
		return prodYardId;
	}
	public void setProdYardId(Integer prodYardId) {
		this.prodYardId = prodYardId;
	}
	
	
	
}
