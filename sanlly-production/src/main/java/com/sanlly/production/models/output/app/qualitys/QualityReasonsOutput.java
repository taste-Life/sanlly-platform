package com.sanlly.production.models.output.app.qualitys;

/**
 * 质检错项原因
 * 
 * @Package com.sanlly.production.models.output.app.qualitys 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年10月9日 下午1:45:30 
 * @version V1.0   
 */
public class QualityReasonsOutput {
	// 原因key
	private String reasonKey;
	// 原因名称
	private String reasonContentLang;

	public String getReasonKey() {
		return reasonKey;
	}

	public void setReasonKey(String reasonKey) {
		this.reasonKey = reasonKey;
	}

	public String getReasonContentLang() {
		return reasonContentLang;
	}

	public void setReasonContentLang(String reasonContentLang) {
		this.reasonContentLang = reasonContentLang;
	}

}
