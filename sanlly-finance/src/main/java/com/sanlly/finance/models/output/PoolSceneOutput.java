package com.sanlly.finance.models.output;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 现场收费费用池（第三方收费）
 * 
 * @Package com.sanlly.finance.models.output 
 * @Description: TODO
 * @author fjy   
 * @date 2019年8月26日 下午3:50:49 
 * @version V1.0   
 */
public class PoolSceneOutput {
	//主键ID
    private Integer id;
	//进场主表ID
    private String prodCourseId;
	//箱ID
    private Integer prodContainerId;
	//箱号
    private String containerNo;
	//进场场站key，关联场站表
    private String yard;
	//箱型key，关联箱型表
    private String containerType;
	//干冷箱，0：干箱，1：冷箱，2：保修
    private String containerCategory;
	//维修代码
    private String repairCode;
	//用箱人key，关联用箱人表
	private String containerUser;
	// 收费对象 同用箱人
	private String chargeObject;
	//进场时间
    private Date courseTime;
	//实收费用
    private BigDecimal realFee;
	//尺寸key，关联尺寸表
    private String size;
	//进场类型key，关联进场类型表
    private String courseType;
	//收费类型，实收费用，押金
    private String chargeType;
	//押金金额
    private BigDecimal depositMoney;
	//实收金额
    private BigDecimal receivedMoney;
	//应退差价
    private BigDecimal shouldBackMoney;
	//实退差价
    private BigDecimal actualBackMoney;
	//付款方式，支付宝，微信，现金，刷卡
    private String paymentType;
	//差价是否退还，是，否
    private String isBackSpread;
	//检验人，关联用户表
    private Integer chargeUser;
	//收费时间
    private Date chargeTime;
	//企业名称
    private String companyName;
	//纳税识别号
    private String taxIdenNo;
	//企业地址
    private String companyAddress;
	//电话
    private String companyPhone;
	//企业开户银行名称
    private String bankName;
	//企业开户银行账号
    private String bankAccount;
	//退款开户银行名称
    private String refundBankName;
	//退款开户银行账号
    private String refundBankAccount;
	//账户名称
    private String accountName;
	//开票信息
    private String invoiceRemarks;
	//付费方
    private String payer;
	//核算部门
    private String deptKey;
	//部门代码
    private String deptCode;
	//备注
    private String remarks;
	//无法收费原因
    private String noCostDesc;
	//是否有效：0：正常；1：无效
    private String isEnabled;
	//费用类型
    private String chargeTypeId;
	//费用状态
    private String freeStatus;
	//收支类型
    private String chargeInoutType;
	//行状态 0 未加入：1 已加入
    private Integer itemStatus;
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

	public String getContainerType() {
		return containerType;
	}

	public void setContainerType(String containerType) {
		this.containerType = containerType;
	}

	public String getContainerCategory() {
		return containerCategory;
	}

	public void setContainerCategory(String containerCategory) {
		this.containerCategory = containerCategory;
	}

	public String getRepairCode() {
		return repairCode;
	}

	public void setRepairCode(String repairCode) {
		this.repairCode = repairCode;
	}

	public String getContainerUser() {
		return containerUser;
	}

	public void setContainerUser(String containerUser) {
		this.containerUser = containerUser;
	}

	public Date getCourseTime() {
		return courseTime;
	}

	public void setCourseTime(Date courseTime) {
		this.courseTime = courseTime;
	}

	public BigDecimal getRealFee() {
		return realFee;
	}

	public void setRealFee(BigDecimal realFee) {
		this.realFee = realFee;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getCourseType() {
		return courseType;
	}

	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}

	public String getChargeType() {
		return chargeType;
	}

	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
	}

	public BigDecimal getDepositMoney() {
		return depositMoney;
	}

	public void setDepositMoney(BigDecimal depositMoney) {
		this.depositMoney = depositMoney;
	}

	public BigDecimal getReceivedMoney() {
		return receivedMoney;
	}

	public void setReceivedMoney(BigDecimal receivedMoney) {
		this.receivedMoney = receivedMoney;
	}

	public BigDecimal getShouldBackMoney() {
		return shouldBackMoney;
	}

	public void setShouldBackMoney(BigDecimal shouldBackMoney) {
		this.shouldBackMoney = shouldBackMoney;
	}

	public BigDecimal getActualBackMoney() {
		return actualBackMoney;
	}

	public void setActualBackMoney(BigDecimal actualBackMoney) {
		this.actualBackMoney = actualBackMoney;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getIsBackSpread() {
		return isBackSpread;
	}

	public void setIsBackSpread(String isBackSpread) {
		this.isBackSpread = isBackSpread;
	}

	public Integer getChargeUser() {
		return chargeUser;
	}

	public void setChargeUser(Integer chargeUser) {
		this.chargeUser = chargeUser;
	}

	public Date getChargeTime() {
		return chargeTime;
	}

	public void setChargeTime(Date chargeTime) {
		this.chargeTime = chargeTime;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getTaxIdenNo() {
		return taxIdenNo;
	}

	public void setTaxIdenNo(String taxIdenNo) {
		this.taxIdenNo = taxIdenNo;
	}

	public String getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

	public String getCompanyPhone() {
		return companyPhone;
	}

	public void setCompanyPhone(String companyPhone) {
		this.companyPhone = companyPhone;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}

	public String getRefundBankName() {
		return refundBankName;
	}

	public void setRefundBankName(String refundBankName) {
		this.refundBankName = refundBankName;
	}

	public String getRefundBankAccount() {
		return refundBankAccount;
	}

	public void setRefundBankAccount(String refundBankAccount) {
		this.refundBankAccount = refundBankAccount;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getInvoiceRemarks() {
		return invoiceRemarks;
	}

	public void setInvoiceRemarks(String invoiceRemarks) {
		this.invoiceRemarks = invoiceRemarks;
	}

	public String getPayer() {
		return payer;
	}

	public void setPayer(String payer) {
		this.payer = payer;
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

	public String getChargeTypeId() {
		return chargeTypeId;
	}

	public void setChargeTypeId(String chargeTypeId) {
		this.chargeTypeId = chargeTypeId;
	}

	public String getFreeStatus() {
		return freeStatus;
	}

	public void setFreeStatus(String freeStatus) {
		this.freeStatus = freeStatus;
	}

	public String getChargeInoutType() {
		return chargeInoutType;
	}

	public void setChargeInoutType(String chargeInoutType) {
		this.chargeInoutType = chargeInoutType;
	}

	public Integer getItemStatus() {
		return itemStatus;
	}

	public void setItemStatus(Integer itemStatus) {
		this.itemStatus = itemStatus;
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

	public String getChargeObject() {
		return chargeObject;
	}

	public void setChargeObject(String chargeObject) {
		this.chargeObject = chargeObject;
	}
	
	

}