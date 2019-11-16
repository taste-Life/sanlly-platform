package com.sanlly.production.service;

import com.sanlly.production.models.input.paying.PayingChangeInput;

/**
 * 付费方接口
 * 
 * @Package com.sanlly.production.service 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年9月16日 上午9:50:52 
 * @version V1.0   
 */
public interface PayingChangeService {

	/**
	 * 获取付费方
	 * 
	 * @Description: TODO
	 * @param input
	 * @return String @throws 
	 */
	String getPayingChange(PayingChangeInput input);

}
