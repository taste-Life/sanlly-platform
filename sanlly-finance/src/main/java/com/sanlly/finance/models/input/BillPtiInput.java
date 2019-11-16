package com.sanlly.finance.models.input;

import java.math.BigDecimal;
import java.util.Date;

/**
 * pti账单主表输出类
* @Package com.sanlly.finance.models.input 
* @Description: TODO 
* @author fjy   
* @date 2019年11月12日 上午10:39:48 
* @version V1.0   
 */
public class BillPtiInput {
	//主键ID
    private Integer billId;
    //账单编号
    private String billCode;
    //账单月份
    private String billMonth;
    //业务分类
    private String businessCategory;
    //业务类型
    private String businessType;
    //发票类型
    private String invoiceType;
	// 用箱人
	private String containerUser;
	//收支类型
    private String chargeInoutType;
    //费用编码
    private String chargecode;
    //费用key
    private String chargeTypeKey;

    //所属公司
    private String companyKey;
    
    //客户全称
    private String merchantsKey;
    //客户编号
    private String sapid;

    //箱类别key，关联箱类别表
    private String containerCategory;
    
    //实收币种
    private String realCurrencyType;
    //实收汇率
    private BigDecimal realRate;
    //税率
    private BigDecimal taxRate;
    //税金(美金)
    private BigDecimal taxAmountUsa;
    //税金(人民币)
    private BigDecimal taxAmountRbm;
    //实收（美金含税）
    private BigDecimal realTaxTotalCostUsa;
    //实收（美金不含税）
    private BigDecimal realNotaxTotalCostUsa;
    //实收（人民币含税）
    private BigDecimal realTaxTotalCostRmb;
    //实收（人民币不含税）
    private BigDecimal realNotaxTotalCostRmb;
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
    //版本号
    private String versionNo;
    //账单状态
    private String billStatus;
    //调账状态
    private String modifyBillStatus;
    //调账方式
    private String modifyBillType;
    //账单产生节点
    private String createNode;
    //是否有效：0：正常；1：无效
    private String isEnabled;
	//删除标识：0：正常；1：删除
    private Integer isDel;
	//创建时间
    private Date createTime;
	//创建人
    private Integer createUser;
	//修改时间
    private Date updateTime;
	//修改人
    private Integer updateUser;


    //区分1干箱 2冷箱 3保修 类型账单
    private Integer billType;
	
	 
    private BigDecimal totalTaxAmount;

    private BigDecimal totalNotaxAmount;

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

	public String getCompanyKey() {
		return companyKey;
	}

	public void setCompanyKey(String companyKey) {
		this.companyKey = companyKey;
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

	public String getContainerCategory() {
		return containerCategory;
	}

	public void setContainerCategory(String containerCategory) {
		this.containerCategory = containerCategory;
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

	public String getCreateNode() {
		return createNode;
	}

	public void setCreateNode(String createNode) {
		this.createNode = createNode;
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

	public Integer getBillType() {
		return billType;
	}

	public void setBillType(Integer billType) {
		this.billType = billType;
	}

	public BigDecimal getTotalTaxAmount() {
		return totalTaxAmount;
	}

	public void setTotalTaxAmount(BigDecimal totalTaxAmount) {
		this.totalTaxAmount = totalTaxAmount;
	}

	public BigDecimal getTotalNotaxAmount() {
		return totalNotaxAmount;
	}

	public void setTotalNotaxAmount(BigDecimal totalNotaxAmount) {
		this.totalNotaxAmount = totalNotaxAmount;
	}

	public String getChargeInoutType() {
		return chargeInoutType;
	}

	public void setChargeInoutType(String chargeInoutType) {
		this.chargeInoutType = chargeInoutType;
	}

	public String getInvoiceType() {
		return invoiceType;
	}

	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}
 
 
}