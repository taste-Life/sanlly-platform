package com.sanlly.production.models.input.goh;

/**
 * 挂衣箱整改要求新增
 * 
 * @Package com.sanlly.production.models.input.goh 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年10月22日 下午2:15:44 
 * @version V1.0   
 */
public class GohRequireUpdateInput {
	// 主键
	private Integer gohId;
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
	// 备注
	private String remarks;
	// 改制要求
	private String requireContent;
	// 挂衣箱id
	private Integer[] containerIds;

	public Integer getGohId() {
		return gohId;
	}

	public void setGohId(Integer gohId) {
		this.gohId = gohId;
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

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getRequireContent() {
		return requireContent;
	}

	public void setRequireContent(String requireContent) {
		this.requireContent = requireContent;
	}

	public Integer[] getContainerIds() {
		return containerIds;
	}

	public void setContainerIds(Integer[] containerIds) {
		this.containerIds = containerIds;
	}

}
