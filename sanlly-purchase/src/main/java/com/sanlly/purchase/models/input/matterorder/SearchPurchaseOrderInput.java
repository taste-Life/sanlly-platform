package com.sanlly.purchase.models.input.matterorder;

import com.sanlly.common.models.input.PageInput;

/**
 * 
* @Package com.sanlly.purchase.models.input.purchaseorder 
* @Description: 订单检索输入 
* @author jlx   
* @date 2019年9月4日 下午3:59:06 
* @version V1.0   
 */
public class SearchPurchaseOrderInput extends PageInput{

	// 采购单位
	private String purchaseCompany;
	// 供应商
	private String supplier;
    // 采购模式
    private String purchasingPattern;
    // 订单状态
    private String orderStatus;
    // 订单状态
    private String sparePartsNo;
    
    public SearchPurchaseOrderInput(Integer pageIndex,Integer pageSize){
		super(pageIndex,pageSize);
	}

	public String getPurchaseCompany() {
		return purchaseCompany;
	}
	public void setPurchaseCompany(String purchaseCompany) {
		this.purchaseCompany = purchaseCompany;
	}
	public String getSupplier() {
		return supplier;
	}
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	public String getPurchasingPattern() {
		return purchasingPattern;
	}
	public void setPurchasingPattern(String purchasingPattern) {
		this.purchasingPattern = purchasingPattern;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getSparePartsNo() {
		return sparePartsNo;
	}

	public void setSparePartsNo(String sparePartsNo) {
		this.sparePartsNo = sparePartsNo;
	}
    
    
}
