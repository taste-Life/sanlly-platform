package com.sanlly.production.models.output.rate;

/**
 * 中远长宽下拉
 * 
 * @Package com.sanlly.production.models.output.rate 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年9月4日 下午6:16:16 
 * @version V1.0   
 */
public class ZySelectOutput {
	/**
	 * 五位代码
	 */
	private String fiveCode;
	/**
	 * 长*宽
	 */
	private String value;

	public String getFiveCode() {
		return fiveCode;
	}

	public void setFiveCode(String fiveCode) {
		this.fiveCode = fiveCode;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
