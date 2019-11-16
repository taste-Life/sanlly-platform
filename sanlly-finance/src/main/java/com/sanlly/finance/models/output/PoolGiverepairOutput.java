package com.sanlly.finance.models.output;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 送修费用池
 * 
 * @Package com.sanlly.finance.models.output 
 * @Description: TODO
 * @author fjy   
 * @date 2019年8月26日 下午3:48:59 
 * @version V1.0   
 */
public class PoolGiverepairOutput {
	//主键id
 	private Integer id;
 	//送修出库单号
    private String stockoutMaintainNo;
 	//维修部门(对应维修部门表)
    private String maintainDepartment;
 	//维修单号
    private String maintainNo;
 	//加工费用
    private BigDecimal processingCharges;
 	//维修材料成本
    private BigDecimal maintainMaterialsCost;
 	//所属公司
    private String company;
 	//维修收入
    private BigDecimal maintainIncome;
 	//部门key
    private String deptKey;
 	//部门编号
    private String deptCode;
 	//费用类型
    private String chargeTypeKey;
 	//费用状态
    private String freeStatus;
 	//行状态
    private Integer itemStatus;
 	//备注
    private String remarks;
 	//无法收费原因
    private String noCostDesc;
 	//是否有效
    private String isEnabled;
	//创建时间
	private Date createTime;
	//创建人
	private String createUser;
	//修改时间
	private Date updateTime;
	//修改人
	private String updateUser;

	// 费用类型
	private String chargeTypeIdNameLang;

	// 核算部门
	private String deptKeyNameLang;

	// 是否退租
	private String isBackLeaseNameLang;

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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStockoutMaintainNo() {
		return stockoutMaintainNo;
	}

	public void setStockoutMaintainNo(String stockoutMaintainNo) {
		this.stockoutMaintainNo = stockoutMaintainNo;
	}

	public String getMaintainDepartment() {
		return maintainDepartment;
	}

	public void setMaintainDepartment(String maintainDepartment) {
		this.maintainDepartment = maintainDepartment;
	}

	public String getMaintainNo() {
		return maintainNo;
	}

	public void setMaintainNo(String maintainNo) {
		this.maintainNo = maintainNo;
	}

	public BigDecimal getProcessingCharges() {
		return processingCharges;
	}

	public void setProcessingCharges(BigDecimal processingCharges) {
		this.processingCharges = processingCharges;
	}

	public BigDecimal getMaintainMaterialsCost() {
		return maintainMaterialsCost;
	}

	public void setMaintainMaterialsCost(BigDecimal maintainMaterialsCost) {
		this.maintainMaterialsCost = maintainMaterialsCost;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public BigDecimal getMaintainIncome() {
		return maintainIncome;
	}

	public void setMaintainIncome(BigDecimal maintainIncome) {
		this.maintainIncome = maintainIncome;
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

	public String getChargeTypeKey() {
		return chargeTypeKey;
	}

	public void setChargeTypeKey(String chargeTypeKey) {
		this.chargeTypeKey = chargeTypeKey;
	}

	public String getFreeStatus() {
		return freeStatus;
	}

	public void setFreeStatus(String freeStatus) {
		this.freeStatus = freeStatus;
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

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(String updateUser) {
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
 

}