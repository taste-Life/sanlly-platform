package com.sanlly.production.models.output.goh;

import java.math.BigDecimal;

/**
 * 挂衣箱条目
 * 
 * @Package com.sanlly.production.models.output.goh 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年10月23日 下午2:32:07 
 * @version V1.0   
 */
public class GohContainerEntryOutput {
	// 主键
	private Integer entryId;
	// 条目名称
	private String entryName;
	// 备件号
	private String sparesNumber;
	// 数量
	private Double quantity;
	// 工时
	private Double manHour;
	// 付费方
	private String payingParty;
	// 标准费用
	private BigDecimal standardCost;
	// 非标准费用
	private BigDecimal nonstandardCost;
	// 是否拆箱条目
	private String isDevanning;
	// 备注
	private String remarks;

	public Integer getEntryId() {
		return entryId;
	}

	public void setEntryId(Integer entryId) {
		this.entryId = entryId;
	}

	public String getEntryName() {
		return entryName;
	}

	public void setEntryName(String entryName) {
		this.entryName = entryName;
	}

	public String getSparesNumber() {
		return sparesNumber;
	}

	public void setSparesNumber(String sparesNumber) {
		this.sparesNumber = sparesNumber;
	}

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public Double getManHour() {
		return manHour;
	}

	public void setManHour(Double manHour) {
		this.manHour = manHour;
	}

	public String getPayingParty() {
		return payingParty;
	}

	public void setPayingParty(String payingParty) {
		this.payingParty = payingParty;
	}

	public BigDecimal getStandardCost() {
		return standardCost;
	}

	public void setStandardCost(BigDecimal standardCost) {
		this.standardCost = standardCost;
	}

	public BigDecimal getNonstandardCost() {
		return nonstandardCost;
	}

	public void setNonstandardCost(BigDecimal nonstandardCost) {
		this.nonstandardCost = nonstandardCost;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getIsDevanning() {
		return isDevanning;
	}

	public void setIsDevanning(String isDevanning) {
		this.isDevanning = isDevanning;
	}

}
