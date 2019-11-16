package com.sanlly.warehouse.models.input.laborInsurance.laborStockOut;

import java.math.BigDecimal;

/**
 * ClassName: AddLaborStockoutDetailInput
 * Description: 新增劳保出库单明细输入类
 * date: 2019/9/5 14:14
 *
 * @author zhh
 */
public class AddLaborStockoutDetailInput {
	//原单明细id;
	private Integer wareLaborReceiveDetailId;
	private Integer wareSellProgrammeDetailId;
	//默认仓库类型
    private String warehouseType;
    //出库数量
    private Double stockoutNum;
    //备件批次号
    private String sparePartsBatch;
    //备件key
    private String spareParts;
    //型号
    private String model;
    //使用人
    private Integer user;
    //总金额
    private BigDecimal totalAmount;
    //场站
    private String yard;

	public String getWarehouseType() {
		return warehouseType;
	}

	public void setWarehouseType(String warehouseType) {
		this.warehouseType = warehouseType;
	}

	public Double getStockoutNum() {
		return stockoutNum;
	}

	public void setStockoutNum(Double stockoutNum) {
		this.stockoutNum = stockoutNum;
	}

	public String getSparePartsBatch() {
		return sparePartsBatch;
	}

	public void setSparePartsBatch(String sparePartsBatch) {
		this.sparePartsBatch = sparePartsBatch;
	}

	public String getSpareParts() {
		return spareParts;
	}

	public void setSpareParts(String spareParts) {
		this.spareParts = spareParts;
	}

	
	public Integer getUser() {
		return user;
	}

	public void setUser(Integer user) {
		this.user = user;
	}

	public String getYard() {
		return yard;
	}

	public void setYard(String yard) {
		this.yard = yard;
	}

	public BigDecimal getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Integer getWareLaborReceiveDetailId() {
		return wareLaborReceiveDetailId;
	}

	public void setWareLaborReceiveDetailId(Integer wareLaborReceiveDetailId) {
		this.wareLaborReceiveDetailId = wareLaborReceiveDetailId;
	}

	public Integer getWareSellProgrammeDetailId() {
		return wareSellProgrammeDetailId;
	}

	public void setWareSellProgrammeDetailId(Integer wareSellProgrammeDetailId) {
		this.wareSellProgrammeDetailId = wareSellProgrammeDetailId;
	}

	
    
}
