package com.sanlly.finance.models.output;

import java.math.BigDecimal;
import java.util.Date;

/**
 * pti账单明细 输出类
 * 
 * @Package com.sanlly.finance.models.input 
 * @Description: TODO
 * @author fjy   
 * @date 2019年11月12日 上午10:39:24 
 * @version V1.0   
 */
public class BillPtiDetailOutput {

	// 主键ID
	private Integer id;
	// 账单主键ID
	private Integer billId;
	// 进场主表ID
	private String prodCourseId;
	// 箱ID
	private String prodContainerId;
	// 箱号
	private String containerNo;
	// 场站
	private String yard;
	// 用箱人
	private String containerUser;
	// 收费对象 同用箱人
	private String chargeObject;
	// 箱类别
	private String containerCategory;
	// 汇率
	private BigDecimal realRate;
	// 费用类型
	private String chargeTypeKey;
	// 备注
	private String remarks;
	// 版本号
	private String versionNo;
	// 是否有效：0：正常；1：无效
	private String isEnabled;
	// 删除标识：0：正常；1：删除
	private Integer isDel;
	// 费用状态
	private String freeStatus;
	// 创建时间
	private Date createTime;
	// 创建人
	private Integer createUser;
	// 修改时间
	private Date updateTime;
	// 修改人
	private Integer updateUser;

	// 区分1干箱 2冷箱 3保修 类型账单
	private Integer billType;

	// 公司
	private String companyKey;
	// PTI费用
	private BigDecimal ptiCost;
	// PTIok日期
	private Date ptiOkDate;
	// 原始费用
	private BigDecimal oldCost;
	// 原始币种
	private String oldCurrencyType;
	// 是否使用公式
	private Integer isFormula;
	// 计算方式
	private String computeFormula;
	// 收费币种
	private String chargeCurrencyType;
	// 操作值
	private String optionValue;
	// 实收费用
	private BigDecimal realCost;
	// 核算部门
	private String deptKey;
	// 部门代码
	private String deptCode;
	// 费用池id
	private Integer poolId;

	// 场站
	private String yardNameLang;
	// 用箱人
	private String containerUserNameLang;
	// 收费对象 同用箱人
	private String chargeObjectNameLang;
	// 箱类别
	private String containerCategoryNameLang;

	// 费用类型
	private String chargeTypeKeyNameLang;
	// 费用状态
	private String freeStatusNameLang;
	// 公司
	private String companyKeyNameLang;
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

	public Integer getBillId() {
		return billId;
	}

	public void setBillId(Integer billId) {
		this.billId = billId;
	}

	public String getProdCourseId() {
		return prodCourseId;
	}

	public void setProdCourseId(String prodCourseId) {
		this.prodCourseId = prodCourseId;
	}

	public String getProdContainerId() {
		return prodContainerId;
	}

	public void setProdContainerId(String prodContainerId) {
		this.prodContainerId = prodContainerId;
	}

	public String getContainerNo() {
		return containerNo;
	}

	public void setContainerNo(String containerNo) {
		this.containerNo = containerNo;
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

	public String getContainerCategory() {
		return containerCategory;
	}

	public void setContainerCategory(String containerCategory) {
		this.containerCategory = containerCategory;
	}

	public BigDecimal getRealRate() {
		return realRate;
	}

	public void setRealRate(BigDecimal realRate) {
		this.realRate = realRate;
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

	public String getVersionNo() {
		return versionNo;
	}

	public void setVersionNo(String versionNo) {
		this.versionNo = versionNo;
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

	public String getCompanyKey() {
		return companyKey;
	}

	public void setCompanyKey(String companyKey) {
		this.companyKey = companyKey;
	}

	public BigDecimal getPtiCost() {
		return ptiCost;
	}

	public void setPtiCost(BigDecimal ptiCost) {
		this.ptiCost = ptiCost;
	}

	public Date getPtiOkDate() {
		return ptiOkDate;
	}

	public void setPtiOkDate(Date ptiOkDate) {
		this.ptiOkDate = ptiOkDate;
	}

	public BigDecimal getOldCost() {
		return oldCost;
	}

	public void setOldCost(BigDecimal oldCost) {
		this.oldCost = oldCost;
	}

	public String getOldCurrencyType() {
		return oldCurrencyType;
	}

	public void setOldCurrencyType(String oldCurrencyType) {
		this.oldCurrencyType = oldCurrencyType;
	}

	public Integer getIsFormula() {
		return isFormula;
	}

	public void setIsFormula(Integer isFormula) {
		this.isFormula = isFormula;
	}

	public String getComputeFormula() {
		return computeFormula;
	}

	public void setComputeFormula(String computeFormula) {
		this.computeFormula = computeFormula;
	}

	public String getChargeCurrencyType() {
		return chargeCurrencyType;
	}

	public void setChargeCurrencyType(String chargeCurrencyType) {
		this.chargeCurrencyType = chargeCurrencyType;
	}

	public String getOptionValue() {
		return optionValue;
	}

	public void setOptionValue(String optionValue) {
		this.optionValue = optionValue;
	}

	public BigDecimal getRealCost() {
		return realCost;
	}

	public void setRealCost(BigDecimal realCost) {
		this.realCost = realCost;
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

	public Integer getPoolId() {
		return poolId;
	}

	public void setPoolId(Integer poolId) {
		this.poolId = poolId;
	}

	public String getYardNameLang() {
		return yardNameLang;
	}

	public void setYardNameLang(String yardNameLang) {
		this.yardNameLang = yardNameLang;
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

	public String getContainerCategoryNameLang() {
		return containerCategoryNameLang;
	}

	public void setContainerCategoryNameLang(String containerCategoryNameLang) {
		this.containerCategoryNameLang = containerCategoryNameLang;
	}

	public String getChargeTypeKeyNameLang() {
		return chargeTypeKeyNameLang;
	}

	public void setChargeTypeKeyNameLang(String chargeTypeKeyNameLang) {
		this.chargeTypeKeyNameLang = chargeTypeKeyNameLang;
	}

	public String getFreeStatusNameLang() {
		return freeStatusNameLang;
	}

	public void setFreeStatusNameLang(String freeStatusNameLang) {
		this.freeStatusNameLang = freeStatusNameLang;
	}

	public String getCompanyKeyNameLang() {
		return companyKeyNameLang;
	}

	public void setCompanyKeyNameLang(String companyKeyNameLang) {
		this.companyKeyNameLang = companyKeyNameLang;
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