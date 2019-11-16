package com.sanlly.purchase.models.output.lang;

import java.util.List;

/**
 * 
* Description: 采购下拉输出类
* @ClassName: BaseSelectOptionOutput
* @date 2019年8月13日
*
* @author jlx
 */
public class BaseSelectOptionOutput {

	// 企业性质
	private List<SelectOptionOutput> supplierNatureList;
	// 供应商库类别
	private List<SelectOptionOutput> storehouseTypeList;
	// 供应商类别
	private List<SelectOptionOutput> supplierTypeList;
	// 供应商采购类型
	private List<SelectOptionOutput> procureTypeList;
	// 发票类型
	private List<SelectOptionOutput> invoiceTypeList;
	// 供应商
	private List<SelectOptionOutput> supplierList;
	
	public List<SelectOptionOutput> getSupplierNatureList() {
		return supplierNatureList;
	}
	public void setSupplierNatureList(List<SelectOptionOutput> supplierNatureList) {
		this.supplierNatureList = supplierNatureList;
	}
	public List<SelectOptionOutput> getStorehouseTypeList() {
		return storehouseTypeList;
	}
	public void setStorehouseTypeList(List<SelectOptionOutput> storehouseTypeList) {
		this.storehouseTypeList = storehouseTypeList;
	}
	public List<SelectOptionOutput> getSupplierTypeList() {
		return supplierTypeList;
	}
	public void setSupplierTypeList(List<SelectOptionOutput> supplierTypeList) {
		this.supplierTypeList = supplierTypeList;
	}
	public List<SelectOptionOutput> getProcureTypeList() {
		return procureTypeList;
	}
	public void setProcureTypeList(List<SelectOptionOutput> procureTypeList) {
		this.procureTypeList = procureTypeList;
	}
	public List<SelectOptionOutput> getInvoiceTypeList() {
		return invoiceTypeList;
	}
	public void setInvoiceTypeList(List<SelectOptionOutput> invoiceTypeList) {
		this.invoiceTypeList = invoiceTypeList;
	}
	public List<SelectOptionOutput> getSupplierList() {
		return supplierList;
	}
	public void setSupplierList(List<SelectOptionOutput> supplierList) {
		this.supplierList = supplierList;
	}
	
	
}
