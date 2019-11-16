package com.sanlly.production.entity;

import java.math.BigDecimal;
import java.util.Date;

public class UnitCourse {
    private String prodCourseId;

    private String containerNo;

    private String zone;

    private String isPreview;

    private String previewState;

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

    private String isVentilation;

    private String isFireTest;

    private String ptiType;

    private String surrenderCourse;

    private String outRemarks;

    private String unitState;

    private Integer testingUser;

    private String testingState;

    private BigDecimal testingManHourCost;

    private BigDecimal testingMaterialCost;

    private BigDecimal testingThirdpartyMoney;

    private BigDecimal testingMoney;

    private String testingReject;

    private Date testingTime;

    private Date testingEndTime;

    private String testingRemarks;

    private String auditType;

    private Integer auditUser;

    private Date auditTime;

    private String valuationNo;

    private String useReplyState;

    private Date useReplyTime;

    private String thirdpartyChargeState;

    private String masterReplyState;

    private Date masterReplyTime;

    private Integer alreadyUseContUser;

    private String valuationCurrency;

    private BigDecimal valuationManHourCost;

    private BigDecimal valuationMaterialCost;

    private BigDecimal valuationThirdpartyMoney;

    private BigDecimal valuationMoney;

    private BigDecimal masterReplyMoneyRmb;

    private BigDecimal masterReplyMoneyUsd;

    private BigDecimal useReplyMoneyRmb;

    private BigDecimal useReplyMoneyUsd;

    private BigDecimal receiptsMasterMoneyRmb;

    private BigDecimal receiptsMasterMoneyUsd;

    private BigDecimal receiptsUseMoneyRmb;

    private BigDecimal receiptsUseMoneyUsd;

    private Integer valuationUser;

    private String valuationReject;

    private String valuationRemarks;

    private Date valuationTime;

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

    private String qualityType;

    private String qualityState;

    private String qualityResult;

    private Integer qualityUser;

    private Date qualityTime;

    private Double qualityTimeout;

    private String pkQualityState;

    private Integer pkQualityUser;

    private Date pkQualityTime;

    private String pkQualityRemarks;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private String size;

    private String containerType;

    private String containerUser;

    private String yard;

    private String courseType;

    public String getProdCourseId() {
        return prodCourseId;
    }

    public void setProdCourseId(String prodCourseId) {
        this.prodCourseId = prodCourseId == null ? null : prodCourseId.trim();
    }

    public String getContainerNo() {
        return containerNo;
    }

    public void setContainerNo(String containerNo) {
        this.containerNo = containerNo == null ? null : containerNo.trim();
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone == null ? null : zone.trim();
    }

    public String getIsPreview() {
        return isPreview;
    }

    public void setIsPreview(String isPreview) {
        this.isPreview = isPreview == null ? null : isPreview.trim();
    }

    public String getPreviewState() {
        return previewState;
    }

