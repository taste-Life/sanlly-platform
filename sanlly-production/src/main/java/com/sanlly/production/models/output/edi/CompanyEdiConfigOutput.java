package com.sanlly.production.models.output.edi;

public class CompanyEdiConfigOutput {

	private Integer configId;
	
	private String companyLang;
	
	private String containerUserLang;
	
	private String containerCategoryLang;
	
	private String ediTypeLang;
	
	/**
	 * 是否统一报价
	 */
	private String isUnityQuoteLang;
	
	private String ediFileFormat;
	
	private String evaluationFormat;
	
	private String ediFileTemplate;
	
	private String sendTypeLang;
	
	private String ediMethod;
	
	private String receiverEmail;
	
	private String isEnabledLang;

	public Integer getConfigId() {
		return configId;
	}

	public void setConfigId(Integer configId) {
		this.configId = configId;
	}

	public String getCompanyLang() {
		return companyLang;
	}

	public void setCompanyLang(String companyLang) {
		this.companyLang = companyLang;
	}

	public String getContainerUserLang() {
		return containerUserLang;
	}

	public void setContainerUserLang(String containerUserLang) {
		this.containerUserLang = containerUserLang;
	}

	public String getContainerCategoryLang() {
		return containerCategoryLang;
	}

	public void setContainerCategoryLang(String containerCategoryLang) {
		this.containerCategoryLang = containerCategoryLang;
	}

	public String getEdiTypeLang() {
		return ediTypeLang;
	}

	public void setEdiTypeLang(String ediTypeLang) {
		this.ediTypeLang = ediTypeLang;
	}

	public String getIsUnityQuoteLang() {
		return isUnityQuoteLang;
	}

	public void setIsUnityQuoteLang(String isUnityQuoteLang) {
		this.isUnityQuoteLang = isUnityQuoteLang;
	}

	public String getEdiFileFormat() {
		return ediFileFormat;
	}

	public void setEdiFileFormat(String ediFileFormat) {
		this.ediFileFormat = ediFileFormat;
	}

	public String getEvaluationFormat() {
		return evaluationFormat;
	}

	public void setEvaluationFormat(String evaluationFormat) {
		this.evaluationFormat = evaluationFormat;
	}

	public String getSendTypeLang() {
		return sendTypeLang;
	}

	public void setSendTypeLang(String sendTypeLang) {
		this.sendTypeLang = sendTypeLang;
	}

	public String getEdiMethod() {
		return ediMethod;
	}

	public void setEdiMethod(String ediMethod) {
		this.ediMethod = ediMethod;
	}

	public String getReceiverEmail() {
		return receiverEmail;
	}

	public void setReceiverEmail(String receiverEmail) {
		this.receiverEmail = receiverEmail;
	}

	public String getIsEnabledLang() {
		return isEnabledLang;
	}

	public void setIsEnabledLang(String isEnabledLang) {
		this.isEnabledLang = isEnabledLang;
	}

	public String getEdiFileTemplate() {
		return ediFileTemplate;
	}

	public void setEdiFileTemplate(String ediFileTemplate) {
		this.ediFileTemplate = ediFileTemplate;
	}
	
	
}
