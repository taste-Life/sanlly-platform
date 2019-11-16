package com.sanlly.production.models.input.goh;

/**
 * 挂衣箱基础信息添加
 * 
 * @Package com.sanlly.production.models.input.goh 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年10月22日 下午7:51:41 
 * @version V1.0   
 */
public class GohContainerAddInput {
	// 进场id
	private String prodCourseId;
	// 结构
	private String structure;
	// 共多少梁
	private Integer sumBeamNumber;
	// 丢失多少梁
	private Integer loseBeamNumber;
	// 水平梁距
	private Double horizontalDistance;
	// 上下梁距
	private Double updownDistance;
	// 是否继续做挂衣箱使用
	private String isGoh;
	// 备注
	private String gohRemark;

	public String getProdCourseId() {
		return prodCourseId;
	}

	public void setProdCourseId(String prodCourseId) {
		this.prodCourseId = prodCourseId;
	}

	public String getStructure() {
		return structure;
	}

	public void setStructure(String structure) {
		this.structure = structure;
	}

	public Integer getSumBeamNumber() {
		return sumBeamNumber;
	}

	public void setSumBeamNumber(Integer sumBeamNumber) {
		this.sumBeamNumber = sumBeamNumber;
	}

	public Integer getLoseBeamNumber() {
		return loseBeamNumber;
	}

	public void setLoseBeamNumber(Integer loseBeamNumber) {
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

	public String getIsGoh() {
		return isGoh;
	}

	public void setIsGoh(String isGoh) {
		this.isGoh = isGoh;
	}

	public String getGohRemark() {
		return gohRemark;
	}

	public void setGohRemark(String gohRemark) {
		this.gohRemark = gohRemark;
	}

}
