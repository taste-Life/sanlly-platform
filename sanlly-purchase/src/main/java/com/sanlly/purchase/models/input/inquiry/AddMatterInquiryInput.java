package com.sanlly.purchase.models.input.inquiry;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sanlly.purchase.models.input.MultiSelectInput;
import com.sanlly.purchase.models.output.MatterDemand.MatterDemandOutput;

import java.util.Date;
import java.util.List;

/**
 * 
* @Package com.sanlly.purchase.models.input.inquiry 
* @Description: 询价发布内容添加 
* @author jlx   
* @date 2019年8月19日 下午4:56:19 
* @version V1.0   
 */
public class AddMatterInquiryInput {

	private Integer purcMatterTenderPurchaseId;
	// 项目名称
	private String tenderName;
	// 询价项目编号
    private String tenderId;
	// 询价类型
    private String tenderType;
	// 采购单位
    private String purchaseCompany;
	// 采购员
    private Integer buyerId;
	// 联系方式
    private String contactType;
	// 询价内容
    private String tenderContent;
	// 投标人资格条件
    private String tenderCondition;
	// 签到截止时间
    private Date firstInstanceTime;
	// 询价方式
    private String tenderMethod;
	// 供货开始时间
    private Date supplyTime;
	// 供货结束时间
	@JsonFormat(pattern = "yyyy-MM-dd",locale="zh", timezone="GMT+8")
	private Date supplyEndTime;
	// 是否周期性定价
    private String isPeriod;
	// 询价截止时间
    private Date tenderEndTime;
//    // 询价次数
//    private Integer biddingNum;
//    // 询价开始时间
//    private Date biddingStartTime;
//    // 询价结束时间
//    private Date biddingEndTime;
	// 温馨提示
    private String reminder;
    // 询价仓库
    private List<MultiSelectInput>  warehouseInputs;
    // 询价备件列表
    private List<MatterDemandOutput> matterDemandList;
    // 邀请供应商
    private String[] purcSupplierIds;
    
    
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
	public String getPurchaseCompany() {
		return purchaseCompany;
	}
	public void setPurchaseCompany(String purchaseCompany) {
		this.purchaseCompany = purchaseCompany;
	}
	public Integer getBuyerId() {
		return buyerId;
	}
	public void setBuyerId(Integer buyerId) {
		this.buyerId = buyerId;
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
	
	public List<MultiSelectInput> getWarehouseInputs() {
		return warehouseInputs;
	}
	public void setWarehouseInputs(List<MultiSelectInput> warehouseInputs) {
		this.warehouseInputs = warehouseInputs;
	}
	public List<MatterDemandOutput> getMatterDemandList() {
		return matterDemandList;
	}
	public void setMatterDemandList(List<MatterDemandOutput> matterDemandList) {
		this.matterDemandList = matterDemandList;
	}
	public String[] getPurcSupplierIds() {
		return purcSupplierIds;
	}
	public void setPurcSupplierIds(String[] purcSupplierIds) {
		this.purcSupplierIds = purcSupplierIds;
	}
	
	
}
