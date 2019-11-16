package com.sanlly.warehouse.models.input.wareearlywarning;

import com.sanlly.common.models.input.PageInput;

/**
 * 
* Description: 检索采购需求
* @ClassName: SearchPurchaseRequisitionsInput
* @date 2019年7月25日
*
* @author jlx
 */
public class SearchPurchaseRequisitionsInput extends PageInput {
	// 备件大类
	private String sparePartsCategories;
	// 备件名称
	private String sparePartsName;
	// 备件key
	private String spareParts;
	// 仓库key
	private String warehouse;
	// 需求编号
	private String purchaseRequisitionsNo;
	// 审核状态
	private String auditStatus;

	public SearchPurchaseRequisitionsInput(){
		 
	}
	
	public SearchPurchaseRequisitionsInput(Integer pageIndex,Integer pageSize){
		super(pageIndex,pageSize);
	}
	
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
	public String getPurchaseRequisitionsNo() {
		return purchaseRequisitionsNo;
	}
	public void setPurchaseRequisitionsNo(String purchaseRequisitionsNo) {
		this.purchaseRequisitionsNo = purchaseRequisitionsNo;
	}

	public String getAuditStatus() {
		return auditStatus;
	}

	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}

	public String getSparePartsCategories() {
		return sparePartsCategories;
	}

	public void setSparePartsCategories(String sparePartsCategories) {
		this.sparePartsCategories = sparePartsCategories;
	}

	public String getSparePartsName() {
		return sparePartsName;
	}

	public void setSparePartsName(String sparePartsName) {
		this.sparePartsName = sparePartsName;
	}

	
	
	
}
