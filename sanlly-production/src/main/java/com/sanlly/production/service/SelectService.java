package com.sanlly.production.service;

import com.sanlly.production.models.output.BaseSelectOutput;

public interface SelectService {

	/**
	 * 一次性加载下拉选
	 * @return
	 */
	BaseSelectOutput select();
	/**
	 * 集采平台一次性加载下拉选
	 * @return
	 */
	BaseSelectOutput supplierSelect();
}
