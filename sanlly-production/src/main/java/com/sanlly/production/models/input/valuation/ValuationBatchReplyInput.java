package com.sanlly.production.models.input.valuation;

import java.util.List;

/**
 * 批量批复匹配包装输入类
 * @author zhangkai
 *
 */
public class ValuationBatchReplyInput {

	private List<ValuationBatchReplyItemInput> details;

	public List<ValuationBatchReplyItemInput> getDetails() {
		return details;
	}

	public void setDetails(List<ValuationBatchReplyItemInput> details) {
		this.details = details;
	}
	
	
}
