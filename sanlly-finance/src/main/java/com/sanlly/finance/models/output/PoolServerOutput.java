package com.sanlly.finance.models.output;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 通用费用池（服务成本账单，劳务外包、）
 * 
 * @Package com.sanlly.finance.models.output 
 * @Description: TODO
 * @author fjy   
 * @date 2019年8月26日 下午3:50:54 
 * @version V1.0   
 */
public class PoolServerOutput {
	//主键iD
    private Integer id;
	//进场主表ID
    private String prodCourseId;
	//账单类型
    private Integer billType;
	//箱ID
    private Integer prodContainerId;
	//箱号
    private String containerNo;
	//进场场站key，关联场站表
    private String yard;
	//费用类型
    private String chargeTypeKey;
	//收支类型
    private String chargeInoutType;
	//导入客户
    private String importUser;
	//客户全称
    private String customerName;
	//客户编号
    private String sapid;
	//场站/人员
    private String yardOrUser;
	//地点
    private String address;
	//船名航次
    private String vesName;
	//备件号
    private String sparePartsNo;
	//备件名称
    private String sparePartsName;
	//冷机机型
    private String refrigeratorType;
	//单价/费率
    private BigDecimal priceOrRate;
	//数量/工时
    private BigDecimal number;
	//币种
    private String currencyType;
	//汇率
    private BigDecimal exchangeRate;
	//费用金额
    private BigDecimal feeAmount;
	//本位币金额
    private BigDecimal standardCurrencyAmount;
	//备注
    private String remarks;
	//无法收费原因
    private String noCostDesc;
	//核算部门
    private String deptKey;
    
  //部门代码
    private String deptCode;
	//是否有效
    private String isEnabled;
	//删除标识：0：正常；1：删除
    private Integer isDel;
	//费用状态
    private String freeStatus;
	//行状态 0 未加入：1 已加入
    private Integer itemStatus;
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

	public String getProdCourseId() {
		return prodCourseId;
	}

	public void setProdCourseId(String prodCourseId) {
		this.prodCourseId = prodCourseId;
	}

	public Integer getBillType() {
		return billType;
	}

	public void setBillType(Integer billType) {
		this.billType = billType;
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

	public String getImportUser() {
		return importUser;
	}

	public void setImportUser(String importUser) {
		this.importUser = importUser;
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

	public String getYardOrUser() {
		return yardOrUser;
	}

	public void setYardOrUser(String yardOrUser) {
		this.yardOrUser = yardOrUser;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getVesName() {
		return vesName;
	}

	public void setVesName(String vesName) {
		this.vesName = vesName;
	}

	public String getSparePartsNo() {
		return sparePartsNo;
	}

	public void setSparePartsNo(String sparePartsNo) {
		this.sparePartsNo = sparePartsNo;
	}

	public String getSparePartsName() {
		return sparePartsName;
	}

	public void setSparePartsName(String sparePartsName) {
		this.sparePartsName = sparePartsName;
	}

	public String getRefrigeratorType() {
		return refrigeratorType;
	}

	public void setRefrigeratorType(String refrigeratorType) {
		this.refrigeratorType = refrigeratorType;
	}

	public BigDecimal getPriceOrRate() {
		return priceOrRate;
	}

	public void setPriceOrRate(BigDecimal priceOrRate) {
		this.priceOrRate = priceOrRate;
	}

	public BigDecimal getNumber() {
		return number;
	}

	public void setNumber(BigDecimal number) {
		this.number = number;
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

	public BigDecimal getFeeAmount() {
		return feeAmount;
	}

	public void setFeeAmount(BigDecimal feeAmount) {
		this.feeAmount = feeAmount;
	}

	public BigDecimal getStandardCurrencyAmount() {
		return standardCurrencyAmount;
	}

	public void setStandardCurrencyAmount(BigDecimal standardCurrencyAmount) {
		this.standardCurrencyAmount = standardCurrencyAmount;
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

	public Integer getItemStatus() {
		return itemStatus;
	}

	public void setItemStatus(Integer itemStatus) {
		this.itemStatus = itemStatus;
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