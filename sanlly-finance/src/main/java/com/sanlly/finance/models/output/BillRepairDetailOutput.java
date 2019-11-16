package com.sanlly.finance.models.output;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 修理账单明细
 * 
 * @Package com.sanlly.finance.models.input 
 * @Description: TODO
 * @author fjy   
 * @date 2019年8月28日 下午3:19:38 
 * @version V1.0   
 */
public class BillRepairDetailOutput {
	//主键ID
	private Integer id;
	//账单主键ID
	private Integer billId;
	//进场主表ID
	private String prodCourseId;
	//箱ID
	private String prodContainerId;
	//箱号
	private String containerNo;
	//场站
	private String yard;
	//批复时间
	private Date replyTime;
	//是否退租 0 :正常 1退租
	private Integer isBackLease;
	//保修序列号
	private String repairNumber;
	// 用箱人
	private String containerUser;
	// 收费对象 同用箱人
	private String chargeObject;
	//收费对象id
	private Integer containerUserId;
	//报价工时
	private BigDecimal valuationHourNumber;
	//报价工时费
	private BigDecimal valuationManHourCost;
	//报价材料费
	private BigDecimal valuationMaterialCost;
	//报价总费用美金
    private BigDecimal valuationMoneyUsd;
	//报价总费用
    private BigDecimal valuationMoneyRmb;
    //批复(含税)总费用美金
    private BigDecimal replyTaxTotalCostUsa;
    //批复(含税)总费用人民币
    private BigDecimal replyTaxTotalCostRmb;
    //批复(不含税)总费用美金
    private BigDecimal replyNotaxTotalCostUsa;
    //批复(不含税)总费用人民币
    private BigDecimal replyNotaxTotalCostRmb;
    //实收（美金含税）
    private BigDecimal realTaxTotalCostUsa;
    //实收（美金不含税）
    private BigDecimal realNotaxTotalCostUsa;
    //实收（人民币含税）
    private BigDecimal realTaxTotalCostRmb;
    //实收（人民币不含税）
    private BigDecimal realNotaxTotalCostRmb;

	//折扣百分比
    private BigDecimal discountPercent;
    //临时折扣百分比
    private BigDecimal discountPercentTmp;
    //减免金额
    private BigDecimal reductionAmount;
	//汇率
    private BigDecimal realRate;
    //报价币种
    private String estCurrencyType;
	//箱类别
	private String containerCategory;
	//估价批复确认日期
	private Date valuationReplyOkTime;
	//批复工时
	private BigDecimal replyHourNumber;
	//批复工时费
	private BigDecimal replyManHourCost;
	//批复材料费
	private BigDecimal replyMaterialCost;
	//付费方
	private String payer;
	//批复费用录入人
	private Integer replyFreeUser;
	//批复费用录入时间
	private Date replyFreeTime;
	//批复费用确认人
	private Integer replyFreeOkUser;
	//批复费用确认时间
	private Date replyFreeOkTime;
	//费用类型
    private String chargeTypeKey;
	//备注
	private String remarks;
	//版本号
	private String versionNo;
	// 是否有效：0：正常；1：无效
	private String isEnabled;
	//删除标识：0：正常；1：删除
	private Integer isDel;
	//费用状态
	private String freeStatus;
	//创建时间
	private Date createTime;
	//创建人
	private Integer createUser;
	//修改时间
	private Date updateTime;
	//修改人
	private Integer updateUser;

	// 是否有效：0：正常；1：无效
	private String isEnabledNameLang;
	// 创建人
	private String createUserName;
	// 修改人
	private String updateUserName;
	//费用类型
    private String chargeTypeKeyNameLang;
	// 场站
	private String yardNameLang;
	// 用箱人修改人
	private String containerUserNameLang;
	// 箱类别修改人
	private String containerCategoryNameLang;
	// 收费对象 同用箱人
	private String chargeObjectNameLang;
	// 费用状态
	private String freeStatusNameLang;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getBillId() {
		return billId;
	}
	public void setBillId(Integer billId) {
		this.billId = billId;
	}
	public String getProdCourseId() {
		return prodCourseId;
	}
	public void setProdCourseId(String prodCourseId) {
		this.prodCourseId = prodCourseId;
	}
	public String getProdContainerId() {
		return prodContainerId;
	}
	public void setProdContainerId(String prodContainerId) {
		this.prodContainerId = prodContainerId;
	}
	public String getContainerNo() {
		return containerNo;
	}
	public void setContainerNo(String containerNo) {
		this.containerNo = containerNo;
	}
	public String getYard() {
		return yard;
	}
	public void setYard(String yard) {
		this.yard = yard;
	}
	public Date getReplyTime() {
		return replyTime;
	}
	public void setReplyTime(Date replyTime) {
		this.replyTime = replyTime;
	}
	public Integer getIsBackLease() {
		return isBackLease;
	}
	public void setIsBackLease(Integer isBackLease) {
		this.isBackLease = isBackLease;
	}
	public String getRepairNumber() {
		return repairNumber;
	}
	public void setRepairNumber(String repairNumber) {
		this.repairNumber = repairNumber;
	}
	public String getContainerUser() {
		return containerUser;
	}
	public void setContainerUser(String containerUser) {
		this.containerUser = containerUser;
	}
	public Integer getContainerUserId() {
		return containerUserId;
	}
	public void setContainerUserId(Integer containerUserId) {
		this.containerUserId = containerUserId;
	}
	public BigDecimal getValuationHourNumber() {
		return valuationHourNumber;
	}
	public void setValuationHourNumber(BigDecimal valuationHourNumber) {
		this.valuationHourNumber = valuationHourNumber;
	}
	 
