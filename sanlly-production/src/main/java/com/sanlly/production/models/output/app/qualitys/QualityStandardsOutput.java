package com.sanlly.production.models.output.app.qualitys;

import java.util.List;

/**
 * 返工问题类别和整改标准列表返回实体
 * 
 * @Package com.sanlly.production.models.output.app.qualitys 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年10月9日 下午1:56:30 
 * @version V1.0   
 */
public class QualityStandardsOutput {
	// 问题类别key
	private String rectStandardTypeKey;
	// 问题类别名称
	private String rectStandardTypeNameLang;
	// 整改标准list
	private List<StandardOutput> standardsList;

	public String getRectStandardTypeKey() {
		return rectStandardTypeKey;
	}

	public void setRectStandardTypeKey(String rectStandardTypeKey) {
		this.rectStandardTypeKey = rectStandardTypeKey;
	}

	public String getRectStandardTypeNameLang() {
		return rectStandardTypeNameLang;
	}

	public void setRectStandardTypeNameLang(String rectStandardTypeNameLang) {
		this.rectStandardTypeNameLang = rectStandardTypeNameLang;
	}

	public List<StandardOutput> getStandardsList() {
		return standardsList;
	}

	public void setStandardsList(List<StandardOutput> standardsList) {
		this.standardsList = standardsList;
	}

}
