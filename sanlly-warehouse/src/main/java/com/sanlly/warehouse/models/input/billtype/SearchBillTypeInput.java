package com.sanlly.warehouse.models.input.billtype;

import com.sanlly.common.models.input.PageInput;

public class SearchBillTypeInput extends PageInput{

	private String key;
	
	public SearchBillTypeInput(Integer index,Integer size) {
		super(index, size);
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}
	
	
}
