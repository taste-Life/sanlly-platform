package com.sanlly.production.models.output.app.company;

import com.sanlly.production.models.output.app.yard.YardLoginOutput;

public class CompanyLoginOutput {

	private String companyKey;
	
	private String companyName;
	
	private String companyNameEn;
	
	private YardLoginOutput[] yardList;

	public String getCompanyKey() {
		return companyKey;
	}

	public void setCompanyKey(String companyKey) {
		this.companyKey = companyKey;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyNameEn() {
		return companyNameEn;
	}

	public void setCompanyNameEn(String companyNameEn) {
		this.companyNameEn = companyNameEn;
	}

	public YardLoginOutput[] getYardList() {
		return yardList;
	}

	public void setYardList(YardLoginOutput[] yardList) {
		this.yardList = yardList;
	}
	
	
}
