package com.sanlly.production.models.input.valuation;

import java.util.List;

/**
 * 冷箱输入类
 * @author zhangkai
 *
 */
public class ValuationCodeInput {

	private List<ValuationCodeDetailInput> details;

	public List<ValuationCodeDetailInput> getDetails() {
		return details;
	}

	public void setDetails(List<ValuationCodeDetailInput> details) {
		this.details = details;
	}
	
}
