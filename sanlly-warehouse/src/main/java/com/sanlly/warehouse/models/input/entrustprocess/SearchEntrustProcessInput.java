package com.sanlly.warehouse.models.input.entrustprocess;

import java.util.Date;

import com.sanlly.common.models.input.PageInput;

/**
 * 委托加工search Input
 * 
 * @author lishzh
 *
 */
public class SearchEntrustProcessInput extends PageInput {

	private Date startDate;// 起始时间

	private Date endDate;// 结束时间

	public SearchEntrustProcessInput(Integer index, Integer size) {
		super(index, size);
		// TODO Auto-generated constructor stub
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

}
