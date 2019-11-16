package com.sanlly.production.models.input.edi;

public class EditEdiConfigInput {
	
	private Integer prodCompanyEdiTypeId;

	private String company;
	
	private String containerUser;
	
	private String containerCategory;
	
	private String ediType;
	
	private String isUnityQuote;
	
	private Integer editFileFormat;

    private String estimateFormat;

    private String ediFileTemplate;

    private String sendType;

    private String ediMethod;

    private String sendEmail;

    private String isEnabled;

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
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

	public String getEdiType() {
		return ediType;
	}

	public void setEdiType(String ediType) {
		this.ediType = ediType;
	}

	public String getIsUnityQuote() {
		return isUnityQuote;
	}

	public void setIsUnityQuote(String isUnityQuote) {
		this.isUnityQuote = isUnityQuote;
	}

	public Integer getEditFileFormat() {
		return editFileFormat;
	}

	public void setEditFileFormat(Integer editFileFormat) {
		this.editFileFormat = editFileFormat;
	}

	public String getEstimateFormat() {
		return estimateFormat;
	}

	public void setEstimateFormat(String estimateFormat) {
		this.estimateFormat = estimateFormat;
	}

	public String getSendType() {
		return sendType;
	}

	public void setSendType(String sendType) {
		this.sendType = sendType;
	}

	public String getEdiMethod() {
		return ediMethod;
	}

	public void setEdiMethod(String ediMethod) {
		this.ediMethod = ediMethod;
	}

	public String getSendEmail() {
		return sendEmail;
	}

	public void setSendEmail(String sendEmail) {
		this.sendEmail = sendEmail;
	}

	public String getIsEnabled() {
		return isEnabled;
	}

	public void setIsEnabled(String isEnabled) {
		this.isEnabled = isEnabled;
	}

	public Integer getProdCompanyEdiTypeId() {
		return prodCompanyEdiTypeId;
	}

	public void setProdCompanyEdiTypeId(Integer prodCompanyEdiTypeId) {
		this.prodCompanyEdiTypeId = prodCompanyEdiTypeId;
	}

	public String getEdiFileTemplate() {
		return ediFileTemplate;
	}

	public void setEdiFileTemplate(String ediFileTemplate) {
		this.ediFileTemplate = ediFileTemplate;
	}

    
}
