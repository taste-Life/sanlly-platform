package com.sanlly.production.models.output.edi;

/**
 * 自动发送报价配置
 * @author RexSheng
 * 2019年10月22日 下午1:50:03
 */
public class AutoSendOutput {

	private Integer autoSendId;
	
	private String companyNameLang;
	
	private String containerUserNameLang;
	
	private String containerCategoryNameLang;
	
	//场站
	private String yardLang;
	
	private Integer timeInterval;
	
	//最大条数
	private Integer maxNumber;

	public Integer getAutoSendId() {
		return autoSendId;
	}

	public void setAutoSendId(Integer autoSendId) {
		this.autoSendId = autoSendId;
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

	public String getYardLang() {
		return yardLang;
	}

	public void setYardLang(String yardLang) {
		this.yardLang = yardLang;
	}
	
	
	
	
	
	
	
	
}
