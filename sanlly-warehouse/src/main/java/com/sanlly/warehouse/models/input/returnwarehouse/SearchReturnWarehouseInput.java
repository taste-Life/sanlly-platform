package com.sanlly.warehouse.models.input.returnwarehouse;

import java.util.Date;

import com.sanlly.common.models.input.PageInput;

public class SearchReturnWarehouseInput extends PageInput {

	private String retuenNo;

	private Date startDate;

	private Date endDate;
	private String sparePartsNo;
	private String containerNo;

	public String getRetuenNo() {
		return retuenNo;
	}

	public void setRetuenNo(String retuenNo) {
		this.retuenNo = retuenNo;
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

	public SearchReturnWarehouseInput(Integer index, Integer size) {
		super(index, size);
	}

	public String getSparePartsNo() {
		return sparePartsNo;
	}

	public void setSparePartsNo(String sparePartsNo) {
		this.sparePartsNo = sparePartsNo;
	}

	public String getContainerNo() {
		return containerNo;
	}

	public void setContainerNo(String containerNo) {
		this.containerNo = containerNo;
	}

	
}
