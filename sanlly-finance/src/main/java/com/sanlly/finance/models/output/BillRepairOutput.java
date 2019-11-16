package com.sanlly.finance.models.output;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 修理账单主 输入类
 * 
 * @Package com.sanlly.finance.models.input 
 * @Description: TODO
 * @author fjy   
 * @date 2019年8月28日 下午3:19:08 
 * @version V1.0   
 */
public class BillRepairOutput {
	// 主键ID
    private Integer billId;
	// 账单编号
	private String billCode;
	// 账单月份
	private String billMonth;
	// 业务分类
	private String businessCategory;
	// 业务类型
	private String businessType;
	// 用箱人
	private String containerUser;
	// 收费对象 同用箱人
	private String chargeObject;
    //费用编码
    private String chargecode;
    //费用key
    private String chargeTypeKey;
	// 客户全称
	private String merchantsKey;
	// 客户编号
	private String sapid;
	// 箱型key，关联箱型表
	private String containerType;
	// 箱类别key，关联箱类别表
	private String containerCategory;
	// 报价工时费
	private BigDecimal valuationManHourCost;
	// 报价材料费
	private BigDecimal valuationMaterialCost;
	// 报价总费用美金
	private BigDecimal valuationMoneyUsd;
	// 报价总费用人民币
	private BigDecimal valuationMoneyRmb;
	// 批复(含税)总费用美金
	private BigDecimal replyTaxTotalCostUsa;
	// 批复(含税)总费用人民币
	private BigDecimal replyTaxTotalCostRmb;
	// 批复(不含税)总费用美金
	private BigDecimal replyNotaxTotalCostUsa;
	// 批复(不含税)总费用人民币
	private BigDecimal replyNotaxTotalCostRmb;
	// 折扣百分比
	private BigDecimal discountPercent;
	// 临时折扣百分比
	private BigDecimal discountPercentTmp;
	// 减免金额
	private BigDecimal reductionAmount;
	// 报价币种
	private String estCurrencyType;
	// 实收币种
	private String realCurrencyType;
	// 实收汇率
	private BigDecimal realRate;
	// 税率
	private BigDecimal taxRate;
	// 税金(美金)
	private BigDecimal taxAmountUsa;
	// 税金(人民币)
	private BigDecimal taxAmountRbm;
	// 实收（美金含税）
	private BigDecimal realTaxTotalCostUsa;
	// 实收（美金不含税）
	private BigDecimal realNotaxTotalCostUsa;
	// 实收（人民币含税）
	private BigDecimal realTaxTotalCostRmb;
	// 实收（人民币不含税）
	private BigDecimal realNotaxTotalCostRmb;
	// 数量（箱量）
	private BigDecimal number;
	// 账单审核人
	private Integer billAuditor;
	// 账单审核时间
	private Date billAuditorTime;
	// 账单驳回人
	private Integer billReturn;
	// 账单驳回时间
	private Date billReturnTime;
	// 账单驳回原因
	private String billReturnReason;
	// 账单备注
	private String billRemark;
	// 财务驳回人
	private Integer financeReturn;
	// 财务驳回时间
	private Date financeReturnTime;
	// 财务驳回原因
	private String financeReturnReason;
	// 财务备注
	private String financeRemark;
	// 版本号
	private String versionNo;
	// 账单状态
	private String billStatus;
	// 调账状态
	private String modifyBillStatus;
	// 调账方式
	private String modifyBillType;

	// 是否有效：0：正常；1：无效
	private String isEnabled;
	// 账单产生节点
	private String createNode;
	// 删除标识：0：正常；1：删除
	private Integer isDel;
	// 创建时间
	private Date createTime;
	// 创建人
	private Integer createUser;
	// 修改时间
	private Date updateTime;
	// 修改人
	private Integer updateUser;

	
	
	// 是否有效：0：正常；1：无效
	private String isEnabledNameLang;
	// 创建人
	private String createUserName;
	// 修改人
	private String updateUserName;
	// 业务分类
	private String businessCategoryNameLang;
	// 业务类型
	private String businessTypeNameLang;
	// 收费对象id
	private String containerUserName;
	// 收费对象 同用箱人
	private String chargeObjectNameLang;
	// 客户全称
	private String merchantsNameLang;

	// 箱型key，关联箱型表
	private String containerTypeNameLang;
	// 箱类别key，关联箱类别表
	private String containerCategoryNameLang;

