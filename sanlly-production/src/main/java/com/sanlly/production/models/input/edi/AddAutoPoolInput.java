package com.sanlly.production.models.input.edi;

/**
 * 新增自动进入EDI池配置
 * @author RexSheng
 * 2019年10月22日 下午3:55:20
 */
public class AddAutoPoolInput {

	
	private String company;
	
	private String containerUser;
	
	private String containerCategory;
	
	private String replyState;
	
	private String timeField;
	
	private Integer waitMiniute;

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

	public String getReplyState() {
		return replyState;
	}

	public void setReplyState(String replyState) {
		this.replyState = replyState;
	}

	public String getTimeField() {
		return timeField;
	}

	public void setTimeField(String timeField) {
		this.timeField = timeField;
	}

	public Integer getWaitMiniute() {
		return waitMiniute;
	}

	public void setWaitMiniute(Integer waitMiniute) {
		this.waitMiniute = waitMiniute;
	}
	
	
}
