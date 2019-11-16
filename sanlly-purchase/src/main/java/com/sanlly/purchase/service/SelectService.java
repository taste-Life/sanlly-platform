package com.sanlly.purchase.service;

import com.sanlly.purchase.models.output.lang.BaseSelectOptionOutput;

/**
 * 
* @Package com.sanlly.purchase.service 
* @Description: 采购相关下拉接口 
* @author jlx   
* @date 2019年8月31日 下午2:35:16 
* @version V1.0   
 */
public interface SelectService {

	/**
	 * 一次性加载下拉选
	 * @return
	 */
	BaseSelectOptionOutput select();
}
