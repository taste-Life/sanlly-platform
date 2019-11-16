package com.sanlly.common.models.input.message;

public class MessageInput {

	private String messageNotifier;

	private String company;

	private String yard;

	private String containerUser;

	private String containerNo;

	private String informMethod;

	public String getMessageNotifier() {
		return messageNotifier;
	}

	public void setMessageNotifier(String messageNotifier) {
		this.messageNotifier = messageNotifier;
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

	public String getContainerUser() {
		return containerUser;
	}

	public void setContainerUser(String containerUser) {
		this.containerUser = containerUser;
	}

	public String getContainerNo() {
		return containerNo;
	}

	public void setContainerNo(String containerNo) {
		this.containerNo = containerNo;
	}

	public String getInformMethod() {
		return informMethod;
	}

	public void setInformMethod(String informMethod) {
		this.informMethod = informMethod;
	}

}
