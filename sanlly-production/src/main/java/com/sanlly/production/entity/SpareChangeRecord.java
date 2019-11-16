package com.sanlly.production.entity;

import java.math.BigDecimal;
import java.util.Date;

public class SpareChangeRecord {
    private String prodCourseEntryId;

    private String containerNo;

    private String prodCourseId;

    private String yard;

    private Date courseTime;

    private String productNode;

    private String partsDetailsCode;

    private String damageCode;

    private String repairCode;

    private String testSparesNumber;

    private String testCompany;

    private String testWarehouse;

    private String testWarehouseType;

    private BigDecimal testPrice;

    private Integer testChangeUser;

    private Date testChangeTime;

    private String evalSparesNumber;

    private String evalCompany;

    private String evalWarehouse;

    private String evalWarehouseType;

    private BigDecimal evalPrice;

    private Integer evalChangeUser;

    private Date evalChangeTime;

    private BigDecimal evalChangeDiff;

    private Double evalChangePercent;

    private String wareSparesNumber;

    private String wareCompany;

    private String wareWarehouse;

    private String wareWarehouseType;

    private BigDecimal warePrice;

    private Integer wareChangeUser;

    private Date wareChangeTime;

    private BigDecimal wareChangeDiff;

    private Double wareChangePercent;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    public String getProdCourseEntryId() {
        return prodCourseEntryId;
    }

    public void setProdCourseEntryId(String prodCourseEntryId) {
        this.prodCourseEntryId = prodCourseEntryId == null ? null : prodCourseEntryId.trim();
    }

    public String getContainerNo() {
        return containerNo;
    }

    public void setContainerNo(String containerNo) {
        this.containerNo = containerNo == null ? null : containerNo.trim();
    }

    public String getProdCourseId() {
        return prodCourseId;
    }

    public void setProdCourseId(String prodCourseId) {
        this.prodCourseId = prodCourseId == null ? null : prodCourseId.trim();
    }

    public String getYard() {
        return yard;
    }

    public void setYard(String yard) {
        this.yard = yard == null ? null : yard.trim();
    }

    public Date getCourseTime() {
        return courseTime;
    }

    public void setCourseTime(Date courseTime) {
        this.courseTime = courseTime;
    }

    public String getProductNode() {
        return productNode;
    }

    public void setProductNode(String productNode) {
        this.productNode = productNode == null ? null : productNode.trim();
    }

    public String getPartsDetailsCode() {
        return partsDetailsCode;
    }

    public void setPartsDetailsCode(String partsDetailsCode) {
        this.partsDetailsCode = partsDetailsCode == null ? null : partsDetailsCode.trim();
    }

    public String getDamageCode() {
        return damageCode;
    }

    public void setDamageCode(String damageCode) {
        this.damageCode = damageCode == null ? null : damageCode.trim();
    }

    public String getRepairCode() {
        return repairCode;
    }

    public void setRepairCode(String repairCode) {
        this.repairCode = repairCode == null ? null : repairCode.trim();
    }

    public String getTestSparesNumber() {
        return testSparesNumber;
    }

    public void setTestSparesNumber(String testSparesNumber) {
        this.testSparesNumber = testSparesNumber == null ? null : testSparesNumber.trim();
    }

    public String getTestCompany() {
        return testCompany;
    }

    public void setTestCompany(String testCompany) {
        this.testCompany = testCompany == null ? null : testCompany.trim();
    }

    public String getTestWarehouse() {
        return testWarehouse;
    }

    public void setTestWarehouse(String testWarehouse) {
        this.testWarehouse = testWarehouse == null ? null : testWarehouse.trim();
    }

    public String getTestWarehouseType() {
        return testWarehouseType;
    }

    public void setTestWarehouseType(String testWarehouseType) {
        this.testWarehouseType = testWarehouseType == null ? null : testWarehouseType.trim();
    }

    public BigDecimal getTestPrice() {
        return testPrice;
    }

    public void setTestPrice(BigDecimal testPrice) {
        this.testPrice = testPrice;
    }

    public Integer getTestChangeUser() {
        return testChangeUser;
    }

