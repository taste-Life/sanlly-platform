package com.sanlly.common.models.input.finance;

import java.math.BigDecimal;
import java.util.Date;
/**
 * 挂衣箱费用池
* @Package com.sanlly.finance.models.input 
* @Description: TODO 
* @author fjy   
* @date 2019年8月26日 下午3:49:28 
* @version V1.0   
 */
public class PoolGonContainerInput {
	//主键ID
    private Integer id;
	//进场主表ID
    private String prodCourseId;
	//箱ID
    private Integer prodContainerId;
	//箱号
    private String containerNo;
    //公司
    private String companyKey;
	//进场场站key，关联场站表
    private String yard;
	//批复时间
    private Date replyTime;
	//是否退租 0 :正常 1退租
    private Integer isBackLease;
	//保修序列号
    private String repairNumber;
	// 用箱人
	private String containerUser;
	// 收费对象 同用箱人
	private String chargeObject;
	//第三方费用
    private BigDecimal amount;
    //箱类别
    private String containerCategory;

    //汇率
    private BigDecimal realRate;

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
    private String chargeTypeKey;
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
    
    //实收（美金含税）
    private BigDecimal realTaxTotalCostUsa;
    //实收（美金不含税）
    private BigDecimal realNotaxTotalCostUsa;
    //实收（人民币含税）
    private BigDecimal realTaxTotalCostRmb;
    //实收（人民币不含税）
    private BigDecimal realNotaxTotalCostRmb;
    //实收币种
    private String realCurrencyType;
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
	public String getRepairNumber() {
		return repairNumber;
	}
	public void setRepairNumber(String repairNumber) {
		this.repairNumber = repairNumber;
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
	public String getRealCurrencyType() {
		return realCurrencyType;
	}
	public void setRealCurrencyType(String realCurrencyType) {
		this.realCurrencyType = realCurrencyType;
	}
	public String getCompanyKey() {
		return companyKey;
	}
	public void setCompanyKey(String companyKey) {
		this.companyKey = companyKey;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

    
    
    
    


    
}