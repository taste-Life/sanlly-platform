package com.sanlly.warehouse.models.input.transfer;

import java.util.List;

/**
 * 调拨 移动 下料 input
 * @author lishzh
 *
 */
public class AddTransferInput {

	private String outWarehouse;

	private String outWarehouseType;

	private String inWarehouse;

	private String inWarehouseType;
	
	private String remark;
	
	private Integer category;

	private List<TransferDetailInput> details;

	public Integer getCategory() {
		return category;
	}

	public void setCategory(Integer category) {
		this.category = category;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public List<TransferDetailInput> getDetails() {
		return details;
	}

	public void setDetails(List<TransferDetailInput> details) {
		this.details = details;
	}

	public String getOutWarehouse() {
		return outWarehouse;
	}

	public void setOutWarehouse(String outWarehouse) {
		this.outWarehouse = outWarehouse;
	}

	public String getOutWarehouseType() {
		return outWarehouseType;
	}

	public void setOutWarehouseType(String outWarehouseType) {
		this.outWarehouseType = outWarehouseType;
	}

	public String getInWarehouse() {
		return inWarehouse;
	}

	public void setInWarehouse(String inWarehouse) {
		this.inWarehouse = inWarehouse;
	}

	public String getInWarehouseType() {
		return inWarehouseType;
	}

	public void setInWarehouseType(String inWarehouseType) {
		this.inWarehouseType = inWarehouseType;
	}

}
