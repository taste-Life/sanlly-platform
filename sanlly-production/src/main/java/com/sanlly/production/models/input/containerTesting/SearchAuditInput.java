package com.sanlly.production.models.input.containerTesting;

import com.sanlly.common.models.input.PageInput;

/**
 * 自动审核列表查询参数
 * 
 * @Package com.sanlly.production.models.input.containerTesting 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年8月29日 下午7:57:01 
 * @version V1.0   
 */
public class SearchAuditInput extends PageInput {
	// 用箱人
	private String containerUser;
	// 箱类别
	private String containerCategory;

	public SearchAuditInput() {

	}

	public SearchAuditInput(Integer pageIndex, Integer pageSize) {
		super(pageIndex, pageSize);
	}

	public String getContainerUser() {
		return containerUser;
	}

	public void setContainerUser(String containerUser) {
		this.containerUser = containerUser;
	}

	public String getContainerCategory() {
		return containerCategory;
	}

	public void setContainerCategory(String containerCategory) {
		this.containerCategory = containerCategory;
	}

}
