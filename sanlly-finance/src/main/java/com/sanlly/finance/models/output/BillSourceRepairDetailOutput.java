package com.sanlly.finance.models.output;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 成本维修收入实体
* @Package com.sanlly.finance.models.input 
* @Description: TODO 
* @author fjy   
* @date 2019年9月25日 上午9:23:39 
* @version V1.0   
 */
public class BillSourceRepairDetailOutput {

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
	// 批复时间
	private Date replyTime;
	// 是否退租 0 :正常 1退租
	private Integer isBackLease;
	// 用箱人
	private String containerUser;
	// 收费对象 同用箱人
	private String chargeObject;
	//费用类型
    private String chargeTypeKey;
    
    //实收（美金含税）
    private BigDecimal realTaxTotalCostUsa;
    //实收（美金不含税）
    private BigDecimal realNotaxTotalCostUsa;
    //实收（人民币含税）
    private BigDecimal realTaxTotalCostRmb;
    //实收（人民币不含税）
    private BigDecimal realNotaxTotalCostRmb;
	// 箱类别
	private String containerCategory;

	//汇率
    private BigDecimal realRate;
	// 付费方
	private String payer;

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
	
    //区分1干箱 2冷箱 3保修 类型账单
    private Integer billType;

    private String deptKey;
    private Integer poolId;
    //场站
    private String yardNameLang;
	// 箱类型  干箱 冷箱
	private String containerCategoryNameLang;
	//费用类型
    private String chargeTypeNameLang;
	// 收费对象 同用箱人
	private String chargeObjectNameLang;
    //核算部门
    private String deptKeyNameLang;
    //用箱人
    private String containerUserNameLang;
    //费用状态
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
	public Date getReplyTime() {
		return replyTime;
	}
	public void setReplyTime(Date replyTime) {
		this.replyTime = replyTime;
	}
	public Integer getIsBackLease() {
		return isBackLease;
	}
	public void setIsBackLease(Integer isBackLease) {
		this.isBackLease = isBackLease;
	}
	public String getContainerUser() {
		return containerUser;
	}
	public void setContainerUser(String containerUser) {
		this.containerUser = containerUser;
	}

	public BigDecimal getRealTaxTotalCostUsa() {
		return realTaxTotalCostUsa;
	}
	public void setRealTaxTotalCostUsa(BigDecimal realTaxTotalCostUsa) {
		this.realTaxTotalCostUsa = realTaxTotalCostUsa;
	}
	public BigDecimal getRealNotaxTotalCostUsa() {
		return realNotaxTotalCostUsa;
	}
	public void setRealNotaxTotalCostUsa(BigDecimal realNotaxTotalCostUsa) {
		this.realNotaxTotalCostUsa = realNotaxTotalCostUsa;
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
	public String getPayer() {
		return payer;
	}
	public void setPayer(String payer) {
		this.payer = payer;
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
	public String getDeptKey() {
		return deptKey;
	}
	public void setDeptKey(String deptKey) {
		this.deptKey = deptKey;
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
	public String getContainerCategoryNameLang() {
		return containerCategoryNameLang;
	}
	public void setContainerCategoryNameLang(String containerCategoryNameLang) {
		this.containerCategoryNameLang = containerCategoryNameLang;
	}
	public String getDeptKeyNameLang() {
		return deptKeyNameLang;
	}
	public void setDeptKeyNameLang(String deptKeyNameLang) {
		this.deptKeyNameLang = deptKeyNameLang;
	}
	public String getContainerUserNameLang() {
		return containerUserNameLang;
	}
	public void setContainerUserNameLang(String containerUserNameLang) {
		this.containerUserNameLang = containerUserNameLang;
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
	public String getChargeTypeNameLang() {
		return chargeTypeNameLang;
	}
	public void setChargeTypeNameLang(String chargeTypeNameLang) {
		this.chargeTypeNameLang = chargeTypeNameLang;
	}
	public String getChargeTypeKey() {
		return chargeTypeKey;
	}
	public void setChargeTypeKey(String chargeTypeKey) {
		this.chargeTypeKey = chargeTypeKey;
	}
	public String getChargeObjectNameLang() {
		return chargeObjectNameLang;
	}
	public void setChargeObjectNameLang(String chargeObjectNameLang) {
		this.chargeObjectNameLang = chargeObjectNameLang;
	}
	 


	
}