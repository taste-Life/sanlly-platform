package com.sanlly.warehouse.entity;

import java.sql.Time;

public class WareStockoutExt {

	private Integer wareStockoutId;
	private String stockoutNo;
	private String preStockoutNo;
	private String billTypeKey;
	private String categoryKey;
	private String stockoutStatus;
	private String pickingUser;
	private Time createTime;
	private Integer createUser;
	public Integer getWareStockoutId() {
		return wareStockoutId;
	}
	public void setWareStockoutId(Integer wareStockoutId) {
		this.wareStockoutId = wareStockoutId;
	}
	public String getStockoutNo() {
		return stockoutNo;
	}
	public void setStockoutNo(String stockoutNo) {
		this.stockoutNo = stockoutNo;
	}
	public String getPreStockoutNo() {
		return preStockoutNo;
	}
	public void setPreStockoutNo(String preStockoutNo) {
		this.preStockoutNo = preStockoutNo;
	}
	public String getBillTypeKey() {
		return billTypeKey;
	}
	public void setBillTypeKey(String billTypeKey) {
		this.billTypeKey = billTypeKey;
	}
	public String getCategoryKey() {
		return categoryKey;
	}
	public void setCategoryKey(String categoryKey) {
		this.categoryKey = categoryKey;
	}
	public String getStockoutStatus() {
		return stockoutStatus;
	}
	public void setStockoutStatus(String stockoutStatus) {
		this.stockoutStatus = stockoutStatus;
	}
	public String getPickingUser() {
		return pickingUser;
	}
	public void setPickingUser(String pickingUser) {
		this.pickingUser = pickingUser;
	}
	public Time getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Time createTime) {
		this.createTime = createTime;
	}
	public Integer getCreateUser() {
		return createUser;
	}
	public void setCreateUser(Integer createUser) {
		this.createUser = createUser;
	}

}
