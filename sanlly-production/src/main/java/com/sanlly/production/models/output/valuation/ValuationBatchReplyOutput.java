package com.sanlly.production.models.output.valuation;

import java.util.List;

/**
 * 批量批复包装输出类
 * @author zhangkai
 *
 */
public class ValuationBatchReplyOutput {

	/*
	 * 可以批复列表
	 */
	private List<ValuationBatchReplyItemOutput> okList;
	/*
	 * 错误列表-不可以批复
	 */
	private List<ValuationBatchReplyItemOutput> errorList;
	public List<ValuationBatchReplyItemOutput> getOkList() {
		return okList;
	}
	public void setOkList(List<ValuationBatchReplyItemOutput> okList) {
		this.okList = okList;
	}
	public List<ValuationBatchReplyItemOutput> getErrorList() {
		return errorList;
	}
	public void setErrorList(List<ValuationBatchReplyItemOutput> errorList) {
		this.errorList = errorList;
	}

	
	
	
}
