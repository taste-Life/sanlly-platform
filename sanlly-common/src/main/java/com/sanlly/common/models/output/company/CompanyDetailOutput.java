package com.sanlly.common.models.output.company;

import com.sanlly.common.models.output.yard.YardDetailOutput;

/**
 * 公司详细信息
 * @author RexSheng
 * 2019年8月16日 下午1:10:47
 */
public class CompanyDetailOutput {

	private Integer companyId;
	
	private String companyKey;
	
	private String companyName;
	
	private String companyNameEn;
	
	/**
	 * 场站列表
	 */
	private YardDetailOutput[] yardList;

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

	public String getCompanyKey() {
		return companyKey;
	}

	public void setCompanyKey(String companyKey) {
		this.companyKey = companyKey;
	}

	public String getCompanyNameEn() {
		return companyNameEn;
	}

	public void setCompanyNameEn(String companyNameEn) {
		this.companyNameEn = companyNameEn;
	}

	public YardDetailOutput[] getYardList() {
		return yardList;
	}

	public void setYardList(YardDetailOutput[] yardList) {
		this.yardList = yardList;
	}
	
	
}
