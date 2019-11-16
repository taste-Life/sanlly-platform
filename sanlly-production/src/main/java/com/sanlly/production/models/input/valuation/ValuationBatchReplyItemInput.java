package com.sanlly.production.models.input.valuation;
/**
 * 批量批复匹配记录输入类
 * @author zhangkai
 *
 */
public class ValuationBatchReplyItemInput {

	/*
	 * 箱号
	 */
	private String containerNo;
	/*
	 * 批复费用
	 */
	private String replyCost;
	
	public String getContainerNo() {
		return containerNo;
	}
	public void setContainerNo(String containerNo) {
		this.containerNo = containerNo;
	}
	public String getReplyCost() {
		return replyCost;
	}
	public void setReplyCost(String replyCost) {
		this.replyCost = replyCost;
	}
	
	
}
