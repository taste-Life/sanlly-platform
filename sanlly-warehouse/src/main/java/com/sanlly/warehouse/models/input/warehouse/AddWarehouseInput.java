package com.sanlly.warehouse.models.input.warehouse;
/**
 * ClassName: AddWarehouseInput
 * Description: 添加仓库信息输入类
 * date: 2019/7/25 17:51
 *
 * @author zhh
 */
public class AddWarehouseInput {
	//仓库名称
    private String warehouseName;
    //仓库英文名称
	private String warehouseNameEn;
    //仓库地址
	private String warehouseAddr;
    //公司key
	private String company;

	public String getWarehouseName() {
		return warehouseName;
	}

	public void setWarehouseName(String warehouseName) {
		this.warehouseName = warehouseName;
	}

	public String getWarehouseNameEn() {
		return warehouseNameEn;
	}

	public void setWarehouseNameEn(String warehouseNameEn) {
		this.warehouseNameEn = warehouseNameEn;
	}

	public String getWarehouseAddr() {
		return warehouseAddr;
	}

	public void setWarehouseAddr(String warehouseAddr) {
		this.warehouseAddr = warehouseAddr;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}


}
