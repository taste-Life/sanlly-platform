package com.sanlly.warehouse.models.input.transfer;

import java.util.Date;

import com.sanlly.common.models.input.PageInput;

/**
 * 调拨 移动 下料 检索input
 * 
 * @author lishzh
 *
 */
public class SearchTransferInput extends PageInput {

	private Date startDate;

	private Date endDate;

	private String no;

	private String outWarehouse;

	private String outWarehouseType;

	private String inWarehouse;

	private String inWarehouseType;

	private String auditStatus;

	private String billStatus;

	private Integer category;

	public Integer getCategory() {
		return category;
	}

	public void setCategory(Integer category) {
		this.category = category;
	}

	public String getBillStatus() {
		return billStatus;
	}

	public void setBillStatus(String billStatus) {
		this.billStatus = billStatus;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
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

	public String getAuditStatus() {
		return auditStatus;
	}

	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
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

	public SearchTransferInput(Integer index, Integer size) {
		super(index, size);
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

}
