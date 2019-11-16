package com.sanlly.production.models.output.edi;

/**
 * 公司与代码对应关系
 * @author RexSheng
 * 2019年10月25日 上午11:22:10
 */
public class CompanyCodeOutput {

	private Integer codeId;
	
	private String company;
	
	private String companyNameLang;
	
	private String containerUser;
	
	private String containerUserNameLang;
	
	private String yard;
	
	private String yardNameLang;
	
	private String sendCode;
	
	private String receptionCode;
	
	private String facilityCode;

	public Integer getCodeId() {
		return codeId;
	}

	public void setCodeId(Integer codeId) {
		this.codeId = codeId;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCompanyNameLang() {
		return companyNameLang;
	}

	public void setCompanyNameLang(String companyNameLang) {
		this.companyNameLang = companyNameLang;
	}

	public String getContainerUser() {
		return containerUser;
	}

	public void setContainerUser(String containerUser) {
		this.containerUser = containerUser;
	}

	public String getContainerUserNameLang() {
		return containerUserNameLang;
	}

	public void setContainerUserNameLang(String containerUserNameLang) {
		this.containerUserNameLang = containerUserNameLang;
	}

	public String getSendCode() {
		return sendCode;
	}

	public void setSendCode(String sendCode) {
		this.sendCode = sendCode;
	}

	public String getReceptionCode() {
		return receptionCode;
	}

	public void setReceptionCode(String receptionCode) {
		this.receptionCode = receptionCode;
	}

	public String getFacilityCode() {
		return facilityCode;
	}

	public void setFacilityCode(String facilityCode) {
		this.facilityCode = facilityCode;
	}

	public String getYard() {
		return yard;
	}

	public void setYard(String yard) {
		this.yard = yard;
	}

	public String getYardNameLang() {
		return yardNameLang;
	}

	public void setYardNameLang(String yardNameLang) {
		this.yardNameLang = yardNameLang;
	}
	
	
}
