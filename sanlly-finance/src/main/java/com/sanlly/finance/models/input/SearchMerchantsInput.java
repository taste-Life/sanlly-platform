package com.sanlly.finance.models.input;

import com.sanlly.common.models.input.PageInput;

/**
 * 商务结算检索输入类
* @Description: TODO(这里用一句话描述这个类的作用)  
* @author fjy
* @date 2019年8月8日  
*
 */
public class SearchMerchantsInput extends PageInput {

	public SearchMerchantsInput(){
		 
	}
	
	public SearchMerchantsInput(Integer pageIndex,Integer pageSize){
		super(pageIndex,pageSize);
	}
	 
	private String merchantsName;

	public String getMerchantsName() {
		return merchantsName;
	}

	public void setMerchantsName(String merchantsName) {
		this.merchantsName = merchantsName;
	}
	
	
	

}
