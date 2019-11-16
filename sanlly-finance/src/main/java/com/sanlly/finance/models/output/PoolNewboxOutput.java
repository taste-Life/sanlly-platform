package com.sanlly.finance.models.output;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 新箱费用池 输出类
 * 
 * @Package com.sanlly.finance.models.output
 * @Description: TODO
 * @author fjy   
 * @date 2019年8月26日 下午3:50:02 
 * @version V1.0   
 */
public class PoolNewboxOutput {
	// 主键id
	private Integer id;
	// 订单号
	private String orderNo;
	// 所属月份
	private Integer month;
	// 冷机公司
	private String chillerCompanyName;
	// 数量
	private Integer count;
	// 单台费用
	private BigDecimal unitPrice;
	// 附加工时
	private BigDecimal additionalWorkingHours;
	// 附加费用
	private BigDecimal additionalCharges;
	// 单据金额
	private BigDecimal orderPrice;
	// 测MODEM 测；不测
	private String testModem;
	// 装MODEM 装；不装
	private String installModem;
	// 测GPS 测；不测
	private String testGps;
	// 装GPS 装；不装
	private String installGps;
	// 审核状态 未提交；已提交；已审核；已驳回
	private String state;
	// 制单日期
	private Date billDate;
	// 完成
	private Integer isFinished;
	// 收费
	private BigDecimal totalPrice;
	// 部门代码
	private String deptCode;
	// 费用类型
	private String chargeTypeKey;
	// 备注
	private String remarks;
	// 无法收费原因
	private String noCostDesc;
	// 费用状态
	private String freeStatus;
	// 行状态 0 未加入：1 已加入
	private Integer itemStatus;
	// 是否有效：0：正常；1：无效
	private String isEnabled;
	// 删除标识：0：正常；1：删除
	private Integer isDel;
	// 创建时间
	private Date createTime;
	// 创建人
	private String createUser;
	// 修改时间
	private Date updateTime;
	// 修改人
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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo == null ? null : orderNo.trim();
	}

	public Integer getMonth() {
		return month;
	}

	public void setMonth(Integer month) {
		this.month = month;
	}

	public String getChillerCompanyName() {
		return chillerCompanyName;
	}

	public void setChillerCompanyName(String chillerCompanyName) {
		this.chillerCompanyName = chillerCompanyName == null ? null : chillerCompanyName.trim();
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public BigDecimal getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	public BigDecimal getAdditionalWorkingHours() {
		return additionalWorkingHours;
	}

	public void setAdditionalWorkingHours(BigDecimal additionalWorkingHours) {
		this.additionalWorkingHours = additionalWorkingHours;
	}

	public BigDecimal getAdditionalCharges() {
		return additionalCharges;
	}

	public void setAdditionalCharges(BigDecimal additionalCharges) {
		this.additionalCharges = additionalCharges;
	}

	public BigDecimal getOrderPrice() {
		return orderPrice;
	}

	public void setOrderPrice(BigDecimal orderPrice) {
		this.orderPrice = orderPrice;
	}

	public String getTestModem() {
		return testModem;
	}

	public void setTestModem(String testModem) {
		this.testModem = testModem;
	}

	public String getInstallModem() {
		return installModem;
	}

	public void setInstallModem(String installModem) {
		this.installModem = installModem;
	}

	public String getTestGps() {
		return testGps;
	}

	public void setTestGps(String testGps) {
		this.testGps = testGps;
	}

	public String getInstallGps() {
		return installGps;
	}

	public void setInstallGps(String installGps) {
		this.installGps = installGps;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Date getBillDate() {
		return billDate;
	}

	public void setBillDate(Date billDate) {
		this.billDate = billDate;
	}

	public Integer getIsFinished() {
		return isFinished;
	}

	public void setIsFinished(Integer isFinished) {
		this.isFinished = isFinished;
	}

	public BigDecimal getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
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
 
}