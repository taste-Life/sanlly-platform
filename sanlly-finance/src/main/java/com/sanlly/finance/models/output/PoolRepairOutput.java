package com.sanlly.finance.models.output;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 修理费用池（冷箱、干箱、保修）
* @Package com.sanlly.finance.models.output 
* @Description: TODO 
* @author fjy   
* @date 2019年8月26日 下午3:50:27 
* @version V1.0   
 */
public class PoolRepairOutput {
	//id
    private Integer id;
	//进场主表ID
    private String prodCourseId;
	//箱ID
    private String prodContainerId;
	//箱号
    private String containerNo;
	//进场场站key，关联场站表
    private String yard;
	//进场场站key，关联场站表
    private String yardNameLang;
	//批复时间
    private Date replyTime;
	//是否退租  LECOMMONOO001  是  LECOMMONOO002 否
    private String isBackLease;
    
	//是否退租
    private String isBackLeaseNameLang;
    
	//保修序列号
    private String repairNumber;
	//用箱人key，关联用箱人表
    private String containerUser;
	// 收费对象 同用箱人
	private String chargeObject;
	//干冷箱，0：干箱，1：冷箱，2：保修
    private String containerType;
    //箱类别
    private String containerCategory;
    //报价工时
    private BigDecimal valuationHourNumber;
    //报价工时费
    private BigDecimal valuationManHourCost;
    //报价材料费
    private BigDecimal valuationMaterialCost;
    //报价总费用美金
    private BigDecimal valuationMoneyUsd;
    //报价总费用人民币
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
    //汇率
    private BigDecimal realRate;
    //折扣百分比
    private BigDecimal discountPercent;
    //临时折扣百分比
    private BigDecimal discountPercentTmp;
    //减免金额
    private BigDecimal reductionAmount;
    //报价币种 0：RMB 1：美金
    private String estCurrencyType;
    //实收币种
    private String realCurrencyType;

	//付费方
    private String payer;
	//批复费用录入人
    private String replyFreeUser;
	//批复费用录入时间
    private Date replyFreeTime;
	//批复费用确认人
    private String replyFreeOkUser;
	//批复费用确认时间
    private Date replyFreeOkTime;
	//核算部门
    private String deptKey;
	//核算部门
    private String deptKeyNameLang;
	//部门代码
    private String deptCode;
	//费用类型
    private String chargeTypeKey;
	//费用类型
    private String chargeTypeIdNameLang;
	//费用状态
    private String freeStatus;
	//费用状态
    private String freeStatusNameLang;
	//行状态 0 未加入：1 已加入
    private Integer itemStatus;
	//备注
    private String remarks;
    //无法收费原因
    private String noCostDesc;
	//是否有效：0：正常；1：无效
    private String isEnabled;
	//是否有效：0：正常；1：无效
    private String isEnabledNameLang;
	//删除标识：0：正常；1：删除
    private Integer isDel;
    //费用池类型
    private Integer poolType;
	//创建时间
    private Date createTime;
	//创建人
    private Integer createUser;
	//创建人
    private String createUserName;
	//修改时间
    private Date updateTime;
	//修改人
    private Integer updateUser;
	//修改人
    private String updateUserName;
    //箱类别
    private String containerCategoryNameLang;
    
	//费用类型
    private String chargeTypeKeyNameLang;
    
	// 用箱人修改人
	private String containerUserNameLang;
	
	// 收费对象 同用箱人
	private String chargeObjectNameLang;
	
	//批复费用录入人
    private String replyFreeUserName;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getYardNameLang() {
		return yardNameLang;
	}

	public void setYardNameLang(String yardNameLang) {
		this.yardNameLang = yardNameLang;
	}

	public Date getReplyTime() {
		return replyTime;
	}

	public void setReplyTime(Date replyTime) {
		this.replyTime = replyTime;
	}

	public String getIsBackLease() {
		return isBackLease;
	}

	public void setIsBackLease(String isBackLease) {
		this.isBackLease = isBackLease;
	}

	public String getIsBackLeaseNameLang() {
		return isBackLeaseNameLang;
	}

