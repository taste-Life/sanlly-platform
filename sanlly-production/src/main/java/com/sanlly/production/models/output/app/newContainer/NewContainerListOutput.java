package com.sanlly.production.models.output.app.newContainer;
/**
 * 新箱列表输出类APP
 * @author zhangkai
 *
 */
public class NewContainerListOutput {

	/*
	 * 订单id
	 */
	private Integer orderId;
	/*
	 * 订单号
	 */
	private String orderNo;
	/*
	 * 客户名称
	 */
	private String customerName;
	/*
	 * 冷机公司
	 */
	private String unitCompany;
	/*
	 * 数量
	 */
	private String number;
	/*
	 * 软件版本
	 */
	private String softwareVersion;
	/*
	 * 备注
	 */
	private String remarks;
	/*
	 * 状态
	 */
	private String statusLang;
	
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getUnitCompany() {
		return unitCompany;
	}
	public void setUnitCompany(String unitCompany) {
		this.unitCompany = unitCompany;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getSoftwareVersion() {
		return softwareVersion;
	}
	public void setSoftwareVersion(String softwareVersion) {
		this.softwareVersion = softwareVersion;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getStatusLang() {
		return statusLang;
	}
	public void setStatusLang(String statusLang) {
		this.statusLang = statusLang;
	}
	
	
}
