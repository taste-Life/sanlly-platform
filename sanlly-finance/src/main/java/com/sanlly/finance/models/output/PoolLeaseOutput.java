package com.sanlly.finance.models.output;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 租赁费用池（租赁、场地费）
 * 
 * @Package com.sanlly.finance.models.output 
 * @Description: TODO
 * @author fjy   
 * @date 2019年8月26日 下午3:49:45 
 * @version V1.0   
 */
public class PoolLeaseOutput {
	//主键ID
    private Integer id;
    
    //公司
    private String companyKey;
    //场站
    private String yard;

	// 用箱人
	private String containerUser;
	// 收费对象 同用箱人
	private String chargeObject;
	
	
	//客户全称
    private String customerName;
	//客户编号
    private String sapid;
	//合同文件路径
    private String contractPath;
	//合同开始月份
    private String startMonth;
	//合同停止月份
    private String endMonth;
	//费用类型
    private String chargeTypeKey;
	//收支类型
    private String chargeInoutType;
	//费用编码
    private String chargecode;
	//核算部门
    private String deptKey;
	//模式公式类型
    private String formulaType;
	//金额 费率
    private BigDecimal amount;
    //实收币种
    private String realCurrencyType;
	
	//是否有效：0：正常；1：无效
    private String isEnabled;
	//费用状态
    private String freeStatus;
 
	//备注
    private String remarks;
    
 

	//创建时间
    private Date createTime;
	//创建人
    private Integer createUser;
	//修改时间
    private Date updateTime;
    
    private Integer updateUser;

	// 费用类型
	private String chargeTypeIdNameLang;

	// 核算部门
	private String deptKeyNameLang;

	// 是否退租
	private String isBackLeaseNameLang;
	
	//客户全称
    private String customerNameNameLang;

	// 进场场站key，关联场站表
	private String yardNameLang;

	// 费用状态
	private String freeStatusNameLang;

	// 是否有效：0：正常；1：无效
	private String isEnabledNameLang;

	// 创建人
	private String createUserName;

	// 修改人
	private String updateUserName;
	
	
	// 用箱人
	private String containerUserNameLang;
	// 收费对象 同用箱人
	private String chargeObjectNameLang;
	
	//模式公式类型
    private String formulaTypeNameLang;
    
	//收支类型
    private String chargeInoutTypeNameLang;
    
    //公司
    private String companyKeyNameLang;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getRealCurrencyType() {
		return realCurrencyType;
	}

	public void setRealCurrencyType(String realCurrencyType) {
		this.realCurrencyType = realCurrencyType;
	}

	public String getIsEnabled() {
		return isEnabled;
	}

	public void setIsEnabled(String isEnabled) {
		this.isEnabled = isEnabled;
	}

	public String getFreeStatus() {
		return freeStatus;
	}

	public void setFreeStatus(String freeStatus) {
		this.freeStatus = freeStatus;
	}

 

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
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

	public String getChargeTypeIdNameLang() {
		return chargeTypeIdNameLang;
	}

	public void setChargeTypeIdNameLang(String chargeTypeIdNameLang) {
		this.chargeTypeIdNameLang = chargeTypeIdNameLang;
	}

	public String getDeptKeyNameLang() {
		return deptKeyNameLang;
	}

	public void setDeptKeyNameLang(String deptKeyNameLang) {
		this.deptKeyNameLang = deptKeyNameLang;
	}

	public String getIsBackLeaseNameLang() {
		return isBackLeaseNameLang;
	}

	public void setIsBackLeaseNameLang(String isBackLeaseNameLang) {
		this.isBackLeaseNameLang = isBackLeaseNameLang;
	}

	public String getCustomerNameNameLang() {
		return customerNameNameLang;
	}

	public void setCustomerNameNameLang(String customerNameNameLang) {
		this.customerNameNameLang = customerNameNameLang;
	}

	public String getYardNameLang() {
		return yardNameLang;
	}

	public void setYardNameLang(String yardNameLang) {
		this.yardNameLang = yardNameLang;
	}

	public String getFreeStatusNameLang() {
		return freeStatusNameLang;
	}

	public void setFreeStatusNameLang(String freeStatusNameLang) {
		this.freeStatusNameLang = freeStatusNameLang;
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

	public String getFormulaTypeNameLang() {
		return formulaTypeNameLang;
	}

	public void setFormulaTypeNameLang(String formulaTypeNameLang) {
		this.formulaTypeNameLang = formulaTypeNameLang;
	}

	public String getChargeInoutTypeNameLang() {
		return chargeInoutTypeNameLang;
	}

	public void setChargeInoutTypeNameLang(String chargeInoutTypeNameLang) {
		this.chargeInoutTypeNameLang = chargeInoutTypeNameLang;
	}

	public String getCompanyKeyNameLang() {
		return companyKeyNameLang;
	}

	public void setCompanyKeyNameLang(String companyKeyNameLang) {
		this.companyKeyNameLang = companyKeyNameLang;
	}



    
	
}