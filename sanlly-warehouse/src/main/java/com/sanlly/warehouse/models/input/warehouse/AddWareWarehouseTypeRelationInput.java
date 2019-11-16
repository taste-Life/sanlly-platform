package com.sanlly.warehouse.models.input.warehouse;
/**
 * ClassName: AddWareWarehouseTypeRelationInput
 * Description: 添加仓库及仓库类型关系输入类
 * date: 2019/7/25 17:51
 *
 * @author zhh
 */
public class AddWareWarehouseTypeRelationInput {
	//仓库key
    private String warehouse;
	//仓库类型key
	private String[] warehouseTypes;

	public String getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(String warehouse) {
		this.warehouse = warehouse;
	}

	public String[] getWarehouseTypes() {
		return warehouseTypes;
	}

	public void setWarehouseTypes(String[] warehouseTypes) {
		this.warehouseTypes = warehouseTypes;
	}

	
	
}
