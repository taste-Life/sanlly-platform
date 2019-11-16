package com.sanlly.warehouse.models.output.laborInsurance;

import java.math.BigDecimal;

/**
 * ClassName: LaborInsuranceOutput
 * Description: 劳保基础信息输出类
 * date: 2019/8/01 17:51
 *
 * @author zhh
 */
public class LaborInsuranceOutput extends LaborBaseOutput{
	//劳保备件key
	private String key;
	//国际化劳保备件key
	private String keyLangLang;
    
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getKeyLangLang() {
		return keyLangLang;
	}
	public void setKeyLangLang(String keyLangLang) {
		this.keyLangLang = keyLangLang;
	}	
	
}
