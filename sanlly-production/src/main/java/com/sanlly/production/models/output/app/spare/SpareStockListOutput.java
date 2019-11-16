package com.sanlly.production.models.output.app.spare;

/**   
* @Package com.sanlly.production.models.output.app.spare 
* @Description: TODO 机组选件-库存选择
* @author tianzhl   
* @date 2019年10月30日 下午3:14:55 
* @version V1.0   
*/
public class SpareStockListOutput {

	// TODO 备件号
	private String sparesNum;

	// TODO 备件名称
	private String sparesNameLang;

	// TODO 地点
	private String company;

	// TODO 地点
	private String companyNameLang;

	// TODO 仓库
	private String warehouse;

	// TODO 仓库
	private String warehouseNameLang;

	// TODO 仓库类型
	private String warehouseType;

	// TODO 仓库类型
	private String warehouseTypeNameLang;

	// TODO 单价
	private String price;

	// TODO 库存数量
	private String surplusQuantity;

	public String getSparesNum() {
		return sparesNum;
	}

	public void setSparesNum(String sparesNum) {
		this.sparesNum = sparesNum;
	}

	public String getSparesNameLang() {
		return sparesNameLang;
	}

	public void setSparesNameLang(String sparesNameLang) {
		this.sparesNameLang = sparesNameLang;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCompanyNameLang() {
		return companyNameLang;
	}

	public void setCompanyNameLang(String companyNameLang) {
		this.companyNameLang = companyNameLang;
	}

	public String getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(String warehouse) {
		this.warehouse = warehouse;
	}

	public String getWarehouseNameLang() {
		return warehouseNameLang;
	}

	public void setWarehouseNameLang(String warehouseNameLang) {
		this.warehouseNameLang = warehouseNameLang;
	}

	public String getWarehouseType() {
		return warehouseType;
	}

	public void setWarehouseType(String warehouseType) {
		this.warehouseType = warehouseType;
	}

	public String getWarehouseTypeNameLang() {
		return warehouseTypeNameLang;
	}

	public void setWarehouseTypeNameLang(String warehouseTypeNameLang) {
		this.warehouseTypeNameLang = warehouseTypeNameLang;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getSurplusQuantity() {
		return surplusQuantity;
	}

	public void setSurplusQuantity(String surplusQuantity) {
		this.surplusQuantity = surplusQuantity;
	}

}
