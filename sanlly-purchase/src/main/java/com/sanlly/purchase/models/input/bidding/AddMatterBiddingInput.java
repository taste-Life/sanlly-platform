package com.sanlly.purchase.models.input.bidding;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sanlly.purchase.models.input.MultiSelectInput;
import com.sanlly.purchase.models.output.MatterDemand.MatterDemandOutput;

import java.util.Date;
import java.util.List;

/**
 * 
* @Package com.sanlly.purchase.models.input.bidding 
* @Description: 竞价发布内容添加 
* @author jlx   
* @date 2019年8月19日 下午4:56:19 
* @version V1.0   
 */
public class AddMatterBiddingInput {

	// 项目名称
	private String tenderName;
	// 竞价项目编号
    private String tenderId;
	// 竞价类型
    private String tenderType;
	// 采购单位
    private String purchaseCompany;
	// 采购员
    private Integer buyerId;
	// 联系方式
    private String contactType;
	// 竞价内容
    private String tenderContent;
	// 投标人资格条件
    private String tenderCondition;
	// 签到截止时间
    private Date firstInstanceTime;
	// 竞价方式
    private String tenderMethod;
	// 供货开始时间
    private Date supplyTime;
	// 供货结束时间
	@JsonFormat(pattern = "yyyy-MM-dd",locale="zh", timezone="GMT+8")
	private Date supplyEndTime;
	// 是否周期性定价
    private String isPeriod;
	// 投标截止时间
    private Date tenderEndTime;
    // 竞价次数
    private Integer biddingNum;
    // 竞价开始时间
    private Date biddingStartTime;
    // 竞价结束时间
    private Date biddingEndTime;
	// 温馨提示
    private String reminder;
    // 发票类型
    private String invoice;
    // 竞价仓库
    private List<MultiSelectInput>  warehouseInputs;
    // 竞价备件列表
    private List<MatterDemandOutput> matterDemandList;
    // 邀请供应商
    private String[] purcSupplierIds;
    
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
	public String getInvoice() {
		return invoice;
	}
	public void setInvoice(String invoice) {
		this.invoice = invoice;
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
	
	
}
