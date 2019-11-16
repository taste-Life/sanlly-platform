package com.sanlly.warehouse.models.input.warehouse;
/**
 * ClassName: EditWarehouseInput
 * Description: 修改仓库信息输入类
 * date: 2019/7/25 17:51
 *
 * @author zhh
 */
public class EditWarehouseInput extends AddWarehouseInput {
	//仓库key
	private String key;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}
	
}
