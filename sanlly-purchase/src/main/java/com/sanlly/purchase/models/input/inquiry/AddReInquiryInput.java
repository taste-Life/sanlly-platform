package com.sanlly.purchase.models.input.inquiry;

import java.util.Date;

/**
 * 
* @Package com.sanlly.purchase.models.input.inquiry 
* @Description: 重新询价 
* @author jlx   
* @date 2019年8月27日 上午11:45:12 
* @version V1.0   
 */
public class AddReInquiryInput {

	private Integer purcMatterTenderPurchaseId;
	// 重新询价截止时间
    private Date tenderEndTime;
    
    
	public Integer getPurcMatterTenderPurchaseId() {
		return purcMatterTenderPurchaseId;
	}
	public void setPurcMatterTenderPurchaseId(Integer purcMatterTenderPurchaseId) {
		this.purcMatterTenderPurchaseId = purcMatterTenderPurchaseId;
	}
	public Date getTenderEndTime() {
		return tenderEndTime;
	}
	public void setTenderEndTime(Date tenderEndTime) {
		this.tenderEndTime = tenderEndTime;
	}
	
	
	
}
