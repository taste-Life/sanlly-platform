package com.sanlly.finance.models.output;

import java.math.BigDecimal;
import java.util.Date;

public class BillGiveRepairOutput {
	
	//主键ID
    private Integer billId;
    //账单编号
    private String billCode;
    //账单月份
    private String billMonth;

    
    private String merchantsKey;

    private String sapid;
    //公司
    private String companyKey;
    //场站
    private String yard;
    //费用编码
    private String chargecode;
    //费用key
    private String chargeTypeKey;
    
    //实收币种 0：RMB 1：美金
    private String realCurrencyType;
    //税率
    private BigDecimal taxRate;
    //税金人民币
    private BigDecimal taxAmountRmb;
    //税金 美金
    private BigDecimal taxAmountUsd;
    //汇率
    private BigDecimal realRate;
     
    //数量（箱量）
    private BigDecimal number;
    //账单审核人
    private Integer billAuditor;
    //账单审核时间
    private Date billAuditorTime;
    //账单驳回人
    private Integer billReturn;
    //账单驳回时间
    private Date billReturnTime;
    //账单驳回原因
    private String billReturnReason;
    //账单备注
    private String billRemark;
    //财务驳回人
    private Integer financeReturn;
    //财务驳回时间
    private Date financeReturnTime;
    //财务驳回原因
    private String financeReturnReason;
    //财务备注
    private String financeRemark;
    //账单产生节点
    private String createNode;
    //版本号（默认0）调账节点产生（全额调账、全额冲回）--对应应付款中的编号 exl1000T01
    private String versionNo;
    //账单状态 1、已生成 2待审核 3已审核 4已驳回 5财务驳回
    private String billStatus;
    //调账方式 1差额调账 2全额调账
    private String modifyBillStatus;
    //调账方式 1差额调账 2全额调账
    private String modifyBillType;
	// 是否有效
	private String isEnabled;
	// 是否删除
	private Integer isDel;
	// 创建时间
	private Date createTime;
	// 创建人
	private Integer createUser;
	// 修改时间
	private Date updateTime;
	// 修改人
	private Integer updateUser;
	
	

	//业务大类
    private String businessCategory;
    //业务分类
    private String businessType;

    //收费对象
    private String chargeObject;
    //收入
    private BigDecimal repairIncome;
    //成本
    private BigDecimal repairCost;
    //利润
    private BigDecimal repairProfit;

    //实收（美金含税）
    private BigDecimal realTaxTotalCostUsa;
    //实收（美金不含税）
    private BigDecimal realNotaxTotalCostUsa;
    //实收（人民币含税）
    private BigDecimal realTaxTotalCostRmb;
    //实收（人民币不含税）
    private BigDecimal realNotaxTotalCostRmb;
    //出库单主表id
    private Integer deliverId;
    
    //公司
    private String companyKeyNameLang;
    //场站
    private String yardNameLang;
    
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

	// 客户全称
	private String merchantsNameLang;

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
	public String getCompanyKey() {
		return companyKey;
	}
	public void setCompanyKey(String companyKey) {
		this.companyKey = companyKey;
	}
	public String getYard() {
		return yard;
	}
	public void setYard(String yard) {
		this.yard = yard;
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
	public String getRealCurrencyType() {
		return realCurrencyType;
	}
	public void setRealCurrencyType(String realCurrencyType) {
		this.realCurrencyType = realCurrencyType;
	}
	public BigDecimal getTaxRate() {
		return taxRate;
	}
	public void setTaxRate(BigDecimal taxRate) {
		this.taxRate = taxRate;
	}
	public BigDecimal getTaxAmountRmb() {
		return taxAmountRmb;
	}
	public void setTaxAmountRmb(BigDecimal taxAmountRmb) {
		this.taxAmountRmb = taxAmountRmb;
	}
	public BigDecimal getTaxAmountUsd() {
		return taxAmountUsd;
	}
	public void setTaxAmountUsd(BigDecimal taxAmountUsd) {
		this.taxAmountUsd = taxAmountUsd;
	}
	public BigDecimal getRealRate() {
		return realRate;
	}
	public void setRealRate(BigDecimal realRate) {
		this.realRate = realRate;
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
	public String getCreateNode() {
		return createNode;
	}
	public void setCreateNode(String createNode) {
		this.createNode = createNode;
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
	public String getChargeObject() {
		return chargeObject;
	}
	public void setChargeObject(String chargeObject) {
		this.chargeObject = chargeObject;
	}
	public BigDecimal getRepairIncome() {
		return repairIncome;
	}
	public void setRepairIncome(BigDecimal repairIncome) {
		this.repairIncome = repairIncome;
	}
	public BigDecimal getRepairCost() {
		return repairCost;
	}
	public void setRepairCost(BigDecimal repairCost) {
		this.repairCost = repairCost;
	}
	public BigDecimal getRepairProfit() {
		return repairProfit;
	}
	public void setRepairProfit(BigDecimal repairProfit) {
		this.repairProfit = repairProfit;
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
	public Integer getDeliverId() {
		return deliverId;
	}
	public void setDeliverId(Integer deliverId) {
		this.deliverId = deliverId;
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
	public String getMerchantsNameLang() {
		return merchantsNameLang;
	}
	public void setMerchantsNameLang(String merchantsNameLang) {
		this.merchantsNameLang = merchantsNameLang;
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
	public String getCompanyKeyNameLang() {
		return companyKeyNameLang;
	}
	public void setCompanyKeyNameLang(String companyKeyNameLang) {
		this.companyKeyNameLang = companyKeyNameLang;
	}
	public String getYardNameLang() {
		return yardNameLang;
	}
	public void setYardNameLang(String yardNameLang) {
		this.yardNameLang = yardNameLang;
	}

    


}