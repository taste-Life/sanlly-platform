package com.sanlly.production.models.output.edi;

public class AutoSendDetailOutput {

	private Integer autoSendId;
	
	private String company;
	
	private String containerUser;
	
	private String containerCategory;
	
	private String yard;
	
	private Integer timeInterval;
	
	private Integer maxNumber;

	public Integer getAutoSendId() {
		return autoSendId;
	}

	public void setAutoSendId(Integer autoSendId) {
		this.autoSendId = autoSendId;
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

	public String getContainerCategory() {
		return containerCategory;
	}

	public void setContainerCategory(String containerCategory) {
		this.containerCategory = containerCategory;
	}

	public String getYard() {
		return yard;
	}

	public void setYard(String yard) {
		this.yard = yard;
	}

	public Integer getTimeInterval() {
		return timeInterval;
	}

	public void setTimeInterval(Integer timeInterval) {
		this.timeInterval = timeInterval;
	}

	public Integer getMaxNumber() {
		return maxNumber;
	}

	public void setMaxNumber(Integer maxNumber) {
		this.maxNumber = maxNumber;
	}
	
	
}
