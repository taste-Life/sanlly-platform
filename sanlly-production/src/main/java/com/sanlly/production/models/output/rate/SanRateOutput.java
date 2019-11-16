package com.sanlly.production.models.output.rate;

/**
 * 获取编辑信息
 * 
 * @author wangxzh
 *
 */
public class SanRateOutput {
	// 主键
	private String rateId;
	// 公司
	private String company;
	// 箱类别
	private String containerCategory;
	// 费率计算方式
	private String calculationType;
	// 用箱人
	private String containerUser;
	// 部件大类
	private String partsType;
	// 部件明细
	private String partsDetails;
	// 部件明细
	private String partsDetailsName;
	// 部件明细
	private String partsDetailsNameEn;
	// 维修代码
	private String repair;
	// 材质代码
	private String material;
	// 费率中文名称
	private String rateNameZh;
	// 费率英文名称
	private String rateNameEn;
	// 是否使用用箱人费率
	private String isContainerUserRate;
	// 用箱人描述
	private String containerUserDescribe;
	// 备注
	private String remark;
	// 条目重复是否提示
	private String isRepeatPrompts;
	// 是否必传图片
	private String isMustPhoto;
	// 是否广州使用
	private String isGuangZhou;

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getRateId() {
		return rateId;
	}

	public void setRateId(String rateId) {
		this.rateId = rateId;
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

	public String getPartsType() {
		return partsType;
	}

	public void setPartsType(String partsType) {
		this.partsType = partsType;
	}

	public String getPartsDetails() {
		return partsDetails;
	}

	public void setPartsDetails(String partsDetails) {
		this.partsDetails = partsDetails;
	}

	public String getRepair() {
		return repair;
	}

	public void setRepair(String repair) {
		this.repair = repair;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getRateNameZh() {
		return rateNameZh;
	}

	public void setRateNameZh(String rateNameZh) {
		this.rateNameZh = rateNameZh;
	}

	public String getRateNameEn() {
		return rateNameEn;
	}

	public void setRateNameEn(String rateNameEn) {
		this.rateNameEn = rateNameEn;
	}

	public String getIsContainerUserRate() {
		return isContainerUserRate;
	}

	public void setIsContainerUserRate(String isContainerUserRate) {
		this.isContainerUserRate = isContainerUserRate;
	}

	public String getContainerUserDescribe() {
		return containerUserDescribe;
	}

	public void setContainerUserDescribe(String containerUserDescribe) {
		this.containerUserDescribe = containerUserDescribe;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getCalculationType() {
		return calculationType;
	}

	public void setCalculationType(String calculationType) {
		this.calculationType = calculationType;
	}

	public String getPartsDetailsName() {
		return partsDetailsName;
	}

	public void setPartsDetailsName(String partsDetailsName) {
		this.partsDetailsName = partsDetailsName;
	}

	public String getPartsDetailsNameEn() {
		return partsDetailsNameEn;
	}

	public void setPartsDetailsNameEn(String partsDetailsNameEn) {
		this.partsDetailsNameEn = partsDetailsNameEn;
	}

	public String getIsRepeatPrompts() {
		return isRepeatPrompts;
	}

	public void setIsRepeatPrompts(String isRepeatPrompts) {
		this.isRepeatPrompts = isRepeatPrompts;
	}

	public String getIsMustPhoto() {
		return isMustPhoto;
	}

	public void setIsMustPhoto(String isMustPhoto) {
		this.isMustPhoto = isMustPhoto;
	}

	public String getIsGuangZhou() {
		return isGuangZhou;
	}

	public void setIsGuangZhou(String isGuangZhou) {
		this.isGuangZhou = isGuangZhou;
	}

}
