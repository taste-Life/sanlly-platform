package com.sanlly.finance.models.input;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 租赁费用池（租赁、场地费）
* @Package com.sanlly.finance.models.input 
* @Description: TODO 
* @author fjy   
* @date 2019年8月26日 下午3:49:45 
* @version V1.0   
 */
public class PoolLeaseInput {
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
	//金额  费率
    private BigDecimal amount;
    //币种
    private String realCurrencyType;
	
	//是否有效：0：正常；1：无效
    private String isEnabled;
	//费用状态
    private String freeStatus;
	//备注
    private String remarks;

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
 
   

    
}