package com.sanlly.production.models.output.edi;

/**
 * 公司与用箱人对应信息维护
 * @author RexSheng
 * 2019年10月23日 下午6:50:49
 */
public class CompanyContainerUserOutput {

	private Integer primaryId;
	
	private String company;
	
	private String companyNameLang;
	
	private String containerUserNameLang;
	
	private String containerUser;
	
	private String ftpReceiveAddress;
	
	private Integer ftpReceivePort;
	
	private String ftpReceiveDirectory;
	
	private String ftpSendAccount;
	
	private String ftpSendPwd;
	
	private String sendEmailAddress;
	
	private String sendSmtpContent;
	
	private Integer sendSmtpPort;
	
	private String emailUser;
	
	private String emailPwd;

	public Integer getPrimaryId() {
		return primaryId;
	}

	public void setPrimaryId(Integer primaryId) {
		this.primaryId = primaryId;
	}

	public String getCompanyNameLang() {
		return companyNameLang;
	}

	public void setCompanyNameLang(String companyNameLang) {
		this.companyNameLang = companyNameLang;
	}

	public String getContainerUserNameLang() {
		return containerUserNameLang;
	}

	public void setContainerUserNameLang(String containerUserNameLang) {
		this.containerUserNameLang = containerUserNameLang;
	}

	public String getFtpReceiveAddress() {
		return ftpReceiveAddress;
	}

	public void setFtpReceiveAddress(String ftpReceiveAddress) {
		this.ftpReceiveAddress = ftpReceiveAddress;
	}

	public Integer getFtpReceivePort() {
		return ftpReceivePort;
	}

	public void setFtpReceivePort(Integer ftpReceivePort) {
		this.ftpReceivePort = ftpReceivePort;
	}

	public String getFtpReceiveDirectory() {
		return ftpReceiveDirectory;
	}

	public void setFtpReceiveDirectory(String ftpReceiveDirectory) {
		this.ftpReceiveDirectory = ftpReceiveDirectory;
	}

	public String getFtpSendAccount() {
		return ftpSendAccount;
	}

	public void setFtpSendAccount(String ftpSendAccount) {
		this.ftpSendAccount = ftpSendAccount;
	}

	public Integer getSendSmtpPort() {
		return sendSmtpPort;
	}

	public void setSendSmtpPort(Integer sendSmtpPort) {
		this.sendSmtpPort = sendSmtpPort;
	}

	public String getEmailUser() {
		return emailUser;
	}

	public void setEmailUser(String emailUser) {
		this.emailUser = emailUser;
	}

	public String getEmailPwd() {
		return emailPwd;
	}

	public void setEmailPwd(String emailPwd) {
		this.emailPwd = emailPwd;
	}

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

	public String getSendEmailAddress() {
		return sendEmailAddress;
	}

	public void setSendEmailAddress(String sendEmailAddress) {
		this.sendEmailAddress = sendEmailAddress;
	}

	public String getSendSmtpContent() {
		return sendSmtpContent;
	}

	public void setSendSmtpContent(String sendSmtpContent) {
		this.sendSmtpContent = sendSmtpContent;
	}

	public String getFtpSendPwd() {
		return ftpSendPwd;
	}

	public void setFtpSendPwd(String ftpSendPwd) {
		this.ftpSendPwd = ftpSendPwd;
	}
	
	
}
