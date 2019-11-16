package com.sanlly.warehouse.models.input.entryadjustment;

import com.sanlly.common.models.input.PageInput;

/**
 * 
* @Package com.sanlly.warehouse.models.input.entryadjustment 
* @Description: 入库单调账查询条件 
* @author jlx   
* @date 2019年9月2日 上午11:12:46 
* @version V1.0   
 */
public class SearchEntryAdjustmentInput  extends PageInput{

	// 调账单号
    private String entryAdjustmentNo;
	// 入库单号
    private String stockinNo;
	// 审核状态
    private String auditStatus;
    

    public SearchEntryAdjustmentInput(Integer pageIndex,Integer pageSize){
        super(pageIndex,pageSize);
    }
	public String getEntryAdjustmentNo() {
		return entryAdjustmentNo;
	}
	public void setEntryAdjustmentNo(String entryAdjustmentNo) {
		this.entryAdjustmentNo = entryAdjustmentNo;
	}
	public String getStockinNo() {
		return stockinNo;
	}
	public void setStockinNo(String stockinNo) {
		this.stockinNo = stockinNo;
	}
	public String getAuditStatus() {
		return auditStatus;
	}
	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}
    
    
}
