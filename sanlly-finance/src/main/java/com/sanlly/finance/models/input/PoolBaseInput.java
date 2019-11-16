package com.sanlly.finance.models.input;

/**
 * 无法收费输入类
* @Package com.sanlly.finance.models.input 
* @Description: TODO 
* @author fjy   
* @date 2019年8月26日 下午3:59:56 
* @version V1.0   
 */
public class PoolBaseInput {

	//id
	private String id;
	//原因
	private String desc;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	
}
