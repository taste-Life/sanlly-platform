package com.sanlly.purchase.models.output.matterinquiry;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sanlly.purchase.enums.AuditStatusEnum;
import com.sanlly.purchase.models.output.matterbidding.MatterBiddingWarehouseOutput;
import com.sanlly.purchase.models.output.matterbidding.MatterSupplierTenderOutput;
import com.sanlly.purchase.models.output.matterbidding.MatterSupplierTenderProductOutput;

import java.util.Date;
import java.util.List;

/**
 * 
 * @Package com.sanlly.purchase.models.output.mattertender 
 * @Description: 竞价采购分页展示输出
 * @author jlx   
 * @date 2019年8月19日 下午4:33:05 
 * @version V1.0   
 */
public class MatterPeriodSupplierTenderDetailOutput {
	// 招标信息start
	private Integer purcMatterTenderPurchaseId;
	// 项目名称
	private String tenderName;
	// 竞价项目编号
	private String tenderId;
	// 竞价类型
	private String tenderType;
	private String tenderTypeLangLang;
	// 采购单位
	private String purchaseCompany;
	private String purchaseCompanyLangLang;
	// 仓库
	private List<MatterBiddingWarehouseOutput> warehouseOutputList;
	// 采购员
	private Integer buyerId;
	private String strBuyer;
	// 联系方式
	private String contactType;
	// 竞价内容
	private String tenderContent;
	// 竞价发布时间
	@JsonFormat(locale="zh", timezone="GMT+8", pattern = "yyyy-MM-dd")
	private Date createTime;
	// 投标人资格条件
	private String tenderCondition;
	// 签到时间@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@JsonFormat(locale="zh", timezone="GMT+8", pattern = "yyyy-MM-dd HH:mm")
	private Date firstInstanceTime;
	// 竞价方式
	private String tenderMethod;
	private String tenderMethodLangLang;
	// 初审
	private String isFirstTrial;
	private String isFirstTrialLangLang;
    // 竞价次数
    private Integer biddingNum;
    // 竞价开始时间
	@JsonFormat( locale="zh", timezone="GMT+8",pattern = "yyyy-MM-dd HH:mm")
    private Date biddingStartTime;
    // 竞价结束时间
	@JsonFormat(locale="zh", timezone="GMT+8",pattern = "yyyy-MM-dd HH:mm")
    private Date biddingEndTime;
	// 竞价状态
	private String tenderStatus;
	private String tenderStatusLangLang;
	// 中标供应商
	private String selectSupplier;
	private String selectSupplierLangLang;
	// 供货开始时间
	@JsonFormat(locale="zh", timezone="GMT+8",pattern = "yyyy-MM-dd")
	private Date supplyTime;
	// 供货结束时间
	@JsonFormat(locale="zh", timezone="GMT+8",pattern = "yyyy-MM-dd")
	private Date supplyEndTime;
	// 是否周期性定价
	private String isPeriod;
	private String isPeriodLangLang;
	// 投标截止时间
	@JsonFormat(locale="zh", timezone="GMT+8",pattern = "yyyy-MM-dd HH:mm")
	private Date tenderEndTime;
	// 温馨提示
	private String reminder;
	// 原因
	private String reason;
	//询价次数
	private  Integer inquiryNum;
	private String auditStatus;

	// 招标信息end
	
    // 供应商报价信息start
	// 竞价备件
	private List<MatterPeriodProductOutput> periodProductOutputList;
    // 供应商报价信息end

