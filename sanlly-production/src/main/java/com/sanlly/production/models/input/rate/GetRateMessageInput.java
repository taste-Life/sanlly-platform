package com.sanlly.production.models.input.rate;

/**
 * 材料费，工时费查询参数接收实体
 * 
 * @author wangxzh
 *
 */
public class GetRateMessageInput {

	/**
	 * SAN费率主键
	 */
	private String rateId;

	/**
	 * 地点（公司）
	 */
	private String company;

	/**
	 * 用箱人
	 */
	private String containerUser;

	/**
	 * 箱类别
	 */
	private String containerCategory;
	/**
	 * 部件大类
	 */
	private String partsType;
	/**
	 * 部件明细
	 */
	private String partsDetails;
	/**
	 * 维修代码
	 */
	private String repair;
	/**
	 * 部件明细（SAN）
	 */
	private String sanPartsDetails;
	/**
	 * 维修代码（SAN）
	 */
	private String sanRepair;
	/**
	 * 材质代码
	 */
	private String material;
	/**
	 * 位置代码
	 */
	private String positionCode;
	/**
	 * 箱型
	 */
	private String containerType;
	/**
	 * 箱尺寸
	 */
	private String size;
	/**
	 * 长
	 */
	private Double length;
	/**
	 * 宽
	 */
	private Double width;
	/**
	 * 数量
	 */
	private Double quantity;
	/**
	 * 费率类型，参照枚举RateFormTypeEnum
	 */
	private String fromType;
	/**
	 * 备件号
	 */
	private String sparesNumber;
	/**
	 * 进场类型
	 */
	private String courseType;
	/**
	 * 内外贸箱
	 */
	private String domesticForeignTrade;
	/**
	 * 是否退租箱
	 */
	private String isSurrender;
	/**
	 * 损坏代码
	 */
	private String damageCode;
	/**
	 * 阶段，RateStageEnum
	 */
	private String stage;
	/**
	 * 冷机公司
	 */
	private String unitCompany;
	/**
	 * 场站
	 */
	private String yard;

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getContainerUser() {
		return containerUser;
	}

	public void setContainerUser(String containerUser) {
		this.containerUser = containerUser;
	}

	public String getContainerCategory() {
		return containerCategory;
	}

	public void setContainerCategory(String containerCategory) {
		this.containerCategory = containerCategory;
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

	public String getPositionCode() {
		return positionCode;
	}

	public void setPositionCode(String positionCode) {
		this.positionCode = positionCode;
	}

	public String getContainerType() {
		return containerType;
	}

	public void setContainerType(String containerType) {
		this.containerType = containerType;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public Double getLength() {
		return length;
	}

	public void setLength(Double length) {
		this.length = length;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getFromType() {
		return fromType;
	}

	public void setFromType(String fromType) {
		this.fromType = fromType;
	}

	public String getSanPartsDetails() {
		return sanPartsDetails;
	}

	public void setSanPartsDetails(String sanPartsDetails) {
		this.sanPartsDetails = sanPartsDetails;
	}

	public String getSanRepair() {
		return sanRepair;
	}

	public void setSanRepair(String sanRepair) {
		this.sanRepair = sanRepair;
	}

	public String getCourseType() {
		return courseType;
	}

	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}

	public String getDomesticForeignTrade() {
		return domesticForeignTrade;
	}

	public void setDomesticForeignTrade(String domesticForeignTrade) {
		this.domesticForeignTrade = domesticForeignTrade;
	}

	public String getIsSurrender() {
		return isSurrender;
	}

	public void setIsSurrender(String isSurrender) {
		this.isSurrender = isSurrender;
	}

	public String getDamageCode() {
		return damageCode;
	}

	public void setDamageCode(String damageCode) {
		this.damageCode = damageCode;
	}

	public String getStage() {
		return stage;
	}

	public void setStage(String stage) {
		this.stage = stage;
	}

	public String getSparesNumber() {
		return sparesNumber;
	}

	public void setSparesNumber(String sparesNumber) {
		this.sparesNumber = sparesNumber;
	}

	public String getUnitCompany() {
		return unitCompany;
	}

	public void setUnitCompany(String unitCompany) {
		this.unitCompany = unitCompany;
	}

	public String getYard() {
		return yard;
	}

	public void setYard(String yard) {
		this.yard = yard;
	}

	public String getRateId() {
		return rateId;
	}

	public void setRateId(String rateId) {
		this.rateId = rateId;
	}

}
