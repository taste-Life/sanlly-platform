package com.sanlly.warehouse.models.input.warehouse;

import java.util.Arrays;
/**
 * ClassName: AddWarehouseYardRelationInput
 * Description: 添加仓库场站输入类
 * date: 2019/7/25 17:51
 *
 * @author zhh
 */
public class AddWarehouseYardRelationInput {
	//仓库key
	private String warehouse;
	//公司key
	private String company;
	//选中的多个场站key
	private String[] yards;
	//场站key
	private String yard;
	//单据名称
	private String billName;
	
	public String getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(String warehouse) {
		this.warehouse = warehouse;
	}

	public String[] getYards() {
		return yards;
	}

	public void setYards(String[] yards) {
		this.yards = yards;
	}

	public String getYard() {
		return yard;
	}

	public void setYard(String yard) {
		this.yard = yard;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getBillName() {
		return billName;
	}

	public void setBillName(String billName) {
		this.billName = billName;
	}
	
}
