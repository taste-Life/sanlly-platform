package com.sanlly.finance.models.output;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 商务结算明细输出实体类
 * 
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author fjy
 * @date 2019年8月9日
 *
 */
public class BusinessDetailOutput {
	

	//明细主键
	private Integer businessDetaillId;
	//主键ID
    private Integer businessId;
	//进场主表ID
    private String prodCourseId;
	//账单编号
    private String billCode;
	//费用类型
    private String chargeTypeKey;
	//客户全称
    private String merchantsKey;
	//客户编号
    private String sapid;
	//币种
    private String currencyType;
	//汇率
    private BigDecimal exchangeRate;
	//税率
    private BigDecimal taxRate;
	//税额
    private BigDecimal taxAmount;
	//人民币金额
    private BigDecimal amountRmb;
	//美金金额
    private BigDecimal amountUsd;
	//发票类型
    private String invoiceType;
	//备注
    private String remarks;
	//核算部门
    private String deptKey;
	//部门代码
    private String deptCode;
	//版本号
    private String versionNo;
	//公司
    private String companyKey;
	//场站
    private String yard;
	//收支类型
    private String chargeInoutType;
	//接口类别
    private String interfaceType;
	//单据类型
    private String legacyDocType;
	//所属月份
    private String billMonth;
	//收支对象
    private String containerUser;
	//源数据表
    private String sourceTable;
	//源账单号
    private String sourceBillCode;
	//源账单Id
    private Integer sourceBillId;
	//净额
    private BigDecimal netAmount;
	//账单审核人
    private Integer billAuditor;
	//账单审核日期
    private Date billAuditorTime;
	//物料编码
    private String materialCode;
	//物料名称
    private String materialName;
	//物料单价
    private BigDecimal materialPrice;
	//数量
    private BigDecimal number;
	//入账时间
    private Date inBillTime;
	//入账人
    private Integer inBillUser;
	//制单人
    private Integer createBillUser;
	//入账状态
    private String freeStatus;
	//
    private Date createTime;
	//
    private Integer createUser;
	
	
	
	// 客户名称
	private String merchantsNameLang;
	// 费用类型
	private String chargeTypeNameLang;
	//发票类型
    private String invoiceTypeNameLang;
	// 核算部门
	private String deptKeyNameLang;
	//公司
    private String companyKeyNameLang;
	//场站
    private String yardNameLang;
	
	//收支类型
    private String chargeInoutTypeNameLang;
	//接口类别
    private String interfaceTypeNameLang;
	//单据类型
    private String legacyDocTypeNameLang;
	 
