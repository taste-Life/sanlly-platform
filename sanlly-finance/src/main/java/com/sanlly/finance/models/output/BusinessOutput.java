package com.sanlly.finance.models.output;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 商务结算主表输出实体类
 * 
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author fjy
 * @date 2019年8月9日
 *
 */
public class BusinessOutput {

   	//id
    private Integer id;
	//账单号
    private String billCode;
    //账单月份
    private String billMonth;
	// 账单类型
	private String billType;
    //收费对象
    private String containerUser;
	// 客户名称
	private String merchantsKey;
	// sapid
	private String sapid;
	// 币种
	private String currencyType;
	// 汇率
	private BigDecimal exchangeRate;
	// 金额 美金 含税
	private BigDecimal taxTotalCostUsd;
	// 金额 美金 不含税
	private BigDecimal notaxTotalCostUsd;
	// 金额 人民币 含税
	private BigDecimal taxTotalCostRmb;
	// 金额 人民币 不含税
	private BigDecimal notaxTotalCostRmb;
	// 税率
	private BigDecimal taxRate;
	// 税金 美金
	private BigDecimal taxAmountUsd;
	// 税金 人民币
	private BigDecimal taxAmountRmb;
	// 备注
	private String remark;
	// 原账单表
	private String sourceTable;
	// 原账单编号
	private String sourceBillCode;
	// 原账单id
	private Integer sourceBillId;
    //版本号
    private String versionNo;
    //收支类型
    private String chargeInoutType;
    //制单人
    private Integer createBillUser;
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

	// 账单类型
	private String billTypeNameLang;
	// 客户名称
	private String merchantsNameLang;
    //收费对象
    private String containerUserNameLang;
	// 入账人
	private String inBillUserName;
	// 是否有效
	private String isEnabledNameLang;
	// 创建人
	private String createUserName;
	// 修改人
	private String updateUserName;
	
    //收支类型
    private String chargeInoutTypeNameLang;

	// 发票到期提醒
	private Boolean isOverdue = false;
	// 是否改变背景色 同发票到期提醒属性值同步
	private Boolean isChangeBg = false;
	//是否有入账的明细
	private Boolean isInBill = false;
	 
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public String getBillType() {
		return billType;
	}
	public void setBillType(String billType) {
		this.billType = billType;
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
	public String getCurrencyType() {
		return currencyType;
	}
	public void setCurrencyType(String currencyType) {
		this.currencyType = currencyType;
	}
	public BigDecimal getExchangeRate() {
		return exchangeRate;
	}
	public void setExchangeRate(BigDecimal exchangeRate) {
		this.exchangeRate = exchangeRate;
	}
	public BigDecimal getTaxTotalCostUsd() {
		return taxTotalCostUsd;
	}
	public void setTaxTotalCostUsd(BigDecimal taxTotalCostUsd) {
		this.taxTotalCostUsd = taxTotalCostUsd;
	}
	public BigDecimal getNotaxTotalCostUsd() {
		return notaxTotalCostUsd;
	}
	public void setNotaxTotalCostUsd(BigDecimal notaxTotalCostUsd) {
		this.notaxTotalCostUsd = notaxTotalCostUsd;
	}
	public BigDecimal getTaxTotalCostRmb() {
		return taxTotalCostRmb;
	}
	public void setTaxTotalCostRmb(BigDecimal taxTotalCostRmb) {
		this.taxTotalCostRmb = taxTotalCostRmb;
	}
	public BigDecimal getNotaxTotalCostRmb() {
		return notaxTotalCostRmb;
	}
	public void setNotaxTotalCostRmb(BigDecimal notaxTotalCostRmb) {
		this.notaxTotalCostRmb = notaxTotalCostRmb;
	}
	public BigDecimal getTaxRate() {
		return taxRate;
	}
	public void setTaxRate(BigDecimal taxRate) {
		this.taxRate = taxRate;
	}
	public BigDecimal getTaxAmountUsd() {
		return taxAmountUsd;
	}
	public void setTaxAmountUsd(BigDecimal taxAmountUsd) {
		this.taxAmountUsd = taxAmountUsd;
	}
	public BigDecimal getTaxAmountRmb() {
		return taxAmountRmb;
	}
	public void setTaxAmountRmb(BigDecimal taxAmountRmb) {
		this.taxAmountRmb = taxAmountRmb;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getSourceTable() {
		return sourceTable;
	}
	public void setSourceTable(String sourceTable) {
		this.sourceTable = sourceTable;
	}
	public String getSourceBillCode() {
		return sourceBillCode;
	}
	public void setSourceBillCode(String sourceBillCode) {
		this.sourceBillCode = sourceBillCode;
	}
	public Integer getSourceBillId() {
		return sourceBillId;
	}
	public void setSourceBillId(Integer sourceBillId) {
		this.sourceBillId = sourceBillId;
	}
	public String getVersionNo() {
		return versionNo;
	}
	public void setVersionNo(String versionNo) {
		this.versionNo = versionNo;
	}
	public String getChargeInoutType() {
		return chargeInoutType;
	}
	public void setChargeInoutType(String chargeInoutType) {
		this.chargeInoutType = chargeInoutType;
	}
	public Integer getCreateBillUser() {
		return createBillUser;
	}
	public void setCreateBillUser(Integer createBillUser) {
		this.createBillUser = createBillUser;
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
	public String getBillTypeNameLang() {
		return billTypeNameLang;
	}
	public void setBillTypeNameLang(String billTypeNameLang) {
		this.billTypeNameLang = billTypeNameLang;
	}
	public String getMerchantsNameLang() {
		return merchantsNameLang;
	}
	public void setMerchantsNameLang(String merchantsNameLang) {
		this.merchantsNameLang = merchantsNameLang;
	}
	public String getInBillUserName() {
		return inBillUserName;
	}
	public void setInBillUserName(String inBillUserName) {
		this.inBillUserName = inBillUserName;
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
	public Boolean getIsOverdue() {
		return isOverdue;
	}
	public void setIsOverdue(Boolean isOverdue) {
		this.isOverdue = isOverdue;
	}
	public Boolean getIsChangeBg() {
		return isChangeBg;
	}
	public void setIsChangeBg(Boolean isChangeBg) {
		this.isChangeBg = isChangeBg;
	}
	public String getContainerUser() {
		return containerUser;
	}
	public void setContainerUser(String containerUser) {
		this.containerUser = containerUser;
	}
	public String getContainerUserNameLang() {
		return containerUserNameLang;
	}
	public void setContainerUserNameLang(String containerUserNameLang) {
		this.containerUserNameLang = containerUserNameLang;
	}
	public Boolean getIsInBill() {
		return isInBill;
	}
	public void setIsInBill(Boolean isInBill) {
		this.isInBill = isInBill;
	}
	public String getChargeInoutTypeNameLang() {
		return chargeInoutTypeNameLang;
	}
	public void setChargeInoutTypeNameLang(String chargeInoutTypeNameLang) {
		this.chargeInoutTypeNameLang = chargeInoutTypeNameLang;
	}


	


	
	

}
