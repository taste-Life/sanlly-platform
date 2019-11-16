package com.sanlly.production.models.output.remark;

/**
 * 自动排程列表
 * 
 * @Package com.sanlly.production.models.output.remark 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年9月10日 上午11:09:58 
 * @version V1.0   
 */
public class SearchAutomationOutput {
	// 用箱人
	private String containerUserLang;
	// 箱号
	private String containerNo;
	// 尺寸
	private String sizeLang;
	// 进场类型
	private String courseTypeLang;
	// 优先级
	private String urgencyLang;
	// 工时
	private Double manHour;
	// 派工时长
	private String referralHours;
	// 用箱人维修周期
	private String repairPeriod;
	// 批复日期
	private String replyTime;
	// 估价状态
	private String replyStateLang;
	// 指定班组
	private String designateUser;

	public String getContainerUserLang() {
		return containerUserLang;
	}

	public void setContainerUserLang(String containerUserLang) {
		this.containerUserLang = containerUserLang;
	}

	public String getContainerNo() {
		return containerNo;
	}

	public void setContainerNo(String containerNo) {
		this.containerNo = containerNo;
	}

	public String getSizeLang() {
		return sizeLang;
	}

	public void setSizeLang(String sizeLang) {
		this.sizeLang = sizeLang;
	}

	public String getCourseTypeLang() {
		return courseTypeLang;
	}

	public void setCourseTypeLang(String courseTypeLang) {
		this.courseTypeLang = courseTypeLang;
	}

	public String getUrgencyLang() {
		return urgencyLang;
	}

	public void setUrgencyLang(String urgencyLang) {
		this.urgencyLang = urgencyLang;
	}

	public Double getManHour() {
		return manHour;
	}

	public void setManHour(Double manHour) {
		this.manHour = manHour;
	}

	public String getReferralHours() {
		return referralHours;
	}

	public void setReferralHours(String referralHours) {
		this.referralHours = referralHours;
	}

	public String getRepairPeriod() {
		return repairPeriod;
	}

	public void setRepairPeriod(String repairPeriod) {
		this.repairPeriod = repairPeriod;
	}

	public String getReplyTime() {
		return replyTime;
	}

	public void setReplyTime(String replyTime) {
		this.replyTime = replyTime;
	}

	public String getReplyStateLang() {
		return replyStateLang;
	}

	public void setReplyStateLang(String replyStateLang) {
		this.replyStateLang = replyStateLang;
	}

	public String getDesignateUser() {
		return designateUser;
	}

	public void setDesignateUser(String designateUser) {
		this.designateUser = designateUser;
	}

}