	public BigDecimal getValuationManHourCost() {
		return valuationManHourCost;
	}
	public void setValuationManHourCost(BigDecimal valuationManHourCost) {
		this.valuationManHourCost = valuationManHourCost;
	}
	public BigDecimal getValuationMaterialCost() {
		return valuationMaterialCost;
	}
	public void setValuationMaterialCost(BigDecimal valuationMaterialCost) {
		this.valuationMaterialCost = valuationMaterialCost;
	}
	public void setReplyManHourCost(BigDecimal replyManHourCost) {
		this.replyManHourCost = replyManHourCost;
	}
	public void setReplyMaterialCost(BigDecimal replyMaterialCost) {
		this.replyMaterialCost = replyMaterialCost;
	}
	public BigDecimal getValuationMoneyUsd() {
		return valuationMoneyUsd;
	}
	public void setValuationMoneyUsd(BigDecimal valuationMoneyUsd) {
		this.valuationMoneyUsd = valuationMoneyUsd;
	}
	public BigDecimal getValuationMoneyRmb() {
		return valuationMoneyRmb;
	}
	public void setValuationMoneyRmb(BigDecimal valuationMoneyRmb) {
		this.valuationMoneyRmb = valuationMoneyRmb;
	}
	public BigDecimal getReplyTaxTotalCostUsa() {
		return replyTaxTotalCostUsa;
	}
	public void setReplyTaxTotalCostUsa(BigDecimal replyTaxTotalCostUsa) {
		this.replyTaxTotalCostUsa = replyTaxTotalCostUsa;
	}
	public BigDecimal getReplyTaxTotalCostRmb() {
		return replyTaxTotalCostRmb;
	}
	public void setReplyTaxTotalCostRmb(BigDecimal replyTaxTotalCostRmb) {
		this.replyTaxTotalCostRmb = replyTaxTotalCostRmb;
	}
	public BigDecimal getReplyNotaxTotalCostUsa() {
		return replyNotaxTotalCostUsa;
	}
	public void setReplyNotaxTotalCostUsa(BigDecimal replyNotaxTotalCostUsa) {
		this.replyNotaxTotalCostUsa = replyNotaxTotalCostUsa;
	}
	public BigDecimal getReplyNotaxTotalCostRmb() {
		return replyNotaxTotalCostRmb;
	}
	public void setReplyNotaxTotalCostRmb(BigDecimal replyNotaxTotalCostRmb) {
		this.replyNotaxTotalCostRmb = replyNotaxTotalCostRmb;
	}
	public BigDecimal getRealTaxTotalCostUsa() {
		return realTaxTotalCostUsa;
	}
	public void setRealTaxTotalCostUsa(BigDecimal realTaxTotalCostUsa) {
		this.realTaxTotalCostUsa = realTaxTotalCostUsa;
	}
	public BigDecimal getRealNotaxTotalCostUsa() {
		return realNotaxTotalCostUsa;
	}
	public void setRealNotaxTotalCostUsa(BigDecimal realNotaxTotalCostUsa) {
		this.realNotaxTotalCostUsa = realNotaxTotalCostUsa;
	}
	public BigDecimal getRealTaxTotalCostRmb() {
		return realTaxTotalCostRmb;
	}
	public void setRealTaxTotalCostRmb(BigDecimal realTaxTotalCostRmb) {
		this.realTaxTotalCostRmb = realTaxTotalCostRmb;
	}
	public BigDecimal getRealNotaxTotalCostRmb() {
		return realNotaxTotalCostRmb;
	}
	public void setRealNotaxTotalCostRmb(BigDecimal realNotaxTotalCostRmb) {
		this.realNotaxTotalCostRmb = realNotaxTotalCostRmb;
	}
	public BigDecimal getDiscountPercent() {
		return discountPercent;
	}
	public void setDiscountPercent(BigDecimal discountPercent) {
		this.discountPercent = discountPercent;
	}
	public BigDecimal getDiscountPercentTmp() {
		return discountPercentTmp;
	}
	public void setDiscountPercentTmp(BigDecimal discountPercentTmp) {
		this.discountPercentTmp = discountPercentTmp;
	}
	public BigDecimal getReductionAmount() {
		return reductionAmount;
	}
	public void setReductionAmount(BigDecimal reductionAmount) {
		this.reductionAmount = reductionAmount;
	}
	public BigDecimal getRealRate() {
		return realRate;
	}
	public void setRealRate(BigDecimal realRate) {
		this.realRate = realRate;
	}
	public String getEstCurrencyType() {
		return estCurrencyType;
	}
	public void setEstCurrencyType(String estCurrencyType) {
		this.estCurrencyType = estCurrencyType;
	}
	public String getContainerCategory() {
		return containerCategory;
	}
	public void setContainerCategory(String containerCategory) {
		this.containerCategory = containerCategory;
	}
	public Date getValuationReplyOkTime() {
		return valuationReplyOkTime;
	}
	public void setValuationReplyOkTime(Date valuationReplyOkTime) {
		this.valuationReplyOkTime = valuationReplyOkTime;
	}
	public BigDecimal getReplyHourNumber() {
		return replyHourNumber;
	}
	public void setReplyHourNumber(BigDecimal replyHourNumber) {
		this.replyHourNumber = replyHourNumber;
	}
	 
