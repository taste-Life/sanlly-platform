package com.sanlly.auth.models.output.role;

import java.util.List;

/**
 * 公司输出类
 * @author RexSheng
 * 2019年8月16日 上午9:43:18
 */
public class CompanyOutput {
	/**
	 * 公司id
	 */
	private Integer companyId;
	
	/**
	 * 公司名称
	 */
	private String companyName;
	
	/**
	 * 是否总部
	 */
	private Boolean isHead;
	
	/**
	 * 包含的场站
	 */
	private List<YardOutput> yardList;

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Boolean getIsHead() {
		return isHead;
	}

	public void setIsHead(Boolean isHead) {
		this.isHead = isHead;
	}

	public List<YardOutput> getYardList() {
		return yardList;
	}

	public void setYardList(List<YardOutput> yardList) {
		this.yardList = yardList;
	}
	
	
}
