package com.sanlly.production.entity;

import java.math.BigDecimal;
import java.util.Date;

public class GonContainer {
    private Integer prodGonContainerId;

    private String containerNo;

    private String size;

    private String beforeContainerType;

    private String afterContainerType;

    private String containerUser;

    private Integer state;

    private BigDecimal laborCost;

    private String vesselVoyage;

    private String billOfLadingNo;

    private String destinationPort;

    private Date extractContTime;

    private Integer auditUser;

    private Date auditTime;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getProdGonContainerId() {
        return prodGonContainerId;
    }

    public void setProdGonContainerId(Integer prodGonContainerId) {
        this.prodGonContainerId = prodGonContainerId;
    }

    public String getContainerNo() {
        return containerNo;
    }

    public void setContainerNo(String containerNo) {
        this.containerNo = containerNo == null ? null : containerNo.trim();
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

    public String getContainerUser() {
        return containerUser;
    }

    public void setContainerUser(String containerUser) {
        this.containerUser = containerUser == null ? null : containerUser.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public BigDecimal getLaborCost() {
        return laborCost;
    }

    public void setLaborCost(BigDecimal laborCost) {
        this.laborCost = laborCost;
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