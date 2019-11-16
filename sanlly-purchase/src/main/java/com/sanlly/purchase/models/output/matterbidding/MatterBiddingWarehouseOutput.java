package com.sanlly.purchase.models.output.matterbidding;

/**
 * 
* @Package com.sanlly.purchase.models.input.mattertender 
* @Description: 招标采购分页展示-采购仓库明细
* @author jlx   
* @date 2019年8月19日 下午4:56:19 
* @version V1.0   
 */
public class MatterBiddingWarehouseOutput { 

    // 仓库
    private String warehouse;
    private String warehouseLangLang;
	// 仓库地址
    private String warehouseAddress;
    
    
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
	public String getWarehouseAddress() {
		return warehouseAddress;
	}
	public void setWarehouseAddress(String warehouseAddress) {
		this.warehouseAddress = warehouseAddress;
	}
    
    
}