    public void setPreviewState(String previewState) {
        this.previewState = previewState == null ? null : previewState.trim();
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

    public String getIsVentilation() {
        return isVentilation;
    }

    public void setIsVentilation(String isVentilation) {
        this.isVentilation = isVentilation == null ? null : isVentilation.trim();
    }

    public String getIsFireTest() {
        return isFireTest;
    }

    public void setIsFireTest(String isFireTest) {
        this.isFireTest = isFireTest == null ? null : isFireTest.trim();
    }

    public String getPtiType() {
        return ptiType;
    }

    public void setPtiType(String ptiType) {
        this.ptiType = ptiType == null ? null : ptiType.trim();
    }

    public String getSurrenderCourse() {
        return surrenderCourse;
    }

    public void setSurrenderCourse(String surrenderCourse) {
        this.surrenderCourse = surrenderCourse == null ? null : surrenderCourse.trim();
    }

    public String getOutRemarks() {
        return outRemarks;
    }

    public void setOutRemarks(String outRemarks) {
        this.outRemarks = outRemarks == null ? null : outRemarks.trim();
    }

    public String getUnitState() {
        return unitState;
    }

    public void setUnitState(String unitState) {
        this.unitState = unitState == null ? null : unitState.trim();
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

    public String getTestingReject() {
        return testingReject;
    }

    public void setTestingReject(String testingReject) {
        this.testingReject = testingReject == null ? null : testingReject.trim();
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

    public String getTestingRemarks() {
        return testingRemarks;
    }

    public void setTestingRemarks(String testingRemarks) {
        this.testingRemarks = testingRemarks == null ? null : testingRemarks.trim();
    }

    public String getAuditType() {
        return auditType;
    }

    public void setAuditType(String auditType) {
        this.auditType = auditType == null ? null : auditType.trim();
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

    public String getValuationNo() {
        return valuationNo;
    }

    public void setValuationNo(String valuationNo) {
        this.valuationNo = valuationNo == null ? null : valuationNo.trim();
    }

    public String getUseReplyState() {
        return useReplyState;
    }

    public void setUseReplyState(String useReplyState) {
        this.useReplyState = useReplyState == null ? null : useReplyState.trim();
    }

    public Date getUseReplyTime() {
        return useReplyTime;
    }

    public void setUseReplyTime(Date useReplyTime) {
        this.useReplyTime = useReplyTime;
    }

    public String getThirdpartyChargeState() {
        return thirdpartyChargeState;
    }

    public void setThirdpartyChargeState(String thirdpartyChargeState) {
        this.thirdpartyChargeState = thirdpartyChargeState == null ? null : thirdpartyChargeState.trim();
    }

    public String getMasterReplyState() {
        return masterReplyState;
    }

    public void setMasterReplyState(String masterReplyState) {
        this.masterReplyState = masterReplyState == null ? null : masterReplyState.trim();
    }

    public Date getMasterReplyTime() {
        return masterReplyTime;
    }

    public void setMasterReplyTime(Date masterReplyTime) {
        this.masterReplyTime = masterReplyTime;
    }

    public Integer getAlreadyUseContUser() {
        return alreadyUseContUser;
    }

    public void setAlreadyUseContUser(Integer alreadyUseContUser) {
        this.alreadyUseContUser = alreadyUseContUser;
    }

    public String getValuationCurrency() {
        return valuationCurrency;
    }

    public void setValuationCurrency(String valuationCurrency) {
        this.valuationCurrency = valuationCurrency == null ? null : valuationCurrency.trim();
    }

    public BigDecimal getValuationManHourCost() {
        return valuationManHourCost;
    }

    public void setValuationManHourCost(BigDecimal valuationManHourCost) {
        this.valuationManHourCost = valuationManHourCost;
    }

    public BigDecimal getValuationMaterialCost() {
        return valuationMaterialCost;
    }

    public void setValuationMaterialCost(BigDecimal valuationMaterialCost) {
        this.valuationMaterialCost = valuationMaterialCost;
    }

    public BigDecimal getValuationThirdpartyMoney() {
        return valuationThirdpartyMoney;
    }

    public void setValuationThirdpartyMoney(BigDecimal valuationThirdpartyMoney) {
        this.valuationThirdpartyMoney = valuationThirdpartyMoney;
    }

    public BigDecimal getValuationMoney() {
        return valuationMoney;
    }

    public void setValuationMoney(BigDecimal valuationMoney) {
        this.valuationMoney = valuationMoney;
    }

    public BigDecimal getMasterReplyMoneyRmb() {
        return masterReplyMoneyRmb;
    }

    public void setMasterReplyMoneyRmb(BigDecimal masterReplyMoneyRmb) {
        this.masterReplyMoneyRmb = masterReplyMoneyRmb;
    }

    public BigDecimal getMasterReplyMoneyUsd() {
        return masterReplyMoneyUsd;
    }

    public void setMasterReplyMoneyUsd(BigDecimal masterReplyMoneyUsd) {
        this.masterReplyMoneyUsd = masterReplyMoneyUsd;
    }

    public BigDecimal getUseReplyMoneyRmb() {
        return useReplyMoneyRmb;
    }

    public void setUseReplyMoneyRmb(BigDecimal useReplyMoneyRmb) {
        this.useReplyMoneyRmb = useReplyMoneyRmb;
    }

    public BigDecimal getUseReplyMoneyUsd() {
        return useReplyMoneyUsd;
    }

    public void setUseReplyMoneyUsd(BigDecimal useReplyMoneyUsd) {
        this.useReplyMoneyUsd = useReplyMoneyUsd;
    }

    public BigDecimal getReceiptsMasterMoneyRmb() {
        return receiptsMasterMoneyRmb;
    }

    public void setReceiptsMasterMoneyRmb(BigDecimal receiptsMasterMoneyRmb) {
        this.receiptsMasterMoneyRmb = receiptsMasterMoneyRmb;
    }

    public BigDecimal getReceiptsMasterMoneyUsd() {
        return receiptsMasterMoneyUsd;
    }

    public void setReceiptsMasterMoneyUsd(BigDecimal receiptsMasterMoneyUsd) {
        this.receiptsMasterMoneyUsd = receiptsMasterMoneyUsd;
    }

    public BigDecimal getReceiptsUseMoneyRmb() {
        return receiptsUseMoneyRmb;
    }

    public void setReceiptsUseMoneyRmb(BigDecimal receiptsUseMoneyRmb) {
        this.receiptsUseMoneyRmb = receiptsUseMoneyRmb;
    }

    public BigDecimal getReceiptsUseMoneyUsd() {
        return receiptsUseMoneyUsd;
    }

    public void setReceiptsUseMoneyUsd(BigDecimal receiptsUseMoneyUsd) {
        this.receiptsUseMoneyUsd = receiptsUseMoneyUsd;
    }

    public Integer getValuationUser() {
        return valuationUser;
    }

    public void setValuationUser(Integer valuationUser) {
        this.valuationUser = valuationUser;
    }

    public String getValuationReject() {
        return valuationReject;
    }

    public void setValuationReject(String valuationReject) {
        this.valuationReject = valuationReject == null ? null : valuationReject.trim();
    }

    public String getValuationRemarks() {
        return valuationRemarks;
    }

    public void setValuationRemarks(String valuationRemarks) {
        this.valuationRemarks = valuationRemarks == null ? null : valuationRemarks.trim();
    }

    public Date getValuationTime() {
        return valuationTime;
    }

    public void setValuationTime(Date valuationTime) {
        this.valuationTime = valuationTime;
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

    public String getQualityType() {
        return qualityType;
    }

    public void setQualityType(String qualityType) {
        this.qualityType = qualityType == null ? null : qualityType.trim();
    }

    public String getQualityState() {
        return qualityState;
    }

    public void setQualityState(String qualityState) {
        this.qualityState = qualityState == null ? null : qualityState.trim();
    }

    public String getQualityResult() {
        return qualityResult;
    }

    public void setQualityResult(String qualityResult) {
        this.qualityResult = qualityResult == null ? null : qualityResult.trim();
    }

    public Integer getQualityUser() {
        return qualityUser;
    }

    public void setQualityUser(Integer qualityUser) {
        this.qualityUser = qualityUser;
    }

    public Date getQualityTime() {
        return qualityTime;
    }

    public void setQualityTime(Date qualityTime) {
        this.qualityTime = qualityTime;
    }

    public Double getQualityTimeout() {
        return qualityTimeout;
    }

    public void setQualityTimeout(Double qualityTimeout) {
        this.qualityTimeout = qualityTimeout;
    }

    public String getPkQualityState() {
        return pkQualityState;
    }

    public void setPkQualityState(String pkQualityState) {
        this.pkQualityState = pkQualityState == null ? null : pkQualityState.trim();
    }

    public Integer getPkQualityUser() {
        return pkQualityUser;
    }

    public void setPkQualityUser(Integer pkQualityUser) {
        this.pkQualityUser = pkQualityUser;
    }

    public Date getPkQualityTime() {
        return pkQualityTime;
    }

    public void setPkQualityTime(Date pkQualityTime) {
        this.pkQualityTime = pkQualityTime;
    }

    public String getPkQualityRemarks() {
        return pkQualityRemarks;
    }

    public void setPkQualityRemarks(String pkQualityRemarks) {
        this.pkQualityRemarks = pkQualityRemarks == null ? null : pkQualityRemarks.trim();
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

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size == null ? null : size.trim();
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

    public String getYard() {
        return yard;
    }

    public void setYard(String yard) {
        this.yard = yard == null ? null : yard.trim();
    }

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType == null ? null : courseType.trim();
    }
}