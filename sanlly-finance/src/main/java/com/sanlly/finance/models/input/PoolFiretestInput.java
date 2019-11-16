package com.sanlly.finance.models.input;

import java.util.Date;

/**
 * 火焰测试费用池
* @Package com.sanlly.finance.models.input 
* @Description: TODO 
* @author fjy   
* @date 2019年8月26日 下午3:48:41 
* @version V1.0   
 */
public class PoolFiretestInput {
	//主键ID
	private Integer id;
	//进场主表ID
    private String prodCourseId;
	//箱ID
    private Integer prodContainerId;
	//箱号
    private String containerNo;
	//干冷箱，0：干箱，1：冷箱，2：保修
    private String containerType;
	//箱类别key，关联箱类别表
    private String containerCategory;
	//用箱人key，关联用箱人表
    private String containerUser;
	//进场场站key，关联场站表
    private String yard;
	//箱型尺寸key
    private String containerSize;
	// 收费对象 同用箱人
	private String chargeObject;
	//付费方
    private String payer;
	//费用
    private Long cost;
	//进场时间
    private Date entryTime;
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
	//删除标识：0：正常；1：删除
    private Integer isDel;
	//费用状态
    private String freeStatus;
	//费用类型
    private String chargeTypeKey;
	//收支类型
    private String chargeInoutType;
	//行状态 0 未加入：1 已加入
    private Integer itemStatus;
	//修改时间
    private Date updateTime;
	//创建时间
    private Date createTime;
	//创建人
    private Integer createUser;
	//修改人
    private Integer updateUser;
	
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

	public String getContainerUser() {
		return containerUser;
	}

	public void setContainerUser(String containerUser) {
		this.containerUser = containerUser;
	}

	public String getYard() {
		return yard;
	}

	public void setYard(String yard) {
		this.yard = yard;
	}

	public String getContainerSize() {
		return containerSize;
	}

	public void setContainerSize(String containerSize) {
		this.containerSize = containerSize;
	}

 

	public String getChargeObject() {
		return chargeObject;
	}

	public void setChargeObject(String chargeObject) {
		this.chargeObject = chargeObject;
	}

	public String getPayer() {
		return payer;
	}

	public void setPayer(String payer) {
		this.payer = payer;
	}

	public Long getCost() {
		return cost;
	}

	public void setCost(Long cost) {
		this.cost = cost;
	}

	public Date getEntryTime() {
		return entryTime;
	}

	public void setEntryTime(Date entryTime) {
		this.entryTime = entryTime;
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

	public Integer getItemStatus() {
		return itemStatus;
	}

	public void setItemStatus(Integer itemStatus) {
		this.itemStatus = itemStatus;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
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

	public Integer getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(Integer updateUser) {
		this.updateUser = updateUser;
	}

   
    
    
}