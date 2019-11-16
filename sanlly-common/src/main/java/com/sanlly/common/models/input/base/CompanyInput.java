package com.sanlly.common.models.input.base;

public class CompanyInput {

	private Integer prodCompanyId;

    private String key;

    private String companyCode;

    private String companyName;

    private String companyNameEn;

    private Integer isHead;

    private Integer isLock;

    private Integer receiveTime;
    
    private Integer isValid;

	public Integer getProdCompanyId() {
		return prodCompanyId;
	}

	public void setProdCompanyId(Integer prodCompanyId) {
		this.prodCompanyId = prodCompanyId;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
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

	public Integer getIsHead() {
		return isHead;
	}

	public void setIsHead(Integer isHead) {
		this.isHead = isHead;
	}

	public Integer getIsLock() {
		return isLock;
	}

	public void setIsLock(Integer isLock) {
		this.isLock = isLock;
	}

	public Integer getReceiveTime() {
		return receiveTime;
	}

	public void setReceiveTime(Integer receiveTime) {
		this.receiveTime = receiveTime;
	}

	public Integer getIsValid() {
		return isValid;
	}

	public void setIsValid(Integer isValid) {
		this.isValid = isValid;
	}
    
    
}
