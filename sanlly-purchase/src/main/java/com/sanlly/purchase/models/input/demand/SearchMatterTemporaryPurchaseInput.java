package com.sanlly.purchase.models.input.demand;

import com.sanlly.common.models.input.PageInput;

/**
 * 
* @Package com.sanlly.purchase.models.input.demand 
* @Description: 检索采购单 
* @author jlx   
* @date 2019年8月19日 下午4:13:40 
* @version V1.0   
 */
public class SearchMatterTemporaryPurchaseInput  extends PageInput{
	
	// 需求编号 子表
	private String demandNo;	
    // 采购单位
    private String purchaseCompany;
    // 备件号  子表
    private String sparePartsNo;
    // 供应商
    private String supplier;
    // 审核状态
    private String auditStatus;
    // 采购模式
    private String purchasingPattern;
    // 备件大类  子表
//    private String sparePartsCategories;
//    // 明细类别 子表
//    private String sparePartsCategoriesDetails;
    // 采购单创建时间起
    private String createStart;
    // 采购单创建时间止
    private String createEnd;

	public SearchMatterTemporaryPurchaseInput(Integer pageIndex, Integer pageSize){
		super(pageIndex,pageSize);
	}

	public String getDemandNo() {
		return demandNo;
	}

	public void setDemandNo(String demandNo) {
		this.demandNo = demandNo;
	}

	public String getPurchaseCompany() {
		return purchaseCompany;
	}

	public void setPurchaseCompany(String purchaseCompany) {
		this.purchaseCompany = purchaseCompany;
	}

	public String getSparePartsNo() {
		return sparePartsNo;
	}

	public void setSparePartsNo(String sparePartsNo) {
		this.sparePartsNo = sparePartsNo;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	public String getAuditStatus() {
		return auditStatus;
	}

	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}

	public String getPurchasingPattern() {
		return purchasingPattern;
	}

	public void setPurchasingPattern(String purchasingPattern) {
		this.purchasingPattern = purchasingPattern;
	}

//	public String getSparePartsCategories() {
//		return sparePartsCategories;
//	}
//
//	public void setSparePartsCategories(String sparePartsCategories) {
//		this.sparePartsCategories = sparePartsCategories;
//	}
//
//	public String getSparePartsCategoriesDetails() {
//		return sparePartsCategoriesDetails;
//	}
//
//	public void setSparePartsCategoriesDetails(String sparePartsCategoriesDetails) {
//		this.sparePartsCategoriesDetails = sparePartsCategoriesDetails;
//	}

	public String getCreateStart() {
		return createStart;
	}

	public void setCreateStart(String createStart) {
		this.createStart = createStart;
	}

	public String getCreateEnd() {
		return createEnd;
	}

	public void setCreateEnd(String createEnd) {
		this.createEnd = createEnd;
	}
	
    
	
}