	// 账单审核人
	private String billAuditorName;

	// 账单驳回人
	private String billReturnName;
	// 财务驳回人
	private String financeReturnName;
	// 账单状态
	private String billStatusNameLang;

	// 调账状态
	private String modifyBillStatusNameLang;
	// 调账方式
	private String modifyBillTypeNameLang;
	
	
	//是否有明细  有明细前台账单无法删除
	private Boolean isDetail;
	//是否入账，只有入账的才能冲回
	private Boolean isInBill;


	
	public Integer getBillId() {
		return billId;
	}
	public void setBillId(Integer billId) {
		this.billId = billId;
	}
	public String getBillCode() {
		return billCode;
	}
	public void setBillCode(String billCode) {
		this.billCode = billCode;
	}
	public String getBillMonth() {
		return billMonth;
	}
	public void setBillMonth(String billMonth) {
		this.billMonth = billMonth;
	}
	public String getBusinessCategory() {
		return businessCategory;
	}
	public void setBusinessCategory(String businessCategory) {
		this.businessCategory = businessCategory;
	}
	public String getBusinessType() {
		return businessType;
	}
	public void setBusinessType(String businessType) {
		this.businessType = businessType;
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
	public String getMerchantsKey() {
		return merchantsKey;
	}
	public void setMerchantsKey(String merchantsKey) {
		this.merchantsKey = merchantsKey;
	}
	public String getSapid() {
		return sapid;
	}
	public void setSapid(String sapid) {
		this.sapid = sapid;
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
	public BigDecimal getRealRate() {
		return realRate;
	}
	public void setRealRate(BigDecimal realRate) {
		this.realRate = realRate;
	}
	public BigDecimal getTaxRate() {
		return taxRate;
	}
	public void setTaxRate(BigDecimal taxRate) {
		this.taxRate = taxRate;
	}
	public BigDecimal getTaxAmountUsa() {
		return taxAmountUsa;
	}
	public void setTaxAmountUsa(BigDecimal taxAmountUsa) {
		this.taxAmountUsa = taxAmountUsa;
	}
	public BigDecimal getTaxAmountRbm() {
		return taxAmountRbm;
	}
	public void setTaxAmountRbm(BigDecimal taxAmountRbm) {
		this.taxAmountRbm = taxAmountRbm;
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
	public BigDecimal getNumber() {
		return number;
	}
	public void setNumber(BigDecimal number) {
		this.number = number;
	}
	public Integer getBillAuditor() {
		return billAuditor;
	}
	public void setBillAuditor(Integer billAuditor) {
		this.billAuditor = billAuditor;
	}
	public Date getBillAuditorTime() {
		return billAuditorTime;
	}
	public void setBillAuditorTime(Date billAuditorTime) {
		this.billAuditorTime = billAuditorTime;
	}
	public Integer getBillReturn() {
		return billReturn;
	}
	public void setBillReturn(Integer billReturn) {
		this.billReturn = billReturn;
	}
	public Date getBillReturnTime() {
		return billReturnTime;
	}
	public void setBillReturnTime(Date billReturnTime) {
		this.billReturnTime = billReturnTime;
	}
	public String getBillReturnReason() {
		return billReturnReason;
	}
	public void setBillReturnReason(String billReturnReason) {
		this.billReturnReason = billReturnReason;
	}
	public String getBillRemark() {
		return billRemark;
	}
	public void setBillRemark(String billRemark) {
		this.billRemark = billRemark;
	}
	public Integer getFinanceReturn() {
		return financeReturn;
	}
	public void setFinanceReturn(Integer financeReturn) {
		this.financeReturn = financeReturn;
	}
	public Date getFinanceReturnTime() {
		return financeReturnTime;
	}
	public void setFinanceReturnTime(Date financeReturnTime) {
		this.financeReturnTime = financeReturnTime;
	}
	public String getFinanceReturnReason() {
		return financeReturnReason;
	}
	public void setFinanceReturnReason(String financeReturnReason) {
		this.financeReturnReason = financeReturnReason;
	}
	public String getFinanceRemark() {
		return financeRemark;
	}
	public void setFinanceRemark(String financeRemark) {
		this.financeRemark = financeRemark;
	}
	public String getVersionNo() {
		return versionNo;
	}
	public void setVersionNo(String versionNo) {
		this.versionNo = versionNo;
	}
	public String getBillStatus() {
		return billStatus;
	}
	public void setBillStatus(String billStatus) {
		this.billStatus = billStatus;
	}
	public String getModifyBillStatus() {
		return modifyBillStatus;
	}
	public void setModifyBillStatus(String modifyBillStatus) {
		this.modifyBillStatus = modifyBillStatus;
	}
	public String getModifyBillType() {
		return modifyBillType;
	}
	public void setModifyBillType(String modifyBillType) {
		this.modifyBillType = modifyBillType;
	}
	public String getIsEnabled() {
		return isEnabled;
	}
	public void setIsEnabled(String isEnabled) {
		this.isEnabled = isEnabled;
	}
	public String getCreateNode() {
		return createNode;
	}
	public void setCreateNode(String createNode) {
		this.createNode = createNode;
	}
	public Integer getIsDel() {
		return isDel;
	}
	public void setIsDel(Integer isDel) {
		this.isDel = isDel;
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
	public String getBusinessCategoryNameLang() {
		return businessCategoryNameLang;
	}
	public void setBusinessCategoryNameLang(String businessCategoryNameLang) {
		this.businessCategoryNameLang = businessCategoryNameLang;
	}
	public String getBusinessTypeNameLang() {
		return businessTypeNameLang;
	}
	public void setBusinessTypeNameLang(String businessTypeNameLang) {
		this.businessTypeNameLang = businessTypeNameLang;
	}
	public String getContainerUserName() {
		return containerUserName;
	}
	public void setContainerUserName(String containerUserName) {
		this.containerUserName = containerUserName;
	}
	public String getChargeObjectNameLang() {
		return chargeObjectNameLang;
	}
	public void setChargeObjectNameLang(String chargeObjectNameLang) {
		this.chargeObjectNameLang = chargeObjectNameLang;
	}
	public String getMerchantsNameLang() {
		return merchantsNameLang;
	}
	public void setMerchantsNameLang(String merchantsNameLang) {
		this.merchantsNameLang = merchantsNameLang;
	}
	public String getContainerTypeNameLang() {
		return containerTypeNameLang;
	}
	public void setContainerTypeNameLang(String containerTypeNameLang) {
		this.containerTypeNameLang = containerTypeNameLang;
	}
	public String getContainerCategoryNameLang() {
		return containerCategoryNameLang;
	}
	public void setContainerCategoryNameLang(String containerCategoryNameLang) {
		this.containerCategoryNameLang = containerCategoryNameLang;
	}
	
	public String getBillAuditorName() {
		return billAuditorName;
	}
	public void setBillAuditorName(String billAuditorName) {
		this.billAuditorName = billAuditorName;
	}
	public String getBillReturnName() {
		return billReturnName;
	}
	public void setBillReturnName(String billReturnName) {
		this.billReturnName = billReturnName;
	}
	public String getFinanceReturnName() {
		return financeReturnName;
	}
	public void setFinanceReturnName(String financeReturnName) {
		this.financeReturnName = financeReturnName;
	}
	public String getBillStatusNameLang() {
		return billStatusNameLang;
	}
	public void setBillStatusNameLang(String billStatusNameLang) {
		this.billStatusNameLang = billStatusNameLang;
	}
	public String getModifyBillStatusNameLang() {
		return modifyBillStatusNameLang;
	}
	public void setModifyBillStatusNameLang(String modifyBillStatusNameLang) {
		this.modifyBillStatusNameLang = modifyBillStatusNameLang;
	}
	public String getModifyBillTypeNameLang() {
		return modifyBillTypeNameLang;
	}
	public void setModifyBillTypeNameLang(String modifyBillTypeNameLang) {
		this.modifyBillTypeNameLang = modifyBillTypeNameLang;
	}
	public Boolean getIsDetail() {
		return isDetail;
	}
	public void setIsDetail(Boolean isDetail) {
		this.isDetail = isDetail;
	}
	public Boolean getIsInBill() {
		return isInBill;
	}
	public void setIsInBill(Boolean isInBill) {
		this.isInBill = isInBill;
	}
	public String getChargecode() {
		return chargecode;
	}
	public void setChargecode(String chargecode) {
		this.chargecode = chargecode;
	}
	public String getChargeTypeKey() {
		return chargeTypeKey;
	}
	public void setChargeTypeKey(String chargeTypeKey) {
		this.chargeTypeKey = chargeTypeKey;
	}



	
	

}