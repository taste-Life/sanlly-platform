package com.sanlly.finance.models.output;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 	租赁 场地 账单输出类
* @Package com.sanlly.finance.models.output 
* @Description: TODO 
* @author fjy   
* @date 2019年8月28日 下午3:19:08 
* @version V1.0   
 */
public class BillLeaseOutput {
	
	 

    //所属公司
    private String companyKey;

    // 租赁 场地
    private String billType;
    
    private String yard;
    
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
	// 用箱人
	private String containerUser;
	// 收费对象 同用箱人
	private String chargeObject;
	//客户key
    private String customerName;
    //客户编号
    private String sapid;
    //合同路径
    private String contractPath;
    //合同开始日期
    private String startMonth;
    //合同结束日期
    private String endMonth;
    
    //费用类型
    private String chargeTypeKey;
    //收入支出
    private String chargeInoutType;
    //费用key
    private String chargecode;
    //核算部门
    private String deptKey;
    //模式公式
    private String formulaType;
    //天数
    private BigDecimal dayNumber;
   
    //实收币种
    private String realCurrencyType;
    //实收汇率
    private BigDecimal realRate;
    //税率
    private BigDecimal taxRate;
    //税金(美金)
    private BigDecimal taxAmountUsd;
    //税金(人民币)
    private BigDecimal taxAmountRmb;
    //实收（美金含税）
    private BigDecimal realTaxTotalCostUsd;
    //实收（美金不含税）
    private BigDecimal realNotaxTotalCostUsd;
    //实收（人民币含税）
    private BigDecimal realTaxTotalCostRmb;
    //实收（人民币不含税）
    private BigDecimal realNotaxTotalCostRmb;
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
    
    
	//创建人
    private String createUserName;
	//修改人
    private String updateUserName;
    
    //所属公司
    private String companyKeyNameLang;
    //场站
    private String yardNameLang;
    //业务分类
    private String businessCategoryNameLang;
    //业务类型
    private String businessTypeNameLang;
	// 用箱人
	private String containerUserNameLang;
	// 收费对象 同用箱人
	private String chargeObjectNameLang;
	//客户key
    private String customerNameNameLang;
    
    //类型
    private String chargeTypeKeyNameLang;
    //收入支出
    private String chargeInoutTypeNameLang;
    //核算部门
    private String deptKeyNameLang;
    //模式公式
    private String formulaTypeNameLang;
    
    //账单审核人
    private String billAuditorName;
    //账单驳回人
    private String billReturnName;
    //财务驳回人
    private String financeReturnName;
    
    
    //账单状态
    private String billStatusNameLang;
    //调账状态
    private String modifyBillStatusNameLang;
    
    //调账方式
    private String modifyBillTypeNameLang;
    
    //是否有效：0：正常；1：无效
    private String isEnabledNameLang;
    
	//是否入账，只有入账的才能冲回
	private Boolean isInBill;
    
   
    
	public String getCompanyKey() {
		return companyKey;
	}
	public void setCompanyKey(String companyKey) {
		this.companyKey = companyKey;
	}
	public String getBillType() {
		return billType;
	}
	public void setBillType(String billType) {
		this.billType = billType;
	}
	public String getYard() {
		return yard;
	}
	public void setYard(String yard) {
		this.yard = yard;
	}
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
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getSapid() {
		return sapid;
	}
	public void setSapid(String sapid) {
		this.sapid = sapid;
	}
	public String getContractPath() {
		return contractPath;
	}
	public void setContractPath(String contractPath) {
		this.contractPath = contractPath;
	}
	public String getStartMonth() {
		return startMonth;
	}
	public void setStartMonth(String startMonth) {
		this.startMonth = startMonth;
	}
	public String getEndMonth() {
		return endMonth;
	}
	public void setEndMonth(String endMonth) {
		this.endMonth = endMonth;
	}
	public String getChargeTypeKey() {
		return chargeTypeKey;
	}
	public void setChargeTypeKey(String chargeTypeKey) {
		this.chargeTypeKey = chargeTypeKey;
	}
	public String getChargeInoutType() {
		return chargeInoutType;
	}
	public void setChargeInoutType(String chargeInoutType) {
		this.chargeInoutType = chargeInoutType;
	}
	public String getChargecode() {
		return chargecode;
	}
	public void setChargecode(String chargecode) {
		this.chargecode = chargecode;
	}
	public String getDeptKey() {
		return deptKey;
	}
	public void setDeptKey(String deptKey) {
		this.deptKey = deptKey;
	}
	public String getFormulaType() {
		return formulaType;
	}
	public void setFormulaType(String formulaType) {
		this.formulaType = formulaType;
	}
	public BigDecimal getDayNumber() {
		return dayNumber;
	}
	public void setDayNumber(BigDecimal dayNumber) {
		this.dayNumber = dayNumber;
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
	public BigDecimal getRealTaxTotalCostUsd() {
		return realTaxTotalCostUsd;
	}
	public void setRealTaxTotalCostUsd(BigDecimal realTaxTotalCostUsd) {
		this.realTaxTotalCostUsd = realTaxTotalCostUsd;
	}
	public BigDecimal getRealNotaxTotalCostUsd() {
		return realNotaxTotalCostUsd;
	}
	public void setRealNotaxTotalCostUsd(BigDecimal realNotaxTotalCostUsd) {
		this.realNotaxTotalCostUsd = realNotaxTotalCostUsd;
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
	public String getContainerUserNameLang() {
		return containerUserNameLang;
	}
	public void setContainerUserNameLang(String containerUserNameLang) {
		this.containerUserNameLang = containerUserNameLang;
	}
	public String getChargeObjectNameLang() {
		return chargeObjectNameLang;
	}
	public void setChargeObjectNameLang(String chargeObjectNameLang) {
		this.chargeObjectNameLang = chargeObjectNameLang;
	}
	public String getCustomerNameNameLang() {
		return customerNameNameLang;
	}
	public void setCustomerNameNameLang(String customerNameNameLang) {
		this.customerNameNameLang = customerNameNameLang;
	}
	public String getChargeTypeKeyNameLang() {
		return chargeTypeKeyNameLang;
	}
	public void setChargeTypeKeyNameLang(String chargeTypeKeyNameLang) {
		this.chargeTypeKeyNameLang = chargeTypeKeyNameLang;
	}
	public String getChargeInoutTypeNameLang() {
		return chargeInoutTypeNameLang;
	}
	public void setChargeInoutTypeNameLang(String chargeInoutTypeNameLang) {
		this.chargeInoutTypeNameLang = chargeInoutTypeNameLang;
	}
	public String getDeptKeyNameLang() {
		return deptKeyNameLang;
	}
	public void setDeptKeyNameLang(String deptKeyNameLang) {
		this.deptKeyNameLang = deptKeyNameLang;
	}
	public String getFormulaTypeNameLang() {
		return formulaTypeNameLang;
	}
	public void setFormulaTypeNameLang(String formulaTypeNameLang) {
		this.formulaTypeNameLang = formulaTypeNameLang;
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
	public String getIsEnabledNameLang() {
		return isEnabledNameLang;
	}
	public void setIsEnabledNameLang(String isEnabledNameLang) {
		this.isEnabledNameLang = isEnabledNameLang;
	}
	public Boolean getIsInBill() {
		return isInBill;
	}
	public void setIsInBill(Boolean isInBill) {
		this.isInBill = isInBill;
	}
	 
    
    
     


	
	

    
}