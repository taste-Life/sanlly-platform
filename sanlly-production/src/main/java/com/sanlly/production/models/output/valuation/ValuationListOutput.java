package com.sanlly.production.models.output.valuation;

import java.util.Date;

/**
 * web估价列表输出类
 * @author zhangkai
 *
 */
public class ValuationListOutput {
	
	/**
	 * 保修估价主键
	 */
	private String prodMaintenanceId;
	
	/*
	 * 进场id
	 */
	private String prodCourseId;
	/*
	 * 估价单号
	 */
	private String valuationNo;
	/*
	 * 箱号
	 */
	private String containerNo;
	/*
	 * 尺寸
	 */
	private String sizeLang;
	/*
	 * 箱型
	 */
	private String containerTypeLang;
	/*
	 * 用箱人
	 */
	private String containerUserLang;
	/*
	 * 进场类型
	 */
	private String courseTypeLang;
	/*
	 * 进场场站
	 */
	private String yardLang;
	/*
	 * 进场时间
	 */
	private String courseTime;
	/*
	 * 提单号
	 */
	private String ladingNo;
	/*
	 * 内外贸
	 */
	private String tradeLang;
	/*
	 * 箱等级
	 */
	private String containerGradeLang;
	/*
	 * 审核时间
	 */
	private String auditTime;
	/*
	 * 已报用箱人
	 */
	private String alreadyContainerUserLang;
	/*
	 * 箱类别
	 */
	private String containerCategoryLang;
	/*
	 * 箱类别key
	 */
	private String containerCategoryKey;
	/*
	 * 用箱人估价状态
	 */
	private String userValuationStateLang;
	
	/*
	 * 用箱人估价状态
	 */
	private String userValuationStateKey;
	
	/**
	 * 箱东估价状态
	 */
	private String ownerValuationStateLang;
	
	/**
	 * 箱东估价状态
	 */
	private String ownerValuationStateKey;
		
	/*
	 * 估价人
	 */
	private String valuationUser;
	/*
	 * 维修状态key
	 */
	private String referralStateKey;
	/*
	 * 维修状态
	 */
	private String referralStateLang;
	/*
	 * 完工人
	 */
	private String finishUser;
	/*
	 * 完工时间
	 */
	private String finishTime;
	/*
	 * 备注
	 */
	private String valuationRemarks;
	/*
	 * 报价总费用
	 */
	private String valuationMoney;
	
	private Date createTime;
	
	public String getValuationNo() {
		return valuationNo;
	}
	public void setValuationNo(String valuationNo) {
		this.valuationNo = valuationNo;
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
	public String getContainerTypeLang() {
		return containerTypeLang;
	}
	public void setContainerTypeLang(String containerTypeLang) {
		this.containerTypeLang = containerTypeLang;
	}
	public String getContainerUserLang() {
		return containerUserLang;
	}
	public void setContainerUserLang(String containerUserLang) {
		this.containerUserLang = containerUserLang;
	}
	public String getCourseTypeLang() {
		return courseTypeLang;
	}
	public void setCourseTypeLang(String courseTypeLang) {
		this.courseTypeLang = courseTypeLang;
	}
	public String getYardLang() {
		return yardLang;
	}
	public void setYardLang(String yardLang) {
		this.yardLang = yardLang;
	}
	public String getCourseTime() {
		return courseTime;
	}
	public void setCourseTime(String courseTime) {
		this.courseTime = courseTime;
	}
	public String getLadingNo() {
		return ladingNo;
	}
	public void setLadingNo(String ladingNo) {
		this.ladingNo = ladingNo;
	}
	public String getTradeLang() {
		return tradeLang;
	}
	public void setTradeLang(String tradeLang) {
		this.tradeLang = tradeLang;
	}
	public String getContainerGradeLang() {
		return containerGradeLang;
	}
	public void setContainerGradeLang(String containerGradeLang) {
		this.containerGradeLang = containerGradeLang;
	}
	public String getAuditTime() {
		return auditTime;
	}
	public void setAuditTime(String auditTime) {
		this.auditTime = auditTime;
	}
	public String getAlreadyContainerUserLang() {
		return alreadyContainerUserLang;
	}
	public void setAlreadyContainerUserLang(String alreadyContainerUserLang) {
		this.alreadyContainerUserLang = alreadyContainerUserLang;
	}
	public String getContainerCategoryLang() {
		return containerCategoryLang;
	}
	public void setContainerCategoryLang(String containerCategoryLang) {
		this.containerCategoryLang = containerCategoryLang;
	}
	public String getUserValuationStateLang() {
		return userValuationStateLang;
	}
	public void setUserValuationStateLang(String userValuationStateLang) {
		this.userValuationStateLang = userValuationStateLang;
	}
	public String getValuationUser() {
		return valuationUser;
	}
	public void setValuationUser(String valuationUser) {
		this.valuationUser = valuationUser;
	}
	public String getReferralStateLang() {
		return referralStateLang;
	}
	public void setReferralStateLang(String referralStateLang) {
		this.referralStateLang = referralStateLang;
	}
	public String getFinishUser() {
		return finishUser;
	}
	public void setFinishUser(String finishUser) {
		this.finishUser = finishUser;
	}
	public String getFinishTime() {
		return finishTime;
	}
	public void setFinishTime(String finishTime) {
		this.finishTime = finishTime;
	}
	public String getValuationRemarks() {
		return valuationRemarks;
	}
	public void setValuationRemarks(String valuationRemarks) {
		this.valuationRemarks = valuationRemarks;
	}
	public String getProdCourseId() {
		return prodCourseId;
	}
	public void setProdCourseId(String prodCourseId) {
		this.prodCourseId = prodCourseId;
	}
	public String getContainerCategoryKey() {
		return containerCategoryKey;
	}
	public void setContainerCategoryKey(String containerCategoryKey) {
		this.containerCategoryKey = containerCategoryKey;
	}
	public String getReferralStateKey() {
		return referralStateKey;
	}
	public void setReferralStateKey(String referralStateKey) {
		this.referralStateKey = referralStateKey;
	}
	public String getProdMaintenanceId() {
		return prodMaintenanceId;
	}
	public void setProdMaintenanceId(String prodMaintenanceId) {
		this.prodMaintenanceId = prodMaintenanceId;
	}
	public String getUserValuationStateKey() {
		return userValuationStateKey;
	}
	public void setUserValuationStateKey(String userValuationStateKey) {
		this.userValuationStateKey = userValuationStateKey;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getOwnerValuationStateLang() {
		return ownerValuationStateLang;
	}
	public void setOwnerValuationStateLang(String ownerValuationStateLang) {
		this.ownerValuationStateLang = ownerValuationStateLang;
	}
	public String getOwnerValuationStateKey() {
		return ownerValuationStateKey;
	}
	public void setOwnerValuationStateKey(String ownerValuationStateKey) {
		this.ownerValuationStateKey = ownerValuationStateKey;
	}
	public String getValuationMoney() {
		return valuationMoney;
	}
	public void setValuationMoney(String valuationMoney) {
		this.valuationMoney = valuationMoney;
	}
	
	
	
	
}
