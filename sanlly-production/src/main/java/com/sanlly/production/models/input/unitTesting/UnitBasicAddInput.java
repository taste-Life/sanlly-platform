package com.sanlly.production.models.input.unitTesting;

/**
 * 机组基础信息录入
 * @author RexSheng
 * 2019年8月14日 下午3:39:15
 */
public class UnitBasicAddInput {
	/**
	 * 进场id
	 */
	private String prodCourseId;
	
	/**
	 * 箱号
	 */
	private String containerNo;

	/**
	 * 机型
	 */
	private String unitType;
	
	/**
	 * 冷机公司
	 */
	private String unitCompany;
	
	/**
	 * 序列号
	 */
	private String unitCode;
	
	/**
	 * 启用日期yyyyMM
	 */
	private String startDate;
	
	/**
	 * 湿度是否可调
	 */
	private String isHumidity;
	
	/**
	 * 通风是否可调
	 */
	private String isVentilation;
	
	/**
	 * 火焰测试
	 */
	private String isFireTest;
	
	/**
	 * pti类型
	 */
	private String ptiType;
	
	/**
	 * 机组状态
	 */
	private String unitState;
	
	/**
	 * 预检区修理
	 */
	private String previewState;
	
	/**
	 * 是否预检区修理
	 */
	private String isPreview;
	
	/**
	 * 检验人
	 */
	private Integer testingUser;
	
	/**
	 * 检验时间
	 */
	private String testingTime;
	
	/**
	 * 压缩机
	 */
	private String compressor;
	
	/**
	 * 控制器
	 */
	private String control;
	
	/**
	 * 软件版本
	 */
	private String softwareVersion;
	
	/**
	 * 是否ca箱
	 */
	private String isCa;
	
	/**
	 * 检验备注
	 */
	private String testingRemarks;
	
	/**
	 * 照片
	 */
	private String unitPhoto;
	
	/**
	 * 基板序列号
	 */
	private String substrateCode;
	
	/**
	 * 修后照片
	 */
	private String afterPhoto;

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

	public String getUnitType() {
		return unitType;
	}

	public void setUnitType(String unitType) {
		this.unitType = unitType;
	}

	public String getUnitCompany() {
		return unitCompany;
	}

	public void setUnitCompany(String unitCompany) {
		this.unitCompany = unitCompany;
	}

	public String getUnitCode() {
		return unitCode;
	}

	public void setUnitCode(String unitCode) {
		this.unitCode = unitCode;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getIsHumidity() {
		return isHumidity;
	}

	public void setIsHumidity(String isHumidity) {
		this.isHumidity = isHumidity;
	}

	public String getIsVentilation() {
		return isVentilation;
	}

	public void setIsVentilation(String isVentilation) {
		this.isVentilation = isVentilation;
	}

	public String getIsFireTest() {
		return isFireTest;
	}

	public void setIsFireTest(String isFireTest) {
		this.isFireTest = isFireTest;
	}

	public String getPtiType() {
		return ptiType;
	}

	public void setPtiType(String ptiType) {
		this.ptiType = ptiType;
	}

	public String getUnitState() {
		return unitState;
	}

	public void setUnitState(String unitState) {
		this.unitState = unitState;
	}

	public String getPreviewState() {
		return previewState;
	}

	public void setPreviewState(String previewState) {
		this.previewState = previewState;
	}

	public Integer getTestingUser() {
		return testingUser;
	}

	public void setTestingUser(Integer testingUser) {
		this.testingUser = testingUser;
	}

	public String getTestingTime() {
		return testingTime;
	}

	public void setTestingTime(String testingTime) {
		this.testingTime = testingTime;
	}

	public String getCompressor() {
		return compressor;
	}

	public void setCompressor(String compressor) {
		this.compressor = compressor;
	}

	public String getControl() {
		return control;
	}

	public void setControl(String control) {
		this.control = control;
	}

	public String getSoftwareVersion() {
		return softwareVersion;
	}

	public void setSoftwareVersion(String softwareVersion) {
		this.softwareVersion = softwareVersion;
	}

	public String getIsCa() {
		return isCa;
	}

	public void setIsCa(String isCa) {
		this.isCa = isCa;
	}

	public String getSubstrateCode() {
		return substrateCode;
	}

	public void setSubstrateCode(String substrateCode) {
		this.substrateCode = substrateCode;
	}

	public String getUnitPhoto() {
		return unitPhoto;
	}

	public void setUnitPhoto(String unitPhoto) {
		this.unitPhoto = unitPhoto;
	}

	public String getTestingRemarks() {
		return testingRemarks;
	}

	public void setTestingRemarks(String testingRemarks) {
		this.testingRemarks = testingRemarks;
	}

	public String getIsPreview() {
		return isPreview;
	}

	public void setIsPreview(String isPreview) {
		this.isPreview = isPreview;
	}

	public String getAfterPhoto() {
		return afterPhoto;
	}

	public void setAfterPhoto(String afterPhoto) {
		this.afterPhoto = afterPhoto;
	}
	
	
}
