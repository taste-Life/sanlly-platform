package com.sanlly.purchase.models.input.demand;

import com.sanlly.common.models.input.PageInput;

/**
 * 
* @Package com.sanlly.purchase.models.input.demand 
* @Description: 检索采购需求 
* @author jlx   
* @date 2019年8月19日 下午4:13:19 
* @version V1.0   
 */
public class SearchDemandOutputInput  extends PageInput{
	
	// 采购状态
    private String isCreateOrder;
    // 采购单位
    private String purchaseCompany;
    // 采购模式
    private String purchasingPattern;
    // 备件大类
    private String sparePartsCategories;
    // 明细类别
    private String sparePartsCategoriesDetails;
    // 备件号
    private String sparePartsNo;
    private String isPeriod;

	public String getIsPeriod() {
		return isPeriod;
	}

	public void setIsPeriod(String isPeriod) {
		this.isPeriod = isPeriod;
	}

	public SearchDemandOutputInput(Integer pageIndex, Integer pageSize){
		super(pageIndex,pageSize);
	}
	public String getIsCreateOrder() {
		return isCreateOrder;
	}
	public void setIsCreateOrder(String isCreateOrder) {
		this.isCreateOrder = isCreateOrder;
	}
	public String getPurchaseCompany() {
		return purchaseCompany;
	}
	public void setPurchaseCompany(String purchaseCompany) {
		this.purchaseCompany = purchaseCompany;
	}
	public String getPurchasingPattern() {
		return purchasingPattern;
	}
	public void setPurchasingPattern(String purchasingPattern) {
		this.purchasingPattern = purchasingPattern;
	}
	public String getSparePartsCategories() {
		return sparePartsCategories;
	}
	public void setSparePartsCategories(String sparePartsCategories) {
		this.sparePartsCategories = sparePartsCategories;
	}
	public String getSparePartsCategoriesDetails() {
		return sparePartsCategoriesDetails;
	}
	public void setSparePartsCategoriesDetails(String sparePartsCategoriesDetails) {
		this.sparePartsCategoriesDetails = sparePartsCategoriesDetails;
	}
	public String getSparePartsNo() {
		return sparePartsNo;
	}
	public void setSparePartsNo(String sparePartsNo) {
		this.sparePartsNo = sparePartsNo;
	}
    
    
	
    
    
	
}