	public String getAuditStatus() {
		return auditStatus;
	}

	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}

	public Integer getPurcMatterTenderPurchaseId() {
		return purcMatterTenderPurchaseId;
	}

	public void setPurcMatterTenderPurchaseId(Integer purcMatterTenderPurchaseId) {
		this.purcMatterTenderPurchaseId = purcMatterTenderPurchaseId;
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

	public List<MatterBiddingWarehouseOutput> getWarehouseOutputList() {
		return warehouseOutputList;
	}

	public void setWarehouseOutputList(List<MatterBiddingWarehouseOutput> warehouseOutputList) {
		this.warehouseOutputList = warehouseOutputList;
	}

	public Integer getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(Integer buyerId) {
		this.buyerId = buyerId;
	}

	public String getStrBuyer() {
		return strBuyer;
	}

	public void setStrBuyer(String strBuyer) {
		this.strBuyer = strBuyer;
	}

	public String getContactType() {
		return contactType;
	}

	public void setContactType(String contactType) {
		this.contactType = contactType;
	}

	public String getTenderContent() {
		return tenderContent;
	}

	public void setTenderContent(String tenderContent) {
		this.tenderContent = tenderContent;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getTenderCondition() {
		return tenderCondition;
	}

	public void setTenderCondition(String tenderCondition) {
		this.tenderCondition = tenderCondition;
	}

	public Date getFirstInstanceTime() {
		return firstInstanceTime;
	}

	public void setFirstInstanceTime(Date firstInstanceTime) {
		this.firstInstanceTime = firstInstanceTime;
	}

	public String getTenderMethod() {
		return tenderMethod;
	}

	public void setTenderMethod(String tenderMethod) {
		this.tenderMethod = tenderMethod;
	}

	public String getTenderMethodLangLang() {
		return tenderMethodLangLang;
	}

	public void setTenderMethodLangLang(String tenderMethodLangLang) {
		this.tenderMethodLangLang = tenderMethodLangLang;
	}

	public String getIsFirstTrial() {
		return isFirstTrial;
	}

	public void setIsFirstTrial(String isFirstTrial) {
		this.isFirstTrial = isFirstTrial;
	}

	public String getIsFirstTrialLangLang() {
		return isFirstTrialLangLang;
	}

	public void setIsFirstTrialLangLang(String isFirstTrialLangLang) {
		this.isFirstTrialLangLang = isFirstTrialLangLang;
	}

	public Integer getBiddingNum() {
		return biddingNum;
	}

	public void setBiddingNum(Integer biddingNum) {
		this.biddingNum = biddingNum;
	}

	public Date getBiddingStartTime() {
		return biddingStartTime;
	}

	public void setBiddingStartTime(Date biddingStartTime) {
		this.biddingStartTime = biddingStartTime;
	}

	public Date getBiddingEndTime() {
		return biddingEndTime;
	}

	public void setBiddingEndTime(Date biddingEndTime) {
		this.biddingEndTime = biddingEndTime;
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

	public Date getSupplyTime() {
		return supplyTime;
	}

	public void setSupplyTime(Date supplyTime) {
		this.supplyTime = supplyTime;
	}

	public Date getSupplyEndTime() {
		return supplyEndTime;
	}

	public void setSupplyEndTime(Date supplyEndTime) {
		this.supplyEndTime = supplyEndTime;
	}

	public String getIsPeriod() {
		return isPeriod;
	}

	public void setIsPeriod(String isPeriod) {
		this.isPeriod = isPeriod;
	}

	public String getIsPeriodLangLang() {
		return isPeriodLangLang;
	}

	public void setIsPeriodLangLang(String isPeriodLangLang) {
		this.isPeriodLangLang = isPeriodLangLang;
	}

	public Date getTenderEndTime() {
		return tenderEndTime;
	}

	public void setTenderEndTime(Date tenderEndTime) {
		this.tenderEndTime = tenderEndTime;
	}

	public String getReminder() {
		return reminder;
	}

	public void setReminder(String reminder) {
		this.reminder = reminder;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public Integer getInquiryNum() {
		return inquiryNum;
	}

	public void setInquiryNum(Integer inquiryNum) {
		this.inquiryNum = inquiryNum;
	}

	public List<MatterPeriodProductOutput> getPeriodProductOutputList() {
		return periodProductOutputList;
	}

	public void setPeriodProductOutputList(List<MatterPeriodProductOutput> periodProductOutputList) {
		this.periodProductOutputList = periodProductOutputList;
	}
	
	

}
