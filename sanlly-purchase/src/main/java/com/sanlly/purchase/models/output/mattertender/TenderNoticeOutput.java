package com.sanlly.purchase.models.output.mattertender;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * 
* @Package com.sanlly.purchase.models.output.mattertender 
* @Description: 招标公告 
* @author jlx   
* @date 2019年8月23日 下午3:52:08 
* @version V1.0   
 */
public class TenderNoticeOutput {

	// 公告id
    private Integer purcTenderNoticeId;
    // 招标id
    private Integer tenderPurchaseId;
	// 公告类型
	private String noticeType;
	// 公告类型
	private String noticeTypeLangLang;
	// 项目名称
	private String tenderName;
	// 招标项目编号
    private String tenderId;
	// 招标类型
    private String tenderType;
    private String tenderTypeLangLang;
	// 采购单位
    private String purchaseCompany;
    private String purchaseCompanyLangLang;
    // 招标发布时间
    @JsonFormat(locale="zh", timezone="GMT+8", pattern = "yyyy-MM-dd")
    private Date createTime;
	// 初审时间
    @JsonFormat(locale="zh", timezone="GMT+8", pattern = "yyyy-MM-dd HH:mm")
    private Date firstInstanceTime;
	// 投标截止时间
    @JsonFormat(locale="zh", timezone="GMT+8", pattern = "yyyy-MM-dd HH:mm")
    private Date tenderEndTime;
	// 招标状态
	private String tenderStatus;
	private String tenderStatusLangLang;
	// 中标供应商
    private String selectSupplier;
    private String selectSupplierLangLang;
    //是否日常招标
	private String isDayPruchase;

	public String getIsDayPruchase() {
		return isDayPruchase;
	}

	public void setIsDayPruchase(String isDayPruchase) {
		this.isDayPruchase = isDayPruchase;
	}

	//
	public Integer getPurcTenderNoticeId() {
		return purcTenderNoticeId;
	}
	public void setPurcTenderNoticeId(Integer purcTenderNoticeId) {
		this.purcTenderNoticeId = purcTenderNoticeId;
	}
	public Integer getTenderPurchaseId() {
		return tenderPurchaseId;
	}
	public void setTenderPurchaseId(Integer tenderPurchaseId) {
		this.tenderPurchaseId = tenderPurchaseId;
	}
	public String getNoticeType() {
		return noticeType;
	}
	public void setNoticeType(String noticeType) {
		this.noticeType = noticeType;
	}
	
	public String getNoticeTypeLangLang() {
		return noticeTypeLangLang;
	}
	public void setNoticeTypeLangLang(String noticeTypeLangLang) {
		this.noticeTypeLangLang = noticeTypeLangLang;
	}
	public String getTenderName() {
		return tenderName;
	}
	public void setTenderName(String tenderName) {
		this.tenderName = tenderName;
	}
	public String getTenderId() {
		return tenderId;
	}
	public void setTenderId(String tenderId) {
		this.tenderId = tenderId;
	}
	public String getTenderType() {
		return tenderType;
	}
	public void setTenderType(String tenderType) {
		this.tenderType = tenderType;
	}
	public String getTenderTypeLangLang() {
		return tenderTypeLangLang;
	}
	public void setTenderTypeLangLang(String tenderTypeLangLang) {
		this.tenderTypeLangLang = tenderTypeLangLang;
	}
	public String getPurchaseCompany() {
		return purchaseCompany;
	}
	public void setPurchaseCompany(String purchaseCompany) {
		this.purchaseCompany = purchaseCompany;
	}
	public String getPurchaseCompanyLangLang() {
		return purchaseCompanyLangLang;
	}
	public void setPurchaseCompanyLangLang(String purchaseCompanyLangLang) {
		this.purchaseCompanyLangLang = purchaseCompanyLangLang;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getFirstInstanceTime() {
		return firstInstanceTime;
	}
	public void setFirstInstanceTime(Date firstInstanceTime) {
		this.firstInstanceTime = firstInstanceTime;
	}
	public Date getTenderEndTime() {
		return tenderEndTime;
	}
	public void setTenderEndTime(Date tenderEndTime) {
		this.tenderEndTime = tenderEndTime;
	}
	public String getTenderStatus() {
		return tenderStatus;
	}
	public void setTenderStatus(String tenderStatus) {
		this.tenderStatus = tenderStatus;
	}
	public String getTenderStatusLangLang() {
		return tenderStatusLangLang;
	}
	public void setTenderStatusLangLang(String tenderStatusLangLang) {
		this.tenderStatusLangLang = tenderStatusLangLang;
	}
	public String getSelectSupplier() {
		return selectSupplier;
	}
	public void setSelectSupplier(String selectSupplier) {
		this.selectSupplier = selectSupplier;
	}
	public String getSelectSupplierLangLang() {
		return selectSupplierLangLang;
	}
	public void setSelectSupplierLangLang(String selectSupplierLangLang) {
		this.selectSupplierLangLang = selectSupplierLangLang;
	}    
}
