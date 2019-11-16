package com.sanlly.finance.models.output;

import java.math.BigDecimal;
import java.util.Date;
/**
 * 	成本-运输费用池
* @Package com.sanlly.finance.models.input 
* @Description: TODO 
* @author fjy   
* @date 2019年9月17日 下午4:48:03 
* @version V1.0   
 */
public class PoolCostTransportOutput {
	//主键ID
    private Integer id;
	//进场主表ID
    private String prodCourseId;
	//箱ID
    private Integer prodContainerId;
	//箱号
    private String containerNo;
	// 用箱人
	private String containerUser;
	// 收费对象 同用箱人
	private String chargeObject;
	//调拨编号
    private String allocationNo;
	//调出场站key
    private String intYard;
	//调入场站key
    private String outYard;
	//车队
    private String fleet;
	//车牌号
    private String plateNo;
	//费用美金
    private BigDecimal costUsd;
	//费用人民币
    private BigDecimal costRmb;
	//调箱时间
    private Date allocationTime;
	//调拨状态   已调入；申请调回；已调回 +申请调入
    private String state;
	//调箱原因
    private String reason;
	//成本中心
    private String costCenter;
	//调拨类型   调入；调回
    private String allocationType;
	//指令发出人 直接存名字
    private String directiveIssuer;
	//指令发出时间
    private Date directiveTime;
	//确认人 直接存名字
    private String identifyPeople;
	//确认时间
    private Date identifyTime;
	//核算部门
    private String deptKey;
	//费用类型
    private String chargeTypeKey;
	//部门代码
    private String deptCode;
	//备注
    private String remarks;
	//行状态 0 未加入：1 已加入
    private Integer itemStatus;
	//无法收费原因
    private String noCostDesc;
	//是否有效：0：正常；1：无效
    private String isEnabled;
	//删除标识：0：正常；1：删除
    private Integer isDel;
	//费用状态
    private String freeStatus;
	//创建时间
    private Date createTime;
	//创建人
    private Integer createUser;
	//修改时间
    private Date updateTime;
	//修改人
    private Integer updateUser;
    
	//创建人
    private String createUserName;
	//修改人
    private String updateUserName;
    
	//用箱人key，关联用箱人表
    private String containerUserNameLang;
    
	//调出场站key
    private String intYardNameLang;
	//调入场站key
    private String outYardNameLang;
    
	//成本中心
    private String costCenterNameLang;
    
	//核算部门
    private String deptKeyNameLang;
	//费用类型
    private String chargeTypeIdNameLang;
    
	//费用状态
    private String freeStatusNameLang;
    
    
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
	public String getContainerUser() {
		return containerUser;
	}
	public void setContainerUser(String containerUser) {
		this.containerUser = containerUser;
	}
	public String getAllocationNo() {
		return allocationNo;
	}
	public void setAllocationNo(String allocationNo) {
		this.allocationNo = allocationNo;
	}
	public String getIntYard() {
		return intYard;
	}
	public void setIntYard(String intYard) {
		this.intYard = intYard;
	}
	public String getOutYard() {
		return outYard;
	}
	public void setOutYard(String outYard) {
		this.outYard = outYard;
	}
	public String getFleet() {
		return fleet;
	}
	public void setFleet(String fleet) {
		this.fleet = fleet;
	}
	public String getPlateNo() {
		return plateNo;
	}
	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}
	public BigDecimal getCostUsd() {
		return costUsd;
	}
	public void setCostUsd(BigDecimal costUsd) {
		this.costUsd = costUsd;
	}
	public BigDecimal getCostRmb() {
		return costRmb;
	}
	public void setCostRmb(BigDecimal costRmb) {
		this.costRmb = costRmb;
	}
	public Date getAllocationTime() {
		return allocationTime;
	}
	public void setAllocationTime(Date allocationTime) {
		this.allocationTime = allocationTime;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getCostCenter() {
		return costCenter;
	}
	public void setCostCenter(String costCenter) {
		this.costCenter = costCenter;
	}
	public String getAllocationType() {
		return allocationType;
	}
	public void setAllocationType(String allocationType) {
		this.allocationType = allocationType;
	}
	public String getDirectiveIssuer() {
		return directiveIssuer;
	}
	public void setDirectiveIssuer(String directiveIssuer) {
		this.directiveIssuer = directiveIssuer;
	}
	public Date getDirectiveTime() {
		return directiveTime;
	}
	public void setDirectiveTime(Date directiveTime) {
		this.directiveTime = directiveTime;
	}
	public String getIdentifyPeople() {
		return identifyPeople;
	}
	public void setIdentifyPeople(String identifyPeople) {
		this.identifyPeople = identifyPeople;
	}
	public Date getIdentifyTime() {
		return identifyTime;
	}
	public void setIdentifyTime(Date identifyTime) {
		this.identifyTime = identifyTime;
	}
	public String getDeptKey() {
		return deptKey;
	}
	public void setDeptKey(String deptKey) {
		this.deptKey = deptKey;
	}
	public String getChargeTypeKey() {
		return chargeTypeKey;
	}
	public void setChargeTypeKey(String chargeTypeKey) {
		this.chargeTypeKey = chargeTypeKey;
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
	public Integer getItemStatus() {
		return itemStatus;
	}
	public void setItemStatus(Integer itemStatus) {
		this.itemStatus = itemStatus;
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
	public String getIntYardNameLang() {
		return intYardNameLang;
	}
	public void setIntYardNameLang(String intYardNameLang) {
		this.intYardNameLang = intYardNameLang;
	}
	public String getOutYardNameLang() {
		return outYardNameLang;
	}
	public void setOutYardNameLang(String outYardNameLang) {
		this.outYardNameLang = outYardNameLang;
	}
	public String getCostCenterNameLang() {
		return costCenterNameLang;
	}
	public void setCostCenterNameLang(String costCenterNameLang) {
		this.costCenterNameLang = costCenterNameLang;
	}
	public String getDeptKeyNameLang() {
		return deptKeyNameLang;
	}
	public void setDeptKeyNameLang(String deptKeyNameLang) {
		this.deptKeyNameLang = deptKeyNameLang;
	}
	public String getChargeTypeIdNameLang() {
		return chargeTypeIdNameLang;
	}
	public void setChargeTypeIdNameLang(String chargeTypeIdNameLang) {
		this.chargeTypeIdNameLang = chargeTypeIdNameLang;
	}
	public String getFreeStatusNameLang() {
		return freeStatusNameLang;
	}
	public void setFreeStatusNameLang(String freeStatusNameLang) {
		this.freeStatusNameLang = freeStatusNameLang;
	}
	public String getChargeObject() {
		return chargeObject;
	}
	public void setChargeObject(String chargeObject) {
		this.chargeObject = chargeObject;
	}


    
}