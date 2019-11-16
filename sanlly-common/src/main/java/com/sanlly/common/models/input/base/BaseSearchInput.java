package com.sanlly.common.models.input.base;

import com.sanlly.common.models.input.PageInput;

/**
 * 通用检索实体类  视情况自己添加属性
* @Package com.sanlly.common.models.input.base 
* @Description: TODO 
* @author fjy   
* @date 2019年8月20日 下午2:21:44 
* @version V1.0   
 */
public class BaseSearchInput extends PageInput{
	
	public BaseSearchInput(){
		 
	}
	
	public BaseSearchInput(Integer pageIndex,Integer pageSize){
		super(pageIndex,pageSize);
	}
	
	//名称检索  中英文通用
	private String name;
	
	private String companyKey;
	
	private String yardKey;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompanyKey() {
		return companyKey;
	}

	public void setCompanyKey(String companyKey) {
		this.companyKey = companyKey;
	}

	public String getYardKey() {
		return yardKey;
	}

	public void setYardKey(String yardKey) {
		this.yardKey = yardKey;
	}
	
	

	
}
