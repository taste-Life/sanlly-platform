package com.sanlly.production.models.input.edi;

import com.sanlly.common.models.input.PageInput;

public class EdiPoolSearchInput extends PageInput{

	private String[] ediType;
	
	private String containerNo;
	
	
	private String evaluationNo;
	
	private Boolean isSend;
	
	private String yard;
	
	private String containerUser;
	
	private String containerOwner;
	
	private String containerCategory;

	public String[] getEdiType() {
		return ediType;
	}

	public void setEdiType(String[] ediType) {
		this.ediType = ediType;
	}

	public String getContainerNo() {
		return containerNo;
	}

	public void setContainerNo(String containerNo) {
		this.containerNo = containerNo;
	}

	public String getEvaluationNo() {
		return evaluationNo;
	}

	public void setEvaluationNo(String evaluationNo) {
		this.evaluationNo = evaluationNo;
	}

	public Boolean getIsSend() {
		return isSend;
	}

	public void setIsSend(Boolean isSend) {
		this.isSend = isSend;
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

	public String getContainerOwner() {
		return containerOwner;
	}

	public void setContainerOwner(String containerOwner) {
		this.containerOwner = containerOwner;
	}

	public String getContainerCategory() {
		return containerCategory;
	}

	public void setContainerCategory(String containerCategory) {
		this.containerCategory = containerCategory;
	}
	
}
