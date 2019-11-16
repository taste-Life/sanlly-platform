package com.sanlly.production.models.output.edi;

import java.math.BigDecimal;

public class EdiPoolExportDetailOutput {

	private String company;
	
	private String yard;
	
	private String courseId;
	
	private String containerUser;
	
	private String containerCategory;
	
	private String containerCategoryDryCold;
	
	private String evaluationNo;
	
	private String ediTypeKey;
	
	private String ediTypeName;
	
	private String ediFileFormat;
	
	private String ediMethodName;
	
	private String ediFileTemplate;
	
	private BigDecimal dppFee;
	
	private BigDecimal cwFee;
	
	private String clientCode;
	
	private String sendType;
	
	private String ftpServer;
	
	private Integer ftpPort;
	
	private String ftpDirectory;
	
	private String ftpUser;
	
	private String ftpPassword;
	
	private String smtpServer;
	
	private Integer smtpPort;
	
	private String sendEmailAddress;
	
	private String sendEmailUser;
	
	private String sendEmailPassword;
	
	private String receiveEmailUser;
	
	private Integer ediPoolId;

	public String getEdiFileTemplate() {
		return ediFileTemplate;
	}

	public void setEdiFileTemplate(String ediFileTemplate) {
		this.ediFileTemplate = ediFileTemplate;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getYard() {
		return yard;
	}

	public void setYard(String yard) {
		this.yard = yard;
	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
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

	public String getEvaluationNo() {
		return evaluationNo;
	}

	public void setEvaluationNo(String evaluationNo) {
		this.evaluationNo = evaluationNo;
	}

	public String getEdiTypeName() {
		return ediTypeName;
	}

	public void setEdiTypeName(String ediTypeName) {
		this.ediTypeName = ediTypeName;
	}

	public String getEdiTypeKey() {
		return ediTypeKey;
	}

	public void setEdiTypeKey(String ediTypeKey) {
		this.ediTypeKey = ediTypeKey;
	}

	public String getEdiFileFormat() {
		return ediFileFormat;
	}

	public void setEdiFileFormat(String ediFileFormat) {
		this.ediFileFormat = ediFileFormat;
	}

	public String getEdiMethodName() {
		return ediMethodName;
	}

	public void setEdiMethodName(String ediMethodName) {
		this.ediMethodName = ediMethodName;
	}

	public String getContainerCategoryDryCold() {
		return containerCategoryDryCold;
	}

	public void setContainerCategoryDryCold(String containerCategoryDryCold) {
		this.containerCategoryDryCold = containerCategoryDryCold;
	}

	public BigDecimal getDppFee() {
		return dppFee;
	}

	public void setDppFee(BigDecimal dppFee) {
		this.dppFee = dppFee;
	}

	public BigDecimal getCwFee() {
		return cwFee;
	}

	public void setCwFee(BigDecimal cwFee) {
		this.cwFee = cwFee;
	}

	public String getClientCode() {
		return clientCode;
	}

	public void setClientCode(String clientCode) {
		this.clientCode = clientCode;
	}

	public String getSendType() {
		return sendType;
	}

	public void setSendType(String sendType) {
		this.sendType = sendType;
	}

	public String getFtpServer() {
		return ftpServer;
	}

	public void setFtpServer(String ftpServer) {
		this.ftpServer = ftpServer;
	}

	public Integer getFtpPort() {
		return ftpPort;
	}

	public void setFtpPort(Integer ftpPort) {
		this.ftpPort = ftpPort;
	}

	public String getFtpDirectory() {
		return ftpDirectory;
	}

	public void setFtpDirectory(String ftpDirectory) {
		this.ftpDirectory = ftpDirectory;
	}

	public String getFtpUser() {
		return ftpUser;
	}

	public void setFtpUser(String ftpUser) {
		this.ftpUser = ftpUser;
	}

	public String getFtpPassword() {
		return ftpPassword;
	}

	public void setFtpPassword(String ftpPassword) {
		this.ftpPassword = ftpPassword;
	}

	public String getSmtpServer() {
		return smtpServer;
	}

	public void setSmtpServer(String smtpServer) {
		this.smtpServer = smtpServer;
	}

	public String getSendEmailAddress() {
		return sendEmailAddress;
	}

	public void setSendEmailAddress(String sendEmailAddress) {
		this.sendEmailAddress = sendEmailAddress;
	}

	public String getSendEmailUser() {
		return sendEmailUser;
	}

	public void setSendEmailUser(String sendEmailUser) {
		this.sendEmailUser = sendEmailUser;
	}

	public String getSendEmailPassword() {
		return sendEmailPassword;
	}

	public void setSendEmailPassword(String sendEmailPassword) {
		this.sendEmailPassword = sendEmailPassword;
	}

	public String getReceiveEmailUser() {
		return receiveEmailUser;
	}

	public void setReceiveEmailUser(String receiveEmailUser) {
		this.receiveEmailUser = receiveEmailUser;
	}

	public Integer getSmtpPort() {
		return smtpPort;
	}

	public void setSmtpPort(Integer smtpPort) {
		this.smtpPort = smtpPort;
	}

	public Integer getEdiPoolId() {
		return ediPoolId;
	}

	public void setEdiPoolId(Integer ediPoolId) {
		this.ediPoolId = ediPoolId;
	}
	
	
}
