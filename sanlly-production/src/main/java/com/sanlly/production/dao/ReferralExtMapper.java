package com.sanlly.production.dao;

import java.util.List;

import com.sanlly.production.models.input.referral.SearchAutomationInput;
import com.sanlly.production.models.output.referral.SearchAutomationOutput;

/**
 * 派工自定义接口
* @Package com.sanlly.production.dao 
* @Description: TODO 
* @author wangxzh   
* @date 2019年9月10日 下午1:41:49 
* @version V1.0   
 */
public interface ReferralExtMapper {

	/**
	 * 获取箱体进场数据
	* @Description: TODO 
	* @param input
	* @return List<SearchAutomationOutput>
	* @throws 
	 */
	List<SearchAutomationOutput> getCourseList(SearchAutomationInput input);
	
	/**
	 * 获取机组进场信息
	* @Description: TODO 
	* @param input
	* @return List<SearchAutomationOutput>
	* @throws 
	 */
	List<SearchAutomationOutput> getUnitCourseList(SearchAutomationInput input);
	
}