	//收支对象
    private String containerUserNameLang;
	//账单审核人
    private String billAuditorName;
	//入账人
    private String inBillUserName;
	// 制单人
	private String createBillUserName;
	// 费用状态
	private String freeStatusNameLang;
	// 创建人
	private String createUserName;
	public Integer getBusinessDetaillId() {
		return businessDetaillId;
	}
	public void setBusinessDetaillId(Integer businessDetaillId) {
		this.businessDetaillId = businessDetaillId;
	}
	public Integer getBusinessId() {
		return businessId;
	}
	public void setBusinessId(Integer businessId) {
		this.businessId = businessId;
	}
	public String getProdCourseId() {
		return prodCourseId;
	}
	public void setProdCourseId(String prodCourseId) {
		this.prodCourseId = prodCourseId;
	}
	public String getBillCode() {
		return billCode;
	}
	public void setBillCode(String billCode) {
		this.billCode = billCode;
	}
	public String getChargeTypeKey() {
		return chargeTypeKey;
	}
	public void setChargeTypeKey(String chargeTypeKey) {
		this.chargeTypeKey = chargeTypeKey;
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
	public BigDecimal getTaxRate() {
		return taxRate;
	}
	public void setTaxRate(BigDecimal taxRate) {
		this.taxRate = taxRate;
	}
	public BigDecimal getTaxAmount() {
		return taxAmount;
	}
	public void setTaxAmount(BigDecimal taxAmount) {
		this.taxAmount = taxAmount;
	}
	public BigDecimal getAmountRmb() {
		return amountRmb;
	}
	public void setAmountRmb(BigDecimal amountRmb) {
		this.amountRmb = amountRmb;
	}
	public BigDecimal getAmountUsd() {
		return amountUsd;
	}
	public void setAmountUsd(BigDecimal amountUsd) {
		this.amountUsd = amountUsd;
	}
	public String getInvoiceType() {
		return invoiceType;
	}
	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getDeptKey() {
		return deptKey;
	}
	public void setDeptKey(String deptKey) {
		this.deptKey = deptKey;
	}
	public String getDeptCode() {
		return deptCode;
	}
	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}
	public String getVersionNo() {
		return versionNo;
	}
	public void setVersionNo(String versionNo) {
		this.versionNo = versionNo;
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
	public String getChargeInoutType() {
		return chargeInoutType;
	}
	public void setChargeInoutType(String chargeInoutType) {
		this.chargeInoutType = chargeInoutType;
	}
	public String getInterfaceType() {
		return interfaceType;
	}
	public void setInterfaceType(String interfaceType) {
		this.interfaceType = interfaceType;
	}
	public String getLegacyDocType() {
		return legacyDocType;
	}
	public void setLegacyDocType(String legacyDocType) {
		this.legacyDocType = legacyDocType;
	}
	public String getBillMonth() {
		return billMonth;
	}
	public void setBillMonth(String billMonth) {
		this.billMonth = billMonth;
	}
	public String getContainerUser() {
		return containerUser;
	}
	public void setContainerUser(String containerUser) {
		this.containerUser = containerUser;
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
	public BigDecimal getNetAmount() {
		return netAmount;
	}
	public void setNetAmount(BigDecimal netAmount) {
		this.netAmount = netAmount;
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
	public String getMaterialCode() {
		return materialCode;
	}
	public void setMaterialCode(String materialCode) {
		this.materialCode = materialCode;
	}
	public String getMaterialName() {
		return materialName;
	}
	public void setMaterialName(String materialName) {
		this.materialName = materialName;
	}
	public BigDecimal getMaterialPrice() {
		return materialPrice;
	}
	public void setMaterialPrice(BigDecimal materialPrice) {
		this.materialPrice = materialPrice;
	}
	public BigDecimal getNumber() {
		return number;
	}
	public void setNumber(BigDecimal number) {
		this.number = number;
	}
	public Date getInBillTime() {
		return inBillTime;
	}
	public void setInBillTime(Date inBillTime) {
		this.inBillTime = inBillTime;
	}
	public Integer getInBillUser() {
		return inBillUser;
	}
	public void setInBillUser(Integer inBillUser) {
		this.inBillUser = inBillUser;
	}
	public Integer getCreateBillUser() {
		return createBillUser;
	}
	public void setCreateBillUser(Integer createBillUser) {
		this.createBillUser = createBillUser;
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
	public String getMerchantsNameLang() {
		return merchantsNameLang;
	}
	public void setMerchantsNameLang(String merchantsNameLang) {
		this.merchantsNameLang = merchantsNameLang;
	}
	public String getChargeTypeNameLang() {
		return chargeTypeNameLang;
	}
	public void setChargeTypeNameLang(String chargeTypeNameLang) {
		this.chargeTypeNameLang = chargeTypeNameLang;
	}
	public String getInvoiceTypeNameLang() {
		return invoiceTypeNameLang;
	}
	public void setInvoiceTypeNameLang(String invoiceTypeNameLang) {
		this.invoiceTypeNameLang = invoiceTypeNameLang;
	}

	public String getDeptKeyNameLang() {
		return deptKeyNameLang;
	}
	public void setDeptKeyNameLang(String deptKeyNameLang) {
		this.deptKeyNameLang = deptKeyNameLang;
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
	public String getChargeInoutTypeNameLang() {
		return chargeInoutTypeNameLang;
	}
	public void setChargeInoutTypeNameLang(String chargeInoutTypeNameLang) {
		this.chargeInoutTypeNameLang = chargeInoutTypeNameLang;
	}
	public String getInterfaceTypeNameLang() {
		return interfaceTypeNameLang;
	}
	public void setInterfaceTypeNameLang(String interfaceTypeNameLang) {
		this.interfaceTypeNameLang = interfaceTypeNameLang;
	}
	public String getLegacyDocTypeNameLang() {
		return legacyDocTypeNameLang;
	}
	public void setLegacyDocTypeNameLang(String legacyDocTypeNameLang) {
		this.legacyDocTypeNameLang = legacyDocTypeNameLang;
	}
	public String getContainerUserNameLang() {
		return containerUserNameLang;
	}
	public void setContainerUserNameLang(String containerUserNameLang) {
		this.containerUserNameLang = containerUserNameLang;
	}
	public String getBillAuditorName() {
		return billAuditorName;
	}
	public void setBillAuditorName(String billAuditorName) {
		this.billAuditorName = billAuditorName;
	}
	public String getCreateBillUserName() {
		return createBillUserName;
	}
	public void setCreateBillUserName(String createBillUserName) {
		this.createBillUserName = createBillUserName;
	}
	public String getFreeStatusNameLang() {
		return freeStatusNameLang;
	}
	public void setFreeStatusNameLang(String freeStatusNameLang) {
		this.freeStatusNameLang = freeStatusNameLang;
	}
	public String getCreateUserName() {
		return createUserName;
	}
	public void setCreateUserName(String createUserName) {
		this.createUserName = createUserName;
	}
	public String getInBillUserName() {
		return inBillUserName;
	}
	public void setInBillUserName(String inBillUserName) {
		this.inBillUserName = inBillUserName;
	}


	
	

}
