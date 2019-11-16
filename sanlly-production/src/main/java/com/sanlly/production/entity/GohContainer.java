package com.sanlly.production.entity;

import java.math.BigDecimal;
import java.util.Date;

public class GohContainer {
    private Integer prodGohContainerId;

    private String course;

    private Integer gohContRequire;

    private String containerNo;

    private String containerUser;

    private String yard;

    private String size;

    private String beforeContainerType;

    private String afterContainerType;

    private String structure;

    private String tierNumber;

    private String reshapeType;

    private Double sumBeamNumber;

    private Double loseBeamNumber;

    private Double horizontalDistance;

    private Double updownDistance;

    private String isGoh;

    private String isEntry;

    private String containerWeight;

    private Double materialWeight;

    private String testingState;

    private String referralState;

    private String pickingState;

    private BigDecimal containerCost;

    private BigDecimal thirdPartyCost;

    private BigDecimal sumCost;

    private BigDecimal laborCost;

    private Double manHour;

    private String vesselVoyage;

    private String billOfLadingNo;

    private String destinationPort;

    private Date extractContTime;

    private Integer auditUser;

    private Date auditTime;

    private String remarks;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getProdGohContainerId() {
        return prodGohContainerId;
    }

    public void setProdGohContainerId(Integer prodGohContainerId) {
        this.prodGohContainerId = prodGohContainerId;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course == null ? null : course.trim();
    }

    public Integer getGohContRequire() {
        return gohContRequire;
    }

    public void setGohContRequire(Integer gohContRequire) {
        this.gohContRequire = gohContRequire;
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

    public String getYard() {
        return yard;
    }

    public void setYard(String yard) {
        this.yard = yard == null ? null : yard.trim();
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size == null ? null : size.trim();
    }

    public String getBeforeContainerType() {
        return beforeContainerType;
    }

    public void setBeforeContainerType(String beforeContainerType) {
        this.beforeContainerType = beforeContainerType == null ? null : beforeContainerType.trim();
    }

    public String getAfterContainerType() {
        return afterContainerType;
    }

    public void setAfterContainerType(String afterContainerType) {
        this.afterContainerType = afterContainerType == null ? null : afterContainerType.trim();
    }

    public String getStructure() {
        return structure;
    }

    public void setStructure(String structure) {
        this.structure = structure == null ? null : structure.trim();
    }

    public String getTierNumber() {
        return tierNumber;
    }

    public void setTierNumber(String tierNumber) {
        this.tierNumber = tierNumber == null ? null : tierNumber.trim();
    }

    public String getReshapeType() {
        return reshapeType;
    }

    public void setReshapeType(String reshapeType) {
        this.reshapeType = reshapeType == null ? null : reshapeType.trim();
    }

    public Double getSumBeamNumber() {
        return sumBeamNumber;
    }

    public void setSumBeamNumber(Double sumBeamNumber) {
        this.sumBeamNumber = sumBeamNumber;
    }

    public Double getLoseBeamNumber() {
        return loseBeamNumber;
    }

    public void setLoseBeamNumber(Double loseBeamNumber) {
        this.loseBeamNumber = loseBeamNumber;
    }

    public Double getHorizontalDistance() {
        return horizontalDistance;
    }

    public void setHorizontalDistance(Double horizontalDistance) {
        this.horizontalDistance = horizontalDistance;
    }

    public Double getUpdownDistance() {
        return updownDistance;
    }

    public void setUpdownDistance(Double updownDistance) {
        this.updownDistance = updownDistance;
    }

    public String getIsGoh() {
        return isGoh;
    }

    public void setIsGoh(String isGoh) {
        this.isGoh = isGoh == null ? null : isGoh.trim();
    }

    public String getIsEntry() {
        return isEntry;
    }

    public void setIsEntry(String isEntry) {
        this.isEntry = isEntry == null ? null : isEntry.trim();
    }

    public String getContainerWeight() {
        return containerWeight;
    }

    public void setContainerWeight(String containerWeight) {
        this.containerWeight = containerWeight == null ? null : containerWeight.trim();
    }

    public Double getMaterialWeight() {
        return materialWeight;
    }

    public void setMaterialWeight(Double materialWeight) {
        this.materialWeight = materialWeight;
    }

    public String getTestingState() {
        return testingState;
    }

    public void setTestingState(String testingState) {
        this.testingState = testingState == null ? null : testingState.trim();
    }

    public String getReferralState() {
        return referralState;
    }

    public void setReferralState(String referralState) {
        this.referralState = referralState == null ? null : referralState.trim();
    }

    public String getPickingState() {
        return pickingState;
    }

    public void setPickingState(String pickingState) {
        this.pickingState = pickingState == null ? null : pickingState.trim();
    }

    public BigDecimal getContainerCost() {
        return containerCost;
    }

    public void setContainerCost(BigDecimal containerCost) {
        this.containerCost = containerCost;
    }

    public BigDecimal getThirdPartyCost() {
        return thirdPartyCost;
    }

    public void setThirdPartyCost(BigDecimal thirdPartyCost) {
        this.thirdPartyCost = thirdPartyCost;
    }

    public BigDecimal getSumCost() {
        return sumCost;
    }

    public void setSumCost(BigDecimal sumCost) {
        this.sumCost = sumCost;
    }

    public BigDecimal getLaborCost() {
        return laborCost;
    }

    public void setLaborCost(BigDecimal laborCost) {
        this.laborCost = laborCost;
    }

    public Double getManHour() {
        return manHour;
    }

    public void setManHour(Double manHour) {
        this.manHour = manHour;
    }

    public String getVesselVoyage() {
        return vesselVoyage;
    }

    public void setVesselVoyage(String vesselVoyage) {
        this.vesselVoyage = vesselVoyage == null ? null : vesselVoyage.trim();
    }

    public String getBillOfLadingNo() {
        return billOfLadingNo;
    }

    public void setBillOfLadingNo(String billOfLadingNo) {
        this.billOfLadingNo = billOfLadingNo == null ? null : billOfLadingNo.trim();
    }

    public String getDestinationPort() {
        return destinationPort;
    }

    public void setDestinationPort(String destinationPort) {
        this.destinationPort = destinationPort == null ? null : destinationPort.trim();
    }

    public Date getExtractContTime() {
        return extractContTime;
    }

    public void setExtractContTime(Date extractContTime) {
        this.extractContTime = extractContTime;
    }

    public Integer getAuditUser() {
        return auditUser;
    }

    public void setAuditUser(Integer auditUser) {
        this.auditUser = auditUser;
    }

    public Date getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
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