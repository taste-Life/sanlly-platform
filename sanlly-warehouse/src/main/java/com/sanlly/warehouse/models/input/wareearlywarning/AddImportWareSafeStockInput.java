package com.sanlly.warehouse.models.input.wareearlywarning;


/**
 * 
* Description: 添加安全库存设置
* @ClassName: AddWareSafeStockInput
* @date 2019年7月25日
*
* @author jlx
 */
public class AddImportWareSafeStockInput {

	// 备件号
	private String sparePartsNo;
	// 公司
	private String company;
	// 仓库名称
	private String warehouseName;
	// 安全库存数
	private Double safeStockNum;
	// 库存上限
	private Double stockUpperNum;
	public String getSparePartsNo() {
		return sparePartsNo;
	}
	public void setSparePartsNo(String sparePartsNo) {
		this.sparePartsNo = sparePartsNo;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getWarehouseName() {
		return warehouseName;
	}
	public void setWarehouseName(String warehouseName) {
		this.warehouseName = warehouseName;
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
