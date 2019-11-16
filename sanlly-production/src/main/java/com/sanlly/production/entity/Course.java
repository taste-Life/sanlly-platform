package com.sanlly.production.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Course {
    private String prodCourseId;

    private String containerNo;

    private String isPreview;

    private String size;

    private String containerCategory;

    private String containerType;

    private String containerAge;

    private String containerTare;

    private String containerLoad;

    private String containerVolume;

    private String grossWeight;

    private String unitType;

    private String rightAngle;

    private String isLabel;

    private String containerOwner;

    private String containerBelong;

    private String containerUser;

    private String containerGrade;

    private String containerCondition;

    private String billOfLadingNo;

    private String vesselVoyage;

    private String domesticForeignTrade;

    private String isGonContainer;

    private String isFreezeDry;

    private String isSurrender;

    private String surrenderCourse;

    private String labelling;

    private String yardContainerType;

    private String yardContGrade;

    private String leadSealing;

    private String bareWeight;

    private String isCleanout;

    private String isLocator;

    private String motorcade;

    private String carNumber;

    private String yard;

    private String courseType;

    private Date courseTime;

    private Integer testingUser;

    private String testingState;

    private String testingReject;

    private Date testingTime;

    private Date testingEndTime;

    private BigDecimal testingManHourCost;

    private BigDecimal testingMaterialCost;

    private BigDecimal testingThirdpartyMoney;

    private BigDecimal testingMoney;

    private String auditType;

    private Integer auditUser;

    private Date auditTime;

    private String testingRemarks;

    private String surrenderType;

    private String surrenderBillType;

    private String isOwnerCharge;

    private String valuationNo;

    private String useReplyState;

    private Date useReplyTime;

    private String masterReplyState;

    private Date masterReplyTime;

    private String thirdpartyChargeState;

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

    private String urgency;

    private Date valuationTime;

    private Integer valuationUser;

    private String valuationReject;

    private String valuationRemarks;

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

    public String getIsPreview() {
        return isPreview;
    }

    public void setIsPreview(String isPreview) {
        this.isPreview = isPreview == null ? null : isPreview.trim();
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size == null ? null : size.trim();
    }

    public String getContainerCategory() {
        return containerCategory;
    }

    public void setContainerCategory(String containerCategory) {
        this.containerCategory = containerCategory == null ? null : containerCategory.trim();
    }

    public String getContainerType() {
        return containerType;
    }

    public void setContainerType(String containerType) {
        this.containerType = containerType == null ? null : containerType.trim();
    }

    public String getContainerAge() {
        return containerAge;
    }

    public void setContainerAge(String containerAge) {
        this.containerAge = containerAge == null ? null : containerAge.trim();
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

    public String getUnitType() {
        return unitType;
    }

    public void setUnitType(String unitType) {
        this.unitType = unitType == null ? null : unitType.trim();
    }

    public String getRightAngle() {
        return rightAngle;
    }

    public void setRightAngle(String rightAngle) {
        this.rightAngle = rightAngle == null ? null : rightAngle.trim();
    }

    public String getIsLabel() {
        return isLabel;
    }

    public void setIsLabel(String isLabel) {
        this.isLabel = isLabel == null ? null : isLabel.trim();
    }

    public String getContainerOwner() {
        return containerOwner;
    }

    public void setContainerOwner(String containerOwner) {
        this.containerOwner = containerOwner == null ? null : containerOwner.trim();
    }

    public String getContainerBelong() {
        return containerBelong;
    }

    public void setContainerBelong(String containerBelong) {
        this.containerBelong = containerBelong == null ? null : containerBelong.trim();
    }

    public String getContainerUser() {
        return containerUser;
    }

    public void setContainerUser(String containerUser) {
        this.containerUser = containerUser == null ? null : containerUser.trim();
    }

    public String getContainerGrade() {
        return containerGrade;
    }

    public void setContainerGrade(String containerGrade) {
        this.containerGrade = containerGrade == null ? null : containerGrade.trim();
    }

    public String getContainerCondition() {
        return containerCondition;
    }

    public void setContainerCondition(String containerCondition) {
        this.containerCondition = containerCondition == null ? null : containerCondition.trim();
    }

    public String getBillOfLadingNo() {
        return billOfLadingNo;
    }

    public void setBillOfLadingNo(String billOfLadingNo) {
        this.billOfLadingNo = billOfLadingNo == null ? null : billOfLadingNo.trim();
    }

    public String getVesselVoyage() {
        return vesselVoyage;
    }

    public void setVesselVoyage(String vesselVoyage) {
        this.vesselVoyage = vesselVoyage == null ? null : vesselVoyage.trim();
    }

    public String getDomesticForeignTrade() {
        return domesticForeignTrade;
    }

    public void setDomesticForeignTrade(String domesticForeignTrade) {
        this.domesticForeignTrade = domesticForeignTrade == null ? null : domesticForeignTrade.trim();
    }

    public String getIsGonContainer() {
        return isGonContainer;
    }

    public void setIsGonContainer(String isGonContainer) {
        this.isGonContainer = isGonContainer == null ? null : isGonContainer.trim();
    }

    public String getIsFreezeDry() {
        return isFreezeDry;
    }

    public void setIsFreezeDry(String isFreezeDry) {
        this.isFreezeDry = isFreezeDry == null ? null : isFreezeDry.trim();
    }

    public String getIsSurrender() {
        return isSurrender;
    }

    public void setIsSurrender(String isSurrender) {
        this.isSurrender = isSurrender == null ? null : isSurrender.trim();
    }

    public String getSurrenderCourse() {
        return surrenderCourse;
    }

    public void setSurrenderCourse(String surrenderCourse) {
        this.surrenderCourse = surrenderCourse == null ? null : surrenderCourse.trim();
    }

    public String getLabelling() {
        return labelling;
    }

    public void setLabelling(String labelling) {
        this.labelling = labelling == null ? null : labelling.trim();
    }

    public String getYardContainerType() {
        return yardContainerType;
    }

    public void setYardContainerType(String yardContainerType) {
        this.yardContainerType = yardContainerType == null ? null : yardContainerType.trim();
    }

    public String getYardContGrade() {
        return yardContGrade;
    }

    public void setYardContGrade(String yardContGrade) {
        this.yardContGrade = yardContGrade == null ? null : yardContGrade.trim();
    }

    public String getLeadSealing() {
        return leadSealing;
    }

    public void setLeadSealing(String leadSealing) {
        this.leadSealing = leadSealing == null ? null : leadSealing.trim();
    }

    public String getBareWeight() {
        return bareWeight;
    }

    public void setBareWeight(String bareWeight) {
        this.bareWeight = bareWeight == null ? null : bareWeight.trim();
    }

    public String getIsCleanout() {
        return isCleanout;
    }

    public void setIsCleanout(String isCleanout) {
        this.isCleanout = isCleanout == null ? null : isCleanout.trim();
    }

    public String getIsLocator() {
        return isLocator;
    }

    public void setIsLocator(String isLocator) {
        this.isLocator = isLocator == null ? null : isLocator.trim();
    }

    public String getMotorcade() {
        return motorcade;
    }

    public void setMotorcade(String motorcade) {
        this.motorcade = motorcade == null ? null : motorcade.trim();
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber == null ? null : carNumber.trim();
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

    public Date getCourseTime() {
        return courseTime;
    }

    public void setCourseTime(Date courseTime) {
        this.courseTime = courseTime;
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

    public String getTestingRemarks() {
        return testingRemarks;
    }

    public void setTestingRemarks(String testingRemarks) {
        this.testingRemarks = testingRemarks == null ? null : testingRemarks.trim();
    }

    public String getSurrenderType() {
        return surrenderType;
    }

    public void setSurrenderType(String surrenderType) {
        this.surrenderType = surrenderType == null ? null : surrenderType.trim();
    }

    public String getSurrenderBillType() {
        return surrenderBillType;
    }

    public void setSurrenderBillType(String surrenderBillType) {
        this.surrenderBillType = surrenderBillType == null ? null : surrenderBillType.trim();
    }

    public String getIsOwnerCharge() {
        return isOwnerCharge;
    }

    public void setIsOwnerCharge(String isOwnerCharge) {
        this.isOwnerCharge = isOwnerCharge == null ? null : isOwnerCharge.trim();
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

    public String getThirdpartyChargeState() {
        return thirdpartyChargeState;
    }

    public void setThirdpartyChargeState(String thirdpartyChargeState) {
        this.thirdpartyChargeState = thirdpartyChargeState == null ? null : thirdpartyChargeState.trim();
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

    public String getUrgency() {
        return urgency;
    }

    public void setUrgency(String urgency) {
        this.urgency = urgency == null ? null : urgency.trim();
    }

    public Date getValuationTime() {
        return valuationTime;
    }

    public void setValuationTime(Date valuationTime) {
        this.valuationTime = valuationTime;
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
}