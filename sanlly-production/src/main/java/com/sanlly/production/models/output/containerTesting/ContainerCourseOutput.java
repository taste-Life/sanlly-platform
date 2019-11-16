package com.sanlly.production.models.output.containerTesting;

/**
 * @Package com.sanlly.production.models.output.app.containerTesting 
 * @Description: TODO 箱体完整信息实体-输出
 * @author tianzhl   
 * @date 2019年8月9日 下午5:09:06 
 * @version V1.0   
 */
public class ContainerCourseOutput {

	// TODO 箱子Id
	private String prodCourseId;
	// TODO 箱号
	private String containerNo;
	// TODO 尺寸
	private String size;
	// TODO 干箱冷箱
	private String containerCategory;
	// TODO 箱型
	private String containerType;
	// TODO 进场类别
	private String entryType;
	// TODO 用箱人
	private String containerUser;
	// TODO 进场日期
	private String entryDate;
	// TODO 审核状态
	private String auditType;
	// TODO 箱况
	private String containerCondition;
	// TODO 提单号
	private String billOfLadingNo;
	// TODO 船名航次
	private String vesselVoyage;
	// TODO 箱龄
	private String containerAge;
	// TODO 内外贸箱
	private String domesticForeignTrade;
	// TODO 箱等级
	private String containerLevel;
	// TODO 冷代干
	private String isFreezeDry;
	// TODO 挂衣箱
	private String isGonContainer;
	// TODO A标
	private String labelling;
	// TODO 备注
	private String remark;
	// TODO 皮重
	private String containerTare;
	// TODO 载重
	private String containerLoad;
	// TODO 铅封
	private String leadSealing;
	// TODO 空重
	private String bareWeight;
	// TODO 容积
	private String containerVolume;
	// TODO 总重
	private String grossWeight;
	// TODO 箱况类别
	private String containerConditionCategory;
	// TODO 进场照片
	private String testingPhoto;
	// TODO 箱东
	private String containerOwner;
	// TODO 检验人
	private String testingUser;
	// TODO 检验时间
	private String testingTime;
	// TODO 箱属
	private String containerBelong;
	// TODO 机组类型
	private String unitType;
	// TODO 是否退租
	private String isSurrender;
	// TODO 是否直角
	private String rightAngle;
	// TODO 是否清洗
	private String isCleanout;
	// TODO 是否定位器
	private String isLocator;
	// TODO 有无箱标
	private String isLabel;
	// TODO 审核状态
	private String auditTypeNameLang;
	// TODO 箱况
	private String containerConditionNameLang;
	// 报价币种
	private String valuationCurrency;
	// 用箱人估价状态
	private String useReplyState;
	// 用箱人估价状态
	private String useReplyStateNameLang;
	
	//箱东估价状态
	private String masterReplyState;
	
	//箱东估价状态
	private String masterReplyStateNameLang;
	
	//箱东扣款 -是否
	private String isMasterCharge;
	
	// 场站
	private String yardKey;
	// 派工状态
	private String referralStateKey;
	// 派工状态
	private String referralStateLang;
	
	// 质检状态
	private String qualityResultLang;
	// 结构
	private String structure;
	// 共多少梁
	private Double sumBeamNumber;
	// 丢失多少梁
	private Double loseBeamNumber;
	// 水平梁距
	private Double horizontalDistance;
	// 上下梁距
	private Double updownDistance;
	// 备注
	private String gohRemark;
	// 是否继续作挂衣箱使用
	private String isGoh;

	public String getProdCourseId() {
		return prodCourseId;
	}

	public void setProdCourseId(String prodCourseId) {
		this.prodCourseId = prodCourseId;
	}

	public String getContainerNo() {
		return containerNo;
	}