	public void setIsBackLeaseNameLang(String isBackLeaseNameLang) {
		this.isBackLeaseNameLang = isBackLeaseNameLang;
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

	 

	public String getChargeObject() {
		return chargeObject;
	}

	public void setChargeObject(String chargeObject) {
		this.chargeObject = chargeObject;
	}

	public String getContainerType() {
		return containerType;
	}

	public void setContainerType(String containerType) {
		this.containerType = containerType;
	}

	public String getContainerCategory() {
		return containerCategory;
	}

	public void setContainerCategory(String containerCategory) {
		this.containerCategory = containerCategory;
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

	public BigDecimal getRealRate() {
		return realRate;
	}

	public void setRealRate(BigDecimal realRate) {
		this.realRate = realRate;
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

	public String getEstCurrencyType() {
		return estCurrencyType;
	}

	public void setEstCurrencyType(String estCurrencyType) {
		this.estCurrencyType = estCurrencyType;
	}

	public String getRealCurrencyType() {
		return realCurrencyType;
	}

	public void setRealCurrencyType(String realCurrencyType) {
		this.realCurrencyType = realCurrencyType;
	}

	public String getPayer() {
		return payer;
	}

	public void setPayer(String payer) {
		this.payer = payer;
	}

	public String getReplyFreeUser() {
		return replyFreeUser;
	}

	public void setReplyFreeUser(String replyFreeUser) {
		this.replyFreeUser = replyFreeUser;
	}

	public Date getReplyFreeTime() {
		return replyFreeTime;
	}

	public void setReplyFreeTime(Date replyFreeTime) {
		this.replyFreeTime = replyFreeTime;
	}

	public String getReplyFreeOkUser() {
		return replyFreeOkUser;
	}

	public void setReplyFreeOkUser(String replyFreeOkUser) {
		this.replyFreeOkUser = replyFreeOkUser;
	}

	public Date getReplyFreeOkTime() {
		return replyFreeOkTime;
	}

	public void setReplyFreeOkTime(Date replyFreeOkTime) {
		this.replyFreeOkTime = replyFreeOkTime;
	}

	public String getDeptKey() {
		return deptKey;
	}

	public void setDeptKey(String deptKey) {
		this.deptKey = deptKey;
	}

	public String getDeptKeyNameLang() {
		return deptKeyNameLang;
	}

	public void setDeptKeyNameLang(String deptKeyNameLang) {
		this.deptKeyNameLang = deptKeyNameLang;
	}

	public String getDeptCode() {
		return deptCode;
	}

	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}

	public String getChargeTypeKey() {
		return chargeTypeKey;
	}

	public void setChargeTypeKey(String chargeTypeKey) {
		this.chargeTypeKey = chargeTypeKey;
	}

	public String getChargeTypeIdNameLang() {
		return chargeTypeIdNameLang;
	}

	public void setChargeTypeIdNameLang(String chargeTypeIdNameLang) {
		this.chargeTypeIdNameLang = chargeTypeIdNameLang;
	}

	public String getFreeStatus() {
		return freeStatus;
	}

	public void setFreeStatus(String freeStatus) {
		this.freeStatus = freeStatus;
	}

	public String getFreeStatusNameLang() {
		return freeStatusNameLang;
	}

	public void setFreeStatusNameLang(String freeStatusNameLang) {
		this.freeStatusNameLang = freeStatusNameLang;
	}

	public Integer getItemStatus() {
		return itemStatus;
	}

	public void setItemStatus(Integer itemStatus) {
		this.itemStatus = itemStatus;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getNoCostDesc() {
		return noCostDesc;
	}

	public void setNoCostDesc(String noCostDesc) {
		this.noCostDesc = noCostDesc;
	}

	public String getIsEnabled() {
		return isEnabled;
	}

	public void setIsEnabled(String isEnabled) {
		this.isEnabled = isEnabled;
	}

	public String getIsEnabledNameLang() {
		return isEnabledNameLang;
	}

	public void setIsEnabledNameLang(String isEnabledNameLang) {
		this.isEnabledNameLang = isEnabledNameLang;
	}

	public Integer getIsDel() {
		return isDel;
	}

	public void setIsDel(Integer isDel) {
		this.isDel = isDel;
	}

	public Integer getPoolType() {
		return poolType;
	}

	public void setPoolType(Integer poolType) {
		this.poolType = poolType;
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

	public String getCreateUserName() {
		return createUserName;
	}

	public void setCreateUserName(String createUserName) {
		this.createUserName = createUserName;
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

	public String getUpdateUserName() {
		return updateUserName;
	}

	public void setUpdateUserName(String updateUserName) {
		this.updateUserName = updateUserName;
	}

	public String getContainerCategoryNameLang() {
		return containerCategoryNameLang;
	}

	public void setContainerCategoryNameLang(String containerCategoryNameLang) {
		this.containerCategoryNameLang = containerCategoryNameLang;
	}

	public String getChargeTypeKeyNameLang() {
		return chargeTypeKeyNameLang;
	}

	public void setChargeTypeKeyNameLang(String chargeTypeKeyNameLang) {
		this.chargeTypeKeyNameLang = chargeTypeKeyNameLang;
	}

	public String getContainerUserNameLang() {
		return containerUserNameLang;
	}

	public void setContainerUserNameLang(String containerUserNameLang) {
		this.containerUserNameLang = containerUserNameLang;
	}

	public String getReplyFreeUserName() {
		return replyFreeUserName;
	}

	public void setReplyFreeUserName(String replyFreeUserName) {
		this.replyFreeUserName = replyFreeUserName;
	}

	public String getChargeObjectNameLang() {
		return chargeObjectNameLang;
	}

	public void setChargeObjectNameLang(String chargeObjectNameLang) {
		this.chargeObjectNameLang = chargeObjectNameLang;
	}

	public BigDecimal getValuationHourNumber() {
		return valuationHourNumber;
	}

	public void setValuationHourNumber(BigDecimal valuationHourNumber) {
		this.valuationHourNumber = valuationHourNumber;
	}

 

	

    
    

	
}