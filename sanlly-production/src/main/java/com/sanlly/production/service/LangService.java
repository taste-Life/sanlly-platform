package com.sanlly.production.service;

import com.sanlly.common.enums.LanguageEnum;
import com.sanlly.common.models.input.lang.LangInput;

/**   
* @Package com.sanlly.production.service 
* @Description: TODO 国际化相关服务
* @author tianzhl   
* @date 2019年8月13日 下午7:09:55 
* @version V1.0   
*/
public interface LangService {
	
	/** 
	* @Description: TODO 国际化表key自动生成器
	* @param tableName
	* @return String
	* @throws 
	*/
	String getLangRuleKeyByTable(String tableName);
	
	/** 
	* @Description: TODO 国际化翻译
	* @param input
	* @return Object
	* @throws 
	*/
	Object lang(LangInput input);
	/**
	*@Description: 获取key的翻译值
	*@Param: [key, lang]
	*@return: java.lang.String
	*@Author: zjd
	*@date: 2019-10-18
	*/
	String langValue(String key, LanguageEnum lang, String name);
	/**
	 * 加载数据
	 */
	void reload();
}
