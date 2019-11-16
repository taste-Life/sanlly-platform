package com.sanlly.production.models.output.rate;

import java.math.BigDecimal;

/**
 * 材料费，工时费返回实体
 * 
 * @author wangxzh
 *
 */
public class GetRateMessageOutput {
	/**
	 * 使用的费率id
	 */
	private String rateId;
	/**
	 * 中远五位代码
	 */
	private String fiveCode;
	/**
	 * 材料费
	 */
	private BigDecimal materialCost;
	/**
	 * 工时费
	 */
	private BigDecimal manHourCost;
	/**
	 * 币种
	 */
	private String currency;
	/**
	 * 工时
	 */
	private Double manHour;
	/**
	 * 主件
	 */
	private String device;
	/**
	 * 备件号
	 */
	private String sparesNumber;
	/**
	 * 条目重复是否提示
	 */
	private String isRepeatPrompts;
	/**
	 * 是否必传图片
	 */
	private String isMustPhoto;
	/**
	 * 用箱人部件明细
	 */
	private String userPartsDetails;
	/**
	 * 用箱人维修代码
	 */
	private String userRepair;
	/**
	 * 付费方
	 */
	private String payingChange;

	public String getRateId() {
		return rateId;
	}

	public void setRateId(String rateId) {
		this.rateId = rateId;
	}

	public String getFiveCode() {
		return fiveCode;
	}

	public void setFiveCode(String fiveCode) {
		this.fiveCode = fiveCode;
	}

	public BigDecimal getMaterialCost() {
		return materialCost;
	}

	public void setMaterialCost(BigDecimal materialCost) {
		this.materialCost = materialCost;
	}

	public BigDecimal getManHourCost() {
		return manHourCost;
	}

	public void setManHourCost(BigDecimal manHourCost) {
		this.manHourCost = manHourCost;
	}

	public Double getManHour() {
		return manHour;
	}

	public void setManHour(Double manHour) {
		this.manHour = manHour;
	}

	public String getIsRepeatPrompts() {
		return isRepeatPrompts;
	}

	public void setIsRepeatPrompts(String isRepeatPrompts) {
		this.isRepeatPrompts = isRepeatPrompts;
	}

	public String getIsMustPhoto() {
		return isMustPhoto;
	}

	public void setIsMustPhoto(String isMustPhoto) {
		this.isMustPhoto = isMustPhoto;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getDevice() {
		return device;
	}

	public void setDevice(String device) {
		this.device = device;
	}

	public String getSparesNumber() {
		return sparesNumber;
	}

	public void setSparesNumber(String sparesNumber) {
		this.sparesNumber = sparesNumber;
	}

	public String getUserPartsDetails() {
		return userPartsDetails;
	}

	public void setUserPartsDetails(String userPartsDetails) {
		this.userPartsDetails = userPartsDetails;
	}

	public String getUserRepair() {
		return userRepair;
	}

	public void setUserRepair(String userRepair) {
		this.userRepair = userRepair;
	}

	public String getPayingChange() {
		return payingChange;
	}

	public void setPayingChange(String payingChange) {
		this.payingChange = payingChange;
	}

}