	public void setContainerNo(String containerNo) {
		this.containerNo = containerNo;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getContainerCategory() {
		return containerCategory;
	}

	public void setContainerCategory(String containerCategory) {
		this.containerCategory = containerCategory;
	}

	public String getContainerType() {
		return containerType;
	}

	public void setContainerType(String containerType) {
		this.containerType = containerType;
	}

	public String getEntryType() {
		return entryType;
	}

	public void setEntryType(String entryType) {
		this.entryType = entryType;
	}

	public String getContainerUser() {
		return containerUser;
	}

	public void setContainerUser(String containerUser) {
		this.containerUser = containerUser;
	}

	public String getEntryDate() {
		return entryDate;
	}

	public void setEntryDate(String entryDate) {
		this.entryDate = entryDate;
	}

	public String getAuditType() {
		return auditType;
	}

	public void setAuditType(String auditType) {
		this.auditType = auditType;
	}

	public String getContainerCondition() {
		return containerCondition;
	}

	public void setContainerCondition(String containerCondition) {
		this.containerCondition = containerCondition;
	}

	public String getBillOfLadingNo() {
		return billOfLadingNo;
	}

	public void setBillOfLadingNo(String billOfLadingNo) {
		this.billOfLadingNo = billOfLadingNo;
	}

	public String getVesselVoyage() {
		return vesselVoyage;
	}

	public void setVesselVoyage(String vesselVoyage) {
		this.vesselVoyage = vesselVoyage;
	}

	public String getContainerAge() {
		return containerAge;
	}

	public void setContainerAge(String containerAge) {
		this.containerAge = containerAge;
	}

	public String getDomesticForeignTrade() {
		return domesticForeignTrade;
	}

	public void setDomesticForeignTrade(String domesticForeignTrade) {
		this.domesticForeignTrade = domesticForeignTrade;
	}

	public String getContainerLevel() {
		return containerLevel;
	}

	public void setContainerLevel(String containerLevel) {
		this.containerLevel = containerLevel;
	}

	public String getIsFreezeDry() {
		return isFreezeDry;
	}

	public void setIsFreezeDry(String isFreezeDry) {
		this.isFreezeDry = isFreezeDry;
	}

	public String getIsGonContainer() {
		return isGonContainer;
	}

	public void setIsGonContainer(String isGonContainer) {
		this.isGonContainer = isGonContainer;
	}

	public String getLabelling() {
		return labelling;
	}

	public void setLabelling(String labelling) {
		this.labelling = labelling;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getContainerTare() {
		return containerTare;
	}

	public void setContainerTare(String containerTare) {
		this.containerTare = containerTare;
	}

	public String getContainerLoad() {
		return containerLoad;
	}

	public void setContainerLoad(String containerLoad) {
		this.containerLoad = containerLoad;
	}

	public String getLeadSealing() {
		return leadSealing;
	}

	public void setLeadSealing(String leadSealing) {
		this.leadSealing = leadSealing;
	}

	public String getBareWeight() {
		return bareWeight;
	}

	public void setBareWeight(String bareWeight) {
		this.bareWeight = bareWeight;
	}

	public String getContainerVolume() {
		return containerVolume;
	}

	public void setContainerVolume(String containerVolume) {
		this.containerVolume = containerVolume;
	}

	public String getGrossWeight() {
		return grossWeight;
	}

	public void setGrossWeight(String grossWeight) {
		this.grossWeight = grossWeight;
	}

	public String getContainerConditionCategory() {
		return containerConditionCategory;
	}

	public void setContainerConditionCategory(String containerConditionCategory) {
		this.containerConditionCategory = containerConditionCategory;
	}

	public String getTestingPhoto() {
		return testingPhoto;
	}

	public void setTestingPhoto(String testingPhoto) {
		this.testingPhoto = testingPhoto;
	}

	public String getContainerOwner() {
		return containerOwner;
	}

	public void setContainerOwner(String containerOwner) {
		this.containerOwner = containerOwner;
	}

	public String getTestingUser() {
		return testingUser;
	}

	public void setTestingUser(String testingUser) {
		this.testingUser = testingUser;
	}

	public String getTestingTime() {
		return testingTime;
	}

	public void setTestingTime(String testingTime) {
		this.testingTime = testingTime;
	}

	public String getContainerBelong() {
		return containerBelong;
	}

	public void setContainerBelong(String containerBelong) {
		this.containerBelong = containerBelong;
	}

	public String getUnitType() {
		return unitType;
	}

	public void setUnitType(String unitType) {
		this.unitType = unitType;
	}

	public String getIsSurrender() {
		return isSurrender;
	}

	public void setIsSurrender(String isSurrender) {
		this.isSurrender = isSurrender;
	}

	public String getRightAngle() {
		return rightAngle;
	}

	public void setRightAngle(String rightAngle) {
		this.rightAngle = rightAngle;
	}

	public String getIsCleanout() {
		return isCleanout;
	}

	public void setIsCleanout(String isCleanout) {
		this.isCleanout = isCleanout;
	}

	public String getIsLocator() {
		return isLocator;
	}

	public void setIsLocator(String isLocator) {
		this.isLocator = isLocator;
	}

	public String getIsLabel() {
		return isLabel;
	}

	public void setIsLabel(String isLabel) {
		this.isLabel = isLabel;
	}

	public String getAuditTypeNameLang() {
		return auditTypeNameLang;
	}

	public void setAuditTypeNameLang(String auditTypeNameLang) {
		this.auditTypeNameLang = auditTypeNameLang;
	}

	public String getContainerConditionNameLang() {
		return containerConditionNameLang;
	}

	public void setContainerConditionNameLang(String containerConditionNameLang) {
		this.containerConditionNameLang = containerConditionNameLang;
	}

	public String getValuationCurrency() {
		return valuationCurrency;
	}

	public void setValuationCurrency(String valuationCurrency) {
		this.valuationCurrency = valuationCurrency;
	}

	public String getUseReplyState() {
		return useReplyState;
	}

	public void setUseReplyState(String useReplyState) {
		this.useReplyState = useReplyState;
	}

	public String getUseReplyStateNameLang() {
		return useReplyStateNameLang;
	}

	public void setUseReplyStateNameLang(String useReplyStateNameLang) {
		this.useReplyStateNameLang = useReplyStateNameLang;
	}

	public String getYardKey() {
		return yardKey;
	}

	public void setYardKey(String yardKey) {
		this.yardKey = yardKey;
	}

	public String getReferralStateKey() {
		return referralStateKey;
	}

	public void setReferralStateKey(String referralStateKey) {
		this.referralStateKey = referralStateKey;
	}

	public String getReferralStateLang() {
		return referralStateLang;
	}

	public void setReferralStateLang(String referralStateLang) {
		this.referralStateLang = referralStateLang;
	}

	public String getQualityResultLang() {
		return qualityResultLang;
	}

	public void setQualityResultLang(String qualityResultLang) {
		this.qualityResultLang = qualityResultLang;
	}

	public String getStructure() {
		return structure;
	}

	public void setStructure(String structure) {
		this.structure = structure;
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

	public String getGohRemark() {
		return gohRemark;
	}

	public void setGohRemark(String gohRemark) {
		this.gohRemark = gohRemark;
	}

	public String getIsGoh() {
		return isGoh;
	}

	public void setIsGoh(String isGoh) {
		this.isGoh = isGoh;
	}

	public String getMasterReplyState() {
		return masterReplyState;
	}

	public void setMasterReplyState(String masterReplyState) {
		this.masterReplyState = masterReplyState;
	}

	public String getMasterReplyStateNameLang() {
		return masterReplyStateNameLang;
	}

	public void setMasterReplyStateNameLang(String masterReplyStateNameLang) {
		this.masterReplyStateNameLang = masterReplyStateNameLang;
	}

	public String getIsMasterCharge() {
		return isMasterCharge;
	}

	public void setIsMasterCharge(String isMasterCharge) {
		this.isMasterCharge = isMasterCharge;
	}

}
