package com.sanlly.warehouse.models.input.wareearlywarning;


/**
 * 
* Description: 添加安全库存设置
* @ClassName: AddWareSafeStockInput
* @date 2019年7月25日
*
* @author jlx
 */
public class AddWareSafeStockInput {

	// 备件key
	private String spareParts;
	// 仓库key
	private String warehouse;
	// 安全库存数
	private Double safeStockNum;
	// 库存上限
	private Double stockUpperNum;
	
	
	public String getSpareParts() {
		return spareParts;
	}
	public void setSpareParts(String spareParts) {
		this.spareParts = spareParts;
	}
	
	public String getWarehouse() {
		return warehouse;
	}
	public void setWarehouse(String warehouse) {
		this.warehouse = warehouse;
	}
	public Double getSafeStockNum() {
		return safeStockNum;
	}
	public void setSafeStockNum(Double safeStockNum) {
		this.safeStockNum = safeStockNum;
	}
	public Double getStockUpperNum() {
		return stockUpperNum;
	}
	public void setStockUpperNum(Double stockUpperNum) {
		this.stockUpperNum = stockUpperNum;
	}
	
}
