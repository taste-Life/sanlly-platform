package com.sanlly.warehouse.models.output.warehouse;

import java.util.List;

public class WareTypeYardOutput {
	//默认仓库
    private String defaultWarehouse;
    //国际化默认仓库
    private String defaultWarehouseLangLang;
    //仓库信息
    private List<WarehouseByCompanyOutput> dataList;
	public String getDefaultWarehouse() {
		return defaultWarehouse;
	}
	public void setDefaultWarehouse(String defaultWarehouse) {
		this.defaultWarehouse = defaultWarehouse;
	}
	public String getDefaultWarehouseLangLang() {
		return defaultWarehouseLangLang;
	}
	public void setDefaultWarehouseLangLang(String defaultWarehouseLangLang) {
		this.defaultWarehouseLangLang = defaultWarehouseLangLang;
	}
	public List<WarehouseByCompanyOutput> getDataList() {
		return dataList;
	}
	public void setDataList(List<WarehouseByCompanyOutput> dataList) {
		this.dataList = dataList;
	}
    
}