    public void setTestChangeUser(Integer testChangeUser) {
        this.testChangeUser = testChangeUser;
    }

    public Date getTestChangeTime() {
        return testChangeTime;
    }

    public void setTestChangeTime(Date testChangeTime) {
        this.testChangeTime = testChangeTime;
    }

    public String getEvalSparesNumber() {
        return evalSparesNumber;
    }

    public void setEvalSparesNumber(String evalSparesNumber) {
        this.evalSparesNumber = evalSparesNumber == null ? null : evalSparesNumber.trim();
    }

    public String getEvalCompany() {
        return evalCompany;
    }

    public void setEvalCompany(String evalCompany) {
        this.evalCompany = evalCompany == null ? null : evalCompany.trim();
    }

    public String getEvalWarehouse() {
        return evalWarehouse;
    }

    public void setEvalWarehouse(String evalWarehouse) {
        this.evalWarehouse = evalWarehouse == null ? null : evalWarehouse.trim();
    }

    public String getEvalWarehouseType() {
        return evalWarehouseType;
    }

    public void setEvalWarehouseType(String evalWarehouseType) {
        this.evalWarehouseType = evalWarehouseType == null ? null : evalWarehouseType.trim();
    }

    public BigDecimal getEvalPrice() {
        return evalPrice;
    }

    public void setEvalPrice(BigDecimal evalPrice) {
        this.evalPrice = evalPrice;
    }

    public Integer getEvalChangeUser() {
        return evalChangeUser;
    }

    public void setEvalChangeUser(Integer evalChangeUser) {
        this.evalChangeUser = evalChangeUser;
    }

    public Date getEvalChangeTime() {
        return evalChangeTime;
    }

    public void setEvalChangeTime(Date evalChangeTime) {
        this.evalChangeTime = evalChangeTime;
    }

    public BigDecimal getEvalChangeDiff() {
        return evalChangeDiff;
    }

    public void setEvalChangeDiff(BigDecimal evalChangeDiff) {
        this.evalChangeDiff = evalChangeDiff;
    }

    public Double getEvalChangePercent() {
        return evalChangePercent;
    }

    public void setEvalChangePercent(Double evalChangePercent) {
        this.evalChangePercent = evalChangePercent;
    }

    public String getWareSparesNumber() {
        return wareSparesNumber;
    }

    public void setWareSparesNumber(String wareSparesNumber) {
        this.wareSparesNumber = wareSparesNumber == null ? null : wareSparesNumber.trim();
    }

    public String getWareCompany() {
        return wareCompany;
    }

    public void setWareCompany(String wareCompany) {
        this.wareCompany = wareCompany == null ? null : wareCompany.trim();
    }

    public String getWareWarehouse() {
        return wareWarehouse;
    }

    public void setWareWarehouse(String wareWarehouse) {
        this.wareWarehouse = wareWarehouse == null ? null : wareWarehouse.trim();
    }

    public String getWareWarehouseType() {
        return wareWarehouseType;
    }

    public void setWareWarehouseType(String wareWarehouseType) {
        this.wareWarehouseType = wareWarehouseType == null ? null : wareWarehouseType.trim();
    }

    public BigDecimal getWarePrice() {
        return warePrice;
    }

    public void setWarePrice(BigDecimal warePrice) {
        this.warePrice = warePrice;
    }

    public Integer getWareChangeUser() {
        return wareChangeUser;
    }

    public void setWareChangeUser(Integer wareChangeUser) {
        this.wareChangeUser = wareChangeUser;
    }

    public Date getWareChangeTime() {
        return wareChangeTime;
    }

    public void setWareChangeTime(Date wareChangeTime) {
        this.wareChangeTime = wareChangeTime;
    }

    public BigDecimal getWareChangeDiff() {
        return wareChangeDiff;
    }

    public void setWareChangeDiff(BigDecimal wareChangeDiff) {
        this.wareChangeDiff = wareChangeDiff;
    }

    public Double getWareChangePercent() {
        return wareChangePercent;
    }

    public void setWareChangePercent(Double wareChangePercent) {
        this.wareChangePercent = wareChangePercent;
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