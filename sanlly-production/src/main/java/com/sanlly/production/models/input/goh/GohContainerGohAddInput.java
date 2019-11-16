package com.sanlly.production.models.input.goh;

import java.math.BigDecimal;
import java.util.List;

/**
 * 挂衣箱添加
 * 
 * @Package com.sanlly.production.models.input.goh 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年10月23日 下午5:02:32 
 * @version V1.0   
 */
public class GohContainerGohAddInput {
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
	// 备注
	private String containerRemarks;
	// 客户费用
	private BigDecimal containerCost;
	// 第三方费用
	private BigDecimal thirdPartyCost;
	// 改制要求
	private Integer requireId;
	// 条目
	private List<GohContainerEntryInput> entryList;

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

	public String getContainerRemarks() {
		return containerRemarks;
	}

	public void setContainerRemarks(String containerRemarks) {
		this.containerRemarks = containerRemarks;
	}

	public Integer getRequireId() {
		return requireId;
	}

	public void setRequireId(Integer requireId) {
		this.requireId = requireId;
	}

	public Integer getGohContainerId() {
		return gohContainerId;
	}

	public void setGohContainerId(Integer gohContainerId) {
		this.gohContainerId = gohContainerId;
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

}
