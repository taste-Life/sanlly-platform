package com.sanlly.production.models.output.rate;

import java.math.BigDecimal;

/**
 * 中远五位代码返回
 * 
 * @Package com.sanlly.production.models.output.rate 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年8月20日 下午1:18:49 
 * @version V1.0   
 */
public class ZYFiveRateOutput {
	/**
	 * SAN标准费率id
	 */
	private String rateId;
	/**
	 * 五位代码
	 */
	private String fiveCode;
	/**
	 * 部件明细
	 */
	private String partsDetails;
	/**
	 * 修理代码
	 */
	private String repair;
	/**
	 * 长
	 */
	private Double length;
	/**
	 * 宽
	 */
	private Double width;
	/**
	 * 数量
	 */
	private Integer quantity;
	/**
	 * 工时费
	 */
	private BigDecimal manHourCost;
	/**
	 * 工时
	 */
	private Double manHour;
	/**
	 * 材料费
	 */
	private BigDecimal materialCost;
	/**
	 * 条目重复是否提示
	 */
	private String isRepeatPrompts;
	/**
	 * 是否必传图片
	 */
	private String isMustPhoto;

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

	public String getPartsDetails() {
		return partsDetails;
	}

	public void setPartsDetails(String partsDetails) {
		this.partsDetails = partsDetails;
	}

	public String getRepair() {
		return repair;
	}

	public void setRepair(String repair) {
		this.repair = repair;
	}

	public Double getLength() {
		return length;
	}

	public void setLength(Double length) {
		this.length = length;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
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

	public BigDecimal getMaterialCost() {
		return materialCost;
	}

	public void setMaterialCost(BigDecimal materialCost) {
		this.materialCost = materialCost;
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

}
