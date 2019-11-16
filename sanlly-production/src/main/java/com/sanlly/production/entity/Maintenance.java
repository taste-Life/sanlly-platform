package com.sanlly.production.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Maintenance {
    private String prodMaintenanceId;

    private String course;

    private String operateType;

    private String containerNo;

    private String containerType;

    private String containerUser;

    private String size;

    private String containerTare;

    private String containerLoad;

    private String containerVolume;

    private String grossWeight;

    private String courseType;

    private String isSurrender;

    private String yard;

    private String unitType;

    private String unitCompany;

    private String unitCode;

    private String startDate;

    private String compressor;

    private String control;

    private String softwareVersion;

    private String isCa;

    private String substrateCode;

    private String isTemperature;

    private String isHumidity;

    private String isVentilate;

    private String maintenanceNumber;

    private String modemNumber;

    private String dept;

    private String maintenanceType;

    private String maintenanceSite;

    private String faultType;

    private Date faultTime;

    private String isMaintenance;

    private Integer testingUser;

    private String testingState;

    private BigDecimal testingManHourCost;

    private BigDecimal testingMaterialCost;

    private BigDecimal testingThirdpartyMoney;

    private BigDecimal testingMoney;

    private Date testingTime;

    private Date testingEndTime;

    private Date courseTime;

    private String valuationCurrency;

    private String valuationNo;

    private Integer valuationUser;

    private Date valuationTime;

    private String valuationState;

    private Integer valuationRejectUser;

    private Date valuationRejectTime;

    private Integer valuationWorkingHours;

    private BigDecimal valuationWorkingHoursCost;

    private BigDecimal valuationMaterialCost;

    private BigDecimal valuationTotalCost;

    private BigDecimal valuationTotalCostRmb;

    private Integer respondUser;

    private Date respondTime;

    private BigDecimal respondCost;

    private BigDecimal respondCostRmb;

    private Integer designateUser;

    private Date designateTime;

    private String referralState;

    private Integer finishUser;

    private String referralType;

    private Date referralTime;

    private String predictTime;

    private Double manHour;

    private Date finishTime;

    private Integer finishAuditUser;

    private Date finishAuditTime;

    private String referralRemarks;

    private String isDel;

    private Integer createUser;

    private Date createTime;

    private Integer updateUser;

    private Date updateTime;

    public String getProdMaintenanceId() {
        return prodMaintenanceId;
    }

    public void setProdMaintenanceId(String prodMaintenanceId) {
        this.prodMaintenanceId = prodMaintenanceId == null ? null : prodMaintenanceId.trim();
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course == null ? null : course.trim();
    }

    public String getOperateType() {
        return operateType;
    }

    public void setOperateType(String operateType) {
        this.operateType = operateType == null ? null : operateType.trim();
    }

    public String getContainerNo() {
        return containerNo;
    }

    public void setContainerNo(String containerNo) {
        this.containerNo = containerNo == null ? null : containerNo.trim();
    }

    public String getContainerType() {
        return containerType;
    }

    public void setContainerType(String containerType) {
        this.containerType = containerType == null ? null : containerType.trim();
    }

    public String getContainerUser() {
        return containerUser;
    }

    public void setContainerUser(String containerUser) {
        this.containerUser = containerUser == null ? null : containerUser.trim();
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size == null ? null : size.trim();
    }

    public String getContainerTare() {
        return containerTare;
    }

    public void setContainerTare(String containerTare) {
        this.containerTare = containerTare == null ? null : containerTare.trim();
    }

    public String getContainerLoad() {
        return containerLoad;
    }

    public void setContainerLoad(String containerLoad) {
        this.containerLoad = containerLoad == null ? null : containerLoad.trim();
    }

    public String getContainerVolume() {
        return containerVolume;
    }

    public void setContainerVolume(String containerVolume) {
        this.containerVolume = containerVolume == null ? null : containerVolume.trim();
    }

    public String getGrossWeight() {
        return grossWeight;
    }

    public void setGrossWeight(String grossWeight) {
        this.grossWeight = grossWeight == null ? null : grossWeight.trim();
    }

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType == null ? null : courseType.trim();
    }

    public String getIsSurrender() {
        return isSurrender;
    }

    public void setIsSurrender(String isSurrender) {
        this.isSurrender = isSurrender == null ? null : isSurrender.trim();
    }

    public String getYard() {
        return yard;
    }

    public void setYard(String yard) {
        this.yard = yard == null ? null : yard.trim();
    }

    public String getUnitType() {
        return unitType;
    }

    public void setUnitType(String unitType) {
        this.unitType = unitType == null ? null : unitType.trim();
    }

    public String getUnitCompany() {
        return unitCompany;
    }

    public void setUnitCompany(String unitCompany) {
        this.unitCompany = unitCompany == null ? null : unitCompany.trim();
    }

    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode == null ? null : unitCode.trim();
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate == null ? null : startDate.trim();
    }

    public String getCompressor() {
        return compressor;
    }

    public void setCompressor(String compressor) {
        this.compressor = compressor == null ? null : compressor.trim();
    }

    public String getControl() {
        return control;
    }

    public void setControl(String control) {
        this.control = control == null ? null : control.trim();
    }

    public String getSoftwareVersion() {
        return softwareVersion;
    }

    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion == null ? null : softwareVersion.trim();
    }

    public String getIsCa() {
        return isCa;
    }

    public void setIsCa(String isCa) {
        this.isCa = isCa == null ? null : isCa.trim();
    }

    public String getSubstrateCode() {
        return substrateCode;
    }

    public void setSubstrateCode(String substrateCode) {
        this.substrateCode = substrateCode == null ? null : substrateCode.trim();
    }

    public String getIsTemperature() {
        return isTemperature;
    }

    public void setIsTemperature(String isTemperature) {
        this.isTemperature = isTemperature == null ? null : isTemperature.trim();
    }

    public String getIsHumidity() {
        return isHumidity;
    }

    public void setIsHumidity(String isHumidity) {
        this.isHumidity = isHumidity == null ? null : isHumidity.trim();
    }

    public String getIsVentilate() {
        return isVentilate;
    }

    public void setIsVentilate(String isVentilate) {
        this.isVentilate = isVentilate == null ? null : isVentilate.trim();
    }

    public String getMaintenanceNumber() {
        return maintenanceNumber;
    }

    public void setMaintenanceNumber(String maintenanceNumber) {
        this.maintenanceNumber = maintenanceNumber == null ? null : maintenanceNumber.trim();
    }

    public String getModemNumber() {
        return modemNumber;
    }

    public void setModemNumber(String modemNumber) {
        this.modemNumber = modemNumber == null ? null : modemNumber.trim();
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept == null ? null : dept.trim();
    }

    public String getMaintenanceType() {
        return maintenanceType;
    }

    public void setMaintenanceType(String maintenanceType) {
        this.maintenanceType = maintenanceType == null ? null : maintenanceType.trim();
    }

    public String getMaintenanceSite() {
        return maintenanceSite;
    }

    public void setMaintenanceSite(String maintenanceSite) {
        this.maintenanceSite = maintenanceSite == null ? null : maintenanceSite.trim();
    }

    public String getFaultType() {
        return faultType;
    }

    public void setFaultType(String faultType) {
        this.faultType = faultType == null ? null : faultType.trim();
    }

    public Date getFaultTime() {
        return faultTime;
    }

    public void setFaultTime(Date faultTime) {
        this.faultTime = faultTime;
    }

    public String getIsMaintenance() {
        return isMaintenance;
    }

    public void setIsMaintenance(String isMaintenance) {
        this.isMaintenance = isMaintenance == null ? null : isMaintenance.trim();
    }

    public Integer getTestingUser() {
        return testingUser;
    }

    public void setTestingUser(Integer testingUser) {
        this.testingUser = testingUser;
    }

    public String getTestingState() {
        return testingState;
    }

    public void setTestingState(String testingState) {
        this.testingState = testingState == null ? null : testingState.trim();
    }

    public BigDecimal getTestingManHourCost() {
        return testingManHourCost;
    }

    public void setTestingManHourCost(BigDecimal testingManHourCost) {
        this.testingManHourCost = testingManHourCost;
    }

    public BigDecimal getTestingMaterialCost() {
        return testingMaterialCost;
    }

    public void setTestingMaterialCost(BigDecimal testingMaterialCost) {
        this.testingMaterialCost = testingMaterialCost;
    }

    public BigDecimal getTestingThirdpartyMoney() {
        return testingThirdpartyMoney;
    }

    public void setTestingThirdpartyMoney(BigDecimal testingThirdpartyMoney) {
        this.testingThirdpartyMoney = testingThirdpartyMoney;
    }

    public BigDecimal getTestingMoney() {
        return testingMoney;
    }

    public void setTestingMoney(BigDecimal testingMoney) {
        this.testingMoney = testingMoney;
    }

    public Date getTestingTime() {
        return testingTime;
    }

    public void setTestingTime(Date testingTime) {
        this.testingTime = testingTime;
    }

    public Date getTestingEndTime() {
        return testingEndTime;
    }

    public void setTestingEndTime(Date testingEndTime) {
        this.testingEndTime = testingEndTime;
    }

    public Date getCourseTime() {
        return courseTime;
    }

    public void setCourseTime(Date courseTime) {
        this.courseTime = courseTime;
    }

    public String getValuationCurrency() {
        return valuationCurrency;
    }

    public void setValuationCurrency(String valuationCurrency) {
        this.valuationCurrency = valuationCurrency == null ? null : valuationCurrency.trim();
    }

    public String getValuationNo() {
        return valuationNo;
    }

    public void setValuationNo(String valuationNo) {
        this.valuationNo = valuationNo == null ? null : valuationNo.trim();
    }

    public Integer getValuationUser() {
        return valuationUser;
    }

    public void setValuationUser(Integer valuationUser) {
        this.valuationUser = valuationUser;
    }

    public Date getValuationTime() {
        return valuationTime;
    }

    public void setValuationTime(Date valuationTime) {
        this.valuationTime = valuationTime;
    }

    public String getValuationState() {
        return valuationState;
    }

    public void setValuationState(String valuationState) {
        this.valuationState = valuationState == null ? null : valuationState.trim();
    }

    public Integer getValuationRejectUser() {
        return valuationRejectUser;
    }

    public void setValuationRejectUser(Integer valuationRejectUser) {
        this.valuationRejectUser = valuationRejectUser;
    }

    public Date getValuationRejectTime() {
        return valuationRejectTime;
    }

    public void setValuationRejectTime(Date valuationRejectTime) {
        this.valuationRejectTime = valuationRejectTime;
    }

    public Integer getValuationWorkingHours() {
        return valuationWorkingHours;
    }

    public void setValuationWorkingHours(Integer valuationWorkingHours) {
        this.valuationWorkingHours = valuationWorkingHours;
    }

    public BigDecimal getValuationWorkingHoursCost() {
        return valuationWorkingHoursCost;
    }

    public void setValuationWorkingHoursCost(BigDecimal valuationWorkingHoursCost) {
        this.valuationWorkingHoursCost = valuationWorkingHoursCost;
    }

    public BigDecimal getValuationMaterialCost() {
        return valuationMaterialCost;
    }

    public void setValuationMaterialCost(BigDecimal valuationMaterialCost) {
        this.valuationMaterialCost = valuationMaterialCost;
    }

    public BigDecimal getValuationTotalCost() {
        return valuationTotalCost;
    }

    public void setValuationTotalCost(BigDecimal valuationTotalCost) {
        this.valuationTotalCost = valuationTotalCost;
    }

    public BigDecimal getValuationTotalCostRmb() {
        return valuationTotalCostRmb;
    }

    public void setValuationTotalCostRmb(BigDecimal valuationTotalCostRmb) {
        this.valuationTotalCostRmb = valuationTotalCostRmb;
    }

    public Integer getRespondUser() {
        return respondUser;
    }

    public void setRespondUser(Integer respondUser) {
        this.respondUser = respondUser;
    }

    public Date getRespondTime() {
        return respondTime;
    }

    public void setRespondTime(Date respondTime) {
        this.respondTime = respondTime;
    }

    public BigDecimal getRespondCost() {
        return respondCost;
    }

    public void setRespondCost(BigDecimal respondCost) {
        this.respondCost = respondCost;
    }

    public BigDecimal getRespondCostRmb() {
        return respondCostRmb;
    }

    public void setRespondCostRmb(BigDecimal respondCostRmb) {
        this.respondCostRmb = respondCostRmb;
    }

    public Integer getDesignateUser() {
        return designateUser;
    }

    public void setDesignateUser(Integer designateUser) {
        this.designateUser = designateUser;
    }

    public Date getDesignateTime() {
        return designateTime;
    }

    public void setDesignateTime(Date designateTime) {
        this.designateTime = designateTime;
    }

    public String getReferralState() {
        return referralState;
    }

    public void setReferralState(String referralState) {
        this.referralState = referralState == null ? null : referralState.trim();
    }

    public Integer getFinishUser() {
        return finishUser;
    }

    public void setFinishUser(Integer finishUser) {
        this.finishUser = finishUser;
    }

    public String getReferralType() {
        return referralType;
    }

    public void setReferralType(String referralType) {
        this.referralType = referralType == null ? null : referralType.trim();
    }

    public Date getReferralTime() {
        return referralTime;
    }

    public void setReferralTime(Date referralTime) {
        this.referralTime = referralTime;
    }

    public String getPredictTime() {
        return predictTime;
    }

    public void setPredictTime(String predictTime) {
        this.predictTime = predictTime == null ? null : predictTime.trim();
    }

    public Double getManHour() {
        return manHour;
    }

    public void setManHour(Double manHour) {
        this.manHour = manHour;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    public Integer getFinishAuditUser() {
        return finishAuditUser;
    }

    public void setFinishAuditUser(Integer finishAuditUser) {
        this.finishAuditUser = finishAuditUser;
    }

    public Date getFinishAuditTime() {
        return finishAuditTime;
    }

    public void setFinishAuditTime(Date finishAuditTime) {
        this.finishAuditTime = finishAuditTime;
    }

    public String getReferralRemarks() {
        return referralRemarks;
    }

    public void setReferralRemarks(String referralRemarks) {
        this.referralRemarks = referralRemarks == null ? null : referralRemarks.trim();
    }

    public String getIsDel() {
        return isDel;
    }

    public void setIsDel(String isDel) {
        this.isDel = isDel == null ? null : isDel.trim();
    }

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}