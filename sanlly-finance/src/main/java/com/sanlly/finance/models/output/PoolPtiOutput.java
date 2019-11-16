package com.sanlly.finance.models.output;

import java.math.BigDecimal;
import java.util.Date;

/**
 * pti 费用池
 * 
 * @Package com.sanlly.finance.models.output 
 * @Description: TODO
 * @author fjy   
 * @date 2019年8月26日 下午3:50:18 
 * @version V1.0   
 */
public class PoolPtiOutput {
	//主键ID
    private Integer id;
	//进场主表ID
    private String prodCourseId;
	//箱ID
    private Integer prodContainerId;
    //箱类别
    private String containerCategory;
	//箱号
    private String containerNo;
	//进场场站key，关联场站表
    private String yard;
	//用箱人key，关联用箱人表
    private String containerUser;
	//PTI费用
    private BigDecimal ptiCost;
	//PTIok日期
    private Date ptiOkdate;
	//原始费用
    private BigDecimal oldCost;
	//原始费用币种
    private String oldCurrencyType;
	//当前汇率
    private BigDecimal currentRate;
	//是否使用公式 0 :无 1：用
    private String isFormula;
	//计算方式
    private String computeFormula;
	//收费币种
    private String chargeCurrencyType;
	//操作值
    private String optionValue;
	//实际应收费用
    private BigDecimal realCost;
	//核算部门
    private String deptKey;
	//收支类型
    private String chargeInoutType;
	//部门代码
    private String deptCode;
	//费用类型
    private String chargeTypeKey;
	//费用状态
    private String freeStatus;
	//行状态 0 未加入：1 已加入
    private Integer itemStatus;
	//备注
    private String remarks;
	//无法收费原因
    private String noCostDesc;
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


	// 费用类型
	private String chargeTypeIdNameLang;

	// 核算部门
	private String deptKeyNameLang;

	//费用类型
    private String chargeTypeKeyNameLang;

	// 进场场站key，关联场站表
	private String yardNameLang;
	//用箱人key，关联用箱人表
    private String containerUserNameLang;
	// 费用状态
	private String freeStatusNameLang;
	
	//收支类型
    private String chargeInoutTypeNameLang;
	
    //箱类别
    private String containerCategoryNameLang;

	// 是否有效：0：正常；1：无效
	private String isEnabledNameLang;

	// 创建人
	private String createUserName;

	// 修改人
	private String updateUserName;
	
	//是否使用公式 0 :无 1：用
    private String isFormulaNameLang;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProdCourseId() {
		return prodCourseId;
	}

	public void setProdCourseId(String prodCourseId) {
		this.prodCourseId = prodCourseId;
	}

	public Integer getProdContainerId() {
		return prodContainerId;
	}

	public void setProdContainerId(Integer prodContainerId) {
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

	public BigDecimal getPtiCost() {
		return ptiCost;
	}

	public void setPtiCost(BigDecimal ptiCost) {
		this.ptiCost = ptiCost;
	}

	public Date getPtiOkdate() {
		return ptiOkdate;
	}

	public void setPtiOkdate(Date ptiOkdate) {
		this.ptiOkdate = ptiOkdate;
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

	public BigDecimal getCurrentRate() {
		return currentRate;
	}

	public void setCurrentRate(BigDecimal currentRate) {
		this.currentRate = currentRate;
	}


	public String getIsFormula() {
		return isFormula;
	}

	public void setIsFormula(String isFormula) {
		this.isFormula = isFormula;
	}

	public String getIsFormulaNameLang() {
		return isFormulaNameLang;
	}

	public void setIsFormulaNameLang(String isFormulaNameLang) {
		this.isFormulaNameLang = isFormulaNameLang;
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

	public String getChargeInoutType() {
		return chargeInoutType;
	}

	public void setChargeInoutType(String chargeInoutType) {
		this.chargeInoutType = chargeInoutType;
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

	public String getContainerCategory() {
		return containerCategory;
	}

	public void setContainerCategory(String containerCategory) {
		this.containerCategory = containerCategory;
	}

	public String getContainerUserNameLang() {
		return containerUserNameLang;
	}

	public void setContainerUserNameLang(String containerUserNameLang) {
		this.containerUserNameLang = containerUserNameLang;
	}

	public String getContainerCategoryNameLang() {
		return containerCategoryNameLang;
	}

	public void setContainerCategoryNameLang(String containerCategoryNameLang) {
		this.containerCategoryNameLang = containerCategoryNameLang;
	}

	public String getChargeInoutTypeNameLang() {
		return chargeInoutTypeNameLang;
	}

	public void setChargeInoutTypeNameLang(String chargeInoutTypeNameLang) {
		this.chargeInoutTypeNameLang = chargeInoutTypeNameLang;
	}

	public String getChargeTypeKeyNameLang() {
		return chargeTypeKeyNameLang;
	}

	public void setChargeTypeKeyNameLang(String chargeTypeKeyNameLang) {
		this.chargeTypeKeyNameLang = chargeTypeKeyNameLang;
	}
	
	

}