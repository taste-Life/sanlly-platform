package com.sanlly.warehouse.models.input.laborInsurance.laborReturnStock;
/**
 * ClassName: ReturnStockDetailInput
 * Description: 添加退库单明细输入类
 * date: 2019/9/17 10:38
 *
 * @author zhh
 * 
 */
public class ReturnStockDetailInput {
	//出库单明细id
	private Integer wareStockoutDetailLabaorId;
	
	private String sparePartsBatch;
	
	private String spareParts;

	private Double returnNum;
	
	private String model;

	public String getSpareParts() {
		return spareParts;
	}

	public void setSpareParts(String spareParts) {
		this.spareParts = spareParts;
	}

	public Double getReturnNum() {
		return returnNum;
	}

	public void setReturnNum(Double returnNum) {
		this.returnNum = returnNum;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getSparePartsBatch() {
		return sparePartsBatch;
	}

	public void setSparePartsBatch(String sparePartsBatch) {
		this.sparePartsBatch = sparePartsBatch;
	}

	public Integer getWareStockoutDetailLabaorId() {
		return wareStockoutDetailLabaorId;
	}

	public void setWareStockoutDetailLabaorId(Integer wareStockoutDetailLabaorId) {
		this.wareStockoutDetailLabaorId = wareStockoutDetailLabaorId;
	}


}
