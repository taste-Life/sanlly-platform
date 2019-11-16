package com.sanlly.production.models.output.edi;

/**
 * 自动进入EDI池配置
 * @author RexSheng
 * 2019年10月22日 下午3:31:56
 */
public class AutoIntoPoolOutput {

	private Integer autoPoolId;
	
	private String companyNameLang;
	
	private String containerUserNameLang;
	
	private String containerCategoryNameLang;
	
	private String replyStateNameLang;
	
	private String timeFieldNameLang;
	
	private Integer waitMiniute;

	public Integer getAutoPoolId() {
		return autoPoolId;
	}

	public void setAutoPoolId(Integer autoPoolId) {
		this.autoPoolId = autoPoolId;
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

	public String getContainerCategoryNameLang() {
		return containerCategoryNameLang;
	}

	public void setContainerCategoryNameLang(String containerCategoryNameLang) {
		this.containerCategoryNameLang = containerCategoryNameLang;
	}

	public String getReplyStateNameLang() {
		return replyStateNameLang;
	}

	public void setReplyStateNameLang(String replyStateNameLang) {
		this.replyStateNameLang = replyStateNameLang;
	}

	public String getTimeFieldNameLang() {
		return timeFieldNameLang;
	}

	public void setTimeFieldNameLang(String timeFieldNameLang) {
		this.timeFieldNameLang = timeFieldNameLang;
	}

	public Integer getWaitMiniute() {
		return waitMiniute;
	}

	public void setWaitMiniute(Integer waitMiniute) {
		this.waitMiniute = waitMiniute;
	}
	
	
}
