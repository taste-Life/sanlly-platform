package com.sanlly.purchase.models.input.periodproduct;

import java.util.Date;

import com.sanlly.common.models.input.PageInput;

/**
 * 
* @Package com.sanlly.purchase.models.input.periodproduct 
* @Description: 检索周期性定价列表 
* @author jlx   
* @date 2019年8月23日 下午5:17:38 
* @version V1.0   
 */
public class SearchPeriodProductInput extends PageInput{

	// 采购单位
	private String purchaseCompany;
	// 备件号
	private String productNum;
	// 供应商
	private String supplier;
	// 采购截止日起
	private Date endTimeStart;
	// 采购截止日止
	private Date endTimeEnd;
	
    public SearchPeriodProductInput(Integer pageIndex,Integer pageSize){
		super(pageIndex,pageSize);
	}

	public String getPurchaseCompany() {
		return purchaseCompany;
	}

	public void setPurchaseCompany(String purchaseCompany) {
		this.purchaseCompany = purchaseCompany;
	}

	public String getProductNum() {
		return productNum;
	}

	public void setProductNum(String productNum) {
		this.productNum = productNum;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	public Date getEndTimeStart() {
		return endTimeStart;
	}

	public void setEndTimeStart(Date endTimeStart) {
		this.endTimeStart = endTimeStart;
	}

	public Date getEndTimeEnd() {
		return endTimeEnd;
	}

	public void setEndTimeEnd(Date endTimeEnd) {
		this.endTimeEnd = endTimeEnd;
	}
    
}
