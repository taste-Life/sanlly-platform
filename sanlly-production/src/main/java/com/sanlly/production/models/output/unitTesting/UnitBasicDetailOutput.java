package com.sanlly.production.models.output.unitTesting;

/**
 * 机组基础信息
 * 
 * @author RexSheng 2019年8月14日 下午2:10:36
 */
public class UnitBasicDetailOutput {

	/**
	 * 进场id
	 */
	private String prodCourseId;

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
	 * 预检区修理
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
	 * 基板序列号
	 */
	private String substrateCode;

	/**
	 * 检验备注
	 */
	private String testingRemarks;

	/**
	 * 机组照片
	 */
	private String unitPhoto;

	/**
	 * 可显示的字段名称
	 */
	private String[] allowedFields;

	/**
	 * 检验状态
	 */
	private String testingState;

	/**
	 * 机组状态
	 */
	private String unitState;

	/**
	 * 检验状态
	 */
	private String testingStateNameLang;

	/**
	 * 机组状态
	 */
	private String unitStateNameLang;

	/**
	 * 报价币种
	 */
	private String valuationCurrency;

	/**
	 * 箱东估价状态
	 */
	private String masterReplyState;

	/**
	 * 用箱人估价状态
	 */
	private String useReplyState;

	/**
	 * 派工状态
	 */
	private String referralState;

	/**
	 * 派工状态
	 */
	private String referralStateNameLang;

	public String getProdCourseId() {
		return prodCourseId;
	}

	public void setProdCourseId(String prodCourseId) {
		this.prodCourseId = prodCourseId;
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

	public String[] getAllowedFields() {
		return allowedFields;
	}

	public void setAllowedFields(String[] allowedFields) {
		this.allowedFields = allowedFields;
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

	public String getControl() {
		return control;
	}

	public void setControl(String control) {
		this.control = control;
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

	public String getTestingState() {
		return testingState;
	}

	public void setTestingState(String testingState) {
		this.testingState = testingState;
	}

	public String getTestingStateNameLang() {
		return testingStateNameLang;
	}

	public void setTestingStateNameLang(String testingStateNameLang) {
		this.testingStateNameLang = testingStateNameLang;
	}

	public String getUnitStateNameLang() {
		return unitStateNameLang;
	}

	public void setUnitStateNameLang(String unitStateNameLang) {
		this.unitStateNameLang = unitStateNameLang;
	}

	public String getValuationCurrency() {
		return valuationCurrency;
	}

	public void setValuationCurrency(String valuationCurrency) {
		this.valuationCurrency = valuationCurrency;
	}

	public String getIsPreview() {
		return isPreview;
	}

	public void setIsPreview(String isPreview) {
		this.isPreview = isPreview;
	}

	public String getMasterReplyState() {
		return masterReplyState;
	}

	public void setMasterReplyState(String masterReplyState) {
		this.masterReplyState = masterReplyState;
	}

	public String getUseReplyState() {
		return useReplyState;
	}

	public void setUseReplyState(String useReplyState) {
		this.useReplyState = useReplyState;
	}

	public String getReferralState() {
		return referralState;
	}

	public void setReferralState(String referralState) {
		this.referralState = referralState;
	}

	public String getReferralStateNameLang() {
		return referralStateNameLang;
	}

	public void setReferralStateNameLang(String referralStateNameLang) {
		this.referralStateNameLang = referralStateNameLang;
	}

}
