package com.sanlly.production.models.input.valuation;

import java.util.List;

/**
 * 估价派工输入类
 * @author zhangkai
 *
 */
public class ValuationReferralInput {

	private List<ValuationReferralDetailInput> details;

	public List<ValuationReferralDetailInput> getDetails() {
		return details;
	}

	public void setDetails(List<ValuationReferralDetailInput> details) {
		this.details = details;
	}
	
	
}
