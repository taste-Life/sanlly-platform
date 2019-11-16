package com.sanlly.purchase.models.output.matterpurchase;

import java.util.Date;

/**
 * 
* Description: 采购单审核流程
* @ClassName: AuditPurchaseTaskOutput
* @date 2019年8月13日
*
* @author jlx
 */
public class AuditPurchaseTaskOutput {
	private Date startTime;

	private  Date endTime;

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	
}
