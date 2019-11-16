package com.sanlly.production.models.output.edi;

/**
 * 自动进入edi池详细信息
 * @author RexSheng
 * 2019年10月22日 下午3:53:19
 */
public class AutoIntoPoolDetailOutput {

	private Integer autoPoolId;
	
	private String company;
	
	private String containerUser;
	
	private String containerCategory;
	
	private String replyState;
	
	private String timeField;
	
	private Integer waitMiniute;

	public Integer getAutoPoolId() {
		return autoPoolId;
	}

	public void setAutoPoolId(Integer autoPoolId) {
		this.autoPoolId = autoPoolId;
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
