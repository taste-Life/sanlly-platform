package com.sanlly.warehouse.models.input.warehousetype;

import com.sanlly.common.models.input.PageInput;

public class SearchWarehouseTypeInput extends PageInput {

	private String key;

	private String name;

	private String cbs;

	public SearchWarehouseTypeInput() {
	}

	public SearchWarehouseTypeInput(Integer index, Integer size) {
		super(index, size);
	}

	public String getCbs() {
		return cbs;
	}

	public void setCbs(String cbs) {
		this.cbs = cbs;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

}