	public BigDecimal getReplyManHourCost() {
		return replyManHourCost;
	}
	public BigDecimal getReplyMaterialCost() {
		return replyMaterialCost;
	}
	public String getPayer() {
		return payer;
	}
	public void setPayer(String payer) {
		this.payer = payer;
	}
	public Integer getReplyFreeUser() {
		return replyFreeUser;
	}
	public void setReplyFreeUser(Integer replyFreeUser) {
		this.replyFreeUser = replyFreeUser;
	}
	public Date getReplyFreeTime() {
		return replyFreeTime;
	}
	public void setReplyFreeTime(Date replyFreeTime) {
		this.replyFreeTime = replyFreeTime;
	}
	public Integer getReplyFreeOkUser() {
		return replyFreeOkUser;
	}
	public void setReplyFreeOkUser(Integer replyFreeOkUser) {
		this.replyFreeOkUser = replyFreeOkUser;
	}
	public Date getReplyFreeOkTime() {
		return replyFreeOkTime;
	}
	public void setReplyFreeOkTime(Date replyFreeOkTime) {
		this.replyFreeOkTime = replyFreeOkTime;
	}
	public String getChargeTypeKey() {
		return chargeTypeKey;
	}
	public void setChargeTypeKey(String chargeTypeKey) {
		this.chargeTypeKey = chargeTypeKey;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getVersionNo() {
		return versionNo;
	}
	public void setVersionNo(String versionNo) {
		this.versionNo = versionNo;
	}
	public String getIsEnabled() {
		return isEnabled;
	}
	public void setIsEnabled(String isEnabled) {
		this.isEnabled = isEnabled;
	}
	public Integer getIsDel() {
		return isDel;
	}
	public void setIsDel(Integer isDel) {
		this.isDel = isDel;
	}
	public String getFreeStatus() {
		return freeStatus;
	}
	public void setFreeStatus(String freeStatus) {
		this.freeStatus = freeStatus;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Integer getCreateUser() {
		return createUser;
	}
	public void setCreateUser(Integer createUser) {
		this.createUser = createUser;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public Integer getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(Integer updateUser) {
		this.updateUser = updateUser;
	}
	public String getIsEnabledNameLang() {
		return isEnabledNameLang;
	}
	public void setIsEnabledNameLang(String isEnabledNameLang) {
		this.isEnabledNameLang = isEnabledNameLang;
	}
	public String getCreateUserName() {
		return createUserName;
	}
	public void setCreateUserName(String createUserName) {
		this.createUserName = createUserName;
	}
	public String getUpdateUserName() {
		return updateUserName;
	}
	public void setUpdateUserName(String updateUserName) {
		this.updateUserName = updateUserName;
	}
	public String getChargeTypeKeyNameLang() {
		return chargeTypeKeyNameLang;
	}
	public void setChargeTypeKeyNameLang(String chargeTypeKeyNameLang) {
		this.chargeTypeKeyNameLang = chargeTypeKeyNameLang;
	}
	public String getYardNameLang() {
		return yardNameLang;
	}
	public void setYardNameLang(String yardNameLang) {
		this.yardNameLang = yardNameLang;
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
	public String getFreeStatusNameLang() {
		return freeStatusNameLang;
	}
	public void setFreeStatusNameLang(String freeStatusNameLang) {
		this.freeStatusNameLang = freeStatusNameLang;
	}
	public String getChargeObject() {
		return chargeObject;
	}
	public void setChargeObject(String chargeObject) {
		this.chargeObject = chargeObject;
	}
	public String getChargeObjectNameLang() {
		return chargeObjectNameLang;
	}
	public void setChargeObjectNameLang(String chargeObjectNameLang) {
		this.chargeObjectNameLang = chargeObjectNameLang;
	}


	
	
	

	

	
	
}