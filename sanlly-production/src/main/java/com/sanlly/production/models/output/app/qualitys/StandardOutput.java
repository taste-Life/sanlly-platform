package com.sanlly.production.models.output.app.qualitys;

/**
 * 整改标准返回实体
 * 
 * @Package com.sanlly.production.models.output.app.qualitys 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年10月9日 下午1:58:07 
 * @version V1.0   
 */
public class StandardOutput {
	// 整改标准key
	private String standardKey;
	// 整改标准名称
	private String standardNameLang;

	public String getStandardKey() {
		return standardKey;
	}

	public void setStandardKey(String standardKey) {
		this.standardKey = standardKey;
	}

	public String getStandardNameLang() {
		return standardNameLang;
	}

	public void setStandardNameLang(String standardNameLang) {
		this.standardNameLang = standardNameLang;
	}

}
