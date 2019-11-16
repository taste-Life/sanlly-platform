package com.sanlly.production.entity;

import java.math.BigDecimal;
import java.util.Date;

public class GohContainerEntry {
    private Integer prodGohContainerEntryId;

    private Integer gohContainer;

    private String entryName;

    private String sparesNumber;

    private String numberExplain;

    private Double quantity;

    private Double manHour;

    private String payingParty;

    private BigDecimal standardCost;

    private BigDecimal nonstandardCost;

    private String isDevanning;

    private String remarks;

    private Integer isDel;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public Integer getProdGohContainerEntryId() {
        return prodGohContainerEntryId;
    }

    public void setProdGohContainerEntryId(Integer prodGohContainerEntryId) {
        this.prodGohContainerEntryId = prodGohContainerEntryId;
    }

    public Integer getGohContainer() {
        return gohContainer;
    }

    public void setGohContainer(Integer gohContainer) {
        this.gohContainer = gohContainer;
    }

    public String getEntryName() {
        return entryName;
    }

    public void setEntryName(String entryName) {
        this.entryName = entryName == null ? null : entryName.trim();
    }

    public String getSparesNumber() {
        return sparesNumber;
    }

    public void setSparesNumber(String sparesNumber) {
        this.sparesNumber = sparesNumber == null ? null : sparesNumber.trim();
    }

    public String getNumberExplain() {
        return numberExplain;
    }

    public void setNumberExplain(String numberExplain) {
        this.numberExplain = numberExplain == null ? null : numberExplain.trim();
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public Double getManHour() {
        return manHour;
    }

    public void setManHour(Double manHour) {
        this.manHour = manHour;
    }

    public String getPayingParty() {
        return payingParty;
    }

    public void setPayingParty(String payingParty) {
        this.payingParty = payingParty == null ? null : payingParty.trim();
    }

    public BigDecimal getStandardCost() {
        return standardCost;
    }

    public void setStandardCost(BigDecimal standardCost) {
        this.standardCost = standardCost;
    }

    public BigDecimal getNonstandardCost() {
        return nonstandardCost;
    }

    public void setNonstandardCost(BigDecimal nonstandardCost) {
        this.nonstandardCost = nonstandardCost;
    }

    public String getIsDevanning() {
        return isDevanning;
    }

    public void setIsDevanning(String isDevanning) {
        this.isDevanning = isDevanning == null ? null : isDevanning.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
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
}