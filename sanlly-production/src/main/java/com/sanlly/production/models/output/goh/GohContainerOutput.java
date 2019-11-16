package com.sanlly.production.models.output.goh;

import java.math.BigDecimal;
import java.util.List;

import com.sanlly.production.models.input.goh.GohContainerEntryInput;

/**
 * 挂衣箱信息
 * 
 * @Package com.sanlly.production.models.output.goh 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年10月24日 下午4:54:03 
 * @version V1.0   
 */
public class GohContainerOutput {
	// 主键
	private Integer gohContainerId;
	// 箱号
	private String containerNo;
	// 用箱人
	private String containerUser;
	// 场站
	private String yard;
	// 修前箱型
	private String beforeContainerType;
	// 尺寸
	private String size;
	// 修后箱型
	private String afterContainerType;
	// 结构
	private String structure;
	// 层数
	private String tierNumber;
	// 改制类型
	private String reshapeType;
	// 共多少梁
	private Double sumBeamNumber;
	// 丢失多少梁
	private Double loseBeamNumber;
	// 水平梁距
	private Double horizontalDistance;
	// 上下梁距
	private Double updownDistance;
	// 箱皮净重
	private String containerWeight;
	// 改箱材料重
	private Double materialWeight;
	// 船名航次
	private String vesselVoyage;
	// 提单号
	private String billOfLadingNo;
	// 目的港
	private String destinationPort;
	// 提箱时间
	private String extractContTime;
	// 检验状态
	private String testingState;
	// 派工状态
	private String referralState;
	// 检验状态
	private String testingStateLang;
	// 派工状态
	private String referralStateLang;
	// 领料状态
	private String pickingState;
	// 备注
	private String containerRemarks;
	// 改制要求
	private Integer requireId;
	// 改制要求名称
	private String requireName;
	// 预计改制箱数
	private Integer estimatedQuantity;
	// 梁数
	private Double beamQuantity;
	// 绳数
	private Double ropeQuantity;
	// 结数
	private Double knotQuantity;
	// 梁距
	private Double beamDistance;
	// 结距
	private Double knotDistance;
	// 前后板距离
	private Double aroundDistance;
	// 客户费用
	private BigDecimal containerCost;
	// 第三方费用
	private BigDecimal thirdPartyCost;
	// 备注
	private String remarks;
	// 改制要求
	private String requireContent;
	// 条目
	private List<GohContainerEntryInput> entryList;

	public Integer getGohContainerId() {
		return gohContainerId;
	}

	public void setGohContainerId(Integer gohContainerId) {
		this.gohContainerId = gohContainerId;
	}

	public String getContainerNo() {
		return containerNo;
	}

	public void setContainerNo(String containerNo) {
		this.containerNo = containerNo;
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

	public String getBeforeContainerType() {
		return beforeContainerType;
	}

	public void setBeforeContainerType(String beforeContainerType) {
		this.beforeContainerType = beforeContainerType;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getAfterContainerType() {
		return afterContainerType;
	}

	public void setAfterContainerType(String afterContainerType) {
		this.afterContainerType = afterContainerType;
	}

	public String getStructure() {
		return structure;
	}

	public void setStructure(String structure) {
		this.structure = structure;
	}

	public String getReshapeType() {
		return reshapeType;
	}

	public void setReshapeType(String reshapeType) {
		this.reshapeType = reshapeType;
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

	public String getContainerWeight() {
		return containerWeight;
	}

	public void setContainerWeight(String containerWeight) {
		this.containerWeight = containerWeight;
	}

	public Double getMaterialWeight() {
		return materialWeight;
	}

	public void setMaterialWeight(Double materialWeight) {
		this.materialWeight = materialWeight;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Integer getRequireId() {
		return requireId;
	}

	public void setRequireId(Integer requireId) {
		this.requireId = requireId;
	}

	public String getRequireName() {
		return requireName;
	}

	public void setRequireName(String requireName) {
		this.requireName = requireName;
	}

	public Integer getEstimatedQuantity() {
		return estimatedQuantity;
	}

	public void setEstimatedQuantity(Integer estimatedQuantity) {
		this.estimatedQuantity = estimatedQuantity;
	}

	public Double getBeamQuantity() {
		return beamQuantity;
	}

	public void setBeamQuantity(Double beamQuantity) {
		this.beamQuantity = beamQuantity;
	}

	public Double getRopeQuantity() {
		return ropeQuantity;
	}

	public void setRopeQuantity(Double ropeQuantity) {
		this.ropeQuantity = ropeQuantity;
	}

	public Double getKnotQuantity() {
		return knotQuantity;
	}

	public void setKnotQuantity(Double knotQuantity) {
		this.knotQuantity = knotQuantity;
	}

	public Double getBeamDistance() {
		return beamDistance;
	}

	public void setBeamDistance(Double beamDistance) {
		this.beamDistance = beamDistance;
	}

	public Double getKnotDistance() {
		return knotDistance;
	}

	public void setKnotDistance(Double knotDistance) {
		this.knotDistance = knotDistance;
	}

	public Double getAroundDistance() {
		return aroundDistance;
	}

	public void setAroundDistance(Double aroundDistance) {
		this.aroundDistance = aroundDistance;
	}

	public String getContainerRemarks() {
		return containerRemarks;
	}

	public void setContainerRemarks(String containerRemarks) {
		this.containerRemarks = containerRemarks;
	}

	public String getRequireContent() {
		return requireContent;
	}

	public void setRequireContent(String requireContent) {
		this.requireContent = requireContent;
	}

	public List<GohContainerEntryInput> getEntryList() {
		return entryList;
	}

	public void setEntryList(List<GohContainerEntryInput> entryList) {
		this.entryList = entryList;
	}

	public String getTierNumber() {
		return tierNumber;
	}

	public void setTierNumber(String tierNumber) {
		this.tierNumber = tierNumber;
	}

	public String getVesselVoyage() {
		return vesselVoyage;
	}

	public void setVesselVoyage(String vesselVoyage) {
		this.vesselVoyage = vesselVoyage;
	}

	public String getBillOfLadingNo() {
		return billOfLadingNo;
	}

	public void setBillOfLadingNo(String billOfLadingNo) {
		this.billOfLadingNo = billOfLadingNo;
	}

	public String getDestinationPort() {
		return destinationPort;
	}

	public void setDestinationPort(String destinationPort) {
		this.destinationPort = destinationPort;
	}

	public String getExtractContTime() {
		return extractContTime;
	}

	public void setExtractContTime(String extractContTime) {
		this.extractContTime = extractContTime;
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

	public String getTestingState() {
		return testingState;
	}

	public void setTestingState(String testingState) {
		this.testingState = testingState;
	}

	public String getReferralState() {
		return referralState;
	}

	public void setReferralState(String referralState) {
		this.referralState = referralState;
	}

	public String getTestingStateLang() {
		return testingStateLang;
	}

	public void setTestingStateLang(String testingStateLang) {
		this.testingStateLang = testingStateLang;
	}

	public String getReferralStateLang() {
		return referralStateLang;
	}

	public void setReferralStateLang(String referralStateLang) {
		this.referralStateLang = referralStateLang;
	}

	public String getPickingState() {
		return pickingState;
	}

	public void setPickingState(String pickingState) {
		this.pickingState = pickingState;
	}

}
