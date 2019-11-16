package com.sanlly.production.models.input.goh;

import com.sanlly.common.models.input.PageInput;

/**
 * 改制要求列表
 * 
 * @Package com.sanlly.production.models.input.goh 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年10月21日 下午4:14:59 
 * @version V1.0   
 */
public class SearchGohRequireInput extends PageInput {
	// 条目名称
	private String entryName;

	public SearchGohRequireInput(Integer pageIndex, Integer pageSize) {
		super(pageIndex, pageSize);
	}

	public String getEntryName() {
		return entryName;
	}

	public void setEntryName(String entryName) {
		this.entryName = entryName;
	}

}
