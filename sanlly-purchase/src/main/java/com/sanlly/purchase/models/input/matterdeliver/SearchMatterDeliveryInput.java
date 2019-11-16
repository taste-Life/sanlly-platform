package com.sanlly.purchase.models.input.matterdeliver;

import com.sanlly.common.models.input.PageInput;

/**
 * 
* @Package com.sanlly.purchase.models.input.matterdeliver 
* @Description: 送货单分页查询 
* @author jlx   
* @date 2019年9月5日 下午2:42:13 
* @version V1.0   
 */
public class SearchMatterDeliveryInput  extends PageInput{
	

	// 供货方式
	private String supplyType;
	// 采购单位
    private String purchaseCompany;
    // 收货状态
    private String reciveStatus;
    // 对账状态
    private String isVerifyAccount;
    // 送货单号
	private String deliveryNum;
	// 供应商
	private String supplier;
	// 送货单Id
	private Integer purcPurchaseDeliveryId;
	// 送货单明细Id
	private Integer[] purcPurchaseDeliveryDetailIds;
	
	
    
    public SearchMatterDeliveryInput(Integer pageIndex,Integer pageSize){
		super(pageIndex,pageSize);
    }
    public SearchMatterDeliveryInput(){
    }	
		
	public String getSupplyType() {
		return supplyType;
	}
	public void setSupplyType(String supplyType) {
		this.supplyType = supplyType;
	}
	public String getPurchaseCompany() {
		return purchaseCompany;
	}
	public void setPurchaseCompany(String purchaseCompany) {
		this.purchaseCompany = purchaseCompany;
	}
	public String getReciveStatus() {
		return reciveStatus;
	}
	public void setReciveStatus(String reciveStatus) {
		this.reciveStatus = reciveStatus;
	}
	public String getIsVerifyAccount() {
		return isVerifyAccount;
	}
	public void setIsVerifyAccount(String isVerifyAccount) {
		this.isVerifyAccount = isVerifyAccount;
	}
	public String getDeliveryNum() {
		return deliveryNum;
	}
	public void setDeliveryNum(String deliveryNum) {
		this.deliveryNum = deliveryNum;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	public Integer getPurcPurchaseDeliveryId() {
		return purcPurchaseDeliveryId;
	}

	public void setPurcPurchaseDeliveryId(Integer purcPurchaseDeliveryId) {
		this.purcPurchaseDeliveryId = purcPurchaseDeliveryId;
	}

	public Integer[] getPurcPurchaseDeliveryDetailIds() {
		return purcPurchaseDeliveryDetailIds;
	}

	public void setPurcPurchaseDeliveryDetailIds(Integer[] purcPurchaseDeliveryDetailIds) {
		this.purcPurchaseDeliveryDetailIds = purcPurchaseDeliveryDetailIds;
	}
	

}
