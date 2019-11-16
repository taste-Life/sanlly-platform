package com.sanlly.finance.entity;

import java.math.BigDecimal;
import java.util.Date;

public class PoolCostTransport {
    private Integer id;

    private String prodCourseId;

    private Integer prodContainerId;

    private String containerNo;

    private String containerUser;

    private String allocationNo;

    private String outYard;

    private String intYard;

    private String fleet;

    private String plateNo;

    private BigDecimal costUsd;

    private BigDecimal costRmb;

    private Date allocationTime;

    private String state;

    private String reason;

    private String costCenter;

    private String allocationType;

    private String directiveIssuer;

    private Date directiveTime;

    private String identifyPeople;

    private Date identifyTime;

    private String deptKey;

    private String chargeTypeKey;

    private String deptCode;

    private String remarks;

    private Integer itemStatus;

    private String noCostDesc;

    private String isEnabled;

    private Integer isDel;

    private String freeStatus;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

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
        this.prodCourseId = prodCourseId == null ? null : prodCourseId.trim();
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
        this.containerNo = containerNo == null ? null : containerNo.trim();
    }

    public String getContainerUser() {
        return containerUser;
    }

    public void setContainerUser(String containerUser) {
        this.containerUser = containerUser == null ? null : containerUser.trim();
    }

    public String getAllocationNo() {
        return allocationNo;
    }

    public void setAllocationNo(String allocationNo) {
        this.allocationNo = allocationNo == null ? null : allocationNo.trim();
    }

    public String getOutYard() {
        return outYard;
    }

    public void setOutYard(String outYard) {
        this.outYard = outYard == null ? null : outYard.trim();
    }

    public String getIntYard() {
        return intYard;
    }

    public void setIntYard(String intYard) {
        this.intYard = intYard == null ? null : intYard.trim();
    }

    public String getFleet() {
        return fleet;
    }

    public void setFleet(String fleet) {
        this.fleet = fleet == null ? null : fleet.trim();
    }

    public String getPlateNo() {
        return plateNo;
    }

    public void setPlateNo(String plateNo) {
        this.plateNo = plateNo == null ? null : plateNo.trim();
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
        this.state = state == null ? null : state.trim();
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public String getCostCenter() {
        return costCenter;
    }

    public void setCostCenter(String costCenter) {
        this.costCenter = costCenter == null ? null : costCenter.trim();
    }

    public String getAllocationType() {
        return allocationType;
    }

    public void setAllocationType(String allocationType) {
        this.allocationType = allocationType == null ? null : allocationType.trim();
    }

    public String getDirectiveIssuer() {
        return directiveIssuer;
    }

    public void setDirectiveIssuer(String directiveIssuer) {
        this.directiveIssuer = directiveIssuer == null ? null : directiveIssuer.trim();
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
        this.identifyPeople = identifyPeople == null ? null : identifyPeople.trim();
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
        this.deptKey = deptKey == null ? null : deptKey.trim();
    }

    public String getChargeTypeKey() {
        return chargeTypeKey;
    }

    public void setChargeTypeKey(String chargeTypeKey) {
        this.chargeTypeKey = chargeTypeKey == null ? null : chargeTypeKey.trim();
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode == null ? null : deptCode.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
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
        this.noCostDesc = noCostDesc == null ? null : noCostDesc.trim();
    }

    public String getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(String isEnabled) {
        this.isEnabled = isEnabled == null ? null : isEnabled.trim();
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
        this.freeStatus = freeStatus == null ? null : freeStatus.trim();
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
}