package com.sanlly.warehouse.models.input.wareearlywarning;

/**
 * 
 * Description: 自动添加采购需求
 * 
 * @ClassName: AddAutoPurchaseRequisitionsInput
 * @date 2019年7月25日
 *
 * @author jlx
 */
public class AddAutoPurchaseRequisitionsInput {

	private String warehouse;
	// 备件key
	private String[] spareParts;
	// 需求数量
	private Double[] totalRequisitionsNum;
	
	
	public String getWarehouse() {
		return warehouse;
	}
	public void setWarehouse(String warehouse) {
		this.warehouse = warehouse;
	}
	public String[] getSpareParts() {
		return spareParts;
	}
	public void setSpareParts(String[] spareParts) {
		this.spareParts = spareParts;
	}
	public Double[] getTotalRequisitionsNum() {
		return totalRequisitionsNum;
	}
	public void setTotalRequisitionsNum(Double[] totalRequisitionsNum) {
		this.totalRequisitionsNum = totalRequisitionsNum;
	}

	

}
