package com.sanlly.purchase.models.input;

/**
 * 
* @Package com.sanlly.purchase.models.input 
* @Description: 上传多选下拉数据 
* @author jlx   
* @date 2019年8月21日 下午4:59:27 
* @version V1.0   
 */
public class MultiSelectInput {

	private String name;
	private String value;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
}
