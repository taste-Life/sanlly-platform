package com.sanlly.common.models.input;

/**
 * 分页信息
 * @author RexSheng
 * 2019年8月16日 下午1:11:22
 */
public class PageInput{

	private Integer pageIndex;
	
	private Integer pageSize;
	
	public PageInput(){}
	
	public PageInput(Integer pageIndex,Integer pageSize){
		this.pageIndex=pageIndex;
		this.pageSize=pageSize;
	}

	public Integer getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
}
 
