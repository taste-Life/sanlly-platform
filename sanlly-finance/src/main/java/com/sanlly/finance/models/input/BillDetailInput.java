package com.sanlly.finance.models.input;

import com.sanlly.common.models.input.PageInput;

/**
 * 账单明细查询 通用类
* @Package com.sanlly.finance.models.input 
* @Description: TODO 
* @author fjy   
* @date 2019年9月3日 下午5:45:49 
* @version V1.0   
 */
public class BillDetailInput extends PageInput{
	
	public BillDetailInput(){
		 
	}
	
	public BillDetailInput(Integer pageIndex,Integer pageSize){
		super(pageIndex,pageSize);
	}
	
	//账单主键id
	private Integer pid;

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}
	
	

}
