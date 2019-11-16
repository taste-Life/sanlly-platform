package com.sanlly.purchase.models.output.mattertender;

/**
 * 
* @Package com.sanlly.purchase.models.input.mattertender 
* @Description: 招标采购分页展示-应邀供应商
* @author jlx   
* @date 2019年8月19日 下午4:56:19 
* @version V1.0   
 */
public class MatterTenderSupplierOutput {
 
	// 供应商
    private String supplier;
    private String supplierLangLang;
	// 结算信用期
    private String settlementCycle;
    private String settlementCycleLangLang;
	// 评价等级
    private String grade;
    private String gradeLangLang;
	
    
	public String getSupplier() {
		return supplier;
	}
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	public String getSupplierLangLang() {
		return supplierLangLang;
	}
	public void setSupplierLangLang(String supplierLangLang) {
		this.supplierLangLang = supplierLangLang;
	}
	public String getSettlementCycle() {
		return settlementCycle;
	}
	public void setSettlementCycle(String settlementCycle) {
		this.settlementCycle = settlementCycle;
	}
	public String getSettlementCycleLangLang() {
		return settlementCycleLangLang;
	}
	public void setSettlementCycleLangLang(String settlementCycleLangLang) {
		this.settlementCycleLangLang = settlementCycleLangLang;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getGradeLangLang() {
		return gradeLangLang;
	}
	public void setGradeLangLang(String gradeLangLang) {
		this.gradeLangLang = gradeLangLang;
	}
      
	
}
