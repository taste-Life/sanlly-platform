package com.sanlly.production.models.input.paying;

/**
 * 付费方转化参数接收（录入条目使用）
 * 
 * @Package com.sanlly.production.models.input.paying 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年9月16日 上午9:44:19 
 * @version V1.0   
 */
public class PayingChangeInput {
	// 公司
	private String company;
	// 进场类型
	private String courseType;
	// 箱类别
	private String containerCategory;
	// 用箱人
	private String containerUser;
	// 内外贸
	private String domesticForeignTrade;
	// 部件修理代码
	private String partsRepairCode;
	// 损坏代码
	private String damageCode;
	// 是否退租箱
	private String isSurrender;

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCourseType() {
		return courseType;
	}

	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}

	public String getContainerCategory() {
		return containerCategory;
	}

	public void setContainerCategory(String containerCategory) {
		this.containerCategory = containerCategory;
	}

	public String getContainerUser() {
		return containerUser;
	}

	public void setContainerUser(String containerUser) {
		this.containerUser = containerUser;
	}

	public String getDomesticForeignTrade() {
		return domesticForeignTrade;
	}

	public void setDomesticForeignTrade(String domesticForeignTrade) {
		this.domesticForeignTrade = domesticForeignTrade;
	}

	public String getPartsRepairCode() {
		return partsRepairCode;
	}

	public void setPartsRepairCode(String partsRepairCode) {
		this.partsRepairCode = partsRepairCode;
	}

	public String getDamageCode() {
		return damageCode;
	}

	public void setDamageCode(String damageCode) {
		this.damageCode = damageCode;
	}

	public String getIsSurrender() {
		return isSurrender;
	}

	public void setIsSurrender(String isSurrender) {
		this.isSurrender = isSurrender;
	}

}
