package com.sanlly.warehouse.models.input.wareearlywarning;

import com.sanlly.common.models.input.PageInput;

/**
 * 
* Description: 检索安全库存设置
* @ClassName: SearchWareSafeStockInput
* @date 2019年7月25日
*
* @author jlx
 */
public class SearchWareSafeStockInput extends PageInput {

	// 备件key
	private String spareParts;
	// 仓库key
	private String wareWarehouse;

	public SearchWareSafeStockInput(){
		 
	}
	
	public SearchWareSafeStockInput(Integer pageIndex,Integer pageSize){
		super(pageIndex,pageSize);
	}
	public String getSpareParts() {
		return spareParts;
	}
	public void setSpareParts(String spareParts) {
		this.spareParts = spareParts;
	}
	public String getWareWarehouse() {
		return wareWarehouse;
	}
	public void setWareWarehouse(String wareWarehouse) {
		this.wareWarehouse = wareWarehouse;
	}
	
	
}
