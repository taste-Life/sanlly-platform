package com.sanlly.warehouse.models.input.laborInsurance.laborReturnStock;

import com.sanlly.common.models.input.PageInput;

public class SearchLaborReturnWarehouseInput extends PageInput{
	private String returnNo;

	public String getReturnNo() {
		return returnNo;
	}

	public void setReturnNo(String returnNo) {
		this.returnNo = returnNo;
	}

	public SearchLaborReturnWarehouseInput() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SearchLaborReturnWarehouseInput(Integer pageIndex, Integer pageSize) {
		super(pageIndex, pageSize);
		// TODO Auto-generated constructor stub
	}
	
	

}
