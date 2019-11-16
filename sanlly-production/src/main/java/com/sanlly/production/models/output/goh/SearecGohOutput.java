package com.sanlly.production.models.output.goh;

/**
 * 挂衣箱列表
 * 
 * @Package com.sanlly.production.models.output.goh 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年10月21日 下午5:00:56 
 * @version V1.0   
 */
public class SearecGohOutput {
	// 主键
	private Integer gohContainerId;
	// 箱号
	private String containerNo;
	// 用箱人
	private String containerUserLang;
	// 场站
	private String yardLang;
	// 共多少梁
	private Double sumBeamNumber;
	// 丢失多少梁
	private Double loseBeamNumber;
	// 水平梁距
	private Double horizontalDistance;
	// 上下梁距
	private Double updownDistance;
	// 改制类型
	private String reshapeTypeLang;

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

	public String getContainerUserLang() {
		return containerUserLang;
	}

	public void setContainerUserLang(String containerUserLang) {
		this.containerUserLang = containerUserLang;
	}

	public String getYardLang() {
		return yardLang;
	}

	public void setYardLang(String yardLang) {
		this.yardLang = yardLang;
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

	public String getReshapeTypeLang() {
		return reshapeTypeLang;
	}

	public void setReshapeTypeLang(String reshapeTypeLang) {
		this.reshapeTypeLang = reshapeTypeLang;
	}

}
